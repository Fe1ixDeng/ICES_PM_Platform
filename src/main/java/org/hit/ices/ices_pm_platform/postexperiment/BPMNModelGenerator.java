package org.hit.ices.ices_pm_platform.postexperiment;

import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.Definitions;
import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.diagram.BPMNDiagram;
import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.diagram.BPMNPlane;
import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.process.Process;

public class BPMNModelGenerator {
    public Definitions generateBPMNModel(){
        Definitions definitions = new Definitions();
        Process process = new Process("p1");
        BPMNDiagram bpmnDiagram = new BPMNDiagram("diagram_p1");
        BPMNPlane bpmnPlane = new BPMNPlane("plane_p1","p1");

        definitions.setProcess(process);
        definitions.setBpmnDiagram(bpmnDiagram);
        bpmnDiagram.setBpmnPlane(bpmnPlane);

        return definitions;
    }
}
