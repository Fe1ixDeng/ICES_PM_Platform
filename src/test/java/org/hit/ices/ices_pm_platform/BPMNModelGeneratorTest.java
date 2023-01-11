package org.hit.ices.ices_pm_platform;

import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.Definitions;
import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.process.Process;
import org.junit.Assert;
import org.junit.Test;

public class BPMNModelGeneratorTest extends IcesPmPlatformApplicationTests{
    private Definitions definitions = new Definitions(new Process("p1"));
    @Test
    public void testGenerateDefinitions() {
        Assert.assertNotNull(definitions.getProcess());
    }
}
