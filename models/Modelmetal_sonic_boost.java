// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelmetal_sonic_boost extends EntityModel<Entity> {
	private final ModelRenderer boost;

	public Modelmetal_sonic_boost() {
		textureWidth = 64;
		textureHeight = 32;

		boost = new ModelRenderer(this);
		boost.setRotationPoint(0.0F, 10.0F, 0.0F);
		boost.setTextureOffset(0, 0).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, 5.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		boost.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.boost.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.boost.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}