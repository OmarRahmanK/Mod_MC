
package net.mcreator.saomod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class WindFleuretItem extends SwordItem {
	public WindFleuretItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				3, -3f,

				new Item.Properties().tab(SaoModModTabs.TAB_SWORD_ART));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Wind Fleuret is portrayed as a thin sword with the blade's length of 41\"."));
	}

}
