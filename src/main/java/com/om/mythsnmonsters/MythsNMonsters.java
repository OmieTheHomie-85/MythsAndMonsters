package com.om.mythsnmonsters;

import com.mojang.logging.LogUtils;
import com.om.mythsnmonsters.entity.ModEnitityTypes;
import com.om.mythsnmonsters.entity.client.PyroraptorRenderer;
import com.om.mythsnmonsters.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MythsNMonsters.MODID)
public class MythsNMonsters {
    public static final String MODID = "mythsnmonsters";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public MythsNMonsters() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);

        ModEnitityTypes.register(eventBus);



        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    private void clientSetup(final FMLCommonSetupEvent event) {
        EntityRenderers.register(ModEnitityTypes.PYRORAPTOR.get(), PyroraptorRenderer::new);
    }

}

