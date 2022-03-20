
package net.mcreator.saomod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.saomod.init.SaoModModTabs;

public class CrystalliteItem extends Item {
	public CrystalliteItem() {
		super(new Item.Properties().tab(SaoModModTabs.TAB_SWORD_ART).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
