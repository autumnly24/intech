
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
	public static final RegistryObject<SoundEvent> BLOCK_PIPE_PLACE = REGISTRY.register("block.pipe.place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.pipe.place")));
	public static final RegistryObject<SoundEvent> BLOCK_PIPE_STEP = REGISTRY.register("block.pipe.step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.pipe.step")));
	public static final RegistryObject<SoundEvent> BLOCK_SPLEAVES_BREAK = REGISTRY.register("block.spleaves.break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.spleaves.break")));
	public static final RegistryObject<SoundEvent> BLOCK_SPLEAVES_PLACE = REGISTRY.register("block.spleaves.place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.spleaves.place")));
	public static final RegistryObject<SoundEvent> BLOCK_SPLEAVES_STEP = REGISTRY.register("block.spleaves.step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.spleaves.step")));
	public static final RegistryObject<SoundEvent> BLOCK_ZINC_PLACE = REGISTRY.register("block.zinc.place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.zinc.place")));
	public static final RegistryObject<SoundEvent> BLOCK_ALUMINUM_STEP = REGISTRY.register("block.aluminum.step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.aluminum.step")));
	public static final RegistryObject<SoundEvent> BLOCK_ALUMINUM_HIT = REGISTRY.register("block.aluminum.hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.aluminum.hit")));
	public static final RegistryObject<SoundEvent> BLOCK_ALUMINUM_PLACE = REGISTRY.register("block.aluminum.place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.aluminum.place")));
	public static final RegistryObject<SoundEvent> BLOCK_ZINC_STEP = REGISTRY.register("block.zinc.step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.zinc.step")));
	public static final RegistryObject<SoundEvent> BLOCK_ZINC_HIT = REGISTRY.register("block.zinc.hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.zinc.hit")));
	public static final RegistryObject<SoundEvent> BLOCK_ZINC_BREAK = REGISTRY.register("block.zinc.break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.zinc.break")));
	public static final RegistryObject<SoundEvent> BLOCK_ALUMINUM_BREAK = REGISTRY.register("block.aluminum.break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("intech", "block.aluminum.break")));
}
