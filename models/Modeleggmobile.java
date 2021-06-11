// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeleggmobile extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer eggman;
	private final ModelRenderer Head;
	private final ModelRenderer goggles;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer eggmobile;

	public Modeleggmobile() {
		textureWidth = 256;
		textureHeight = 128;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 26.0F, 0.0F);

		eggman = new ModelRenderer(this);
		eggman.setRotationPoint(0.0F, -8.0F, 4.0F);
		main.addChild(eggman);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -24.0F, 0.0F);
		eggman.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(0, 32).addBox(-8.0F, -4.25F, -4.25F, 16.0F, 4.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		goggles = new ModelRenderer(this);
		goggles.setRotationPoint(0.0F, -5.5F, -0.25F);
		Head.addChild(goggles);
		setRotationAngle(goggles, -0.6109F, 0.0F, 0.0F);
		goggles.setTextureOffset(25, 36).addBox(-4.0F, -1.2314F, -4.4217F, 8.0F, 3.0F, 10.0F, 0.25F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -24.0F, 0.0F);
		eggman.addChild(Body);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(0, 36).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 14.0F, 4.0F, 0.25F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, -22.0F, 0.0F);
		eggman.addChild(RightArm);
		setRotationAngle(RightArm, -1.1345F, 0.0F, 0.0F);
		RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, -22.0F, 0.0F);
		eggman.addChild(LeftArm);
		setRotationAngle(LeftArm, -1.1345F, 0.0F, 0.0F);
		LeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, -12.0F, 0.0F);
		eggman.addChild(RightLeg);
		setRotationAngle(RightLeg, -1.2654F, 0.2618F, 0.0F);
		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, -12.0F, 0.0F);
		eggman.addChild(LeftLeg);
		setRotationAngle(LeftLeg, -1.309F, -0.2618F, 0.0F);
		LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		eggmobile = new ModelRenderer(this);
		eggmobile.setRotationPoint(0.0F, -8.0F, -6.0F);
		main.addChild(eggmobile);
		eggmobile.setTextureOffset(0, 54).addBox(-14.0F, -20.0F, -9.0F, 28.0F, 16.0F, 8.0F, 0.0F, false);
		eggmobile.setTextureOffset(0, 78).addBox(-14.0F, -20.0F, 13.0F, 28.0F, 16.0F, 8.0F, 0.0F, false);
		eggmobile.setTextureOffset(0, 102).addBox(-8.0F, -22.0F, 13.0F, 16.0F, 2.0F, 6.0F, 0.0F, false);
		eggmobile.setTextureOffset(64, 0).addBox(14.0F, -20.0F, -9.0F, 1.0F, 16.0F, 30.0F, 0.0F, false);
		eggmobile.setTextureOffset(64, 0).addBox(-15.0F, -20.0F, -9.0F, 1.0F, 16.0F, 30.0F, 0.0F, true);
		eggmobile.setTextureOffset(126, 0).addBox(-14.0F, -8.0F, -8.0F, 28.0F, 10.0F, 28.0F, 0.0F, false);
		eggmobile.setTextureOffset(0, 112).addBox(-6.0F, 2.0F, 0.0F, 12.0F, 4.0F, 12.0F, 0.0F, false);
		eggmobile.setTextureOffset(32, 8).addBox(-7.0F, -21.0F, -5.0F, 14.0F, 1.0F, 4.0F, 0.0F, false);
		eggmobile.setTextureOffset(31, 0).addBox(-3.0F, -22.0F, -5.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		eggmobile.setTextureOffset(56, 18).addBox(6.0F, -11.0F, 21.0F, 6.0F, 6.0F, 3.0F, 0.0F, false);
		eggmobile.setTextureOffset(56, 18).addBox(-12.0F, -11.0F, 21.0F, 6.0F, 6.0F, 3.0F, 0.0F, true);
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
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}