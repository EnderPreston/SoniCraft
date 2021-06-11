// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeltornado_plane extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer body;
	private final ModelRenderer propeller1;
	private final ModelRenderer propeller2;
	private final ModelRenderer rod1;
	private final ModelRenderer rod2;
	private final ModelRenderer rod3;
	private final ModelRenderer rod4;
	private final ModelRenderer rod5;
	private final ModelRenderer rod6;
	private final ModelRenderer wheel1;
	private final ModelRenderer axle1;
	private final ModelRenderer wheel2;
	private final ModelRenderer axle2;
	private final ModelRenderer axleBack;
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
	private final ModelRenderer passenger;
	private final ModelRenderer sonic;
	private final ModelRenderer head2;
	private final ModelRenderer body3;
	private final ModelRenderer hipR;
	private final ModelRenderer hipL;
	private final ModelRenderer shoulderR2;
	private final ModelRenderer shoulderL2;

	public Modeltornado_plane() {
		textureWidth = 256;
		textureHeight = 128;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 20.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(body);
		body.setTextureOffset(136, 68).addBox(-10.0F, -26.0F, -28.0F, 20.0F, 20.0F, 40.0F, 0.0F, false);
		body.setTextureOffset(90, 10).addBox(-9.0F, -29.0F, -10.0F, 18.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(84, 42).addBox(-7.0F, -33.0F, 5.0F, 14.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 48).addBox(-9.0F, -26.0F, 12.0F, 18.0F, 18.0F, 16.0F, 0.0F, false);
		body.setTextureOffset(0, 82).addBox(-7.0F, -26.0F, 28.0F, 14.0F, 14.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(0, 106).addBox(-3.0F, -19.0F, -36.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(60, 19).addBox(-40.0F, -38.0F, -26.0F, 80.0F, 2.0F, 16.0F, 0.0F, false);
		body.setTextureOffset(60, 19).addBox(-40.0F, -13.0F, -22.0F, 80.0F, 2.0F, 16.0F, 0.0F, false);
		body.setTextureOffset(42, 54).addBox(-20.0F, -25.0F, 28.0F, 40.0F, 0.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(208, 28).addBox(0.0F, -42.0F, 14.0F, 0.0F, 16.0F, 24.0F, 0.0F, false);
		body.setTextureOffset(186, 0).addBox(1.0F, -2.0F, 25.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(186, 0).addBox(-3.0F, -2.0F, 25.0F, 2.0F, 6.0F, 6.0F, 0.0F, true);

		propeller1 = new ModelRenderer(this);
		propeller1.setRotationPoint(0.0F, -16.0F, -31.0F);
		body.addChild(propeller1);

		propeller2 = new ModelRenderer(this);
		propeller2.setRotationPoint(0.0F, 0.0F, 0.0F);
		propeller1.addChild(propeller2);
		propeller2.setTextureOffset(210, 0).addBox(-3.0F, -17.0F, 0.0F, 6.0F, 18.0F, 1.0F, -0.25F, false);
		propeller2.setTextureOffset(210, 0).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 18.0F, 1.0F, -0.25F, false);

		rod1 = new ModelRenderer(this);
		rod1.setRotationPoint(25.0F, -35.0F, -23.0F);
		body.addChild(rod1);
		setRotationAngle(rod1, 0.1309F, 0.0F, 0.0F);
		rod1.setTextureOffset(60, 0).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 26.0F, 2.0F, 0.0F, false);

		rod2 = new ModelRenderer(this);
		rod2.setRotationPoint(25.0F, -35.0F, -13.0F);
		body.addChild(rod2);
		setRotationAngle(rod2, 0.1309F, 0.0F, 0.0F);
		rod2.setTextureOffset(60, 0).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 26.0F, 2.0F, 0.0F, false);

		rod3 = new ModelRenderer(this);
		rod3.setRotationPoint(-25.0F, -35.0F, -23.0F);
		body.addChild(rod3);
		setRotationAngle(rod3, 0.1309F, 0.0F, 0.0F);
		rod3.setTextureOffset(60, 0).addBox(0.0F, -2.0F, 0.0F, 2.0F, 26.0F, 2.0F, 0.0F, true);

		rod4 = new ModelRenderer(this);
		rod4.setRotationPoint(-25.0F, -35.0F, -13.0F);
		body.addChild(rod4);
		setRotationAngle(rod4, 0.1309F, 0.0F, 0.0F);
		rod4.setTextureOffset(60, 0).addBox(0.0F, -2.0F, 0.0F, 2.0F, 26.0F, 2.0F, 0.0F, true);

		rod5 = new ModelRenderer(this);
		rod5.setRotationPoint(-9.0F, -27.0F, -23.0F);
		body.addChild(rod5);
		setRotationAngle(rod5, 0.0F, 0.0F, 0.8727F);
		rod5.setTextureOffset(84, 38).addBox(-14.0F, 0.0F, 1.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		rod6 = new ModelRenderer(this);
		rod6.setRotationPoint(9.0F, -27.0F, -23.0F);
		body.addChild(rod6);
		setRotationAngle(rod6, 0.0F, 0.0F, -0.8727F);
		rod6.setTextureOffset(84, 38).addBox(-2.0F, 0.0F, 1.0F, 16.0F, 2.0F, 2.0F, 0.0F, true);

		wheel1 = new ModelRenderer(this);
		wheel1.setRotationPoint(0.0F, -26.0F, 26.0F);
		body.addChild(wheel1);
		wheel1.setTextureOffset(166, 0).addBox(9.0F, 22.0F, -43.0F, 2.0F, 8.0F, 8.0F, 0.0F, false);
		wheel1.setTextureOffset(134, 10).addBox(7.0F, 24.0F, -41.0F, 2.0F, 4.0F, 4.0F, 0.25F, false);

		axle1 = new ModelRenderer(this);
		axle1.setRotationPoint(9.0F, 25.0F, -39.0F);
		wheel1.addChild(axle1);
		setRotationAngle(axle1, 0.7854F, 0.0F, 0.0F);
		axle1.setTextureOffset(130, 0).addBox(-2.0F, -9.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		axle1.setTextureOffset(142, 0).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);

		wheel2 = new ModelRenderer(this);
		wheel2.setRotationPoint(0.0F, -26.0F, 26.0F);
		body.addChild(wheel2);
		wheel2.setTextureOffset(166, 0).addBox(-11.0F, 22.0F, -43.0F, 2.0F, 8.0F, 8.0F, 0.0F, true);
		wheel2.setTextureOffset(134, 10).addBox(-9.0F, 24.0F, -41.0F, 2.0F, 4.0F, 4.0F, 0.25F, true);

		axle2 = new ModelRenderer(this);
		axle2.setRotationPoint(-9.0F, 25.0F, -39.0F);
		wheel2.addChild(axle2);
		setRotationAngle(axle2, 0.7854F, 0.0F, 0.0F);
		axle2.setTextureOffset(130, 0).addBox(0.0F, -9.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);
		axle2.setTextureOffset(142, 0).addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 10.0F, 0.0F, true);

		axleBack = new ModelRenderer(this);
		axleBack.setRotationPoint(0.0F, 1.0F, 28.0F);
		body.addChild(axleBack);
		setRotationAngle(axleBack, 0.6545F, 0.0F, 0.0F);
		axleBack.setTextureOffset(202, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 14.0F, 2.0F, 0.0F, false);

		driver = new ModelRenderer(this);
		driver.setRotationPoint(0.0F, 22.0F, 0.0F);
		main.addChild(driver);

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

		passenger = new ModelRenderer(this);
		passenger.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(passenger);

		sonic = new ModelRenderer(this);
		sonic.setRotationPoint(0.0F, -43.0F, -17.0F);
		passenger.addChild(sonic);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, -4.0F, 0.0F);
		sonic.addChild(head2);
		head2.setTextureOffset(68, 68).addBox(-0.5F, -8.0F, -4.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head2.setTextureOffset(68, 64).addBox(-4.0F, -13.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head2.setTextureOffset(100, 64).addBox(4.125F, -13.0F, -2.75F, 0.0F, 8.0F, 8.0F, 0.0F, false);
		head2.setTextureOffset(100, 64).addBox(-4.125F, -13.0F, -2.75F, 0.0F, 8.0F, 8.0F, 0.0F, true);
		head2.setTextureOffset(100, 64).addBox(0.0F, -12.5F, -1.25F, 0.0F, 8.0F, 8.0F, 0.0F, true);
		head2.setTextureOffset(68, 65).addBox(-4.0F, -15.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head2.setTextureOffset(68, 65).addBox(2.0F, -15.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head2.setTextureOffset(100, 64).addBox(-4.0F, -13.15F, -2.0F, 8.0F, 0.0F, 8.0F, 0.0F, false);

		body3 = new ModelRenderer(this);
		body3.setRotationPoint(-0.5F, 0.0F, 0.0F);
		sonic.addChild(body3);
		body3.setTextureOffset(68, 86).addBox(-1.5F, -9.0F, -1.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		body3.setTextureOffset(116, 72).addBox(-1.0F, -10.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
		body3.setTextureOffset(116, 72).addBox(2.0F, -10.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		hipR = new ModelRenderer(this);
		hipR.setRotationPoint(-1.0F, 2.0F, 0.0F);
		sonic.addChild(hipR);
		hipR.setTextureOffset(90, 80).addBox(-1.0F, -6.25F, -1.0F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		hipR.setTextureOffset(84, 90).addBox(-2.0F, -0.75F, -2.0F, 4.0F, 2.0F, 4.0F, -0.25F, false);
		hipR.setTextureOffset(102, 88).addBox(-2.0F, 1.0F, -4.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);

		hipL = new ModelRenderer(this);
		hipL.setRotationPoint(1.0F, 2.0F, 0.0F);
		sonic.addChild(hipL);
		hipL.setTextureOffset(90, 80).addBox(-1.0F, -6.25F, -1.0F, 2.0F, 6.0F, 2.0F, -0.25F, true);
		hipL.setTextureOffset(84, 90).addBox(-2.0F, -0.75F, -2.0F, 4.0F, 2.0F, 4.0F, -0.25F, true);
		hipL.setTextureOffset(102, 88).addBox(-2.0F, 1.0F, -4.0F, 4.0F, 2.0F, 6.0F, 0.0F, true);

		shoulderR2 = new ModelRenderer(this);
		shoulderR2.setRotationPoint(-2.0F, -3.0F, 0.0F);
		sonic.addChild(shoulderR2);
		setRotationAngle(shoulderR2, 0.0F, 0.0F, 0.2618F);
		shoulderR2.setTextureOffset(82, 80).addBox(-3.2941F, -5.8296F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		shoulderR2.setTextureOffset(104, 80).addBox(-4.2941F, -1.86F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		shoulderL2 = new ModelRenderer(this);
		shoulderL2.setRotationPoint(2.0F, -3.0F, 0.0F);
		sonic.addChild(shoulderL2);
		setRotationAngle(shoulderL2, 0.0F, 0.0F, -0.2618F);
		shoulderL2.setTextureOffset(82, 80).addBox(1.2941F, -5.8296F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);
		shoulderL2.setTextureOffset(104, 80).addBox(0.2941F, -1.86F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
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
		this.propeller2.rotateAngleZ = f2;
		this.propeller1.rotateAngleZ = f2;
		this.head2.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head2.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}