package net.johnny.folclorebr.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.johnny.folclorebr.Folclorebrmod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FOLCLORE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Folclorebrmod.MOD_ID, "folclorebrmod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.folclorebrmod"))
                    .icon(() -> new ItemStack(CustomItems.ElfGlassBottle)).entries((displayContext, entries) -> {
                        entries.add(CustomItems.ElfGlassBottle);
                    }).build());

    public static void registerItemGroups(){
        Folclorebrmod.LOGGER.info("Registering Item Group for" + Folclorebrmod.MOD_ID);
    }
}
