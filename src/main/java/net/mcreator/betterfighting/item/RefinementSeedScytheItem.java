
package net.mcreator.betterfighting.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.betterfighting.itemgroup.BetterfightingItemGroup;
import net.mcreator.betterfighting.BetterFightingModElements;

@BetterFightingModElements.ModElement.Tag
public class RefinementSeedScytheItem extends BetterFightingModElements.ModElement {
	@ObjectHolder("better_fighting:refinement_seed_scythe")
	public static final Item block = null;

	public RefinementSeedScytheItem(BetterFightingModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BetterfightingItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("refinement_seed_scythe");
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
