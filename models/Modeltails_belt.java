// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeltails_belt extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;
	private final ModelRenderer bb_main;

	public Modeltails_belt() {
		textureWidth = 64;
		textureHeight = 64;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.4F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.4F, true);

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(-2.0F, 12.0F, 0.0F);
		setRotationAngle(tail1, 0.9599F, -0.2618F, 0.0F);
		tail1.setTextureOffset(40, 50).addBox(-1.2235F, 1.8001F, -0.5187F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(2.0F, 11.0F, 3.0F);
		setRotationAngle(tail2, 0.9599F, 0.2618F, 0.0F);
		tail2.setTextureOffset(40, 50).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 9.0F, 5.0F, 0.0F, true);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(43, 57).addBox(-3.0F, -13.25F, 2.0F, 6.0F, 1.0F, 1.0F, 0.4F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		tail1.render(matrixStack, buffer, packedLight, packedOverlay);
		tail2.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}