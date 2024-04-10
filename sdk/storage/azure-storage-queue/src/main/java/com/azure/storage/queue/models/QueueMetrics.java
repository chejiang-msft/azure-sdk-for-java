// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * a summary of request statistics grouped by API in hour or minute aggregates for queues.
 */
@Fluent
public final class QueueMetrics implements XmlSerializable<QueueMetrics> {
    /*
     * The version of Storage Analytics to configure.
     */
    private String version;

    /*
     * Indicates whether metrics are enabled for the Queue service.
     */
    private boolean enabled;

    /*
     * Indicates whether metrics should generate summary statistics for called API operations.
     */
    private Boolean includeApis;

    /*
     * the retention policy
     */
    private QueueRetentionPolicy retentionPolicy;

    /**
     * Creates an instance of QueueMetrics class.
     */
    public QueueMetrics() {
    }

    /**
     * Get the version property: The version of Storage Analytics to configure.
     * 
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of Storage Analytics to configure.
     * 
     * @param version the version value to set.
     * @return the QueueMetrics object itself.
     */
    public QueueMetrics setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether metrics are enabled for the Queue service.
     * 
     * @return the enabled value.
     */
    public boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether metrics are enabled for the Queue service.
     * 
     * @param enabled the enabled value to set.
     * @return the QueueMetrics object itself.
     */
    public QueueMetrics setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the includeApis property: Indicates whether metrics should generate summary statistics for called API
     * operations.
     * 
     * @return the includeApis value.
     */
    public Boolean isIncludeApis() {
        return this.includeApis;
    }

    /**
     * Set the includeApis property: Indicates whether metrics should generate summary statistics for called API
     * operations.
     * 
     * @param includeApis the includeApis value to set.
     * @return the QueueMetrics object itself.
     */
    public QueueMetrics setIncludeApis(Boolean includeApis) {
        this.includeApis = includeApis;
        return this;
    }

    /**
     * Get the retentionPolicy property: the retention policy.
     * 
     * @return the retentionPolicy value.
     */
    public QueueRetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: the retention policy.
     * 
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the QueueMetrics object itself.
     */
    public QueueMetrics setRetentionPolicy(QueueRetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "QueueMetrics" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("Version", this.version);
        xmlWriter.writeBooleanElement("Enabled", this.enabled);
        xmlWriter.writeBooleanElement("IncludeAPIs", this.includeApis);
        xmlWriter.writeXml(this.retentionPolicy, "RetentionPolicy");
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of QueueMetrics from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of QueueMetrics if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the QueueMetrics.
     */
    public static QueueMetrics fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of QueueMetrics from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of QueueMetrics if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the QueueMetrics.
     */
    public static QueueMetrics fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "QueueMetrics" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            QueueMetrics deserializedQueueMetrics = new QueueMetrics();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("Version".equals(elementName.getLocalPart())) {
                    deserializedQueueMetrics.version = reader.getStringElement();
                } else if ("Enabled".equals(elementName.getLocalPart())) {
                    deserializedQueueMetrics.enabled = reader.getBooleanElement();
                } else if ("IncludeAPIs".equals(elementName.getLocalPart())) {
                    deserializedQueueMetrics.includeApis = reader.getNullableElement(Boolean::parseBoolean);
                } else if ("RetentionPolicy".equals(elementName.getLocalPart())) {
                    deserializedQueueMetrics.retentionPolicy = QueueRetentionPolicy.fromXml(reader, "RetentionPolicy");
                } else {
                    reader.skipElement();
                }
            }

            return deserializedQueueMetrics;
        });
    }
}
