package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    // This creates a proper logger instance
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        // Replacing System.out.println with a logger to satisfy SonarCloud
        logger.info("Hello DevSecOps");
    }
}
