package xyz.regulad.tbh.procedures;

import xyz.regulad.tbh.init.TbhModParticleTypes;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

public class ConfettiEggProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (TbhModParticleTypes.CONFETTI.get()), x, y, z, 60, 3, 3, 3, 1.3);
	}
}
