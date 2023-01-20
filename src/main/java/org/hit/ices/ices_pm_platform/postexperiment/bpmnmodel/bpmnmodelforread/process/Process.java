package org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforread.process;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

public class Process {
    @JacksonXmlProperty(isAttribute = true)
    private String id;
    @JacksonXmlProperty(isAttribute = true)
    private String name;

    private StartEvent startEvent;
    private EndEvent endEvent;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ExclusiveGateway> exclusiveGateway = new ArrayList<>();
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<UserTask> userTask = new ArrayList<>();
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<SequenceFlow> sequenceFlow = new ArrayList<>();

    public Process() {
    }

    public Process(String id) {
        this.id = id;
    }

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

    public StartEvent getStartEvent() {
        return startEvent;
    }

    public void setStartEvent(StartEvent startEvent) {
        this.startEvent = startEvent;
    }

    public EndEvent getEndEvent() {
        return endEvent;
    }

    public void setEndEvent(EndEvent endEvent) {
        this.endEvent = endEvent;
    }

    public List<ExclusiveGateway> getExclusiveGateway() {
        return exclusiveGateway;
    }

    public void setExclusiveGateway(List<ExclusiveGateway> exclusiveGateway) {
        this.exclusiveGateway = exclusiveGateway;
    }

    public List<UserTask> getUserTask() {
        return userTask;
    }

    public void setUserTask(List<UserTask> userTask) {
        this.userTask = userTask;
    }

    public List<SequenceFlow> getSequenceFlow() {
        return sequenceFlow;
    }

    public void setSequenceFlow(List<SequenceFlow> sequenceFlow) {
        this.sequenceFlow = sequenceFlow;
    }
}
