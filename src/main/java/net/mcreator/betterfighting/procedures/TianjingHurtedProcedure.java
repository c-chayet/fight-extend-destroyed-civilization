package net.mcreator.fight_extend_destroyed_civilization.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fight_extend_destroyed_civilization.potion.ChaosDepressPotionEffect;
import net.mcreator.fight_extend_destroyed_civilization.FightExtendDcMod;

import java.util.Map;

public class TianjingHurtedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FightExtendDcMod.LOGGER.warn("Failed to load dependency entity for procedure TianjingHurted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double sktime = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1)
				- ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < 100) {
			sktime = 0;
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1)
				- ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) >= 100
				&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1)
						- ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < 200
				&& sktime == 0) {
			sktime = 1;
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(ChaosDepressPotionEffect.potion, (int) 60, (int) 1));
			if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
				((LivingEntity) ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))
						.attackEntityFrom(new DamageSource("tjskill").setDamageBypassesArmor(), (float) 4);
			}
		} else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1)
				- ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) >= 200
				&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1)
						- ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < 300
				&& sktime == 1) {
			sktime = 2;
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(ChaosDepressPotionEffect.potion, (int) 60, (int) 1));
			if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
				((LivingEntity) ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))
						.attackEntityFrom(new DamageSource("tjskill").setDamageBypassesArmor(), (float) 6);
			}
		} else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1)
				- ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) >= 300
				&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1)
						- ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < 400
				&& sktime == 2) {
			sktime = 3;
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(ChaosDepressPotionEffect.potion, (int) 60, (int) 1));
			if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
				((LivingEntity) ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))
						.attackEntityFrom(new DamageSource("tjskill").setDamageBypassesArmor(), (float) 8);
			}
		} else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1)
				- ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) >= 400
				&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1)
						- ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < 500
				&& sktime == 3) {
			sktime = 4;
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(ChaosDepressPotionEffect.potion, (int) 60, (int) 1));
			if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
				((LivingEntity) ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))
						.attackEntityFrom(new DamageSource("tjskill").setDamageBypassesArmor(), (float) 12);
			}
		}
	}
}
