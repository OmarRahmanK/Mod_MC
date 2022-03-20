
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.saomod.block.PlatinumOreBlock;
import net.mcreator.saomod.block.PlatinumBlockBlock;
import net.mcreator.saomod.block.KoboldOreBlock;
import net.mcreator.saomod.block.KoboldBlockBlock;
import net.mcreator.saomod.SaoModMod;

public class SaoModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SaoModMod.MODID);
	public static final RegistryObject<Block> KOBOLD_ORE = REGISTRY.register("kobold_ore", () -> new KoboldOreBlock());
	public static final RegistryObject<Block> KOBOLD_BLOCK = REGISTRY.register("kobold_block", () -> new KoboldBlockBlock());
	public static final RegistryObject<Block> PLATINUM_ORE = REGISTRY.register("platinum_ore", () -> new PlatinumOreBlock());
	public static final RegistryObject<Block> PLATINUM_BLOCK = REGISTRY.register("platinum_block", () -> new PlatinumBlockBlock());
}
