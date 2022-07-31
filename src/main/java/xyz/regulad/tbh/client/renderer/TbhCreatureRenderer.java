
package xyz.regulad.tbh.client.renderer;

import xyz.regulad.tbh.entity.TbhCreatureEntity;
import xyz.regulad.tbh.client.model.Modeltbh;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TbhCreatureRenderer extends MobRenderer<TbhCreatureEntity, Modeltbh<TbhCreatureEntity>> {
	public TbhCreatureRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltbh(context.bakeLayer(Modeltbh.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(TbhCreatureEntity entity) {
		return new ResourceLocation("tbh:textures/tbh.png");
	}
}
