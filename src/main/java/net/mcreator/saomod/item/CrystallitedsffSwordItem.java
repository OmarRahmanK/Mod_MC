
package net.mcreator.saomod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.saomod.init.SaoModModTabs;
import net.mcreator.saomod.init.SaoModModItems;

public class CrystalliteSwordItem extends SwordItem {
	public CrystalliteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1444;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 19f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 49;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SaoModModItems.CRYSTALLITE.get()));
			}
		}, 3, -3f, new Item.Properties().tab(SaoModModTabs.TAB_SWORD_ART));
	}
}
