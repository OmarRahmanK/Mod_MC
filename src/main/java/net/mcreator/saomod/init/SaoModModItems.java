
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.saomod.item.WeCanDoCustomMusicItem;
import net.mcreator.saomod.SaoModMod;

public class SaoModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SaoModMod.MODID);
	public static final RegistryObject<Item> WE_CAN_DO_CUSTOM_MUSIC = REGISTRY.register("we_can_do_custom_music", () -> new WeCanDoCustomMusicItem());
}
