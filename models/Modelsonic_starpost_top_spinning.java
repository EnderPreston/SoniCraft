// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelsonic_starpost_top_spinning extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer top1;

	public Modelsonic_starpost_top_spinning() {
		textureWidth = 32;
		textureHeight = 16;

		main = new ModelRenderer(this);
		main.setRotationPoint(-18.0F, 32.0F, 8.0F);

		top1 = new ModelRenderer(this);
		top1.setRotationPoint(18.0F, -14.0F, -8.0F);
		main.addChild(top1);
		top1.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
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
		this.top1.rotateAngleZ = f2;
	}
}