package com.om.mythsnmonsters.item;

import com.om.mythsnmonsters.MythsNMonsters;
import com.om.mythsnmonsters.entity.ModEnitityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MythsNMonsters.MODID);

    public static final RegistryObject<ForgeSpawnEggItem> PYRORAPTOR_SPAWN_EGG = ITEMS.register("pyroraptor_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEnitityTypes.PYRORAPTOR, 0xDC143C, 0xFAD02C,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
