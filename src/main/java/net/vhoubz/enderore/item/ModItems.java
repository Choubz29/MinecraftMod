package net.vhoubz.enderore.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vhoubz.enderore.EnderOre;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EnderOre.MOD_ID);

    public static final RegistryObject<Item> ENDER_DUST = ITEMS.register("enderdust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE = ITEMS.register("enderite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMPTALLOY_UPGRADE = ITEMS.register("emptalloy_upgrade",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMPTALLOY_INGOT = ITEMS.register("emptalloy_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}