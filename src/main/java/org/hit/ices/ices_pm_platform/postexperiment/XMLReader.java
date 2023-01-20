package org.hit.ices.ices_pm_platform.postexperiment;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.bpmnmodelforread.Definitions;

import java.io.FileInputStream;
import java.io.IOException;

public class XMLReader {
    public Definitions readXmlFile(String filePath) throws IOException {
        FileInputStream input = new FileInputStream(filePath);

        XmlMapper mapper = new XmlMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Definitions definitions = mapper.readValue(input, Definitions.class);

        return definitions;
    }
}
