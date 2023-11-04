
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.intech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.intech.IntechMod;

public class IntechModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, IntechMod.MODID);
	public static final RegistryObject<SoundEvent> PIPECLANK = REGISTRY.register("pipeclank", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "pipeclank")));
	public static final RegistryObject<SoundEvent> BLOCK_PIPE_BREAK = REGISTRY.register("block.pipe.break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.pipe.break")));
	public static final RegistryObject<SoundEvent> BLOCK_PIPE_STEP = REGISTRY.register("block.pipe.step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.pipe.step")));
}
