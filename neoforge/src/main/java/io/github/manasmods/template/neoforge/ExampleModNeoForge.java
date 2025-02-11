package io.github.manasmods.template.neoforge;

import net.neoforged.fml.common.Mod;

import io.github.manasmods.template.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
