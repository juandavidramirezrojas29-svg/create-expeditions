package com.craftworkgames.expeditions.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpeditionHelper {
    private static final Logger LOGGER = LoggerFactory.getLogger("Expeditions Helper");

    public static void log(String message) {
        LOGGER.info("[Expeditions] " + message);
    }

    public static void warn(String message) {
        LOGGER.warn("[Expeditions] " + message);
    }

    public static void error(String message) {
        LOGGER.error("[Expeditions] " + message);
    }
}
