
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.saomod.item.WindFleuretItem;
import net.mcreator.saomod.item.TyrantDragonItem;
import net.mcreator.saomod.item.PlatinumIngotItem;
import net.mcreator.saomod.item.LambentLightItem;
import net.mcreator.saomod.item.KoboldIngotItem;
import net.mcreator.saomod.item.GuiltyThornItem;
import net.mcreator.saomod.item.ElucidatorItem;
import net.mcreator.saomod.item.DarkRepulserItem;
import net.mcreator.saomod.item.CrystalliteItem;
import net.mcreator.saomod.SaoModMod;

public class SaoModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SaoModMod.MODID);
	public static final RegistryObject<Item> ELUCIDATOR = REGISTRY.register("elucidator", () -> new ElucidatorItem());
	public static final RegistryObject<Item> DARK_REPULSER = REGISTRY.register("dark_repulser", () -> new DarkRepulserItem());
	public static final RegistryObject<Item> LAMBENT_LIGHT = REGISTRY.register("lambent_light", () -> new LambentLightItem());
	public static final RegistryObject<Item> KOBOLD_INGOT = REGISTRY.register("kobold_ingot", () -> new KoboldIngotItem());
	public static final RegistryObject<Item> KOBOLD_ORE = block(SaoModModBlocks.KOBOLD_ORE, SaoModModTabs.TAB_SWORD_ART);
	public static final RegistryObject<Item> KOBOLD_BLOCK = block(SaoModModBlocks.KOBOLD_BLOCK, SaoModModTabs.TAB_SWORD_ART);
	public static final RegistryObject<Item> CRYSTALLITE = REGISTRY.register("crystallite", () -> new CrystalliteItem());
	public static final RegistryObject<Item> CRYSTALLITE_ORE = block(SaoModModBlocks.CRYSTALLITE_ORE, SaoModModTabs.TAB_SWORD_ART);
	public static final RegistryObject<Item> CRYSTALLITE_BLOCK = block(SaoModModBlocks.CRYSTALLITE_BLOCK, SaoModModTabs.TAB_SWORD_ART);
	public static final RegistryObject<Item> PLATINUM_INGOT = REGISTRY.register("platinum_ingot", () -> new PlatinumIngotItem());
	public static final RegistryObject<Item> PLATINUM_ORE = block(SaoModModBlocks.PLATINUM_ORE, SaoModModTabs.TAB_SWORD_ART);
	public static final RegistryObject<Item> PLATINUM_BLOCK = block(SaoModModBlocks.PLATINUM_BLOCK, SaoModModTabs.TAB_SWORD_ART);
	public static final RegistryObject<Item> WIND_FLEURET = REGISTRY.register("wind_fleuret", () -> new WindFleuretItem());
	public static final RegistryObject<Item> TYRANT_DRAGON = REGISTRY.register("tyrant_dragon", () -> new TyrantDragonItem());
	public static final RegistryObject<Item> GUILTY_THORN = REGISTRY.register("guilty_thorn", () -> new GuiltyThornItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
