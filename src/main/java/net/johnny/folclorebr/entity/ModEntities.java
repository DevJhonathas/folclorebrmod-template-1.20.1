package net.johnny.folclorebr.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.johnny.folclorebr.Folclorebrmod;
import net.johnny.folclorebr.entity.custom.HumanCucaEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<HumanCucaEntity> CUCA = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Folclorebrmod.MOD_ID, "cuca"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, HumanCucaEntity::new).dimensions(EntityDimensions.fixed(1f, 1f)).build());
}
