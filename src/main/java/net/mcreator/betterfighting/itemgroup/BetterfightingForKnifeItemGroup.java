
package net.mcreator.betterfighting.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.betterfighting.item.MagicalCrystalKnifeItem;
import net.mcreator.betterfighting.BetterFightingModElements;

@BetterFightingModElements.ModElement.Tag
public class BetterfightingForKnifeItemGroup extends BetterFightingModElements.ModElement {
	public BetterfightingForKnifeItemGroup(BetterFightingModElements instance) {
		super(instance, 89);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbetterfighting_for_knife") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MagicalCrystalKnifeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
