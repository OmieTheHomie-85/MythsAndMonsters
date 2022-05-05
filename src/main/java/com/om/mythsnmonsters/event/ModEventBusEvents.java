package com.om.mythsnmonsters.event;

import com.om.mythsnmonsters.MythsNMonsters;
import com.om.mythsnmonsters.entity.ModEnitityTypes;
import com.om.mythsnmonsters.entity.custom.PyroraptorEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MythsNMonsters.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEnitityTypes.PYRORAPTOR.get(), PyroraptorEntity.setAttributes());
    }
}
