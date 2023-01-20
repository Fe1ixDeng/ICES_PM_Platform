package org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforwrite.process;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SequenceFlow extends Element {
    @JacksonXmlProperty(isAttribute = true)
    private String id;
    @JacksonXmlProperty(isAttribute = true)
    private String sourceRef;
    @JacksonXmlProperty(isAttribute = true)
    private String targetRef;

    public SequenceFlow() {
    }

    public SequenceFlow(String id, String sourceRef, String targetRef) {
        this.id = id;
        this.sourceRef = sourceRef;
        this.targetRef = targetRef;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getSourceRef() {
        return sourceRef;
    }

    public void setSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
    }

    public String getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(String targetRef) {
        this.targetRef = targetRef;
    }
}
