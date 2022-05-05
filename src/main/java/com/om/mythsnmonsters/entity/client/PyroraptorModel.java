package com.om.mythsnmonsters.entity.client;

import com.om.mythsnmonsters.MythsNMonsters;
import com.om.mythsnmonsters.entity.custom.PyroraptorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PyroraptorModel extends AnimatedGeoModel<PyroraptorEntity> {
    @Override
    public ResourceLocation getModelLocation(PyroraptorEntity object) {
        return new ResourceLocation(MythsNMonsters.MODID, "geo/pyroraptor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PyroraptorEntity object) {
        return new ResourceLocation(MythsNMonsters.MODID, "textures/entity/pyroraptor/pyroraptor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PyroraptorEntity animatable) {
        return new ResourceLocation(MythsNMonsters.MODID, "animations/raccoon.animation.json");
    }
}
