package org.hit.ices.ices_pm_platform;

import org.hit.ices.ices_pm_platform.postexperiment.BPMNModelGenerator;
import org.hit.ices.ices_pm_platform.postexperiment.XMLReader;
import org.hit.ices.ices_pm_platform.postexperiment.XMLWriter;
import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.Definitions;
import org.junit.Test;

import java.io.IOException;

public class PostExperimentTest extends IcesPmPlatformApplicationTests{
    @Test
    public void generateBPMNModelTest(){
        Definitions definitions = new BPMNModelGenerator().generateBPMNModel();

        System.out.println(definitions.getProcess().getId());
        System.out.println(definitions.getBpmnDiagram().getId());
        System.out.println(definitions.getBpmnDiagram().getBpmnPlane().getId() + " - " + definitions.getBpmnDiagram().getBpmnPlane().getBpmnElement());
    }

    @Test
    public void writeXmlTest(){
        BPMNModelGenerator bpmnModelGenerator = new BPMNModelGenerator();
        XMLWriter xmlWriter = new XMLWriter();

        xmlWriter.writeXmlFile( bpmnModelGenerator.generateBPMNModel(),"testWrite.xml");
    }

    @Test
    public void readXmlTest() throws IOException {
        XMLReader xmlReader = new XMLReader();
        Definitions definitions = xmlReader.readXmlFile("src/test/resources/testWrite.xml");

        System.out.println(definitions.getProcess().getId());
        System.out.println(definitions.getProcess().getStartEvent().getId());
        System.out.println(definitions.getBpmnDiagram().getId());
        System.out.println(definitions.getBpmnDiagram().getBpmnPlane().getId() + " - " + definitions.getBpmnDiagram().getBpmnPlane().getBpmnElement());
    }
}
