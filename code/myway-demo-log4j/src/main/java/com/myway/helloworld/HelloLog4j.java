package com.myway.helloworld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.PrintWriter;
import java.io.StringWriter;

public class HelloLog4j {
    private static Logger logger = LogManager.getLogger(HelloLog4j.class.getName());

    public static void main(String[] args) {
//        logger.trace("trace level");
//        logger.debug("debug level");
//        logger.info("info level");
//        logger.warn("warn level");
//        logger.error("error level");
//        logger.fatal("fatal level");

        doError();

    }

    public static void doError() {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            logger.error(collectExceptionStackMsg(e));
        }
    }

    /**
     * 收集异常堆栈信息
     */
    public static String collectExceptionStackMsg(Exception e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw, true));
        String strs = sw.toString();
        return strs;
    }

}
