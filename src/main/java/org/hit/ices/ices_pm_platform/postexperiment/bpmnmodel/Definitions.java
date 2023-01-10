package org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel;

import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.diagram.BPMNDiagram;
import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.process.Process;

public class Definitions {
    private Process process;
    private BPMNDiagram bpmnDiagram;

    public Definitions(Process process) {
        this.process = process;
    }
    public Definitions(Process process, BPMNDiagram bpmnDiagram) {
        this.process = process;
        this.bpmnDiagram = bpmnDiagram;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public BPMNDiagram getBpmnDiagram() {
        return bpmnDiagram;
    }

    public void setBpmnDiagram(BPMNDiagram bpmnDiagram) {
        this.bpmnDiagram = bpmnDiagram;
    }
}
