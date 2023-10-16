package com.mateusback.modteste.item;

import com.mateusback.modteste.ModTeste;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
           DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModTeste.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FOOD_TAB = CREATIVE_MODE_TABS.register("food_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EVIL_MUSHROOM.get()))
                    .title(Component.translatable("creativetab.food_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.EVIL_MUSHROOM.get());
                        pOutput.accept(ModItems.COOKED_EVIL_MUSHROOM.get());
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
