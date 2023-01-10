package org.hit.ices.ices_pm_platform;

import org.deckfour.xes.info.XLogInfo;
import org.deckfour.xes.model.XLog;
import org.hit.ices.ices_pm_platform.preexperiment.XESModelParser;
import org.junit.Test;

public class XESModelParserTest extends IcesPmPlatformApplicationTests{
    @Test
    public void parseXESTest() throws Exception {
        XESModelParser xesModelParser = new XESModelParser();

        XLog xlog = xesModelParser.getLog();
        XLogInfo xLogInfo = xesModelParser.getLogInfo();

        System.out.println(xlog.get(0).getAttributes());
        System.out.println(xLogInfo.getNumberOfEvents());
        System.out.println(xLogInfo.getEventClasses());
        System.out.println(xLogInfo.getLogTimeBoundaries());
        System.out.println(xLogInfo.getTraceAttributeInfo());
    }
}

