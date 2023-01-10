package org.hit.ices.ices_pm_platform.preexperiment;

import org.deckfour.xes.extension.std.XConceptExtension;
import org.deckfour.xes.in.*;
import org.deckfour.xes.info.XLogInfo;
import org.deckfour.xes.info.XLogInfoFactory;
import org.deckfour.xes.model.XLog;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collection;

public class XESModelParser {
    private XLog log;
    private XLogInfo logInfo;

//  构造方法，完成所有初始化操作。只用调用构造方法然后访问getter即可获取日志。
    public XESModelParser() throws Exception {
         log = parseXES(convert("src/main/resources/data_transfer_file/logFile.xes"));
         logInfo = XLogInfoFactory.createLogInfo(log);
    }
//  2个功能方法
    public FileInputStream convert(String filePathName) throws FileNotFoundException {
        return new FileInputStream(filePathName);
    }
    public XLog parseXES(InputStream inputStream) throws Exception {
        Collection<XLog> logs;
        XParser parser = new XesXmlParser();
        try {
            logs = parser.parse(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
            logs = null;
        }
        if (logs == null) {
            // try any other parser
            for (XParser p : XParserRegistry.instance().getAvailable()) {
                if (p == parser) {
                    continue;
                }
                try {
                    logs = p.parse(inputStream);
                    if (logs.size() > 0) {
                        break;
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                    logs = null;
                }
            }
        }

        // log sanity checks;
        // notify user if the log is awkward / does miss crucial information
        if (logs == null || logs.size() == 0) {
            throw new Exception("No processes contained in log!");
        }

        XLog log = logs.iterator().next();
        if (XConceptExtension.instance().extractName(log) == null) {
            XConceptExtension.instance().assignName(log, "Anonymous log imported from ");
        }

        if (log.isEmpty()) {
            throw new Exception("No process instances contained in log!");
        }

        return log;
    }

//  Getters
    public XLog getLog() {
        return log;
    }
    public XLogInfo getLogInfo() {
        return logInfo;
    }


}
