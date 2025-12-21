package com.ytonidc.mondoteleport.mixin;

import com.ytonidc.mondoteleport.MondoTeleport;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.arguments.selector.EntitySelector;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntitySelector.class)
public class MixinEntitySelector {
    @Inject(method = "checkPermissions", at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/CommandSourceStack;hasPermission(I)Z"), cancellable = true)
    private void checkPermissions(CommandSourceStack commandSourceStack, CallbackInfo ci) {
        if (MondoTeleport.passPermissionCheck()) {
            ci.cancel();
        }
    }
}
