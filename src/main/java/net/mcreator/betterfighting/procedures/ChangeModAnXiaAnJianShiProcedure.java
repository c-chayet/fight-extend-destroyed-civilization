package net.mcreator.fight_extend_destroyed_civilization.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalScytheeiItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalScytheThItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalScytheSiItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalScytheSevItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalScytheSeItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalScytheNiItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalScytheItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalScytheFoItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalScytheFiItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalKnifeThItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalKnifeSiItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalKnifeSevItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalKnifeSeItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalKnifeNiItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalKnifeItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalKnifeFoItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalKnifeFiItem;
import net.mcreator.fight_extend_destroyed_civilization.item.MagicalCrystalKnifeEiItem;
import net.mcreator.fight_extend_destroyed_civilization.FightExtendDcMod;

import java.util.Map;

public class ChangeModAnXiaAnJianShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FightExtendDcMod.LOGGER.warn("Failed to load dependency entity for procedure ChangeModAnXiaAnJianShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == MagicalCrystalKnifeItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalKnifeSeItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalKnifeThItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalKnifeFoItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalKnifeFiItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalKnifeSiItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalKnifeSevItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalKnifeEiItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalKnifeNiItem.block) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
					.getDouble("DMode") < 0
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
							.getDouble("DMode") >= 1) {
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
						.putDouble("DMode", 0);
			} else {
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
						.putDouble("DMode", 1);
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == MagicalCrystalScytheItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalScytheSeItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalScytheThItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalScytheFoItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalScytheFiItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalScytheSiItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalScytheSevItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalScytheeiItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MagicalCrystalScytheNiItem.block) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
					.getDouble("SMode") < 0
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
							.getDouble("SMode") >= 1) {
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
						.putDouble("SMode", 0);
			} else {
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
						.putDouble("SMode", 1);
			}
		}
	}
}
