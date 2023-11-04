
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.intech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.intech.block.WeatheredCopperSpleavesBlock;
import net.mcreator.intech.block.WeatheredCopperPipeBlock;
import net.mcreator.intech.block.ReinforcedDarkBrassBlock;
import net.mcreator.intech.block.RawAluminumBlockBlock;
import net.mcreator.intech.block.PolishedBauxitePillarBlock;
import net.mcreator.intech.block.PolishedBauxiteBricksBlock;
import net.mcreator.intech.block.PolishedBauxiteBlock;
import net.mcreator.intech.block.OxidizedCopperSpleavesBlock;
import net.mcreator.intech.block.OxidizedCopperPipeBlock;
import net.mcreator.intech.block.ExposedCopperSpleavesBlock;
import net.mcreator.intech.block.ExposedCopperPipeBlock;
import net.mcreator.intech.block.DarkBrassTilesBlock;
import net.mcreator.intech.block.DarkBrassPipeBlock;
import net.mcreator.intech.block.DarkBrassPillarBlock;
import net.mcreator.intech.block.DarkBrassBlockBlock;
import net.mcreator.intech.block.CopperSpleavesBlock;
import net.mcreator.intech.block.CopperPipeBlock;
import net.mcreator.intech.block.CopperJunctionBlock;
import net.mcreator.intech.block.BauxiteBlock;
import net.mcreator.intech.block.AluminumTilesBlock;
import net.mcreator.intech.block.AluminumPillarBlock;
import net.mcreator.intech.block.AluminumBlockBlock;
import net.mcreator.intech.IntechMod;

public class IntechModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IntechMod.MODID);
	public static final RegistryObject<Block> BAUXITE = REGISTRY.register("bauxite", () -> new BauxiteBlock());
	public static final RegistryObject<Block> POLISHED_BAUXITE = REGISTRY.register("polished_bauxite", () -> new PolishedBauxiteBlock());
	public static final RegistryObject<Block> POLISHED_BAUXITE_BRICKS = REGISTRY.register("polished_bauxite_bricks", () -> new PolishedBauxiteBricksBlock());
	public static final RegistryObject<Block> POLISHED_BAUXITE_PILLAR = REGISTRY.register("polished_bauxite_pillar", () -> new PolishedBauxitePillarBlock());
	public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = REGISTRY.register("raw_aluminum_block", () -> new RawAluminumBlockBlock());
	public static final RegistryObject<Block> ALUMINUM_BLOCK = REGISTRY.register("aluminum_block", () -> new AluminumBlockBlock());
	public static final RegistryObject<Block> ALUMINUM_TILES = REGISTRY.register("aluminum_tiles", () -> new AluminumTilesBlock());
	public static final RegistryObject<Block> ALUMINUM_PILLAR = REGISTRY.register("aluminum_pillar", () -> new AluminumPillarBlock());
	public static final RegistryObject<Block> DARK_BRASS_BLOCK = REGISTRY.register("dark_brass_block", () -> new DarkBrassBlockBlock());
	public static final RegistryObject<Block> DARK_BRASS_TILES = REGISTRY.register("dark_brass_tiles", () -> new DarkBrassTilesBlock());
	public static final RegistryObject<Block> DARK_BRASS_PILLAR = REGISTRY.register("dark_brass_pillar", () -> new DarkBrassPillarBlock());
	public static final RegistryObject<Block> REINFORCED_DARK_BRASS = REGISTRY.register("reinforced_dark_brass", () -> new ReinforcedDarkBrassBlock());
	public static final RegistryObject<Block> COPPER_SPLEAVES = REGISTRY.register("copper_spleaves", () -> new CopperSpleavesBlock());
	public static final RegistryObject<Block> EXPOSED_COPPER_SPLEAVES = REGISTRY.register("exposed_copper_spleaves", () -> new ExposedCopperSpleavesBlock());
	public static final RegistryObject<Block> WEATHERED_COPPER_SPLEAVES = REGISTRY.register("weathered_copper_spleaves", () -> new WeatheredCopperSpleavesBlock());
	public static final RegistryObject<Block> COPPER_PIPE = REGISTRY.register("copper_pipe", () -> new CopperPipeBlock());
	public static final RegistryObject<Block> EXPOSED_COPPER_PIPE = REGISTRY.register("exposed_copper_pipe", () -> new ExposedCopperPipeBlock());
	public static final RegistryObject<Block> WEATHERED_COPPER_PIPE = REGISTRY.register("weathered_copper_pipe", () -> new WeatheredCopperPipeBlock());
	public static final RegistryObject<Block> OXIDIZED_COPPER_PIPE = REGISTRY.register("oxidized_copper_pipe", () -> new OxidizedCopperPipeBlock());
	public static final RegistryObject<Block> DARK_BRASS_PIPE = REGISTRY.register("dark_brass_pipe", () -> new DarkBrassPipeBlock());
	public static final RegistryObject<Block> OXIDIZED_COPPER_SPLEAVES = REGISTRY.register("oxidized_copper_spleaves", () -> new OxidizedCopperSpleavesBlock());
	public static final RegistryObject<Block> COPPER_JUNCTION = REGISTRY.register("copper_junction", () -> new CopperJunctionBlock());
}
