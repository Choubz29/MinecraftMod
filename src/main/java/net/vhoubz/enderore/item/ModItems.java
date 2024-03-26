package net.vhoubz.enderore.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vhoubz.enderore.EnderOre;
import net.vhoubz.enderore.item.armor.EmptalloyArmor;
import net.vhoubz.enderore.item.armor.ModArmorMaterials;
import net.vhoubz.enderore.item.armor.ModSmithingTemplateItem;



public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EnderOre.MOD_ID);

    public static final RegistryObject<Item> ENDER_DUST = ITEMS.register("enderdust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE = ITEMS.register("enderite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMPTALLOY_UPGRADE = ITEMS.register("emptalloy_upgrade",
            () -> ModSmithingTemplateItem.createEmptalloyUpgradeTemplate());

    public static final RegistryObject<Item> EMPTALLOY_INGOT = ITEMS.register("emptalloy_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<EmptalloyArmor> EMPTALLOY_HELMET = ITEMS.register("emptalloy_helmet",
            () -> new EmptalloyArmor(ModArmorMaterials.EMPTALLOY, ArmorItem.Type.HELMET));
    public static final RegistryObject<EmptalloyArmor> EMPTALLOY_CHESTPLATE = ITEMS.register("emptalloy_chestplate",
            () -> new EmptalloyArmor(ModArmorMaterials.EMPTALLOY, ArmorItem.Type.CHESTPLATE));
    public static final RegistryObject<EmptalloyArmor> EMPTALLOY_LEGGINGS = ITEMS.register("emptalloy_leggings",
            () -> new EmptalloyArmor(ModArmorMaterials.EMPTALLOY, ArmorItem.Type.LEGGINGS));
    public static final RegistryObject<EmptalloyArmor> EMPTALLOY_BOOTS = ITEMS.register("emptalloy_boots",
            () -> new EmptalloyArmor(ModArmorMaterials.EMPTALLOY, ArmorItem.Type.BOOTS));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}