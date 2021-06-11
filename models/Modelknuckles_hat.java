// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelknuckles_hat extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer bone;

	public Modelknuckles_hat() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 48).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -4.0F, 0.0F);
		Head.addChild(bone);
		setRotationAngle(bone, -1.5708F, 0.0F, 0.0F);
		bone.setTextureOffset(32, 48).addBox(-8.0F, -8.0F, -3.0F, 16.0F, 16.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}