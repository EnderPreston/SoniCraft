// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelmotobug extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer wheel;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer armR;
	private final ModelRenderer armL;

	public Modelmotobug() {
		textureWidth = 128;
		textureHeight = 64;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 24.0F, 0.5F);

		wheel = new ModelRenderer(this);
		wheel.setRotationPoint(0.0F, -6.0F, -0.5F);
		main.addChild(wheel);
		wheel.setTextureOffset(68, 0).addBox(-4.0F, -6.0F, -6.0F, 8.0F, 12.0F, 12.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(body);
		body.setTextureOffset(0, 0).addBox(-8.0F, -19.0F, -7.5F, 16.0F, 14.0F, 18.0F, 0.0F, false);
		body.setTextureOffset(44, 32).addBox(-10.0F, -11.0F, -4.0F, 4.0F, 4.0F, 16.0F, 0.0F, false);
		body.setTextureOffset(44, 32).addBox(6.0F, -11.0F, -4.0F, 4.0F, 4.0F, 16.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -11.0F, -7.5F);
		body.addChild(head);
		head.setTextureOffset(0, 32).addBox(-5.0F, -5.0F, -6.0F, 10.0F, 10.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(4.0F, -10.0F, -7.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -7.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

		armR = new ModelRenderer(this);
		armR.setRotationPoint(-7.0F, -6.0F, -7.0F);
		body.addChild(armR);
		armR.setTextureOffset(32, 33).addBox(0.0F, -3.0F, -6.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

		armL = new ModelRenderer(this);
		armL.setRotationPoint(7.0F, -6.0F, -7.0F);
		body.addChild(armL);
		armL.setTextureOffset(32, 33).addBox(0.0F, -3.0F, -6.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);
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
		this.armR.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.armL.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}