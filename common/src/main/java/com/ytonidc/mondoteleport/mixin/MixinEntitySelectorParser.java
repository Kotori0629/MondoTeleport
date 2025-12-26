package com.ytonidc.mondoteleport.mixin;

import com.ytonidc.mondoteleport.MondoTeleport;
import net.minecraft.commands.SharedSuggestionProvider;
import net.minecraft.commands.arguments.selector.EntitySelectorParser;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EntitySelectorParser.class)
public class MixinEntitySelectorParser {
    @Redirect(method = "allowSelectors", at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/SharedSuggestionProvider;hasPermission(I)Z"))
    private static boolean allowSelectors(SharedSuggestionProvider sharedSuggestionProvider, int i) {
        return MondoTeleport.passPermissionCheck();
    }
}
