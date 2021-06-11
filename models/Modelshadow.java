// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelshadow extends EntityModel<Entity> {
	private final ModelRenderer sonic;
	private final ModelRenderer head;
	private final ModelRenderer hairL;
	private final ModelRenderer hairR;
	private final ModelRenderer body;
	private final ModelRenderer hipR;
	private final ModelRenderer hipL;
	private final ModelRenderer shoulderR;
	private final ModelRenderer shoulderL;

	public Modelshadow() {
		textureWidth = 64;
		textureHeight = 32;

		sonic = new ModelRenderer(this);
		sonic.setRotationPoint(0.0F, 14.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -4.0F, 0.0F);
		sonic.addChild(head);
		head.setTextureOffset(0, 4).addBox(-0.5F, -3.0F, -4.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(48, 0).addBox(0.0F, -7.5F, -0.25F, 0.0F, 8.0F, 8.0F, 0.0F, true);
		head.setTextureOffset(0, 1).addBox(-4.0F, -10.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 1).addBox(2.0F, -10.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(32, 0).addBox(-4.0F, -8.15F, -2.0F, 8.0F, 0.0F, 8.0F, 0.0F, false);

		hairL = new ModelRenderer(this);
		hairL.setRotationPoint(4.125F, -4.0F, -1.75F);
		head.addChild(hairL);
		hairL.setTextureOffset(32, 0).addBox(0.0F, -4.0F, -1.0F, 0.0F, 8.0F, 8.0F, 0.0F, false);

		hairR = new ModelRenderer(this);
		hairR.setRotationPoint(0.0F, 14.0F, 0.0F);
		head.addChild(hairR);
		hairR.setTextureOffset(32, 0).addBox(-4.125F, -22.0F, -2.75F, 0.0F, 8.0F, 8.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.5F, 0.0F, 0.0F);
		sonic.addChild(body);
		body.setTextureOffset(0, 22).addBox(-1.5F, -4.0F, -1.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(48, 0).addBox(-1.0F, -5.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(48, 0).addBox(2.0F, -5.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		hipR = new ModelRenderer(this);
		hipR.setRotationPoint(-1.0F, 2.0F, 0.0F);
		sonic.addChild(hipR);
		hipR.setTextureOffset(22, 16).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		hipR.setTextureOffset(16, 26).addBox(-2.0F, 4.25F, -2.0F, 4.0F, 2.0F, 4.0F, -0.25F, false);
		hipR.setTextureOffset(34, 24).addBox(-2.0F, 6.0F, -4.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

		hipL = new ModelRenderer(this);
		hipL.setRotationPoint(1.0F, 2.0F, 0.0F);
		sonic.addChild(hipL);
		hipL.setTextureOffset(22, 16).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 6.0F, 2.0F, -0.25F, true);
		hipL.setTextureOffset(16, 26).addBox(-2.0F, 4.25F, -2.0F, 4.0F, 2.0F, 4.0F, -0.25F, true);
		hipL.setTextureOffset(34, 24).addBox(-2.0F, 6.0F, -4.0F, 4.0F, 2.0F, 6.0F, 0.0F, true);

		shoulderR = new ModelRenderer(this);
		shoulderR.setRotationPoint(-2.0F, -3.0F, 0.0F);
		sonic.addChild(shoulderR);
		setRotationAngle(shoulderR, 0.0F, 0.0F, 0.2618F);
		shoulderR.setTextureOffset(14, 16).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		shoulderR.setTextureOffset(36, 16).addBox(-3.0F, 2.9696F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		shoulderL = new ModelRenderer(this);
		shoulderL.setRotationPoint(2.0F, -3.0F, 0.0F);
		sonic.addChild(shoulderL);
		setRotationAngle(shoulderL, 0.0F, 0.0F, -0.2618F);
		shoulderL.setTextureOffset(14, 16).addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);
		shoulderL.setTextureOffset(36, 16).addBox(-1.0F, 2.9696F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		sonic.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.shoulderR.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.hipR.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.hipL.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.shoulderL.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}