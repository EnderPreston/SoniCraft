// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeleggman_bomb extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer spikes;
	private final ModelRenderer cornerspikes;
	private final ModelRenderer bone;
	private final ModelRenderer spikes2;
	private final ModelRenderer spikes3;
	private final ModelRenderer bone2;
	private final ModelRenderer spikes4;
	private final ModelRenderer spikes5;
	private final ModelRenderer bone3;
	private final ModelRenderer spikes6;
	private final ModelRenderer spikes7;
	private final ModelRenderer bone4;
	private final ModelRenderer spikes8;
	private final ModelRenderer spikes9;

	public Modeleggman_bomb() {
		textureWidth = 32;
		textureHeight = 16;

		main = new ModelRenderer(this);
		main.setRotationPoint(1.0F, 20.0F, 4.0F);
		main.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		spikes = new ModelRenderer(this);
		spikes.setRotationPoint(3.0F, 3.0F, -8.0F);
		main.addChild(spikes);
		spikes.setTextureOffset(0, 0).addBox(-5.0F, -10.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		spikes.setTextureOffset(0, 0).addBox(-5.0F, 0.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		spikes.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		spikes.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, 8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		spikes.setTextureOffset(0, 0).addBox(0.0F, -5.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		spikes.setTextureOffset(0, 0).addBox(-10.0F, -5.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cornerspikes = new ModelRenderer(this);
		cornerspikes.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(cornerspikes);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(2.0F, -1.0F, -7.0F);
		cornerspikes.addChild(bone);
		setRotationAngle(bone, 0.0F, -0.7854F, 0.0F);

		spikes2 = new ModelRenderer(this);
		spikes2.setRotationPoint(0.0F, -3.5F, -0.5F);
		bone.addChild(spikes2);
		setRotationAngle(spikes2, 0.7854F, 0.0F, 0.0F);
		spikes2.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		spikes3 = new ModelRenderer(this);
		spikes3.setRotationPoint(0.0F, 3.5F, -0.5F);
		bone.addChild(spikes3);
		setRotationAngle(spikes3, -0.7854F, 0.0F, 0.0F);
		spikes3.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-4.0F, -1.0F, -7.0F);
		cornerspikes.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.7854F, 0.0F);

		spikes4 = new ModelRenderer(this);
		spikes4.setRotationPoint(0.0F, -3.5F, -0.5F);
		bone2.addChild(spikes4);
		setRotationAngle(spikes4, 0.7854F, 0.0F, 0.0F);
		spikes4.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		spikes5 = new ModelRenderer(this);
		spikes5.setRotationPoint(0.0F, 3.5F, -0.5F);
		bone2.addChild(spikes5);
		setRotationAngle(spikes5, -0.7854F, 0.0F, 0.0F);
		spikes5.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-4.0F, -1.0F, -1.0F);
		cornerspikes.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -0.7854F, 0.0F);

		spikes6 = new ModelRenderer(this);
		spikes6.setRotationPoint(0.0F, -3.5F, 0.5F);
		bone3.addChild(spikes6);
		setRotationAngle(spikes6, -0.7854F, 0.0F, 0.0F);
		spikes6.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		spikes7 = new ModelRenderer(this);
		spikes7.setRotationPoint(0.0F, 3.5F, 0.5F);
		bone3.addChild(spikes7);
		setRotationAngle(spikes7, 0.7854F, 0.0F, 0.0F);
		spikes7.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(2.0F, -1.0F, -1.0F);
		cornerspikes.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.7854F, 0.0F);

		spikes8 = new ModelRenderer(this);
		spikes8.setRotationPoint(0.0F, -3.5F, 0.5F);
		bone4.addChild(spikes8);
		setRotationAngle(spikes8, -0.7854F, 0.0F, 0.0F);
		spikes8.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		spikes9 = new ModelRenderer(this);
		spikes9.setRotationPoint(0.0F, 3.5F, 0.5F);
		bone4.addChild(spikes9);
		setRotationAngle(spikes9, 0.7854F, 0.0F, 0.0F);
		spikes9.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
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