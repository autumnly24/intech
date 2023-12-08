
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.intech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.intech.block.entity.WeatheredCopperPipeBlockEntity;
import net.mcreator.intech.block.entity.OxidizedCopperPipeBlockEntity;
import net.mcreator.intech.block.entity.ExtruderBlockEntity;
import net.mcreator.intech.block.entity.ExposedCopperPipeBlockEntity;
import net.mcreator.intech.block.entity.DarkBrassPipeBlockEntity;
import net.mcreator.intech.block.entity.CopperPipeBlockEntity;
import net.mcreator.intech.IntechMod;

public class IntechModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, IntechMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COPPER_PIPE = register("copper_pipe", IntechModBlocks.COPPER_PIPE, CopperPipeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EXPOSED_COPPER_PIPE = register("exposed_copper_pipe", IntechModBlocks.EXPOSED_COPPER_PIPE, ExposedCopperPipeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEATHERED_COPPER_PIPE = register("weathered_copper_pipe", IntechModBlocks.WEATHERED_COPPER_PIPE, WeatheredCopperPipeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OXIDIZED_COPPER_PIPE = register("oxidized_copper_pipe", IntechModBlocks.OXIDIZED_COPPER_PIPE, OxidizedCopperPipeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_BRASS_PIPE = register("dark_brass_pipe", IntechModBlocks.DARK_BRASS_PIPE, DarkBrassPipeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EXTRUDER = register("extruder", IntechModBlocks.EXTRUDER, ExtruderBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
