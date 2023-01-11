package org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.diagram;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BPMNShape {
    @JacksonXmlProperty(isAttribute = true)
    private String id;
    @JacksonXmlProperty(isAttribute = true)
    private String bpmnElement;
//    @JacksonXmlProperty(localName = "omgdc:Bounds") 写xml的时候用这个，读的时候用下面的
    @JacksonXmlProperty(localName = "Bounds")
    private Bounds bounds;

    public BPMNShape() {
    }

    public BPMNShape(String id, String bpmnElement, Bounds bounds) {
        this.id = id;
        this.bpmnElement = bpmnElement;
        this.bounds = bounds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBpmnElement() {
        return bpmnElement;
    }

    public void setBpmnElement(String bpmnElement) {
        this.bpmnElement = bpmnElement;
    }

    public Bounds getBounds() {
        return bounds;
    }

    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }
}
