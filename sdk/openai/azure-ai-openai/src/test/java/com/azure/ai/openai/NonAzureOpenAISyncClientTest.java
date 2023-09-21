// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.openai;

import com.azure.ai.openai.functions.MyFunctionCallArguments;
import com.azure.ai.openai.models.AudioTaskLabel;
import com.azure.ai.openai.models.AudioTranscription;
import com.azure.ai.openai.models.AudioTranscriptionFormat;
import com.azure.ai.openai.models.AudioTranscriptionOptions;
import com.azure.ai.openai.models.AudioTranslationOptions;
import com.azure.ai.openai.models.ChatChoice;
import com.azure.ai.openai.models.ChatCompletions;
import com.azure.ai.openai.models.ChatCompletionsOptions;
import com.azure.ai.openai.models.ChatRole;
import com.azure.ai.openai.models.Completions;
import com.azure.ai.openai.models.CompletionsOptions;
import com.azure.ai.openai.models.CompletionsUsage;
import com.azure.ai.openai.models.Embeddings;
import com.azure.ai.openai.models.FunctionCallConfig;
import com.azure.core.credential.KeyCredential;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.IterableStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static com.azure.ai.openai.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NonAzureOpenAISyncClientTest extends OpenAIClientTestBase {
    private OpenAIClient client;

    private OpenAIClient getNonAzureOpenAISyncClient(HttpClient httpClient) {
        return getNonAzureOpenAIClientBuilder(
            interceptorManager.isPlaybackMode() ? interceptorManager.getPlaybackClient() : httpClient)
            .buildClient();
    }

    private OpenAIClient getNonAzureOpenAISyncClient(HttpClient httpClient, KeyCredential keyCredential) {
        return getNonAzureOpenAIClientBuilder(
            interceptorManager.isPlaybackMode() ? interceptorManager.getPlaybackClient() : httpClient)
            .credential(keyCredential)
            .buildClient();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletions(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getCompletionsRunner((deploymentId, prompt) -> {
            Completions resultCompletions = client.getCompletions(deploymentId, new CompletionsOptions(prompt));
            assertCompletions(1, resultCompletions);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletionsStream(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getCompletionsRunner((deploymentId, prompt) -> {
            IterableStream<Completions> resultCompletions = client.getCompletionsStream(deploymentId, new CompletionsOptions(prompt));
            assertTrue(resultCompletions.stream().toArray().length > 1);
            resultCompletions.forEach(OpenAIClientTestBase::assertCompletionsStream);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletionsFromPrompt(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getCompletionsFromSinglePromptRunner((deploymentId, prompts) -> {
            Completions completions = client.getCompletions(deploymentId, prompts);
            assertCompletions(1, completions);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletionsWithResponse(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getCompletionsRunner((deploymentId, prompt) -> {
            Response<BinaryData> response = client.getCompletionsWithResponse(deploymentId,
                BinaryData.fromObject(new CompletionsOptions(prompt)), new RequestOptions());
            Completions resultCompletions = assertAndGetValueFromResponse(response, Completions.class, 200);
            assertCompletions(1, resultCompletions);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletionsBadSecretKey(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(
            httpClient,
            new KeyCredential("not_token_looking_string"));

        getCompletionsRunner((modelId, prompt) -> {
            ClientAuthenticationException exception = assertThrows(ClientAuthenticationException.class,
                () -> client.getCompletionsWithResponse(modelId,
                    BinaryData.fromObject(new CompletionsOptions(prompt)), new RequestOptions()));
            assertEquals(401, exception.getResponse().getStatusCode());
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletionsUsageField(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getCompletionsRunner((modelId, prompt) -> {
            CompletionsOptions completionsOptions = new CompletionsOptions(prompt);
            completionsOptions.setMaxTokens(1024);
            completionsOptions.setN(3);
            completionsOptions.setLogprobs(1);

            Completions resultCompletions = client.getCompletions(modelId, completionsOptions);

            CompletionsUsage usage = resultCompletions.getUsage();
            assertCompletions(completionsOptions.getN() * completionsOptions.getPrompt().size(), resultCompletions);
            assertNotNull(usage);
            assertTrue(usage.getTotalTokens() > 0);
            assertEquals(usage.getCompletionTokens() + usage.getPromptTokens(), usage.getTotalTokens());
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletionsTokenCutoff(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getCompletionsRunner((modelId, prompt) -> {
            CompletionsOptions completionsOptions = new CompletionsOptions(prompt);
            completionsOptions.setMaxTokens(3);
            Completions resultCompletions = client.getCompletions(modelId, completionsOptions);
            assertCompletions(1, "length", resultCompletions);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetChatCompletions(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getChatCompletionsForNonAzureRunner((deploymentId, chatMessages) -> {
            ChatCompletions resultChatCompletions = client.getChatCompletions(deploymentId, new ChatCompletionsOptions(chatMessages));
            assertChatCompletions(1, resultChatCompletions);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetChatCompletionsStream(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getChatCompletionsForNonAzureRunner((deploymentId, chatMessages) -> {
            IterableStream<ChatCompletions> resultChatCompletions = client.getChatCompletionsStream(deploymentId, new ChatCompletionsOptions(chatMessages));
            assertTrue(resultChatCompletions.stream().toArray().length > 1);
            resultChatCompletions.forEach(OpenAIClientTestBase::assertChatCompletionsStream);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetChatCompletionsWithResponse(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getChatCompletionsForNonAzureRunner((deploymentId, chatMessages) -> {
            Response<BinaryData> response = client.getChatCompletionsWithResponse(deploymentId,
                BinaryData.fromObject(new ChatCompletionsOptions(chatMessages)), new RequestOptions());
            ChatCompletions resultChatCompletions = assertAndGetValueFromResponse(response, ChatCompletions.class, 200);
            assertChatCompletions(1, resultChatCompletions);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetEmbeddings(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getEmbeddingNonAzureRunner((deploymentId, embeddingsOptions) -> {
            Embeddings resultEmbeddings = client.getEmbeddings(deploymentId, embeddingsOptions);
            assertEmbeddings(resultEmbeddings);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetEmbeddingsWithResponse(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getEmbeddingNonAzureRunner((deploymentId, embeddingsOptions) -> {
            Response<BinaryData> response = client.getEmbeddingsWithResponse(deploymentId,
                BinaryData.fromObject(embeddingsOptions), new RequestOptions());
            Embeddings resultEmbeddings = assertAndGetValueFromResponse(response, Embeddings.class, 200);
            assertEmbeddings(resultEmbeddings);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGenerateImage(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getImageGenerationRunner(options -> assertImageResponse(client.getImages(options)));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testChatFunctionAutoPreset(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getChatFunctionForNonAzureRunner((modelId, chatCompletionsOptions) -> {
            chatCompletionsOptions.setFunctionCall(FunctionCallConfig.AUTO);
            ChatCompletions chatCompletions = client.getChatCompletions(modelId, chatCompletionsOptions);

            assertEquals(1, chatCompletions.getChoices().size());
            ChatChoice chatChoice = chatCompletions.getChoices().get(0);
            MyFunctionCallArguments arguments = assertFunctionCall(
                chatChoice,
                "MyFunction",
                MyFunctionCallArguments.class);
            assertEquals(arguments.getLocation(), "San Francisco, CA");
            assertEquals(arguments.getUnit(), "CELSIUS");
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testChatFunctionNonePreset(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getChatFunctionForNonAzureRunner((modelId, chatCompletionsOptions) -> {
            chatCompletionsOptions.setFunctionCall(FunctionCallConfig.NONE);
            ChatCompletions chatCompletions = client.getChatCompletions(modelId, chatCompletionsOptions);

            assertChatCompletions(1, "stop", ChatRole.ASSISTANT, chatCompletions);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testChatFunctionNotSuppliedByNamePreset(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getChatFunctionForNonAzureRunner((modelId, chatCompletionsOptions) -> {
            chatCompletionsOptions.setFunctionCall(new FunctionCallConfig("NotMyFunction"));
            HttpResponseException exception = assertThrows(HttpResponseException.class,
                () -> client.getChatCompletions(modelId, chatCompletionsOptions));
            assertEquals(400, exception.getResponse().getStatusCode());

            assertInstanceOf(HttpResponseException.class, exception);
            assertTrue(exception.getMessage().contains("Invalid value for 'function_call'"));
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testChatCompletionContentFiltering(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getChatCompletionsContentFilterRunnerForNonAzure((modelId, chatMessages) -> {
            ChatCompletions chatCompletions = client.getChatCompletions(modelId, new ChatCompletionsOptions(chatMessages));

            assertNull(chatCompletions.getPromptFilterResults());
            assertEquals(1, chatCompletions.getChoices().size());
            assertNull(chatCompletions.getChoices().get(0).getContentFilterResults());
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testCompletionContentFiltering(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        getCompletionsContentFilterRunnerForNonAzure((modelId, prompt) -> {
            CompletionsOptions completionsOptions = new CompletionsOptions(Arrays.asList(prompt));
            Completions completions = client.getCompletions(modelId, completionsOptions);

            assertCompletions(1, completions);
            assertNull(completions.getPromptFilterResults());
            assertNull(completions.getChoices().get(0).getContentFilterResults());
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranscriptionJson(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);

        getAudioTranscriptionRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranscriptionOptions transcriptionOptions = new AudioTranscriptionOptions(file);
            transcriptionOptions.setResponseFormat(AudioTranscriptionFormat.JSON);

            AudioTranscription transcription = client.getAudioTranscription(modelId, fileName, transcriptionOptions);
            assertAudioTranscriptionSimpleJson(transcription, BATMAN_TRANSCRIPTION);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranscriptionVerboseJson(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);

        getAudioTranscriptionRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranscriptionOptions transcriptionOptions = new AudioTranscriptionOptions(file);
            transcriptionOptions.setResponseFormat(AudioTranscriptionFormat.VERBOSE_JSON);

            AudioTranscription transcription = client.getAudioTranscription(modelId, fileName, transcriptionOptions);
            assertAudioTranscriptionVerboseJson(transcription, BATMAN_TRANSCRIPTION, AudioTaskLabel.TRANSCRIBE);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranscriptionTextPlain(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);

        getAudioTranscriptionRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranscriptionOptions transcriptionOptions = new AudioTranscriptionOptions(file);
            transcriptionOptions.setResponseFormat(AudioTranscriptionFormat.TEXT);

            String transcription = client.getAudioTranscriptionText(modelId, fileName, transcriptionOptions);
            // A plain/text request adds a line break as an artifact. Also observed for translations
            assertEquals(BATMAN_TRANSCRIPTION + "\n", transcription);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranscriptionSrt(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);

        getAudioTranscriptionRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranscriptionOptions transcriptionOptions = new AudioTranscriptionOptions(file);
            transcriptionOptions.setResponseFormat(AudioTranscriptionFormat.SRT);

            String transcription = client.getAudioTranscriptionText(modelId, fileName, transcriptionOptions);
            // Sequence number
            assertTrue(transcription.contains("1\n"));
            // First sequence starts at timestamp 0
            assertTrue(transcription.contains("00:00:00,000 --> "));
            // Contains one expected word
            assertTrue(transcription.contains("Batman"));
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranscriptionVtt(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);

        getAudioTranscriptionRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranscriptionOptions transcriptionOptions = new AudioTranscriptionOptions(file);
            transcriptionOptions.setResponseFormat(AudioTranscriptionFormat.VTT);

            String transcription = client.getAudioTranscriptionText(modelId, fileName, transcriptionOptions);
            // Start value according to spec
            assertTrue(transcription.startsWith("WEBVTT\n"));
            // First sequence starts at timestamp 0. Note: unlike SRT, the millisecond separator is a "."
            assertTrue(transcription.contains("00:00:00.000 --> "));
            // Contains at least one expected word
            assertTrue(transcription.contains("Batman"));
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranscriptionTextWrongFormats(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        List<AudioTranscriptionFormat> wrongFormats = Arrays.asList(
                AudioTranscriptionFormat.JSON,
                AudioTranscriptionFormat.VERBOSE_JSON
        );

        getAudioTranscriptionRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranscriptionOptions transcriptionOptions = new AudioTranscriptionOptions(file);

            for (AudioTranscriptionFormat format: wrongFormats) {
                transcriptionOptions.setResponseFormat(format);
                assertThrows(IllegalArgumentException.class, () -> {
                    client.getAudioTranscriptionText(modelId, fileName, transcriptionOptions);
                });
            }
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranscriptionJsonWrongFormats(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        List<AudioTranscriptionFormat> wrongFormats = Arrays.asList(
                AudioTranscriptionFormat.TEXT,
                AudioTranscriptionFormat.SRT,
                AudioTranscriptionFormat.VTT
        );

        getAudioTranscriptionRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranscriptionOptions transcriptionOptions = new AudioTranscriptionOptions(file);

            for (AudioTranscriptionFormat format: wrongFormats) {
                transcriptionOptions.setResponseFormat(format);
                assertThrows(IllegalArgumentException.class, () -> {
                    client.getAudioTranscription(modelId, fileName, transcriptionOptions);
                });
            }
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationJson(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);

        getAudioTranslationRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);
            translationOptions.setResponseFormat(AudioTranscriptionFormat.JSON);

            AudioTranscription translation = client.getAudioTranslation(modelId, fileName, translationOptions);
            assertAudioTranscriptionSimpleJson(translation, "It's raining today.");
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationVerboseJson(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);

        getAudioTranslationRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);
            translationOptions.setResponseFormat(AudioTranscriptionFormat.VERBOSE_JSON);

            AudioTranscription translation = client.getAudioTranslation(modelId, fileName, translationOptions);
            assertAudioTranscriptionVerboseJson(translation, "It's raining today.", AudioTaskLabel.TRANSLATE);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationTextPlain(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);

        getAudioTranslationRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);
            translationOptions.setResponseFormat(AudioTranscriptionFormat.TEXT);

            String transcription = client.getAudioTranslationText(modelId, fileName, translationOptions);
            assertEquals("It's raining today.\n", transcription);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationSrt(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);

        getAudioTranslationRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);
            translationOptions.setResponseFormat(AudioTranscriptionFormat.SRT);

            String transcription = client.getAudioTranslationText(modelId, fileName, translationOptions);
            // Sequence number
            assertTrue(transcription.contains("1\n"));
            // First sequence starts at timestamp 0
            assertTrue(transcription.contains("00:00:00,000 --> "));
            // Actual translation value
            assertTrue(transcription.contains("It's raining today."));
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationVtt(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);

        getAudioTranslationRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);
            translationOptions.setResponseFormat(AudioTranscriptionFormat.VTT);

            String transcription = client.getAudioTranslationText(modelId, fileName, translationOptions);
            // Start value according to spec
            assertTrue(transcription.startsWith("WEBVTT\n"));
            // First sequence starts at timestamp 0. Note: unlike SRT, the millisecond separator is a "."
            assertTrue(transcription.contains("00:00:00.000 --> "));
            // Actual translation value
            assertTrue(transcription.contains("It's raining today."));
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationTextWrongFormats(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        List<AudioTranscriptionFormat> wrongFormats = Arrays.asList(
                AudioTranscriptionFormat.JSON,
                AudioTranscriptionFormat.VERBOSE_JSON
        );

        getAudioTranslationRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);

            for (AudioTranscriptionFormat format: wrongFormats) {
                translationOptions.setResponseFormat(format);
                assertThrows(IllegalArgumentException.class, () -> {
                    client.getAudioTranslationText(modelId, fileName, translationOptions);
                });
            }
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationJsonWrongFormats(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getNonAzureOpenAISyncClient(httpClient);
        List<AudioTranscriptionFormat> wrongFormats = Arrays.asList(
                AudioTranscriptionFormat.TEXT,
                AudioTranscriptionFormat.SRT,
                AudioTranscriptionFormat.VTT
        );

        getAudioTranslationRunnerForNonAzure((modelId, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);

            for (AudioTranscriptionFormat format: wrongFormats) {
                translationOptions.setResponseFormat(format);
                assertThrows(IllegalArgumentException.class, () -> {
                    client.getAudioTranslation(modelId, fileName, translationOptions);
                });
            }
        });
    }
}
