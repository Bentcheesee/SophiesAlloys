package com.sophiecheese.alloys.datagen;

import static com.sophiecheese.alloys.SophiesAlloys.prefix;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.init.OreBlockInit;
import com.sophiecheese.alloys.init.GeneralItemInit;
import com.sophiecheese.alloys.init.compat.CreateCompat;

import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemModelGen extends ItemModelProvider {
    public ItemModelGen(DataGenerator generator, ExistingFileHelper existingFileHelper){
        super(generator, SophiesAlloys.MOD_ID, existingFileHelper);
    }

    @SuppressWarnings("deprecation")
	@Override
    protected void registerModels(){
        for (Item i : Registry.ITEM) {
            if (i instanceof SpawnEggItem && ForgeRegistries.ITEMS.getKey(i).getNamespace().equals(SophiesAlloys.MOD_ID)) {
                getBuilder(ForgeRegistries.ITEMS.getKey(i).getPath())
                        .parent(getExistingFile(new ResourceLocation("item/template_spawn_egg")));
            }
        }

        flatItem(GeneralItemInit.UNKNOWN_RAW_MEAT);

        toBasicBlock(OreBlockInit.FOXITE_BLOCK);

        flatItemCreate(CreateCompat.CRUSHED_FOXITE);
    }
    private void toBasicBlock(RegistryObject<Block> b) {
        toBlockModel(b, b.getId().getPath());
    }

    private void toBlockModel(RegistryObject<Block> b, String model) {
        toBlockModel(b, prefix("block/" + model));
    }

    private void toBlockModel(RegistryObject<Block> b, ResourceLocation model) {
        withExistingParent(b.getId().getPath(), model);
    }

    private ItemModelBuilder flatItemCreate(RegistryObject<Item> item) {
        return generated(item.getId().getPath(), prefix("item/createcompat/" + item.getId().getPath()));
    }

    private ItemModelBuilder flatItem(RegistryObject<Item> item) {
        return generated(item.getId().getPath(), prefix("item/" + item.getId().getPath()));
    }

    private ItemModelBuilder generated(String name, ResourceLocation... layers) {
        ItemModelBuilder builder = withExistingParent(name, "item/generated");
        for (int i = 0; i < layers.length; i++) {
            builder = builder.texture("layer" + i, layers[i]);
        }
        return builder;
    }
}