// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcaterkillerbody extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer body;
	private final ModelRenderer bone1fix;

	public Modelcaterkillerbody() {
		textureWidth = 64;
		textureHeight = 64;

		main = new ModelRenderer(this);
		main.setRotationPoint(6.0F, 24.0F, -23.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(-6.0F, -6.0F, 12.0F);
		main.addChild(body);
		setRotationAngle(body, 0.0F, 0.0F, 0.0F);

		bone1fix = new ModelRenderer(this);
		bone1fix.setRotationPoint(0.0F, 0.0F, 11.0F);
		body.addChild(bone1fix);
		bone1fix.setTextureOffset(0, 24).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
		bone1fix.setTextureOffset(48, 0).addBox(-10.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bone1fix.setTextureOffset(48, 0).addBox(6.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
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