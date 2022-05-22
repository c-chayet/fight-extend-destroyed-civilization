package net.mcreator.fight_extend_destroyed_civilization.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

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
import java.util.HashMap;

public class UsingChangeModProcedure {
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

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FightExtendDcMod.LOGGER.warn("Failed to load dependency entity for procedure UsingChangeMod!");
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
					.getDouble("DMode") == 1) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 1, (int) 2));
				entity.attackEntityFrom(DamageSource.MAGIC, (float) 2.5);
			}
		}
	}
}
