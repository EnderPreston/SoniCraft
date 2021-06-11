// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeldeath_egg_robot_damaged extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer head;

	public Modeldeath_egg_robot_damaged() {
		textureWidth = 512;
		textureHeight = 512;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 81.25F, 0.0F);
		main.setTextureOffset(0, 0).addBox(-32.0F, -107.25F, -32.0F, 64.0F, 50.0F, 64.0F, 0.0F, false);
		main.setTextureOffset(0, 266).addBox(-24.0F, -108.25F, 32.0F, 48.0F, 40.0F, 24.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -106.0F, 0.0F);
		main.addChild(head);
		head.setTextureOffset(0, 182).addBox(-30.0F, -25.25F, -30.0F, 60.0F, 24.0F, 60.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -12.25F, -36.0F, 8.0F, 8.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(348, 60).addBox(-36.0F, -19.25F, -32.0F, 72.0F, 16.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-31.0F, -35.25F, -6.0F, 0.0F, 32.0F, 32.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(31.0F, -35.25F, -6.0F, 0.0F, 32.0F, 32.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}