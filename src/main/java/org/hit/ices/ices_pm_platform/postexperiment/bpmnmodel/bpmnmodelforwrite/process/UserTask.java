package org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforwrite.process;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class UserTask extends Element {
    @JacksonXmlProperty(isAttribute = true)
    private String id;
    @JacksonXmlProperty(isAttribute = true)
    private String name;

    public UserTask() {
    }

    public UserTask(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
