
package xyz.regulad.tbh.fluid;

import xyz.regulad.tbh.init.TbhModItems;
import xyz.regulad.tbh.init.TbhModFluids;
import xyz.regulad.tbh.init.TbhModBlocks;
import xyz.regulad.tbh.fluid.attributes.CumFluidAttributes;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

public abstract class CumFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(TbhModFluids.CUM, TbhModFluids.FLOWING_CUM,
			CumFluidAttributes.builder(new ResourceLocation("tbh:blocks/cum_still"), new ResourceLocation("tbh:blocks/cum_flowing"))

					.temperature(310)

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tbh:squirt"))).color(-4138753))
			.explosionResistance(100f).canMultiply().tickRate(9).levelDecreasePerBlock(3)

			.bucket(TbhModItems.CUM_BUCKET).block(() -> (LiquidBlock) TbhModBlocks.CUM.get());

	private CumFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends CumFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CumFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
