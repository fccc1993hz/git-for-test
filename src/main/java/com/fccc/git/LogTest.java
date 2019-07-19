package com.fccc.git;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by fccc on 2019/7/3
 */
public class LogTest {
    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            logger.trace("trace-" + new Date());
            logger.debug("debug-" + new Date());
            logger.info("info-" + new Date());
            logger.warn("warn-" + new Date());
            logger.error("error-" + new Date());
        }
    }
}
