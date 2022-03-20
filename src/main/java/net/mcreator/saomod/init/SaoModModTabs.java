
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saomod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SaoModModTabs {
	public static CreativeModeTab TAB_SWORD_ART;

	public static void load() {
		TAB_SWORD_ART = new CreativeModeTab("tabsword_art") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SaoModModItems.ELUCIDATOR.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
