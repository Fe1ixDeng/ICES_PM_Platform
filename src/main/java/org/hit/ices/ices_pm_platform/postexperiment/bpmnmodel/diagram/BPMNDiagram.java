package org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.diagram;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BPMNDiagram {
    @JacksonXmlProperty(isAttribute = true)
    private String id;
//    @JacksonXmlProperty(localName = "bpmndi:BPMNPlane") 写xml的时候用这个，读的时候用下面的
    @JacksonXmlProperty(localName = "BPMNPlane")
    private BPMNPlane bpmnPlane;

    public BPMNDiagram() {
    }

    public BPMNDiagram(String id) {
        this.id = id;
    }

    public BPMNDiagram(String id, BPMNPlane bpmnPlane) {
        this.id = id;
        this.bpmnPlane = bpmnPlane;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BPMNPlane getBpmnPlane() {
        return bpmnPlane;
    }

    public void setBpmnPlane(BPMNPlane bpmnPlane) {
        this.bpmnPlane = bpmnPlane;
    }
}
