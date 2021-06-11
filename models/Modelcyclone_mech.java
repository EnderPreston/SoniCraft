// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcyclone_mech extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer body;
	private final ModelRenderer legR;
	private final ModelRenderer hipR;
	private final ModelRenderer kneeR;
	private final ModelRenderer footR;
	private final ModelRenderer legL;
	private final ModelRenderer hipL;
	private final ModelRenderer kneeL;
	private final ModelRenderer footL;
	private final ModelRenderer turret;
	private final ModelRenderer driver;
	private final ModelRenderer tails;
	private final ModelRenderer head;
	private final ModelRenderer hair;
	private final ModelRenderer hair1;
	private final ModelRenderer hair2;
	private final ModelRenderer hair3;
	private final ModelRenderer body2;
	private final ModelRenderer tailL;
	private final ModelRenderer tailL2;
	private final ModelRenderer tailR;
	private final ModelRenderer R2;
	private final ModelRenderer hipR2;
	private final ModelRenderer hipL2;
	private final ModelRenderer shoulderR;
	private final ModelRenderer shoulderL;

	public Modelcyclone_mech() {
		textureWidth = 256;
		textureHeight = 128;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 28.9F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(body);
		body.setTextureOffset(136, 68).addBox(-10.0F, -51.4F, -28.0F, 20.0F, 20.0F, 40.0F, 0.0F, false);
		body.setTextureOffset(80, 0).addBox(-9.0F, -55.4F, -20.0F, 18.0F, 4.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(80, 24).addBox(-1.0F, -54.4F, -30.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(156, 0).addBox(-9.0F, -63.4F, 5.0F, 18.0F, 20.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(112, 69).addBox(-5.0F, -42.4F, 11.0F, 10.0F, 10.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(56, 60).addBox(-3.0F, -31.4F, -13.0F, 6.0F, 8.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(0, 60).addBox(-10.0F, -30.4F, -11.0F, 20.0F, 6.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(120, 40).addBox(-3.0F, -71.4F, 7.0F, 6.0F, 8.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(160, 56).addBox(-22.0F, -41.4F, -22.0F, 12.0F, 0.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(160, 56).addBox(10.0F, -41.4F, -22.0F, 12.0F, 0.0F, 12.0F, 0.0F, true);

		legR = new ModelRenderer(this);
		legR.setRotationPoint(-10.0F, -28.0F, -7.0F);
		body.addChild(legR);

		hipR = new ModelRenderer(this);
		hipR.setRotationPoint(0.0F, 0.0F, 0.0F);
		legR.addChild(hipR);
		setRotationAngle(hipR, -0.0873F, 0.0F, 0.0F);
		hipR.setTextureOffset(0, 74).addBox(-6.0F, -5.4F, -6.0F, 6.0F, 12.0F, 20.0F, 0.0F, false);
		hipR.setTextureOffset(216, 0).addBox(-5.0F, -15.4F, 8.0F, 0.0F, 18.0F, 10.0F, 0.0F, true);
		hipR.setTextureOffset(197, 41).addBox(-22.0F, 0.6F, 8.0F, 16.0F, 0.0F, 12.0F, 0.0F, true);

		kneeR = new ModelRenderer(this);
		kneeR.setRotationPoint(-3.0F, 4.0F, 12.0F);
		hipR.addChild(kneeR);
		setRotationAngle(kneeR, -0.5236F, 0.0F, 0.0F);
		kneeR.setTextureOffset(52, 80).addBox(-3.0F, -1.4F, -2.0F, 6.0F, 18.0F, 8.0F, 0.25F, false);

		footR = new ModelRenderer(this);
		footR.setRotationPoint(0.0F, 13.0F, 2.0F);
		kneeR.addChild(footR);
		setRotationAngle(footR, 0.6109F, 0.0F, 0.0F);
		footR.setTextureOffset(0, 106).addBox(-3.0F, -1.4F, -11.0F, 6.0F, 8.0F, 12.0F, 0.0F, false);
		footR.setTextureOffset(36, 106).addBox(-2.0F, -1.4F, 1.0F, 4.0F, 8.0F, 8.0F, 0.0F, false);

		legL = new ModelRenderer(this);
		legL.setRotationPoint(10.0F, -28.0F, -7.0F);
		body.addChild(legL);

		hipL = new ModelRenderer(this);
		hipL.setRotationPoint(0.0F, 0.0F, 0.0F);
		legL.addChild(hipL);
		setRotationAngle(hipL, -0.0873F, 0.0F, 0.0F);
		hipL.setTextureOffset(80, 74).addBox(0.0F, -5.4F, -6.0F, 6.0F, 12.0F, 20.0F, 0.0F, true);
		hipL.setTextureOffset(216, 0).addBox(5.0F, -15.4F, 8.0F, 0.0F, 18.0F, 10.0F, 0.0F, false);
		hipL.setTextureOffset(197, 41).addBox(6.0F, 0.6F, 8.0F, 16.0F, 0.0F, 12.0F, 0.0F, false);

		kneeL = new ModelRenderer(this);
		kneeL.setRotationPoint(3.0F, 4.0F, 12.0F);
		hipL.addChild(kneeL);
		setRotationAngle(kneeL, -0.5236F, 0.0F, 0.0F);
		kneeL.setTextureOffset(52, 80).addBox(-3.0F, -1.4F, -2.0F, 6.0F, 18.0F, 8.0F, 0.25F, true);

		footL = new ModelRenderer(this);
		footL.setRotationPoint(0.0F, 13.0F, 2.0F);
		kneeL.addChild(footL);
		setRotationAngle(footL, 0.6109F, 0.0F, 0.0F);
		footL.setTextureOffset(0, 106).addBox(-3.0F, -1.4F, -11.0F, 6.0F, 8.0F, 12.0F, 0.0F, true);
		footL.setTextureOffset(36, 106).addBox(-2.0F, -1.4F, 1.0F, 4.0F, 8.0F, 8.0F, 0.0F, true);

		turret = new ModelRenderer(this);
		turret.setRotationPoint(0.0F, -70.9F, 11.0F);
		body.addChild(turret);
		turret.setTextureOffset(148, 32).addBox(-3.0F, -6.5F, -6.0F, 6.0F, 10.0F, 14.0F, 0.25F, false);
		turret.setTextureOffset(108, 22).addBox(-7.0F, -3.5F, -6.0F, 4.0F, 4.0F, 14.0F, 0.0F, false);
		turret.setTextureOffset(120, 56).addBox(-2.0F, -3.5F, -15.0F, 4.0F, 4.0F, 9.0F, 0.0F, false);

		driver = new ModelRenderer(this);
		driver.setRotationPoint(0.0F, 24.0F, 0.0F);

		tails = new ModelRenderer(this);
		tails.setRotationPoint(0.0F, -48.0F, 0.0F);
		driver.addChild(tails);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -4.0F, 0.0F);
		tails.addChild(head);
		head.setTextureOffset(0, 4).addBox(-0.5F, -1.0F, -4.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -3.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(1.0F, -9.0F, -3.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 5).addBox(-5.5F, -2.0F, -3.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(24, 5).addBox(2.5F, -2.0F, -3.5F, 3.0F, 3.0F, 0.0F, 0.0F, true);

		hair = new ModelRenderer(this);
		hair.setRotationPoint(0.0F, -7.0F, -4.0F);
		head.addChild(hair);
		setRotationAngle(hair, 0.2182F, 0.0F, 0.0F);

		hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(0.0F, -0.5936F, -0.3219F);
		hair.addChild(hair1);
		setRotationAngle(hair1, 0.7418F, 3.1416F, 0.0F);
		hair1.setTextureOffset(50, 6).addBox(0.0F, 0.6232F, -3.2159F, 0.0F, 2.0F, 5.0F, 0.0F, false);

		hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(0.0F, 0.0F, -1.0F);
		hair.addChild(hair2);
		setRotationAngle(hair2, 0.2618F, 3.1416F, 0.0F);
		hair2.setTextureOffset(50, 6).addBox(0.0F, 1.1307F, -2.3678F, 0.0F, 2.0F, 5.0F, 0.0F, false);

		hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(0.0F, 1.25F, 0.0F);
		hair.addChild(hair3);
		setRotationAngle(hair3, -0.2182F, 3.1416F, 0.0F);
		hair3.setTextureOffset(50, 6).addBox(0.0F, 0.7037F, -1.3706F, 0.0F, 2.0F, 5.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(-0.5F, 0.0F, 0.0F);
		tails.addChild(body2);
		body2.setTextureOffset(0, 21).addBox(-1.5F, -2.0F, -1.5F, 4.0F, 5.0F, 3.0F, 0.0F, false);

		tailL = new ModelRenderer(this);
		tailL.setRotationPoint(2.0F, 0.5F, 2.5F);
		body2.addChild(tailL);

		tailL2 = new ModelRenderer(this);
		tailL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		tailL.addChild(tailL2);
		setRotationAngle(tailL2, 1.1345F, 0.1745F, 0.0F);
		tailL2.setTextureOffset(50, 0).addBox(-1.0F, -1.1548F, -3.3126F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		tailL2.setTextureOffset(32, 0).addBox(-1.5076F, 0.4239F, -4.2759F, 4.0F, 9.0F, 5.0F, 0.0F, true);

		tailR = new ModelRenderer(this);
		tailR.setRotationPoint(-1.0F, 0.5F, 2.5F);
		body2.addChild(tailR);

		R2 = new ModelRenderer(this);
		R2.setRotationPoint(0.0F, 0.0F, 0.0F);
		tailR.addChild(R2);
		setRotationAngle(R2, 1.1345F, -0.1745F, 0.0F);
		R2.setTextureOffset(50, 0).addBox(-1.0F, -1.1548F, -3.3126F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		R2.setTextureOffset(32, 0).addBox(-2.4924F, 0.4239F, -4.2759F, 4.0F, 9.0F, 5.0F, 0.0F, false);

		hipR2 = new ModelRenderer(this);
		hipR2.setRotationPoint(-1.0F, 3.0F, 0.0F);
		tails.addChild(hipR2);
		setRotationAngle(hipR2, -1.1345F, 0.2618F, 0.0F);
		hipR2.setTextureOffset(22, 16).addBox(-1.0F, -0.25F, -1.0F, 2.0F, 4.0F, 2.0F, -0.25F, false);
		hipR2.setTextureOffset(16, 26).addBox(-2.0F, 3.25F, -2.0F, 4.0F, 2.0F, 4.0F, -0.25F, false);
		hipR2.setTextureOffset(34, 24).addBox(-2.0F, 5.0F, -4.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

		hipL2 = new ModelRenderer(this);
		hipL2.setRotationPoint(1.0F, 3.0F, 0.0F);
		tails.addChild(hipL2);
		setRotationAngle(hipL2, -1.1345F, -0.2618F, 0.0F);
		hipL2.setTextureOffset(22, 16).addBox(-1.0F, -0.25F, -1.0F, 2.0F, 4.0F, 2.0F, -0.25F, true);
		hipL2.setTextureOffset(16, 26).addBox(-2.0F, 3.25F, -2.0F, 4.0F, 2.0F, 4.0F, -0.25F, true);
		hipL2.setTextureOffset(34, 24).addBox(-2.0F, 5.0F, -4.0F, 4.0F, 2.0F, 6.0F, 0.0F, true);

		shoulderR = new ModelRenderer(this);
		shoulderR.setRotationPoint(-2.0F, -3.0F, 0.0F);
		tails.addChild(shoulderR);
		setRotationAngle(shoulderR, -0.9599F, 0.0F, 0.2618F);
		shoulderR.setTextureOffset(14, 16).addBox(-1.4824F, 0.9319F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		shoulderR.setTextureOffset(36, 16).addBox(-2.4824F, 4.9015F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		shoulderL = new ModelRenderer(this);
		shoulderL.setRotationPoint(2.0F, -3.0F, 0.0F);
		tails.addChild(shoulderL);
		setRotationAngle(shoulderL, -0.9599F, 0.0F, -0.2618F);
		shoulderL.setTextureOffset(14, 16).addBox(-0.5176F, 0.9319F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);
		shoulderL.setTextureOffset(36, 16).addBox(-1.5176F, 4.9015F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		main.render(matrixStack, buffer, packedLight, packedOverlay);
		driver.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.legL.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.turret.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.legR.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}