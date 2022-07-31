
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package xyz.regulad.tbh.init;

import xyz.regulad.tbh.block.SolidCumBlock;
import xyz.regulad.tbh.block.CumDimensionPortalBlock;
import xyz.regulad.tbh.block.CumBlock;
import xyz.regulad.tbh.TbhMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class TbhModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TbhMod.MODID);
	public static final RegistryObject<Block> CUM = REGISTRY.register("cum", () -> new CumBlock());
	public static final RegistryObject<Block> SOLID_CUM = REGISTRY.register("solid_cum", () -> new SolidCumBlock());
	public static final RegistryObject<Block> CUM_DIMENSION_PORTAL = REGISTRY.register("cum_dimension_portal", () -> new CumDimensionPortalBlock());
}
