package net.johnny.folclorebr.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.johnny.folclorebr.Folclorebrmod;
import net.minecraft.item.Item;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CustomItems {

    public static final Item ElfGlassBottle = registerItem("elfintheglassbottle", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(ElfGlassBottle);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Folclorebrmod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Folclorebrmod.LOGGER.info("Registering Mod Item for " + Folclorebrmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(CustomItems::addItemsToIngredientItemGroup);
    }
}
