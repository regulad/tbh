
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package xyz.regulad.tbh.init;

import xyz.regulad.tbh.item.CumItem;
import xyz.regulad.tbh.TbhMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class TbhModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TbhMod.MODID);
	public static final RegistryObject<Item> TBH_CREATURE = REGISTRY.register("tbh_creature_spawn_egg",
			() -> new ForgeSpawnEggItem(TbhModEntities.TBH_CREATURE, -1, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CUM_BUCKET = REGISTRY.register("cum_bucket", () -> new CumItem());
}
