package com.ytonidc.mondoteleport.fabric.mixin;

import com.ytonidc.mondoteleport.MondoTeleport;
import net.minecraft.commands.arguments.MessageArgument;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MessageArgument.Message.class)
public class MixinMessageArgument_Message {
    @Redirect(method = "resolveComponent", at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/arguments/selector/EntitySelectorParser;allowSelectors(Ljava/lang/Object;)Z"))
    private <S> boolean redirectHasPermission(S s) {
        return MondoTeleport.passPermissionCheck();
    }
}
