package xyz.regulad.tbh.procedures;

import xyz.regulad.tbh.init.TbhModParticleTypes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

public class TbhCreatureEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 2.4, (entity.getDeltaMovement().z())));
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (TbhModParticleTypes.CONFETTI.get()), x, y, z, 200, (entity.getDeltaMovement().x()), 2.4, (entity.getDeltaMovement().z()), 0.5);
	}
}
