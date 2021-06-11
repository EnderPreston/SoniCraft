// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeldeath_egg_robot_player extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer head;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_elbow;
	private final ModelRenderer right_hand;
	private final ModelRenderer bone1;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_elbow;
	private final ModelRenderer left_hand;
	private final ModelRenderer bone2;
	private final ModelRenderer cockpit;
	private final ModelRenderer lever1;
	private final ModelRenderer lever2;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_leg_bend;
	private final ModelRenderer left_knee;
	private final ModelRenderer left_foot;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg_bend;
	private final ModelRenderer right_knee;
	private final ModelRenderer right_foot;

	public Modeldeath_egg_robot_player() {
		textureWidth = 512;
		textureHeight = 512;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, -39.2083F, 0.0F);
		main.setTextureOffset(0, 0).addBox(-32.0F, -57.5417F, -32.0F, 64.0F, 50.0F, 64.0F, 0.0F, false);
		main.setTextureOffset(0, 266).addBox(-24.0F, -58.5417F, 32.0F, 48.0F, 40.0F, 24.0F, 0.0F, false);
		main.setTextureOffset(0, 114).addBox(-8.0F, -7.5417F, -25.0F, 16.0F, 18.0F, 50.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -57.5417F, 0.0F);
		main.addChild(head);
		head.setTextureOffset(0, 182).addBox(-30.0F, -24.0F, -30.0F, 60.0F, 24.0F, 60.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -11.0F, -36.0F, 8.0F, 8.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(348, 60).addBox(-36.0F, -18.0F, -32.0F, 72.0F, 16.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-31.0F, -34.0F, -6.0F, 0.0F, 32.0F, 32.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(31.0F, -34.0F, -6.0F, 0.0F, 32.0F, 32.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-36.0F, -47.5417F, 0.0F);
		main.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.1745F);
		right_arm.setTextureOffset(132, 114).addBox(-16.0F, -12.0F, -8.0F, 20.0F, 36.0F, 20.0F, 0.0F, false);

		right_elbow = new ModelRenderer(this);
		right_elbow.setRotationPoint(-6.0F, 17.0F, 2.0F);
		right_arm.addChild(right_elbow);
		setRotationAngle(right_elbow, -1.2217F, 0.0F, 0.0F);
		right_elbow.setTextureOffset(180, 170).addBox(-13.0F, -6.0F, -13.0F, 26.0F, 36.0F, 26.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setRotationPoint(0.0F, 30.0F, 0.0F);
		right_elbow.addChild(right_hand);

		bone1 = new ModelRenderer(this);
		bone1.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_hand.addChild(bone1);
		bone1.setTextureOffset(192, 0).addBox(-12.0F, 0.0F, -5.0F, 24.0F, 24.0F, 0.0F, 0.0F, false);
		bone1.setTextureOffset(192, 0).addBox(-5.0F, 0.0F, -12.0F, 0.0F, 24.0F, 24.0F, 0.0F, false);
		bone1.setTextureOffset(192, 0).addBox(-12.0F, 0.0F, 5.0F, 24.0F, 24.0F, 0.0F, 0.0F, false);
		bone1.setTextureOffset(192, 0).addBox(5.0F, 0.0F, -12.0F, 0.0F, 24.0F, 24.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(36.0F, -47.5417F, 0.0F);
		main.addChild(left_arm);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.2182F);
		left_arm.setTextureOffset(132, 114).addBox(-4.0F, -12.0F, -8.0F, 20.0F, 36.0F, 20.0F, 0.0F, true);

		left_elbow = new ModelRenderer(this);
		left_elbow.setRotationPoint(6.0F, 17.0F, 2.0F);
		left_arm.addChild(left_elbow);
		setRotationAngle(left_elbow, -1.2217F, 0.0F, 0.0F);
		left_elbow.setTextureOffset(180, 170).addBox(-13.0F, -6.0F, -13.0F, 26.0F, 36.0F, 26.0F, 0.0F, true);

		left_hand = new ModelRenderer(this);
		left_hand.setRotationPoint(0.0F, 30.0F, 0.0F);
		left_elbow.addChild(left_hand);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_hand.addChild(bone2);
		bone2.setTextureOffset(192, 0).addBox(-12.0F, 0.0F, -5.0F, 24.0F, 24.0F, 0.0F, 0.0F, true);
		bone2.setTextureOffset(192, 0).addBox(5.0F, 0.0F, -12.0F, 0.0F, 24.0F, 24.0F, 0.0F, true);
		bone2.setTextureOffset(192, 0).addBox(-12.0F, 0.0F, 5.0F, 24.0F, 24.0F, 0.0F, 0.0F, true);
		bone2.setTextureOffset(192, 0).addBox(-5.0F, 0.0F, -12.0F, 0.0F, 24.0F, 24.0F, 0.0F, true);

		cockpit = new ModelRenderer(this);
		cockpit.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(cockpit);
		cockpit.setTextureOffset(0, 330).addBox(-30.0F, -57.0F, -29.0F, 60.0F, 30.0F, 22.0F, 0.0F, false);
		cockpit.setTextureOffset(0, 452).addBox(12.0F, -54.0F, -9.0F, 18.0F, 30.0F, 20.0F, 0.0F, false);
		cockpit.setTextureOffset(76, 452).addBox(-30.0F, -54.0F, -9.0F, 18.0F, 30.0F, 20.0F, 0.0F, true);
		cockpit.setTextureOffset(164, 336).addBox(-30.0F, -54.0F, 11.0F, 60.0F, 30.0F, 16.0F, 0.0F, false);
		cockpit.setTextureOffset(224, 268).addBox(-10.0F, -69.0F, 5.0F, 20.0F, 36.0F, 6.0F, 0.0F, false);
		cockpit.setTextureOffset(144, 274).addBox(-10.0F, -49.0F, -15.0F, 20.0F, 16.0F, 20.0F, 0.0F, false);
		cockpit.setTextureOffset(0, 382).addBox(-30.0F, -38.0F, -30.0F, 60.0F, 10.0F, 60.0F, 0.0F, false);

		lever1 = new ModelRenderer(this);
		lever1.setRotationPoint(-8.0F, -55.0F, -8.5F);
		cockpit.addChild(lever1);
		setRotationAngle(lever1, -0.6981F, 0.0F, 0.0F);
		lever1.setTextureOffset(248, 56).addBox(-1.0F, -5.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		lever2 = new ModelRenderer(this);
		lever2.setRotationPoint(8.0F, -55.0F, -8.5F);
		cockpit.addChild(lever2);
		setRotationAngle(lever2, -0.6981F, 0.0F, 0.0F);
		lever2.setTextureOffset(248, 56).addBox(-1.0F, -5.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(8.0F, -38.5F, 0.0F);

		left_leg_bend = new ModelRenderer(this);
		left_leg_bend.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_leg.addChild(left_leg_bend);
		setRotationAngle(left_leg_bend, -0.2618F, 0.0F, 0.0F);
		left_leg_bend.setTextureOffset(256, 0).addBox(0.0F, -7.0F, -12.0F, 20.0F, 44.0F, 24.0F, 0.0F, true);

		left_knee = new ModelRenderer(this);
		left_knee.setRotationPoint(10.5F, 25.0F, 0.0F);
		left_leg_bend.addChild(left_knee);
		setRotationAngle(left_knee, 0.4363F, 0.0F, 0.0F);
		left_knee.setTextureOffset(256, 68).addBox(-14.5F, -9.0F, -18.0F, 28.0F, 40.0F, 36.0F, 0.0F, true);
		left_knee.setTextureOffset(0, 114).addBox(-9.5F, -21.0F, -19.0F, 18.0F, 20.0F, 0.0F, 0.0F, false);

		left_foot = new ModelRenderer(this);
		left_foot.setRotationPoint(-0.5F, 30.0F, 1.0F);
		left_knee.addChild(left_foot);
		setRotationAngle(left_foot, -0.1745F, 0.0F, 0.0F);
		left_foot.setTextureOffset(344, 0).addBox(-16.0F, -3.0F, -29.0F, 32.0F, 12.0F, 48.0F, 0.0F, true);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-8.0F, -38.5F, 0.0F);

		right_leg_bend = new ModelRenderer(this);
		right_leg_bend.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_leg.addChild(right_leg_bend);
		setRotationAngle(right_leg_bend, -0.2618F, 0.0F, 0.0F);
		right_leg_bend.setTextureOffset(256, 0).addBox(-20.0F, -7.0F, -12.0F, 20.0F, 44.0F, 24.0F, 0.0F, false);

		right_knee = new ModelRenderer(this);
		right_knee.setRotationPoint(-10.5F, 25.0F, 0.0F);
		right_leg_bend.addChild(right_knee);
		setRotationAngle(right_knee, 0.4363F, 0.0F, 0.0F);
		right_knee.setTextureOffset(256, 68).addBox(-13.5F, -9.0F, -18.0F, 28.0F, 40.0F, 36.0F, 0.0F, false);
		right_knee.setTextureOffset(0, 114).addBox(-8.5F, -21.0F, -19.0F, 18.0F, 20.0F, 0.0F, 0.0F, false);

		right_foot = new ModelRenderer(this);
		right_foot.setRotationPoint(0.5F, 30.0F, 1.0F);
		right_knee.addChild(right_foot);
		setRotationAngle(right_foot, -0.1745F, 0.0F, 0.0F);
		right_foot.setTextureOffset(344, 0).addBox(-16.0F, -3.0F, -29.0F, 32.0F, 12.0F, 48.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		main.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.bone1.rotateAngleY = f2 / 20.f;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.bone2.rotateAngleY = f2 / 20.f;
	}
}