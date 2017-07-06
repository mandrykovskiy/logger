package com;

import org.apache.log4j.Logger;

public class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getSimpleName());

    public static void main(String[] args) {
        LOGGER.info("Method is started");
        LOGGER.warn("you are going yo divide by zero!");
        try {
            int a = 1 / 0;
        } catch (Throwable cause) {
            LOGGER.error("can't divide by zero", cause);
        }
    }
}
