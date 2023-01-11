package org.hit.ices.ices_pm_platform;

import org.hit.ices.ices_pm_platform.postexperiment.BPMNModelGenerator;
import org.hit.ices.ices_pm_platform.postexperiment.XMLWriter;
import org.junit.Test;

public class PostExperimentTest extends IcesPmPlatformApplicationTests{
    @Test
    public void generateBPMNModelTest(){
        BPMNModelGenerator bpmnModelGenerator = new BPMNModelGenerator();
        XMLWriter xmlWriter = new XMLWriter();

        xmlWriter.writeXmlFile( bpmnModelGenerator.generateBPMNModel(),"testWrite.xml");

    }
}
