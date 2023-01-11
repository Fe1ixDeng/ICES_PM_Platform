package org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.diagram;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

public class BPMNPlane {
    @JacksonXmlProperty(isAttribute = true)
    private String id;
    @JacksonXmlProperty(isAttribute = true)
    private String bpmnElement;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "BPMNEdge")
    private List<BPMNEdge> bpmnEdge = new ArrayList<>();
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "BPMNShape")
    private List<BPMNShape> bpmnShape = new ArrayList<>();

    public BPMNPlane() {
    }

    public BPMNPlane(String id, String bpmnElement) {
        this.id = id;
        this.bpmnElement = bpmnElement;
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

    public List<BPMNEdge> getBpmnEdge() {
        return bpmnEdge;
    }

    public void setBpmnEdge(List<BPMNEdge> bpmnEdge) {
        this.bpmnEdge = bpmnEdge;
    }

    public List<BPMNShape> getBpmnShape() {
        return bpmnShape;
    }

    public void setBpmnShape(List<BPMNShape> bpmnShape) {
        this.bpmnShape = bpmnShape;
    }
}
