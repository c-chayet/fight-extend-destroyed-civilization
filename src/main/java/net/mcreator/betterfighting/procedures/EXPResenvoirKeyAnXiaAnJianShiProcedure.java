package net.mcreator.fight_extend_destroyed_civilization.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fight_extend_destroyed_civilization.item.TenEXPCrystalItem;
import net.mcreator.fight_extend_destroyed_civilization.item.FighterInstrumentItem;
import net.mcreator.fight_extend_destroyed_civilization.item.EXPLevelCrystalItem;
import net.mcreator.fight_extend_destroyed_civilization.FightExtendDcMod;

import java.util.Map;

public class EXPResenvoirKeyAnXiaAnJianShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FightExtendDcMod.LOGGER.warn("Failed to load dependency entity for procedure EXPResenvoirKeyAnXiaAnJianShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(FighterInstrumentItem.block))
				: false) == true && entity.getPersistentData().getDouble("EXPlevel") >= 1) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(EXPLevelCrystalItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			entity.getPersistentData().putDouble("EXPlevel", (entity.getPersistentData().getDouble("EXPlevel") - 1));
		} else if (((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(FighterInstrumentItem.block))
				: false) == true && entity.getPersistentData().getDouble("fighterEXP") >= 10) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(TenEXPCrystalItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			entity.getPersistentData().putDouble("fighterEXP", (entity.getPersistentData().getDouble("fighterEXP") - 10));
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You Don't Have Enough Fighter EXP/EXP Level !!!"), (true));
			}
		}
	}
}
