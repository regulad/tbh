
package xyz.regulad.tbh.fluid;

import xyz.regulad.tbh.init.TbhModItems;
import xyz.regulad.tbh.init.TbhModFluids;
import xyz.regulad.tbh.init.TbhModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

public abstract class CumFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(TbhModFluids.CUM, TbhModFluids.FLOWING_CUM,
			FluidAttributes.builder(new ResourceLocation("tbh:blocks/cum_still"), new ResourceLocation("tbh:blocks/cum_flowing"))

					.temperature(310)

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tbh:squirt"))))
			.explosionResistance(100f)

			.tickRate(9).levelDecreasePerBlock(2)

			.bucket(TbhModItems.CUM_BUCKET).block(() -> (LiquidBlock) TbhModBlocks.CUM.get());

	private CumFluid() {
		super(PROPERTIES);
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
