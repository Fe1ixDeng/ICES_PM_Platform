package org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforread.diagram;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

public class BPMNEdge {
    @JacksonXmlProperty(isAttribute = true)
    private String id;
    @JacksonXmlProperty(isAttribute = true)
    private String bpmnElement;
    @JacksonXmlElementWrapper(useWrapping = false)
//    @JacksonXmlProperty(localName = "omgdi:waypoint") 写xml的时候用这个，读的时候用下面的
    @JacksonXmlProperty(localName = "waypoint")
    private List<waypoint> waypoint = new ArrayList<>();

    public BPMNEdge() {
    }

    public BPMNEdge(String id, String bpmnElement) {
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

    public List<org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforread.diagram.waypoint> getWaypoint() {
        return waypoint;
    }

    public void setWaypoint(List<org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforread.diagram.waypoint> waypoint) {
        this.waypoint = waypoint;
    }
}
