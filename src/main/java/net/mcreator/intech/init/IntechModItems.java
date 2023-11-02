
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

import net.mcreator.intech.item.RawAluminumItem;
import net.mcreator.intech.item.AluminumIngotItem;
import net.mcreator.intech.IntechMod;

public class IntechModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IntechMod.MODID);
	public static final RegistryObject<Item> BAUXITE = block(IntechModBlocks.BAUXITE);
	public static final RegistryObject<Item> POLISHED_BAUXITE = block(IntechModBlocks.POLISHED_BAUXITE);
	public static final RegistryObject<Item> POLISHED_BAUXITE_BRICKS = block(IntechModBlocks.POLISHED_BAUXITE_BRICKS);
	public static final RegistryObject<Item> POLISHED_BAUXITE_PILLAR = block(IntechModBlocks.POLISHED_BAUXITE_PILLAR);
	public static final RegistryObject<Item> RAW_ALUMINUM = REGISTRY.register("raw_aluminum", () -> new RawAluminumItem());
	public static final RegistryObject<Item> RAW_ALUMINUM_BLOCK = block(IntechModBlocks.RAW_ALUMINUM_BLOCK);
	public static final RegistryObject<Item> ALUMINUM_INGOT = REGISTRY.register("aluminum_ingot", () -> new AluminumIngotItem());
	public static final RegistryObject<Item> ALUMINUM_BLOCK = block(IntechModBlocks.ALUMINUM_BLOCK);
	public static final RegistryObject<Item> ALUMINUM_TILES = block(IntechModBlocks.ALUMINUM_TILES);
	public static final RegistryObject<Item> ALUMINUM_PILLAR = block(IntechModBlocks.ALUMINUM_PILLAR);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
