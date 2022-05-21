
package net.mcreator.betterfighting.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.betterfighting.itemgroup.BetterfightingItemGroup;
import net.mcreator.betterfighting.BetterFightingModElements;

@BetterFightingModElements.ModElement.Tag
public class MagicalCrystalArmourItem extends BetterFightingModElements.ModElement {
	@ObjectHolder("better_fighting:magical_crystal_armour_helmet")
	public static final Item helmet = null;
	@ObjectHolder("better_fighting:magical_crystal_armour_chestplate")
	public static final Item body = null;
	@ObjectHolder("better_fighting:magical_crystal_armour_leggings")
	public static final Item legs = null;
	@ObjectHolder("better_fighting:magical_crystal_armour_boots")
	public static final Item boots = null;

	public MagicalCrystalArmourItem(BetterFightingModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 90;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{8, 10, 10, 8}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 54;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MagicalCrystalItem.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "magical_crystal_armour";
			}

			@Override
			public float getToughness() {
				return 1.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD,
				new Item.Properties().group(BetterfightingItemGroup.tab).isImmuneToFire()) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "better_fighting:textures/models/armor/mojingarmour_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("magical_crystal_armour_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST,
				new Item.Properties().group(BetterfightingItemGroup.tab).isImmuneToFire()) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "better_fighting:textures/models/armor/mojingarmour_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("magical_crystal_armour_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS,
				new Item.Properties().group(BetterfightingItemGroup.tab).isImmuneToFire()) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "better_fighting:textures/models/armor/mojingarmour_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("magical_crystal_armour_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET,
				new Item.Properties().group(BetterfightingItemGroup.tab).isImmuneToFire()) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "better_fighting:textures/models/armor/mojingarmour_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("magical_crystal_armour_boots"));
	}

}
