
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.intech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.intech.item.ZincIngotItem;
import net.mcreator.intech.item.RawAluminumItem;
import net.mcreator.intech.item.DarkBrassIngotItem;
import net.mcreator.intech.item.AluminumIngotItem;
import net.mcreator.intech.IntechMod;

public class IntechModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IntechMod.MODID);
	public static final RegistryObject<Item> BAUXITE = block(IntechModBlocks.BAUXITE);
	public static final RegistryObject<Item> POLISHED_BAUXITE = block(IntechModBlocks.POLISHED_BAUXITE);
	public static final RegistryObject<Item> POLISHED_BAUXITE_BRICKS = block(IntechModBlocks.POLISHED_BAUXITE_BRICKS);
	public static final RegistryObject<Item> POLISHED_BAUXITE_PILLAR = block(IntechModBlocks.POLISHED_BAUXITE_PILLAR);
	public static final RegistryObject<Item> RAW_ALUMINUM_BLOCK = block(IntechModBlocks.RAW_ALUMINUM_BLOCK);
	public static final RegistryObject<Item> ALUMINUM_BLOCK = block(IntechModBlocks.ALUMINUM_BLOCK);
	public static final RegistryObject<Item> ALUMINUM_TILES = block(IntechModBlocks.ALUMINUM_TILES);
	public static final RegistryObject<Item> ALUMINUM_PILLAR = block(IntechModBlocks.ALUMINUM_PILLAR);
	public static final RegistryObject<Item> DARK_BRASS_BLOCK = block(IntechModBlocks.DARK_BRASS_BLOCK);
	public static final RegistryObject<Item> DARK_BRASS_TILES = block(IntechModBlocks.DARK_BRASS_TILES);
	public static final RegistryObject<Item> DARK_BRASS_PILLAR = block(IntechModBlocks.DARK_BRASS_PILLAR);
	public static final RegistryObject<Item> REINFORCED_DARK_BRASS = block(IntechModBlocks.REINFORCED_DARK_BRASS);
	public static final RegistryObject<Item> COPPER_SPLEAVES = block(IntechModBlocks.COPPER_SPLEAVES);
	public static final RegistryObject<Item> EXPOSED_COPPER_SPLEAVES = block(IntechModBlocks.EXPOSED_COPPER_SPLEAVES);
	public static final RegistryObject<Item> REINFORCED_COPPER_SPLEAVES = block(IntechModBlocks.REINFORCED_COPPER_SPLEAVES);
	public static final RegistryObject<Item> WEATHERED_COPPER_SPLEAVES = block(IntechModBlocks.WEATHERED_COPPER_SPLEAVES);
	public static final RegistryObject<Item> RAW_ALUMINUM = REGISTRY.register("raw_aluminum", () -> new RawAluminumItem());
	public static final RegistryObject<Item> REINFORCED_EXPOSED_COPPER_SPLEAVES = block(IntechModBlocks.REINFORCED_EXPOSED_COPPER_SPLEAVES);
	public static final RegistryObject<Item> ALUMINUM_INGOT = REGISTRY.register("aluminum_ingot", () -> new AluminumIngotItem());
	public static final RegistryObject<Item> DARK_BRASS_INGOT = REGISTRY.register("dark_brass_ingot", () -> new DarkBrassIngotItem());
	public static final RegistryObject<Item> REINFORCED_WEATHERED_COPPER_SPLEAVES = block(IntechModBlocks.REINFORCED_WEATHERED_COPPER_SPLEAVES);
	public static final RegistryObject<Item> COPPER_PIPE = block(IntechModBlocks.COPPER_PIPE);
	public static final RegistryObject<Item> EXPOSED_COPPER_PIPE = block(IntechModBlocks.EXPOSED_COPPER_PIPE);
	public static final RegistryObject<Item> REINFORCED_OXIDIZED_COPPER_SPLEAVES = block(IntechModBlocks.REINFORCED_OXIDIZED_COPPER_SPLEAVES);
	public static final RegistryObject<Item> WEATHERED_COPPER_PIPE = block(IntechModBlocks.WEATHERED_COPPER_PIPE);
	public static final RegistryObject<Item> OXIDIZED_COPPER_PIPE = block(IntechModBlocks.OXIDIZED_COPPER_PIPE);
	public static final RegistryObject<Item> DARK_BRASS_PIPE = block(IntechModBlocks.DARK_BRASS_PIPE);
	public static final RegistryObject<Item> COPPER_MESH = block(IntechModBlocks.COPPER_MESH);
	public static final RegistryObject<Item> CHISELED_COPPER = block(IntechModBlocks.CHISELED_COPPER);
	public static final RegistryObject<Item> WAXED_CHISELED_COPPER = block(IntechModBlocks.WAXED_CHISELED_COPPER);
	public static final RegistryObject<Item> EXPOSED_COPPER_MESH = block(IntechModBlocks.EXPOSED_COPPER_MESH);
	public static final RegistryObject<Item> EXPOSED_CHISELED_COPPER = block(IntechModBlocks.EXPOSED_CHISELED_COPPER);
	public static final RegistryObject<Item> WAXED_EXPOSED_CHISELED_COPPER = block(IntechModBlocks.WAXED_EXPOSED_CHISELED_COPPER);
	public static final RegistryObject<Item> WEATHERED_CHISELED_COPPER = block(IntechModBlocks.WEATHERED_CHISELED_COPPER);
	public static final RegistryObject<Item> WAXED_WEATHERED_CHISELED_COPPER = block(IntechModBlocks.WAXED_WEATHERED_CHISELED_COPPER);
	public static final RegistryObject<Item> OXIDIZED_CHISELED_COPPER = block(IntechModBlocks.OXIDIZED_CHISELED_COPPER);
	public static final RegistryObject<Item> WEATHERED_COPPER_MESH = block(IntechModBlocks.WEATHERED_COPPER_MESH);
	public static final RegistryObject<Item> WAXED_OXIDIZED_CHISELED_COPPER = block(IntechModBlocks.WAXED_OXIDIZED_CHISELED_COPPER);
	public static final RegistryObject<Item> ZINC_BLOCK = block(IntechModBlocks.ZINC_BLOCK);
	public static final RegistryObject<Item> ZINC_TILES = block(IntechModBlocks.ZINC_TILES);
	public static final RegistryObject<Item> POLISHED_TUFF = block(IntechModBlocks.POLISHED_TUFF);
	public static final RegistryObject<Item> POLISHED_TUFF_STAIRS = block(IntechModBlocks.POLISHED_TUFF_STAIRS);
	public static final RegistryObject<Item> OXIDIZED_COPPER_MESH = block(IntechModBlocks.OXIDIZED_COPPER_MESH);
	public static final RegistryObject<Item> POLISHED_TUFF_SLAB = block(IntechModBlocks.POLISHED_TUFF_SLAB);
	public static final RegistryObject<Item> POLISHED_TUFF_WALL = block(IntechModBlocks.POLISHED_TUFF_WALL);
	public static final RegistryObject<Item> POLISHED_TUFF_BRICKS = block(IntechModBlocks.POLISHED_TUFF_BRICKS);
	public static final RegistryObject<Item> POLISHED_TUFF_BRICK_STAIRS = block(IntechModBlocks.POLISHED_TUFF_BRICK_STAIRS);
	public static final RegistryObject<Item> POLISHED_TUFF_BRICK_SLAB = block(IntechModBlocks.POLISHED_TUFF_BRICK_SLAB);
	public static final RegistryObject<Item> OXIDIZED_COPPER_SPLEAVES = block(IntechModBlocks.OXIDIZED_COPPER_SPLEAVES);
	public static final RegistryObject<Item> POLISHED_TUFF_BRICK_WALL = block(IntechModBlocks.POLISHED_TUFF_BRICK_WALL);
	public static final RegistryObject<Item> COPPER_JUNCTION = block(IntechModBlocks.COPPER_JUNCTION);
	public static final RegistryObject<Item> POLISHED_CHISELED_TUFF = block(IntechModBlocks.POLISHED_CHISELED_TUFF);
	public static final RegistryObject<Item> COPPER_CABLE = block(IntechModBlocks.COPPER_CABLE);
	public static final RegistryObject<Item> POLISHED_CHISELED_TUFF_BRICKS = block(IntechModBlocks.POLISHED_CHISELED_TUFF_BRICKS);
	public static final RegistryObject<Item> BAUXITE_STAIRS = block(IntechModBlocks.BAUXITE_STAIRS);
	public static final RegistryObject<Item> BAUXITE_SLAB = block(IntechModBlocks.BAUXITE_SLAB);
	public static final RegistryObject<Item> BAUXITE_WALL = block(IntechModBlocks.BAUXITE_WALL);
	public static final RegistryObject<Item> BAUXITE_PRESSURE_PLATE = block(IntechModBlocks.BAUXITE_PRESSURE_PLATE);
	public static final RegistryObject<Item> ZINC_INGOT = REGISTRY.register("zinc_ingot", () -> new ZincIngotItem());
	public static final RegistryObject<Item> BAUXITE_BUTTON = block(IntechModBlocks.BAUXITE_BUTTON);
	public static final RegistryObject<Item> POLISHED_BAUXITE_BRICK_STAIRS = block(IntechModBlocks.POLISHED_BAUXITE_BRICK_STAIRS);
	public static final RegistryObject<Item> POLISHED_BAUXITE_BRICK_SLAB = block(IntechModBlocks.POLISHED_BAUXITE_BRICK_SLAB);
	public static final RegistryObject<Item> POLISHED_BAUXITE_BRICK_WALL = block(IntechModBlocks.POLISHED_BAUXITE_BRICK_WALL);
	public static final RegistryObject<Item> ALUMINUM_TILE_STAIRS = block(IntechModBlocks.ALUMINUM_TILE_STAIRS);
	public static final RegistryObject<Item> ALUMINUM_TILE_SLAB = block(IntechModBlocks.ALUMINUM_TILE_SLAB);
	public static final RegistryObject<Item> LIGHTNING_BULB = block(IntechModBlocks.LIGHTNING_BULB);
	public static final RegistryObject<Item> LIT_LIGHTNING_BULB = block(IntechModBlocks.LIT_LIGHTNING_BULB);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
