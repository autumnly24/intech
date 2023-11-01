
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.intech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.intech.block.BauxiteBlock;
import net.mcreator.intech.IntechMod;

public class IntechModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IntechMod.MODID);
	public static final RegistryObject<Block> BAUXITE = REGISTRY.register("bauxite", () -> new BauxiteBlock());
}
