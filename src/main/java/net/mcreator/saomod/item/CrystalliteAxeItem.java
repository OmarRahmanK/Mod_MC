
package net.mcreator.saomod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CrystalliteAxeItem extends AxeItem {
	public CrystalliteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1444;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 30f;
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
		},

				1, -3f,

				new Item.Properties().tab(SaoModModTabs.TAB_SWORD_ART));
	}

}
