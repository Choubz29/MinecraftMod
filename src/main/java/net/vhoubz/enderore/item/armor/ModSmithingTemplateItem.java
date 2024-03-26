package net.vhoubz.enderore.item.armor;

import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;


import javax.annotation.Nullable;
import java.util.List;

public class ModSmithingTemplateItem extends Item {
    private static final ChatFormatting TITLE_FORMAT;
    private static final ChatFormatting DESCRIPTION_FORMAT;
    private static final String DESCRIPTION_ID;
    private static final Component INGREDIENTS_TITLE;
    private static final Component APPLIES_TO_TITLE;
    private static final Component EMPTALLOY_UPGRADE;
    private static final Component EMPTALLOY_UPGRADE_APPLIES_TO;
    private static final Component EMPTALLOY_UPGRADE_INGREDIENTS;
    private static final Component EMPTALLOY_UPGRADE_BASE_SLOT_DESCRIPTION;
    private static final Component EMPTALLOY_UPGRADE_ADDITIONS_SLOT_DESCRIPTION;
    private static final ResourceLocation EMPTY_SLOT_HELMET;
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE;
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS;
    private static final ResourceLocation EMPTY_SLOT_BOOTS;
    private static final ResourceLocation EMPTY_SLOT_HOE;
    private static final ResourceLocation EMPTY_SLOT_AXE;
    private static final ResourceLocation EMPTY_SLOT_SWORD;
    private static final ResourceLocation EMPTY_SLOT_SHOVEL;
    private static final ResourceLocation EMPTY_SLOT_PICKAXE;
    private static final ResourceLocation EMPTY_SLOT_INGOT;

    private final Component appliesTo;
    private final Component ingredients;
    private final Component upgradeDescription;
    private final Component baseSlotDescription;
    private final Component additionsSlotDescription;
    private final List<ResourceLocation> baseSlotEmptyIcons;
    private final List<ResourceLocation> additionalSlotEmptyIcons;


    public ModSmithingTemplateItem(Properties pProperties, Component appliesTo, Component ingredients, Component upgradeDescription, Component baseSlotDescription, Component additionsSlotDescription, List<ResourceLocation> baseSlotEmptyIcons, List<ResourceLocation> additionalSlotEmptyIcons) {
        super(pProperties);
        this.appliesTo = appliesTo;
        this.ingredients = ingredients;
        this.upgradeDescription = upgradeDescription;
        this.baseSlotDescription = baseSlotDescription;
        this.additionsSlotDescription = additionsSlotDescription;
        this.baseSlotEmptyIcons = baseSlotEmptyIcons;
        this.additionalSlotEmptyIcons = additionalSlotEmptyIcons;
    }




    public static net.vhoubz.enderore.item.armor.ModSmithingTemplateItem createEmptalloyUpgradeTemplate() {
        return new net.vhoubz.enderore.item.armor.ModSmithingTemplateItem(new Properties(),EMPTALLOY_UPGRADE_APPLIES_TO, EMPTALLOY_UPGRADE_INGREDIENTS, EMPTALLOY_UPGRADE, EMPTALLOY_UPGRADE_BASE_SLOT_DESCRIPTION, EMPTALLOY_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createEmptalloyUpgradeIconList(), createEmptalloyUpgradeMaterialList());
    }


    private static List<ResourceLocation> createEmptalloyUpgradeIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_SWORD, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_AXE, EMPTY_SLOT_BOOTS, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL);
    }

    private static List<ResourceLocation> createEmptalloyUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        pTooltipComponents.add(this.upgradeDescription);
        pTooltipComponents.add(CommonComponents.EMPTY);
        pTooltipComponents.add(APPLIES_TO_TITLE);
        pTooltipComponents.add(CommonComponents.space().append(this.appliesTo));
        pTooltipComponents.add(INGREDIENTS_TITLE);
        pTooltipComponents.add(CommonComponents.space().append(this.ingredients));
    }

    public Component getBaseSlotDescription() {
        return this.baseSlotDescription;
    }

    public Component getAdditionSlotDescription() {
        return this.additionsSlotDescription;
    }

    public List<ResourceLocation> getBaseSlotEmptyIcons() {
        return this.baseSlotEmptyIcons;
    }

    public List<ResourceLocation> getAdditionalSlotEmptyIcons() {
        return this.additionalSlotEmptyIcons;
    }

    public String getDescriptionId() {
        return DESCRIPTION_ID;
    }

    static {
        TITLE_FORMAT = ChatFormatting.GRAY;
        DESCRIPTION_FORMAT = ChatFormatting.BLUE;
        DESCRIPTION_ID = Util.makeDescriptionId("item", new ResourceLocation("smithing_template"));
        INGREDIENTS_TITLE = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.ingredients"))).withStyle(TITLE_FORMAT);
        APPLIES_TO_TITLE = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.applies_to"))).withStyle(TITLE_FORMAT);
        EMPTALLOY_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation("emptalloy_upgrade"))).withStyle(TITLE_FORMAT);
        EMPTALLOY_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.emptalloy_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
        EMPTALLOY_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.emptalloy_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
        EMPTALLOY_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.emptalloy_upgrade.base_slot_description")));
        EMPTALLOY_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.emptalloy_upgrade.additions_slot_description")));
        EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
        EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
        EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
        EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");
        EMPTY_SLOT_HOE = new ResourceLocation("item/empty_slot_hoe");
        EMPTY_SLOT_AXE = new ResourceLocation("item/empty_slot_axe");
        EMPTY_SLOT_SWORD = new ResourceLocation("item/empty_slot_sword");
        EMPTY_SLOT_SHOVEL = new ResourceLocation("item/empty_slot_shovel");
        EMPTY_SLOT_PICKAXE = new ResourceLocation("item/empty_slot_pickaxe");
        EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");
    }
}
