
package net.mcreator.saomod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.saomod.init.SaoModModTabs;

public class WeCanDoCustomMusicItem extends RecordItem {
	public WeCanDoCustomMusicItem() {
		super(0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
				new Item.Properties().tab(SaoModModTabs.TAB_SWORD_ART).stacksTo(1).rarity(Rarity.RARE));
	}
}
