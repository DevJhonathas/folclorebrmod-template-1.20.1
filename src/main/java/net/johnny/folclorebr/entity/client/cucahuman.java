package net.johnny.folclorebr.entity.client;

import net.johnny.folclorebr.entity.custom.HumanCucaEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class cucahuman<T extends HumanCucaEntity> extends SinglePartEntityModel<T> {
	private final ModelPart cuca;
	private final ModelPart head;
	public cucahuman(ModelPart root) {
		this.cuca = root.getChild("cuca");
		this.head = cuca.getChild("cabeca");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData cuca = modelPartData.addChild("cuca", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 24.0F, 0.0F));

		ModelPartData torso = cuca.addChild("torso", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, -19.0F, 2.0F));

		ModelPartData cube_r1 = torso.addChild("cube_r1", ModelPartBuilder.create().uv(58, 9).cuboid(-4.0F, -6.9003F, -6.6673F, 8.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 9.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r2 = torso.addChild("cube_r2", ModelPartBuilder.create().uv(37, 52).cuboid(-4.0F, -1.4165F, 0.2936F, 8.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 36).cuboid(3.0F, -1.4165F, -7.7064F, 1.0F, 4.0F, 8.0F, new Dilation(0.0F))
		.uv(30, 45).cuboid(-4.0F, -1.4165F, -7.7064F, 1.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r3 = torso.addChild("cube_r3", ModelPartBuilder.create().uv(54, 35).cuboid(-4.0F, -6.616F, 5.2689F, 8.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 9.0F, 0.0F, 0.7767F, 0.0F, 0.0F));

		ModelPartData cube_r4 = torso.addChild("cube_r4", ModelPartBuilder.create().uv(52, 22).cuboid(-6.9916F, -7.0125F, -3.0F, 1.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 9.0F, 0.0F, 0.2835F, -0.1153F, 0.3762F));

		ModelPartData cube_r5 = torso.addChild("cube_r5", ModelPartBuilder.create().uv(20, 53).cuboid(5.9448F, -6.6132F, -3.0F, 1.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 9.0F, 0.0F, 0.2835F, 0.1153F, -0.3762F));

		ModelPartData cube_r6 = torso.addChild("cube_r6", ModelPartBuilder.create().uv(48, 0).cuboid(-4.0F, -6.0F, -5.0F, 8.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 9).cuboid(4.0F, -6.0F, -3.0F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F))
		.uv(48, 48).cuboid(-6.0F, -6.0F, -3.0F, 2.0F, 7.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 51).cuboid(-4.0F, -6.0F, 3.0F, 8.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 9.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		ModelPartData cabeca = cuca.addChild("cabeca", ModelPartBuilder.create().uv(0, 17).cuboid(-3.0F, -6.4165F, -8.7064F, 6.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -19.0F, 2.0F));

		ModelPartData cube_r7 = cabeca.addChild("cube_r7", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, -1.4165F, 0.2936F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, -9.0F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r8 = cabeca.addChild("cube_r8", ModelPartBuilder.create().uv(20, 17).cuboid(2.0F, 1.0F, 0.2936F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -6.0F, -10.0F, 0.0F, 0.0F, -0.2618F));

		ModelPartData cube_r9 = cabeca.addChild("cube_r9", ModelPartBuilder.create().uv(32, 26).cuboid(-1.0F, -0.5F, 9.2936F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(7, 40).cuboid(5.0F, -0.5F, 1.2936F, 1.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(18, 43).cuboid(-2.0F, -0.5F, 1.2936F, 1.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -6.0F, -10.0F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r10 = cabeca.addChild("cube_r10", ModelPartBuilder.create().uv(20, 19).cuboid(-1.0F, 0.0F, 0.2936F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -6.0F, -10.0F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r11 = cabeca.addChild("cube_r11", ModelPartBuilder.create().uv(31, 36).cuboid(-4.5F, -6.4165F, -8.7064F, 3.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r12 = cabeca.addChild("cube_r12", ModelPartBuilder.create().uv(39, 27).cuboid(1.5F, -6.4165F, -8.7064F, 3.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		ModelPartData quadril = cuca.addChild("quadril", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, 0.0F, -3.0F, 8.0F, 11.0F, 6.0F, new Dilation(0.0F))
		.uv(22, 27).cuboid(4.0F, 1.0F, -3.0F, 2.0F, 10.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 33).cuboid(-6.0F, 1.0F, -3.0F, 2.0F, 10.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 0).cuboid(-4.0F, 0.0F, -5.0F, 8.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 13).cuboid(-4.0F, 0.0F, 3.0F, 8.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -11.0F, 2.0F));

		ModelPartData cuca2 = quadril.addChild("cuca2", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 11.0F, 4.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		cuca.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return cuca;
	}
}