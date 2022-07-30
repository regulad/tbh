
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package xyz.regulad.tbh.init;

import xyz.regulad.tbh.entity.TbhCreatureEntity;
import xyz.regulad.tbh.entity.ConfettiEggEntity;
import xyz.regulad.tbh.TbhMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TbhModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, TbhMod.MODID);
	public static final RegistryObject<EntityType<TbhCreatureEntity>> TBH_CREATURE = register("tbh_creature",
			EntityType.Builder.<TbhCreatureEntity>of(TbhCreatureEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(18).setUpdateInterval(3).setCustomClientFactory(TbhCreatureEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ConfettiEggEntity>> CONFETTI_EGG = register("projectile_confetti_egg",
			EntityType.Builder.<ConfettiEggEntity>of(ConfettiEggEntity::new, MobCategory.MISC).setCustomClientFactory(ConfettiEggEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TbhCreatureEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TBH_CREATURE.get(), TbhCreatureEntity.createAttributes().build());
	}
}
