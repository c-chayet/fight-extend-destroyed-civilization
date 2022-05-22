package net.mcreator.fight_extend_destroyed_civilization.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fight_extend_destroyed_civilization.item.FighterInstrumentItem;
import net.mcreator.fight_extend_destroyed_civilization.item.FighterEXPItem;
import net.mcreator.fight_extend_destroyed_civilization.FightExtendDcMod;

import java.util.Map;

public class FighterEXPDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FightExtendDcMod.LOGGER.warn("Failed to load dependency entity for procedure FighterEXPDangWuPinZaiBeiBaoZhongMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("fighterEXP") > 102 || entity.getPersistentData().getDouble("fighterEXP") < 0) {
			entity.getPersistentData().putDouble("fighterEXP", 0);
		}
		if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(FighterEXPItem.block)) : false) == true
				&& entity.getPersistentData().getDouble("EXPlevel") < 10) {
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(FighterInstrumentItem.block))
					: false) == true) {
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(FighterEXPItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				entity.getPersistentData().putDouble("fighterEXP", (entity.getPersistentData().getDouble("fighterEXP") + 1));
			} else {
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(FighterEXPItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
	}
}
