
package net.mcreator.saomod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.saomod.init.SaoModModTabs;
import net.mcreator.saomod.init.SaoModModItems;

public class KoboldHoeItem extends HoeItem {
	public KoboldHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 902;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 35;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SaoModModItems.KOBOLD_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(SaoModModTabs.TAB_SWORD_ART));
	}
}