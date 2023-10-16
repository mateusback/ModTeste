package com.mateusback.modteste.item;

import com.mateusback.modteste.ModTeste;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
   public static final DeferredRegister<Item> ITEMS =
           DeferredRegister.create(ForgeRegistries.ITEMS, ModTeste.MOD_ID);

   public static final RegistryObject<Item> EVIL_MUSHROOM = ITEMS.register("evil_mushroom",
           () -> new Item(new Item.Properties()));

   public static final RegistryObject<Item> COOKED_EVIL_MUSHROOM = ITEMS.register("cooked_evil_mushroom",
           () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
       ITEMS.register(eventBus);
   }


}
