package com.ytonidc.mondoteleport.forge;

import com.ytonidc.mondoteleport.MondoTeleport;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MondoTeleport.MOD_ID)
public final class MondoTeleportForge {
    public MondoTeleportForge() {
        EventBuses.registerModEventBus(MondoTeleport.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MondoTeleport.init();
    }
}
