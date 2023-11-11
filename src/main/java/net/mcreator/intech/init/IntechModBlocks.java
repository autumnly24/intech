
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.intech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.intech.block.ZincTilesBlock;
import net.mcreator.intech.block.ZincOreBlock;
import net.mcreator.intech.block.ZincDoorBlock;
import net.mcreator.intech.block.ZincBlockBlock;
import net.mcreator.intech.block.ZincBatteryBlock;
import net.mcreator.intech.block.WeatheredCopperSpleavesBlock;
import net.mcreator.intech.block.WeatheredCopperPipeBlock;
import net.mcreator.intech.block.WeatheredCopperMeshBlock;
import net.mcreator.intech.block.WeatheredChiseledCopperBlock;
import net.mcreator.intech.block.WaxedWeatheredCopperMeshBlock;
import net.mcreator.intech.block.WaxedWeatheredCopperGrateBlock;
import net.mcreator.intech.block.WaxedWeatheredChiseledCopperBlock;
import net.mcreator.intech.block.WaxedOxidizedCopperMeshBlock;
import net.mcreator.intech.block.WaxedOxidizedCopperGrateBlock;
import net.mcreator.intech.block.WaxedOxidizedChiseledCopperBlock;
import net.mcreator.intech.block.WaxedExposedCopperMeshBlock;
import net.mcreator.intech.block.WaxedExposedCopperGrateBlock;
import net.mcreator.intech.block.WaxedExposedChiseledCopperBlock;
import net.mcreator.intech.block.WaxedCopperMeshBlock;
import net.mcreator.intech.block.WaxedCopperGrateBlock;
import net.mcreator.intech.block.WaxedChiseledCopperBlock;
import net.mcreator.intech.block.ReinforcedWeatheredCopperSpleavesBlock;
import net.mcreator.intech.block.ReinforcedOxidizedCopperSpleavesBlock;
import net.mcreator.intech.block.ReinforcedExposedCopperSpleavesBlock;
import net.mcreator.intech.block.ReinforcedDarkBrassBlock;
import net.mcreator.intech.block.ReinforcedCopperSpleavesBlock;
import net.mcreator.intech.block.RawAluminumBlockBlock;
import net.mcreator.intech.block.PulverizerBlock;
import net.mcreator.intech.block.PolishedTuffWallBlock;
import net.mcreator.intech.block.PolishedTuffStairsBlock;
import net.mcreator.intech.block.PolishedTuffSlabBlock;
import net.mcreator.intech.block.PolishedTuffBricksBlock;
import net.mcreator.intech.block.PolishedTuffBrickWallBlock;
import net.mcreator.intech.block.PolishedTuffBrickStairsBlock;
import net.mcreator.intech.block.PolishedTuffBrickSlabBlock;
import net.mcreator.intech.block.PolishedTuffBlock;
import net.mcreator.intech.block.PolishedChiseledTuffBricksBlock;
import net.mcreator.intech.block.PolishedChiseledTuffBlock;
import net.mcreator.intech.block.PolishedBauxitePillarBlock;
import net.mcreator.intech.block.PolishedBauxiteBricksBlock;
import net.mcreator.intech.block.PolishedBauxiteBrickWallBlock;
import net.mcreator.intech.block.PolishedBauxiteBrickStairsBlock;
import net.mcreator.intech.block.PolishedBauxiteBrickSlabBlock;
import net.mcreator.intech.block.PolishedBauxiteBlock;
import net.mcreator.intech.block.OxidizedCopperSpleavesBlock;
import net.mcreator.intech.block.OxidizedCopperPipeBlock;
import net.mcreator.intech.block.OxidizedCopperMeshBlock;
import net.mcreator.intech.block.OxidizedChiseledCopperBlock;
import net.mcreator.intech.block.LitLightningBulbBlock;
import net.mcreator.intech.block.LightningBulbBlock;
import net.mcreator.intech.block.ExposedCopperSpleavesBlock;
import net.mcreator.intech.block.ExposedCopperPipeBlock;
import net.mcreator.intech.block.ExposedCopperMeshBlock;
import net.mcreator.intech.block.ExposedChiseledCopperBlock;
import net.mcreator.intech.block.DeepslateZincOreBlock;
import net.mcreator.intech.block.DarkBrassTilesBlock;
import net.mcreator.intech.block.DarkBrassPipeBlock;
import net.mcreator.intech.block.DarkBrassPillarBlock;
import net.mcreator.intech.block.DarkBrassDoorBlock;
import net.mcreator.intech.block.DarkBrassBlockBlock;
import net.mcreator.intech.block.CopperSpleavesBlock;
import net.mcreator.intech.block.CopperPipeBlock;
import net.mcreator.intech.block.CopperMeshBlock;
import net.mcreator.intech.block.CopperJunctionBlock;
import net.mcreator.intech.block.CopperDiodeBlock;
import net.mcreator.intech.block.CopperCableBlock;
import net.mcreator.intech.block.ChiseledCopperBlock;
import net.mcreator.intech.block.BauxiteWallBlock;
import net.mcreator.intech.block.BauxiteStairsBlock;
import net.mcreator.intech.block.BauxiteSlabBlock;
import net.mcreator.intech.block.BauxitePressurePlateBlock;
import net.mcreator.intech.block.BauxiteButtonBlock;
import net.mcreator.intech.block.BauxiteBlock;
import net.mcreator.intech.block.AncientCoilBlock;
import net.mcreator.intech.block.AluminumTilesBlock;
import net.mcreator.intech.block.AluminumTileStairsBlock;
import net.mcreator.intech.block.AluminumTileSlabBlock;
import net.mcreator.intech.block.AluminumPillarBlock;
import net.mcreator.intech.block.AluminumDoorBlock;
import net.mcreator.intech.block.AluminumBlockBlock;
import net.mcreator.intech.IntechMod;

public class IntechModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IntechMod.MODID);
	public static final RegistryObject<Block> BAUXITE = REGISTRY.register("bauxite", () -> new BauxiteBlock());
	public static final RegistryObject<Block> BAUXITE_STAIRS = REGISTRY.register("bauxite_stairs", () -> new BauxiteStairsBlock());
	public static final RegistryObject<Block> BAUXITE_SLAB = REGISTRY.register("bauxite_slab", () -> new BauxiteSlabBlock());
	public static final RegistryObject<Block> BAUXITE_WALL = REGISTRY.register("bauxite_wall", () -> new BauxiteWallBlock());
	public static final RegistryObject<Block> POLISHED_BAUXITE = REGISTRY.register("polished_bauxite", () -> new PolishedBauxiteBlock());
	public static final RegistryObject<Block> POLISHED_BAUXITE_BRICKS = REGISTRY.register("polished_bauxite_bricks", () -> new PolishedBauxiteBricksBlock());
	public static final RegistryObject<Block> POLISHED_BAUXITE_BRICK_STAIRS = REGISTRY.register("polished_bauxite_brick_stairs", () -> new PolishedBauxiteBrickStairsBlock());
	public static final RegistryObject<Block> POLISHED_BAUXITE_BRICK_SLAB = REGISTRY.register("polished_bauxite_brick_slab", () -> new PolishedBauxiteBrickSlabBlock());
	public static final RegistryObject<Block> POLISHED_BAUXITE_BRICK_WALL = REGISTRY.register("polished_bauxite_brick_wall", () -> new PolishedBauxiteBrickWallBlock());
	public static final RegistryObject<Block> POLISHED_BAUXITE_PILLAR = REGISTRY.register("polished_bauxite_pillar", () -> new PolishedBauxitePillarBlock());
	public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = REGISTRY.register("raw_aluminum_block", () -> new RawAluminumBlockBlock());
	public static final RegistryObject<Block> ALUMINUM_BLOCK = REGISTRY.register("aluminum_block", () -> new AluminumBlockBlock());
	public static final RegistryObject<Block> ALUMINUM_TILES = REGISTRY.register("aluminum_tiles", () -> new AluminumTilesBlock());
	public static final RegistryObject<Block> ALUMINUM_TILE_STAIRS = REGISTRY.register("aluminum_tile_stairs", () -> new AluminumTileStairsBlock());
	public static final RegistryObject<Block> ALUMINUM_TILE_SLAB = REGISTRY.register("aluminum_tile_slab", () -> new AluminumTileSlabBlock());
	public static final RegistryObject<Block> ALUMINUM_PILLAR = REGISTRY.register("aluminum_pillar", () -> new AluminumPillarBlock());
	public static final RegistryObject<Block> ALUMINUM_DOOR = REGISTRY.register("aluminum_door", () -> new AluminumDoorBlock());
	public static final RegistryObject<Block> DARK_BRASS_BLOCK = REGISTRY.register("dark_brass_block", () -> new DarkBrassBlockBlock());
	public static final RegistryObject<Block> DARK_BRASS_TILES = REGISTRY.register("dark_brass_tiles", () -> new DarkBrassTilesBlock());
	public static final RegistryObject<Block> DARK_BRASS_PILLAR = REGISTRY.register("dark_brass_pillar", () -> new DarkBrassPillarBlock());
	public static final RegistryObject<Block> REINFORCED_DARK_BRASS = REGISTRY.register("reinforced_dark_brass", () -> new ReinforcedDarkBrassBlock());
	public static final RegistryObject<Block> DARK_BRASS_DOOR = REGISTRY.register("dark_brass_door", () -> new DarkBrassDoorBlock());
	public static final RegistryObject<Block> CHISELED_COPPER = REGISTRY.register("chiseled_copper", () -> new ChiseledCopperBlock());
	public static final RegistryObject<Block> WAXED_CHISELED_COPPER = REGISTRY.register("waxed_chiseled_copper", () -> new WaxedChiseledCopperBlock());
	public static final RegistryObject<Block> COPPER_SPLEAVES = REGISTRY.register("copper_spleaves", () -> new CopperSpleavesBlock());
	public static final RegistryObject<Block> REINFORCED_COPPER_SPLEAVES = REGISTRY.register("reinforced_copper_spleaves", () -> new ReinforcedCopperSpleavesBlock());
	public static final RegistryObject<Block> WAXED_COPPER_GRATE = REGISTRY.register("waxed_copper_grate", () -> new WaxedCopperGrateBlock());
	public static final RegistryObject<Block> COPPER_MESH = REGISTRY.register("copper_mesh", () -> new CopperMeshBlock());
	public static final RegistryObject<Block> WAXED_COPPER_MESH = REGISTRY.register("waxed_copper_mesh", () -> new WaxedCopperMeshBlock());
	public static final RegistryObject<Block> EXPOSED_CHISELED_COPPER = REGISTRY.register("exposed_chiseled_copper", () -> new ExposedChiseledCopperBlock());
	public static final RegistryObject<Block> WAXED_EXPOSED_CHISELED_COPPER = REGISTRY.register("waxed_exposed_chiseled_copper", () -> new WaxedExposedChiseledCopperBlock());
	public static final RegistryObject<Block> EXPOSED_COPPER_SPLEAVES = REGISTRY.register("exposed_copper_spleaves", () -> new ExposedCopperSpleavesBlock());
	public static final RegistryObject<Block> REINFORCED_EXPOSED_COPPER_SPLEAVES = REGISTRY.register("reinforced_exposed_copper_spleaves", () -> new ReinforcedExposedCopperSpleavesBlock());
	public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_GRATE = REGISTRY.register("waxed_exposed_copper_grate", () -> new WaxedExposedCopperGrateBlock());
	public static final RegistryObject<Block> EXPOSED_COPPER_MESH = REGISTRY.register("exposed_copper_mesh", () -> new ExposedCopperMeshBlock());
	public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_MESH = REGISTRY.register("waxed_exposed_copper_mesh", () -> new WaxedExposedCopperMeshBlock());
	public static final RegistryObject<Block> WEATHERED_CHISELED_COPPER = REGISTRY.register("weathered_chiseled_copper", () -> new WeatheredChiseledCopperBlock());
	public static final RegistryObject<Block> WAXED_WEATHERED_CHISELED_COPPER = REGISTRY.register("waxed_weathered_chiseled_copper", () -> new WaxedWeatheredChiseledCopperBlock());
	public static final RegistryObject<Block> WEATHERED_COPPER_SPLEAVES = REGISTRY.register("weathered_copper_spleaves", () -> new WeatheredCopperSpleavesBlock());
	public static final RegistryObject<Block> REINFORCED_WEATHERED_COPPER_SPLEAVES = REGISTRY.register("reinforced_weathered_copper_spleaves", () -> new ReinforcedWeatheredCopperSpleavesBlock());
	public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_GRATE = REGISTRY.register("waxed_weathered_copper_grate", () -> new WaxedWeatheredCopperGrateBlock());
	public static final RegistryObject<Block> WEATHERED_COPPER_MESH = REGISTRY.register("weathered_copper_mesh", () -> new WeatheredCopperMeshBlock());
	public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_MESH = REGISTRY.register("waxed_weathered_copper_mesh", () -> new WaxedWeatheredCopperMeshBlock());
	public static final RegistryObject<Block> OXIDIZED_CHISELED_COPPER = REGISTRY.register("oxidized_chiseled_copper", () -> new OxidizedChiseledCopperBlock());
	public static final RegistryObject<Block> WAXED_OXIDIZED_CHISELED_COPPER = REGISTRY.register("waxed_oxidized_chiseled_copper", () -> new WaxedOxidizedChiseledCopperBlock());
	public static final RegistryObject<Block> OXIDIZED_COPPER_SPLEAVES = REGISTRY.register("oxidized_copper_spleaves", () -> new OxidizedCopperSpleavesBlock());
	public static final RegistryObject<Block> REINFORCED_OXIDIZED_COPPER_SPLEAVES = REGISTRY.register("reinforced_oxidized_copper_spleaves", () -> new ReinforcedOxidizedCopperSpleavesBlock());
	public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_GRATE = REGISTRY.register("waxed_oxidized_copper_grate", () -> new WaxedOxidizedCopperGrateBlock());
	public static final RegistryObject<Block> OXIDIZED_COPPER_MESH = REGISTRY.register("oxidized_copper_mesh", () -> new OxidizedCopperMeshBlock());
	public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_MESH = REGISTRY.register("waxed_oxidized_copper_mesh", () -> new WaxedOxidizedCopperMeshBlock());
	public static final RegistryObject<Block> ZINC_BLOCK = REGISTRY.register("zinc_block", () -> new ZincBlockBlock());
	public static final RegistryObject<Block> ZINC_TILES = REGISTRY.register("zinc_tiles", () -> new ZincTilesBlock());
	public static final RegistryObject<Block> ZINC_DOOR = REGISTRY.register("zinc_door", () -> new ZincDoorBlock());
	public static final RegistryObject<Block> POLISHED_TUFF = REGISTRY.register("polished_tuff", () -> new PolishedTuffBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_STAIRS = REGISTRY.register("polished_tuff_stairs", () -> new PolishedTuffStairsBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_SLAB = REGISTRY.register("polished_tuff_slab", () -> new PolishedTuffSlabBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_WALL = REGISTRY.register("polished_tuff_wall", () -> new PolishedTuffWallBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_BRICKS = REGISTRY.register("polished_tuff_bricks", () -> new PolishedTuffBricksBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_BRICK_STAIRS = REGISTRY.register("polished_tuff_brick_stairs", () -> new PolishedTuffBrickStairsBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_BRICK_SLAB = REGISTRY.register("polished_tuff_brick_slab", () -> new PolishedTuffBrickSlabBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_BRICK_WALL = REGISTRY.register("polished_tuff_brick_wall", () -> new PolishedTuffBrickWallBlock());
	public static final RegistryObject<Block> POLISHED_CHISELED_TUFF = REGISTRY.register("polished_chiseled_tuff", () -> new PolishedChiseledTuffBlock());
	public static final RegistryObject<Block> POLISHED_CHISELED_TUFF_BRICKS = REGISTRY.register("polished_chiseled_tuff_bricks", () -> new PolishedChiseledTuffBricksBlock());
	public static final RegistryObject<Block> PULVERIZER = REGISTRY.register("pulverizer", () -> new PulverizerBlock());
	public static final RegistryObject<Block> COPPER_PIPE = REGISTRY.register("copper_pipe", () -> new CopperPipeBlock());
	public static final RegistryObject<Block> EXPOSED_COPPER_PIPE = REGISTRY.register("exposed_copper_pipe", () -> new ExposedCopperPipeBlock());
	public static final RegistryObject<Block> WEATHERED_COPPER_PIPE = REGISTRY.register("weathered_copper_pipe", () -> new WeatheredCopperPipeBlock());
	public static final RegistryObject<Block> OXIDIZED_COPPER_PIPE = REGISTRY.register("oxidized_copper_pipe", () -> new OxidizedCopperPipeBlock());
	public static final RegistryObject<Block> DARK_BRASS_PIPE = REGISTRY.register("dark_brass_pipe", () -> new DarkBrassPipeBlock());
	public static final RegistryObject<Block> COPPER_JUNCTION = REGISTRY.register("copper_junction", () -> new CopperJunctionBlock());
	public static final RegistryObject<Block> COPPER_CABLE = REGISTRY.register("copper_cable", () -> new CopperCableBlock());
	public static final RegistryObject<Block> ZINC_BATTERY = REGISTRY.register("zinc_battery", () -> new ZincBatteryBlock());
	public static final RegistryObject<Block> LIGHTNING_BULB = REGISTRY.register("lightning_bulb", () -> new LightningBulbBlock());
	public static final RegistryObject<Block> BAUXITE_PRESSURE_PLATE = REGISTRY.register("bauxite_pressure_plate", () -> new BauxitePressurePlateBlock());
	public static final RegistryObject<Block> BAUXITE_BUTTON = REGISTRY.register("bauxite_button", () -> new BauxiteButtonBlock());
	public static final RegistryObject<Block> ZINC_ORE = REGISTRY.register("zinc_ore", () -> new ZincOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = REGISTRY.register("deepslate_zinc_ore", () -> new DeepslateZincOreBlock());
	public static final RegistryObject<Block> LIT_LIGHTNING_BULB = REGISTRY.register("lit_lightning_bulb", () -> new LitLightningBulbBlock());
	public static final RegistryObject<Block> COPPER_DIODE = REGISTRY.register("copper_diode", () -> new CopperDiodeBlock());
	public static final RegistryObject<Block> ANCIENT_COIL = REGISTRY.register("ancient_coil", () -> new AncientCoilBlock());
}
