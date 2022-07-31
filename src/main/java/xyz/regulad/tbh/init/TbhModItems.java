
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package xyz.regulad.tbh.init;

import xyz.regulad.tbh.item.CumItem;
import xyz.regulad.tbh.item.CumDimensionItem;
import xyz.regulad.tbh.item.ConfettiEggItem;
import xyz.regulad.tbh.TbhMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class TbhModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TbhMod.MODID);
	public static final RegistryObject<Item> TBH_CREATURE = REGISTRY.register("tbh_creature_spawn_egg",
			() -> new ForgeSpawnEggItem(TbhModEntities.TBH_CREATURE, -1, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CUM_BUCKET = REGISTRY.register("cum_bucket", () -> new CumItem());
	public static final RegistryObject<Item> CONFETTI_EGG = REGISTRY.register("confetti_egg", () -> new ConfettiEggItem());
	public static final RegistryObject<Item> SOLID_CUM = block(TbhModBlocks.SOLID_CUM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CUM_DIMENSION = REGISTRY.register("cum_dimension", () -> new CumDimensionItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
