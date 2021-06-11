// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcaterkillerhead extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer body;
	private final ModelRenderer headfix;
	private final ModelRenderer headfix2;
	private final ModelRenderer head;

	public Modelcaterkillerhead() {
		textureWidth = 64;
		textureHeight = 64;

		main = new ModelRenderer(this);
		main.setRotationPoint(6.0F, 24.0F, -23.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(-6.0F, -6.0F, 12.0F);
		main.addChild(body);
		setRotationAngle(body, 0.0F, 0.0F, 0.0F);

		headfix = new ModelRenderer(this);
		headfix.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(headfix);
		setRotationAngle(headfix, 0.6981F, 0.0F, 0.0F);

		headfix2 = new ModelRenderer(this);
		headfix2.setRotationPoint(0.0F, -4.0F, -4.0F);
		headfix.addChild(headfix2);
		setRotationAngle(headfix2, -0.6981F, 0.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 16.5F);
		headfix2.addChild(head);
		head.setTextureOffset(0, 0).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
		head.setTextureOffset(0, 48).addBox(-4.0F, -14.0F, -7.0F, 0.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 48).addBox(4.0F, -14.0F, -7.0F, 0.0F, 8.0F, 8.0F, 0.0F, true);
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
	}
}