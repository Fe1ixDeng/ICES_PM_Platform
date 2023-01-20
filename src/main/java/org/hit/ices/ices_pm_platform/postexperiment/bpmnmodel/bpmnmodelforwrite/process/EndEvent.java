package org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforwrite.process;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class EndEvent extends Element {
    @JacksonXmlProperty(isAttribute = true)
    private String id;

    public EndEvent() {
    }

    public EndEvent(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
