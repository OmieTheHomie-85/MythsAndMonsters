package com.om.mythsnmonsters.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.om.mythsnmonsters.MythsNMonsters;
import com.om.mythsnmonsters.entity.custom.PyroraptorEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PyroraptorRenderer extends GeoEntityRenderer<PyroraptorEntity> {
    public PyroraptorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PyroraptorModel());
        this.shadowRadius = 0.3f;
    }
    @Override
    public ResourceLocation getTextureLocation(PyroraptorEntity instance) {
        return new ResourceLocation(MythsNMonsters.MODID, "textures/entity/pyroraptor/pyroraptor.png");
    }
    @Override
    public RenderType getRenderType(PyroraptorEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int PackedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, PackedLightIn, textureLocation);
    }
}
