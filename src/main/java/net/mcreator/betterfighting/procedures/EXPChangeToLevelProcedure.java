package net.mcreator.fight_extend_destroyed_civilization.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.fight_extend_destroyed_civilization.FightExtendDcMod;

import java.util.Map;
import java.util.HashMap;

public class EXPChangeToLevelProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
			Entity entity = event.getEntityLiving();
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

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FightExtendDcMod.LOGGER.warn("Failed to load dependency entity for procedure EXPChangeToLevel!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("EXPlevel") > 10 || entity.getPersistentData().getDouble("EXPlevel") < 0) {
			entity.getPersistentData().putDouble("EXPlevel", 0);
		}
		if (entity.getPersistentData().getDouble("fighterEXP") >= 100 && entity.getPersistentData().getDouble("EXPlevel") >= 0
				&& entity.getPersistentData().getDouble("EXPlevel") <= 10) {
			entity.getPersistentData().putDouble("EXPlevel", (entity.getPersistentData().getDouble("EXPlevel") + 1));
			entity.getPersistentData().putDouble("fighterEXP", (entity.getPersistentData().getDouble("fighterEXP") - 100));
		}
	}
}
