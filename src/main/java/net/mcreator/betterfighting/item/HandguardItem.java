
package net.mcreator.betterfighting.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.betterfighting.itemgroup.BetterfightingForKnifeItemGroup;
import net.mcreator.betterfighting.BetterFightingModElements;

@BetterFightingModElements.ModElement.Tag
public class HandguardItem extends BetterFightingModElements.ModElement {
	@ObjectHolder("better_fighting:handguard")
	public static final Item block = null;

	public HandguardItem(BetterFightingModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BetterfightingForKnifeItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("handguard");
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
