package org.hit.ices.ices_pm_platform.postexperiment;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import org.hit.ices.ices_pm_platform.postexperiment.bpmnmodel.Definitions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class XMLWriter {
    public void writeXmlFile(Definitions definitions, String xmlFileName) {
        ObjectMapper mapper = new XmlMapper().configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        try {
            File file = new File("src/main/resources/data_transfer_file/" + xmlFileName);
            if (!file.exists()) {file.createNewFile();}

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(definitions));
            bw.close();
        }
        catch (JsonProcessingException e) {e.printStackTrace();}
        catch (IOException e) {throw new RuntimeException(e);}
    }
}
