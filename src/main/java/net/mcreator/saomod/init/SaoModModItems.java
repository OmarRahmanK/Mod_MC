
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
import net.mcreator.saomod.item.MateChopperItem;
import net.mcreator.saomod.item.LiberatorSwordItem;
import net.mcreator.saomod.item.LambentLightItem;
import net.mcreator.saomod.item.KarakurenaiItem;
import net.mcreator.saomod.item.GuiltyThornItem;
import net.mcreator.saomod.item.ElucidatorItem;
import net.mcreator.saomod.item.DarkRepulserItem;
import net.mcreator.saomod.item.AnnealBladeItem;
import net.mcreator.saomod.SaoModMod;

public class SaoModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SaoModMod.MODID);
	public static final RegistryObject<Item> ELUCIDATOR = REGISTRY.register("elucidator", () -> new ElucidatorItem());
	public static final RegistryObject<Item> DARK_REPULSER = REGISTRY.register("dark_repulser", () -> new DarkRepulserItem());
	public static final RegistryObject<Item> LAMBENT_LIGHT = REGISTRY.register("lambent_light", () -> new LambentLightItem());
	public static final RegistryObject<Item> WIND_FLEURET = REGISTRY.register("wind_fleuret", () -> new WindFleuretItem());
	public static final RegistryObject<Item> TYRANT_DRAGON = REGISTRY.register("tyrant_dragon", () -> new TyrantDragonItem());
	public static final RegistryObject<Item> GUILTY_THORN = REGISTRY.register("guilty_thorn", () -> new GuiltyThornItem());
	public static final RegistryObject<Item> ANNEAL_BLADE = REGISTRY.register("anneal_blade", () -> new AnnealBladeItem());
	public static final RegistryObject<Item> KARAKURENAI = REGISTRY.register("karakurenai", () -> new KarakurenaiItem());
	public static final RegistryObject<Item> MATE_CHOPPER = REGISTRY.register("mate_chopper", () -> new MateChopperItem());
	public static final RegistryObject<Item> LIBERATOR_SWORD = REGISTRY.register("liberator_sword", () -> new LiberatorSwordItem());
	public static final RegistryObject<Item> SWORD_WORKBENCH = block(SaoModModBlocks.SWORD_WORKBENCH, SaoModModTabs.TAB_SWORD_ART);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
