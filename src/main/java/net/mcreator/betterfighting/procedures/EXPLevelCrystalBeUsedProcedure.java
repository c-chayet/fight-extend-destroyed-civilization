package net.mcreator.fight_extend_destroyed_civilization.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fight_extend_destroyed_civilization.item.EXPLevelCrystalItem;
import net.mcreator.fight_extend_destroyed_civilization.FightExtendDcMod;

import java.util.Map;

public class EXPLevelCrystalBeUsedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FightExtendDcMod.LOGGER.warn("Failed to load dependency entity for procedure EXPLevelCrystalBeUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("EXPlevel") < 10) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(EXPLevelCrystalItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			entity.getPersistentData().putDouble("EXPlevel", (entity.getPersistentData().getDouble("EXPlevel") + 1));
		}
	}
}
