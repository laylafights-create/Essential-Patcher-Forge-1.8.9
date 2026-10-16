package com.leclowndu93150.essentialpatcher;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Legacy Forge 1.8.9 entry point.
 *
 * This module is intentionally isolated from the modern Prism/ForgeGradle builds.
 * Essential 1.8.9 uses a different internal API; feature mixins must be ported
 * against the matching Essential 1.8.9 artifact before enabling them.
 */
@Mod(
    modid = EssentialPatcher189.MOD_ID,
    name = "Essential Patcher",
    version = "1.0.9",
    clientSideOnly = true,
    acceptedMinecraftVersions = "[1.8.9]"
)
public final class EssentialPatcher189 {
    public static final String MOD_ID = "essentialpatcher";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        event.getModLog().info("Essential Patcher Forge 1.8.9 legacy module loaded.");
    }
}
