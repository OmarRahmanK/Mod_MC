
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.saomod.block.SwordWorkbenchBlock;
import net.mcreator.saomod.SaoModMod;

public class SaoModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SaoModMod.MODID);
	public static final RegistryObject<Block> SWORD_WORKBENCH = REGISTRY.register("sword_workbench", () -> new SwordWorkbenchBlock());
}
