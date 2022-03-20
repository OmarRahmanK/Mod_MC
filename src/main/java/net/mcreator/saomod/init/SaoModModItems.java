
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.saomod.item.LambentLightItem;
import net.mcreator.saomod.item.ElucidatorItem;
import net.mcreator.saomod.item.DarkRepulserItem;
import net.mcreator.saomod.SaoModMod;

public class SaoModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SaoModMod.MODID);
	public static final RegistryObject<Item> ELUCIDATOR = REGISTRY.register("elucidator", () -> new ElucidatorItem());
	public static final RegistryObject<Item> DARK_REPULSER = REGISTRY.register("dark_repulser", () -> new DarkRepulserItem());
	public static final RegistryObject<Item> LAMBENT_LIGHT = REGISTRY.register("lambent_light", () -> new LambentLightItem());
}
