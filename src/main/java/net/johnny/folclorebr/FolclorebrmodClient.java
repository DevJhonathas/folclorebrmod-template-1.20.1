package net.johnny.folclorebr;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.johnny.folclorebr.entity.ModEntities;
import net.johnny.folclorebr.entity.client.HumanCucaRenderer;
import net.johnny.folclorebr.entity.client.ModModelLayers;
import net.johnny.folclorebr.entity.client.cucahuman;

public class FolclorebrmodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.CUCA, HumanCucaRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.CUCA, cucahuman::getTexturedModelData);
    }
}
