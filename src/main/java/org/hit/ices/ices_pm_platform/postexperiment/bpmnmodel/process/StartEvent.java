package org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.process;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class StartEvent extends Element {
    @JacksonXmlProperty(isAttribute = true)
    private String id;

    public StartEvent(String id) {
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
