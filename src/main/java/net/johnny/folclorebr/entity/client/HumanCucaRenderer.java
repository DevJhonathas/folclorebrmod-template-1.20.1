package net.johnny.folclorebr.entity.client;

import net.johnny.folclorebr.Folclorebrmod;
import net.johnny.folclorebr.entity.custom.HumanCucaEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class HumanCucaRenderer extends MobEntityRenderer<HumanCucaEntity, cucahuman<HumanCucaEntity>>{
    private static final Identifier TEXTURE = new Identifier(Folclorebrmod.MOD_ID, "textures/entity/humancuca.png");

    public HumanCucaRenderer(EntityRendererFactory.Context context) {
        super(context, new cucahuman<>(context.getPart(ModModelLayers.CUCA)), 0.6f);
    }

    @Override
    public Identifier getTexture(HumanCucaEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(HumanCucaEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()){
            matrixStack.scale(1f, 1f, 1f);
        } else{
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
