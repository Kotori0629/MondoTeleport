package com.ytonidc.mondoteleport.mixin;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.ytonidc.mondoteleport.MondoTeleport;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.commands.TeleportCommand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.RelativeMovement;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Set;

@Mixin(TeleportCommand.class)
public class MixinTeleportCommand {
    @Inject(method = "performTeleport", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/BlockPos;containing(DDD)Lnet/minecraft/core/BlockPos;"))
    private static void onTeleport(CommandSourceStack commandSourceStack, Entity entity, ServerLevel serverLevel, double d, double e, double f, Set<RelativeMovement> set, float g, float h, TeleportCommand.LookAt lookAt, CallbackInfo ci) {
        if (entity instanceof Player player) {
            MondoTeleport.log.info("[MondoTeleport]: Player {} is trying to teleport to {} {} {}", player.getName().getString(), d, e, f);
        }
    }

    @ModifyArg(method = "register", at = @At(value = "INVOKE", target = "Lcom/mojang/brigadier/CommandDispatcher;register(Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;)Lcom/mojang/brigadier/tree/LiteralCommandNode;"))
    private static LiteralArgumentBuilder<CommandSourceStack> ignoreTeleportPermission(LiteralArgumentBuilder<CommandSourceStack> command) {
        return command.requires(source -> source.hasPermission(0));
    }
}
