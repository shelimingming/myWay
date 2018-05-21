package com.myway.helloworld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloLog4j {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(HelloLog4j.class.getName());


        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");

    }
}
