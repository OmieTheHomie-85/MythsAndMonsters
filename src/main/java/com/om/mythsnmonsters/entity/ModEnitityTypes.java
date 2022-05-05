package com.om.mythsnmonsters.entity;

import com.om.mythsnmonsters.MythsNMonsters;
import com.om.mythsnmonsters.entity.custom.PyroraptorEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnitityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, MythsNMonsters.MODID);

    public static final RegistryObject<EntityType<PyroraptorEntity>> PYRORAPTOR = ENTITY_TYPES.register("pyroraptor",
            () -> EntityType.Builder.of(PyroraptorEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(MythsNMonsters.MODID, "pyroraptor").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
