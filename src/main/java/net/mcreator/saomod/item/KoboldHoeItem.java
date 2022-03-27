
package net.mcreator.saomod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

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
		},

				0, -3f,

				new Item.Properties().tab(SaoModModTabs.TAB_SWORD_ART));
	}

}
