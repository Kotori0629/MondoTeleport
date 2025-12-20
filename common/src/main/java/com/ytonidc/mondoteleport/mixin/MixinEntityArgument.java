package com.ytonidc.mondoteleport.mixin;

import com.mojang.brigadier.StringReader;
import com.ytonidc.mondoteleport.MondoTeleport;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.arguments.selector.EntitySelectorParser;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EntityArgument.class)
public class MixinEntityArgument {
    @Redirect(method = "listSuggestions", at = @At(value = "NEW", target = "(Lcom/mojang/brigadier/StringReader;Z)Lnet/minecraft/commands/arguments/selector/EntitySelectorParser;"))
    private EntitySelectorParser mondoTeleport$createEntitySelectorParser(StringReader reader, boolean allowFallback) {
        return new EntitySelectorParser(reader, MondoTeleport.passPermissionCheck());
    }
}