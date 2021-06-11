// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelhornet_van extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer windshield;
	private final ModelRenderer bone;
	private final ModelRenderer satellite;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bb_main;

	public Modelhornet_van() {
		textureWidth = 256;
		textureHeight = 256;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 24.0F, 0.0F);

		windshield = new ModelRenderer(this);
		windshield.setRotationPoint(0.0F, -20.0F, -11.0F);
		main.addChild(windshield);
		setRotationAngle(windshield, -0.3927F, 0.0F, 0.0F);
		windshield.setTextureOffset(0, 106).addBox(10.7F, -18.0F, -4.0F, 3.0F, 18.0F, 4.0F, 0.0F, false);
		windshield.setTextureOffset(181, 0).addBox(11.0F, -19.1481F, -1.2284F, 2.0F, 18.0F, 8.0F, 0.0F, true);
		windshield.setTextureOffset(0, 106).addBox(-13.8F, -18.0F, -4.0F, 3.0F, 18.0F, 4.0F, 0.0F, false);
		windshield.setTextureOffset(181, 0).addBox(-13.0F, -19.1481F, -1.2284F, 2.0F, 18.0F, 8.0F, 0.0F, false);
		windshield.setTextureOffset(14, 110).addBox(-11.0F, -18.0F, -4.0F, 22.0F, 18.0F, 0.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-12.0F, 7.5F, 11.0F);
		setRotationAngle(bone, 0.0F, 3.1416F, 0.0F);
		bone.setTextureOffset(88, 0).addBox(-2.0F, -5.5F, -24.0F, 4.0F, 11.0F, 48.0F, 0.0F, false);

		satellite = new ModelRenderer(this);
		satellite.setRotationPoint(0.0F, -30.0F, 27.0F);
		setRotationAngle(satellite, 1.0472F, 0.0F, 0.0F);
		satellite.setTextureOffset(200, 113).addBox(-7.0F, -2.0F, -7.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);
		satellite.setTextureOffset(222, 36).addBox(-9.0F, -8.0F, -7.0F, 2.0F, 6.0F, 14.0F, 0.0F, false);
		satellite.setTextureOffset(222, 36).addBox(7.0F, -8.0F, -7.0F, 2.0F, 6.0F, 14.0F, 0.0F, true);
		satellite.setTextureOffset(151, 62).addBox(-7.0F, -8.0F, 7.0F, 14.0F, 6.0F, 2.0F, 0.0F, false);
		satellite.setTextureOffset(224, 18).addBox(-7.0F, -8.0F, -9.0F, 14.0F, 6.0F, 2.0F, 0.0F, false);
		satellite.setTextureOffset(237, 75).addBox(-2.0F, -20.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -8.0F, 0.0F);
		satellite.addChild(bone2);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 1.0F, 8.0F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, 0.6109F, 0.0F, 0.0F);
		bone3.setTextureOffset(225, 30).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -8.0F, 0.0F);
		satellite.addChild(bone4);
		setRotationAngle(bone4, 0.0873F, -2.3562F, 0.0F);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 1.0F, 8.0F);
		bone4.addChild(bone5);
		setRotationAngle(bone5, 0.6109F, 0.0F, 0.0F);
		bone5.setTextureOffset(225, 30).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 14.0F, 2.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, -8.0F, 0.0F);
		satellite.addChild(bone6);
		setRotationAngle(bone6, 0.0873F, 2.3562F, 0.0F);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 1.0F, 8.0F);
		bone6.addChild(bone7);
		setRotationAngle(bone7, 0.6109F, 0.0F, 0.0F);
		bone7.setTextureOffset(225, 30).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 14.0F, 2.0F, 0.0F, true);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-14.0F, -22.0F, -19.0F, 28.0F, 18.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 24).addBox(-10.0F, -8.0F, -13.0F, 20.0F, 4.0F, 48.0F, 0.0F, false);
		bb_main.setTextureOffset(88, 0).addBox(9.0F, -22.0F, -13.0F, 1.0F, 14.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(2, 24).addBox(10.0F, -11.0F, -1.0F, 4.0F, 7.0F, 18.0F, 0.0F, false);
		bb_main.setTextureOffset(88, 0).addBox(10.0F, -22.0F, -13.0F, 4.0F, 11.0F, 48.0F, 0.0F, false);
		bb_main.setTextureOffset(144, 0).addBox(9.0F, -22.0F, -3.0F, 1.0F, 14.0F, 34.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 24).addBox(10.0F, -11.0F, 29.0F, 4.0F, 7.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(58, 76).addBox(-9.0F, -36.0F, 5.0F, 18.0F, 28.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 92).addBox(-9.0F, -12.0F, -5.0F, 18.0F, 4.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 76).addBox(-10.0F, -22.0F, -13.0F, 19.0F, 8.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(68, 0).addBox(10.0F, -36.0F, -3.0F, 4.0F, 14.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(68, 0).addBox(10.0F, -36.0F, 13.0F, 4.0F, 14.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(10.0F, -36.0F, 29.0F, 4.0F, 14.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(144, 0).addBox(9.0F, -36.0F, -3.0F, 1.0F, 14.0F, 34.0F, 0.0F, false);
		bb_main.setTextureOffset(58, 76).addBox(-14.0F, -40.0F, -9.0F, 28.0F, 4.0F, 44.0F, 0.0F, false);
		bb_main.setTextureOffset(68, 0).addBox(-14.0F, -36.0F, -3.0F, 4.0F, 14.0F, 6.0F, 0.0F, true);
		bb_main.setTextureOffset(144, 0).addBox(-10.0F, -36.0F, -3.0F, 1.0F, 14.0F, 34.0F, 0.0F, true);
		bb_main.setTextureOffset(68, 0).addBox(-14.0F, -36.0F, 13.0F, 4.0F, 14.0F, 6.0F, 0.0F, true);
		bb_main.setTextureOffset(144, 0).addBox(-14.0F, -36.0F, 29.0F, 4.0F, 14.0F, 6.0F, 0.0F, true);
		bb_main.setTextureOffset(2, 24).addBox(-14.0F, -11.0F, -1.0F, 4.0F, 7.0F, 18.0F, 0.0F, true);
		bb_main.setTextureOffset(0, 24).addBox(-14.0F, -11.0F, 29.0F, 4.0F, 7.0F, 6.0F, 0.0F, true);
		bb_main.setTextureOffset(144, 0).addBox(-10.0F, -22.0F, -3.0F, 1.0F, 14.0F, 34.0F, 0.0F, true);
		bb_main.setTextureOffset(88, 0).addBox(-10.0F, -22.0F, -13.0F, 1.0F, 14.0F, 10.0F, 0.0F, true);
		bb_main.setTextureOffset(158, 76).addBox(-10.0F, -36.0F, 31.0F, 20.0F, 28.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(90, 24).addBox(10.0F, -10.0F, -12.0F, 4.0F, 10.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(90, 24).addBox(10.0F, -10.0F, 18.0F, 4.0F, 10.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(90, 24).addBox(-14.0F, -10.0F, -12.0F, 4.0F, 10.0F, 10.0F, 0.0F, true);
		bb_main.setTextureOffset(90, 24).addBox(-14.0F, -10.0F, 18.0F, 4.0F, 10.0F, 10.0F, 0.0F, true);
		bb_main.setTextureOffset(186, 25).addBox(12.0F, -36.0F, -2.0F, 1.0F, 14.0F, 34.0F, 0.0F, false);
		bb_main.setTextureOffset(186, 25).addBox(-13.0F, -36.0F, -2.0F, 1.0F, 14.0F, 34.0F, 0.0F, true);
		bb_main.setTextureOffset(196, 94).addBox(-8.0F, -44.0F, 18.0F, 16.0F, 4.0F, 14.0F, 0.0F, false);
		bb_main.setTextureOffset(204, 0).addBox(-6.0F, -49.0F, 22.0F, 12.0F, 8.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(207, 75).addBox(-4.0F, -54.0F, 25.0F, 8.0F, 10.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		main.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		satellite.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
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