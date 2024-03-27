package net.vhoubz.enderore.datagen;

import net.vhoubz.enderore.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vhoubz.enderore.EnderOre;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EnderOre.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ENDERITE_BLOCK.get(),
                        ModBlocks.ENDERITE_ORE.get());



        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ENDERITE_BLOCK.get(),
                        ModBlocks.ENDERITE_ORE.get());


    }
}
