
package net.mcreator.betterfighting.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.betterfighting.itemgroup.BetterfightingForScytheItemGroup;
import net.mcreator.betterfighting.BetterFightingModElements;

@BetterFightingModElements.ModElement.Tag
public class LongHiltItem extends BetterFightingModElements.ModElement {
	@ObjectHolder("better_fighting:long_hilt")
	public static final Item block = null;

	public LongHiltItem(BetterFightingModElements instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BetterfightingForScytheItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("long_hilt");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}
	}
}
