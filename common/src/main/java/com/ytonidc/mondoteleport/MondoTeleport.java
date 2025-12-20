package com.ytonidc.mondoteleport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class MondoTeleport {
    public static final String MOD_ID = "mondoteleport";
    public static final Logger log = LogManager.getLogger(MOD_ID);

    public static void init() {
        log.info("Initializing MondoTeleport Mod!");
    }

    public static boolean passPermissionCheck() {
        return true;
    }
}
