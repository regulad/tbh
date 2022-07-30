package xyz.regulad.tbh.procedures;

import xyz.regulad.tbh.init.TbhModParticleTypes;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

public class ConfettiEggWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (TbhModParticleTypes.CONFETTI.get()), x, y, z, 0, 1, 0);
	}
}
