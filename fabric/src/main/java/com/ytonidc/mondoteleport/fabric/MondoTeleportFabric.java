package com.ytonidc.mondoteleport.fabric;

import com.ytonidc.mondoteleport.MondoTeleport;
import net.fabricmc.api.ModInitializer;

public final class MondoTeleportFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MondoTeleport.init();
    }
}
