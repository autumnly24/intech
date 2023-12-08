
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.intech.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.intech.IntechMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IntechModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IntechMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(IntechModBlocks.BAUXITE.get().asItem());
			tabData.accept(IntechModBlocks.BAUXITE_STAIRS.get().asItem());
			tabData.accept(IntechModBlocks.BAUXITE_SLAB.get().asItem());
			tabData.accept(IntechModBlocks.BAUXITE_WALL.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_BAUXITE.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_BAUXITE_BRICKS.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_BAUXITE_BRICK_STAIRS.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_BAUXITE_BRICK_SLAB.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_BAUXITE_BRICK_WALL.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_BAUXITE_PILLAR.get().asItem());
			tabData.accept(IntechModBlocks.RAW_ALUMINUM_BLOCK.get().asItem());
			tabData.accept(IntechModBlocks.ALUMINUM_BLOCK.get().asItem());
			tabData.accept(IntechModBlocks.ALUMINUM_TILES.get().asItem());
			tabData.accept(IntechModBlocks.ALUMINUM_TILE_STAIRS.get().asItem());
			tabData.accept(IntechModBlocks.ALUMINUM_TILE_SLAB.get().asItem());
			tabData.accept(IntechModBlocks.ALUMINUM_PILLAR.get().asItem());
			tabData.accept(IntechModBlocks.ALUMINUM_DOOR.get().asItem());
			tabData.accept(IntechModBlocks.DARK_BRASS_BLOCK.get().asItem());
			tabData.accept(IntechModBlocks.DARK_BRASS_TILES.get().asItem());
			tabData.accept(IntechModBlocks.DARK_BRASS_PILLAR.get().asItem());
			tabData.accept(IntechModBlocks.REINFORCED_DARK_BRASS.get().asItem());
			tabData.accept(IntechModBlocks.DARK_BRASS_DOOR.get().asItem());
			tabData.accept(IntechModBlocks.CHISELED_COPPER.get().asItem());
			tabData.accept(IntechModBlocks.WAXED_CHISELED_COPPER.get().asItem());
			tabData.accept(IntechModBlocks.COPPER_SPLEAVES.get().asItem());
			tabData.accept(IntechModBlocks.REINFORCED_COPPER_SPLEAVES.get().asItem());
			tabData.accept(IntechModBlocks.WAXED_COPPER_GRATE.get().asItem());
			tabData.accept(IntechModBlocks.COPPER_MESH.get().asItem());
			tabData.accept(IntechModBlocks.WAXED_COPPER_MESH.get().asItem());
			tabData.accept(IntechModBlocks.EXPOSED_CHISELED_COPPER.get().asItem());
			tabData.accept(IntechModBlocks.WAXED_EXPOSED_CHISELED_COPPER.get().asItem());
			tabData.accept(IntechModBlocks.EXPOSED_COPPER_SPLEAVES.get().asItem());
			tabData.accept(IntechModBlocks.REINFORCED_EXPOSED_COPPER_SPLEAVES.get().asItem());
			tabData.accept(IntechModBlocks.WAXED_EXPOSED_COPPER_GRATE.get().asItem());
			tabData.accept(IntechModBlocks.EXPOSED_COPPER_MESH.get().asItem());
			tabData.accept(IntechModBlocks.WAXED_EXPOSED_COPPER_MESH.get().asItem());
			tabData.accept(IntechModBlocks.WEATHERED_CHISELED_COPPER.get().asItem());
			tabData.accept(IntechModBlocks.WAXED_WEATHERED_CHISELED_COPPER.get().asItem());
			tabData.accept(IntechModBlocks.WEATHERED_COPPER_SPLEAVES.get().asItem());
			tabData.accept(IntechModBlocks.REINFORCED_WEATHERED_COPPER_SPLEAVES.get().asItem());
			tabData.accept(IntechModBlocks.WAXED_WEATHERED_COPPER_GRATE.get().asItem());
			tabData.accept(IntechModBlocks.WEATHERED_COPPER_MESH.get().asItem());
			tabData.accept(IntechModBlocks.WAXED_WEATHERED_COPPER_MESH.get().asItem());
			tabData.accept(IntechModBlocks.OXIDIZED_CHISELED_COPPER.get().asItem());
			tabData.accept(IntechModBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get().asItem());
			tabData.accept(IntechModBlocks.OXIDIZED_COPPER_SPLEAVES.get().asItem());
			tabData.accept(IntechModBlocks.REINFORCED_OXIDIZED_COPPER_SPLEAVES.get().asItem());
			tabData.accept(IntechModBlocks.WAXED_OXIDIZED_COPPER_GRATE.get().asItem());
			tabData.accept(IntechModBlocks.OXIDIZED_COPPER_MESH.get().asItem());
			tabData.accept(IntechModBlocks.WAXED_OXIDIZED_COPPER_MESH.get().asItem());
			tabData.accept(IntechModBlocks.ZINC_BLOCK.get().asItem());
			tabData.accept(IntechModBlocks.ZINC_TILES.get().asItem());
			tabData.accept(IntechModBlocks.ZINC_DOOR.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_TUFF.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_TUFF_STAIRS.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_TUFF_SLAB.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_TUFF_WALL.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_TUFF_BRICKS.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_TUFF_BRICK_STAIRS.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_TUFF_BRICK_SLAB.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_TUFF_BRICK_WALL.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_CHISELED_TUFF.get().asItem());
			tabData.accept(IntechModBlocks.POLISHED_CHISELED_TUFF_BRICKS.get().asItem());
			tabData.accept(IntechModBlocks.SOME_REALLY_HECKIN_SWAGGY_STAIRS.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(IntechModBlocks.COPPER_PIPE.get().asItem());
			tabData.accept(IntechModBlocks.EXPOSED_COPPER_PIPE.get().asItem());
			tabData.accept(IntechModBlocks.WEATHERED_COPPER_PIPE.get().asItem());
			tabData.accept(IntechModBlocks.OXIDIZED_COPPER_PIPE.get().asItem());
			tabData.accept(IntechModBlocks.DARK_BRASS_PIPE.get().asItem());
			tabData.accept(IntechModBlocks.BAUXITE_PRESSURE_PLATE.get().asItem());
			tabData.accept(IntechModBlocks.BAUXITE_BUTTON.get().asItem());
			tabData.accept(IntechModBlocks.EXTRUDER.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(IntechModItems.RAW_ALUMINUM.get());
			tabData.accept(IntechModItems.ALUMINUM_INGOT.get());
			tabData.accept(IntechModItems.RAW_ZINC.get());
			tabData.accept(IntechModItems.ZINC_INGOT.get());
			tabData.accept(IntechModItems.DARK_BRASS_INGOT.get());
			tabData.accept(IntechModItems.GALVANIZED_BILLET.get());
			tabData.accept(IntechModItems.DISC_FRAGMENT_JUNCTION_JAM.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(IntechModBlocks.ZINC_ORE.get().asItem());
			tabData.accept(IntechModBlocks.DEEPSLATE_ZINC_ORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(IntechModItems.MUSIC_DISC_JUNCTION_JAM.get());
		}
	}
}
