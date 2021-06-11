// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelflicky extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer body;
	private final ModelRenderer wingR;
	private final ModelRenderer wingL;
	private final ModelRenderer legR;
	private final ModelRenderer legL;
	private final ModelRenderer head;

	public Modelflicky() {
		textureWidth = 32;
		textureHeight = 32;

		main = new ModelRenderer(this);
		main.setRotationPoint(1.0F, 22.0F, -1.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 3.0F, 0.0F);
		main.addChild(body);
		body.setTextureOffset(0, 11).addBox(-2.5F, -5.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		wingR = new ModelRenderer(this);
		wingR.setRotationPoint(-2.5F, -4.5F, 1.0F);
		body.addChild(wingR);
		wingR.setTextureOffset(15, 0).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		wingL = new ModelRenderer(this);
		wingL.setRotationPoint(0.5F, -4.5F, 1.0F);
		body.addChild(wingL);
		wingL.setTextureOffset(14, 15).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		legR = new ModelRenderer(this);
		legR.setRotationPoint(-2.0F, -2.0F, 1.25F);
		body.addChild(legR);
		legR.setTextureOffset(7, 15).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		legL = new ModelRenderer(this);
		legL.setRotationPoint(0.0F, -2.0F, 1.25F);
		body.addChild(legL);
		legL.setTextureOffset(10, 11).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-1.0F, -2.0F, 1.0F);
		main.addChild(head);
		head.setTextureOffset(0, 0).addBox(-2.5F, -5.75F, -2.5F, 5.0F, 6.0F, 5.0F, -0.25F, false);
		head.setTextureOffset(15, 2).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
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
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.legR.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.wingR.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.legL.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.wingL.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
	}
}