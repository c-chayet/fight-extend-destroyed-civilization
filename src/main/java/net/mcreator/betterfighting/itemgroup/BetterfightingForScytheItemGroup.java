
package net.mcreator.betterfighting.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.betterfighting.item.MagicalCrystalScytheItem;
import net.mcreator.betterfighting.BetterFightingModElements;

@BetterFightingModElements.ModElement.Tag
public class BetterfightingForScytheItemGroup extends BetterFightingModElements.ModElement {
	public BetterfightingForScytheItemGroup(BetterFightingModElements instance) {
		super(instance, 130);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbetterfighting_for_scythe") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MagicalCrystalScytheItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
