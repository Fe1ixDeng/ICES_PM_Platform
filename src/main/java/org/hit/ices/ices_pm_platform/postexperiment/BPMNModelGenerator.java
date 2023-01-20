package org.hit.ices.ices_pm_platform.postexperiment;

import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforwrite.Definitions;
import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforwrite.diagram.BPMNDiagram;
import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforwrite.diagram.BPMNPlane;
import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforwrite.process.Process;

public class BPMNModelGenerator {
    public Definitions generateBPMNModel(){
        Definitions definitions = new Definitions();
        org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforwrite.process.Process process = new Process("p1");
        org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforwrite.diagram.BPMNDiagram bpmnDiagram = new BPMNDiagram("diagram_p1");
        BPMNPlane bpmnPlane = new BPMNPlane("plane_p1","p1");

        definitions.setProcess(process);
        definitions.setBpmnDiagram(bpmnDiagram);
        bpmnDiagram.setBpmnPlane(bpmnPlane);

        return definitions;
    }

}
