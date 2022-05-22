package net.mcreator.fight_extend_destroyed_civilization.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
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
import net.mcreator.fight_extend_destroyed_civilization.FightExtendDcMod;

import java.util.Map;
import java.util.HashMap;

public class ModeshowForScytheXianShiYouXiNeiDieJiaCengProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FightExtendDcMod.LOGGER.warn("Failed to load dependency entity for procedure ModeshowForScytheXianShiYouXiNeiDieJiaCeng!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
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
					.getDouble("SMode") == 0) {
				entity.getPersistentData().putString("smode", "NORMAL");
			} else {
				entity.getPersistentData().putString("smode", "DEATH");
			}
			return true;
		}
		return false;
	}
}
