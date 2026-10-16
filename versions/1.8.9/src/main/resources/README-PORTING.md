# Forge 1.8.9 port status

This is an isolated ForgeGradle 2.1 module targeting Minecraft 1.8.9 / Forge
11.15.1.2318 and Java 8.

It currently provides the legacy Forge mod entry point and build configuration.
It does **not** claim feature parity with modern Essential Patcher: the modern
mixins target newer Essential/Minecraft internals and cannot safely be reused
on 1.8.9. Cosmetic unlocking, telemetry blocking, UI patches, and cosmetic sync
must be ported individually after inspecting the exact Essential 1.8.9 client
artifact and its mappings.

Build from this directory with a Java 8 runtime:

    gradle setupDecompWorkspace
    gradle build

The output JAR is written to `build/libs/`.
