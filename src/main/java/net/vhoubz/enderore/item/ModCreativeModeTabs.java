package net.vhoubz.enderore.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vhoubz.enderore.EnderOre;
import net.vhoubz.enderore.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EnderOre.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("enderore_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDER_DUST.get()))
                    .title(Component.translatable("creativetab.enderore_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ENDER_DUST.get());
                        pOutput.accept(ModItems.ENDERITE.get());
                        pOutput.accept(ModItems.EMPTALLOY_UPGRADE.get());
                        pOutput.accept(ModItems.EMPTALLOY_INGOT.get());

                        pOutput.accept(ModBlocks.ENDERITE_ORE.get());
                        pOutput.accept(ModBlocks.ENDERITE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
