package org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforwrite.process;

public abstract class Element {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
