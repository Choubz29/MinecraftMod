package net.vhoubz.enderore.item.armor;

import org.jetbrains.annotations.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class EmptalloyArmor extends ArmorItem {

    public EmptalloyArmor(ArmorMaterial pMaterial, Type slot) {
        super(pMaterial, slot, new Properties().stacksTo(1));
    }

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type)
    {
        // Have to return the exact path to the armor, just passing standard resource location won't work
        return "enderore:textures/models/armor/emptalloy" + (slot == EquipmentSlot.LEGS ? "_layer_2" : "_layer_1") + ".png";
    }
}
