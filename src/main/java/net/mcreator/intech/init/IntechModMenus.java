
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.intech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.intech.world.inventory.ExtruderGUIMenu;
import net.mcreator.intech.IntechMod;

public class IntechModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, IntechMod.MODID);
	public static final RegistryObject<MenuType<ExtruderGUIMenu>> EXTRUDER_GUI = REGISTRY.register("extruder_gui", () -> IForgeMenuType.create(ExtruderGUIMenu::new));
}
