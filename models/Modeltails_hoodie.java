// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeltails_hoodie extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Body2;
	private final ModelRenderer tail2;
	private final ModelRenderer tail1;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public Modeltails_hoodie() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.45F, false);
		Body.setTextureOffset(32, 48).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		Body2 = new ModelRenderer(this);
		Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Body2);
		Body2.setTextureOffset(48, 41).addBox(-3.0F, 10.75F, 2.0F, 6.0F, 1.0F, 1.0F, 0.4F, false);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(2.0F, 11.0F, 3.0F);
		Body2.addChild(tail2);
		setRotationAngle(tail2, 0.9599F, 0.2618F, 0.0F);
		tail2.setTextureOffset(46, 34).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 9.0F, 5.0F, 0.0F, true);

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(-2.0F, 12.0F, 0.0F);
		Body2.addChild(tail1);
		setRotationAngle(tail1, 0.9599F, -0.2618F, 0.0F);
		tail1.setTextureOffset(46, 34).addBox(-1.2235F, 1.8001F, -0.5187F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(24, 42).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.5F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(24, 42).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.5F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}