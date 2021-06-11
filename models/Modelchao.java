// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelchao extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer cone;
	private final ModelRenderer cone1;
	private final ModelRenderer cone2;
	private final ModelRenderer hero_hair1;
	private final ModelRenderer hero_hair2;
	private final ModelRenderer dark_hair;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_wing;
	private final ModelRenderer left_wing;
	private final ModelRenderer dark_tail;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public Modelchao() {
		textureWidth = 64;
		textureHeight = 32;

		main = new ModelRenderer(this);
		main.setRotationPoint(3.0F, 20.0F, -3.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(-3.0F, 2.0F, 3.0F);
		main.addChild(body);
		body.setTextureOffset(0, 11).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(19, 6).addBox(-2.5F, -8.0F, -2.0F, 5.0F, 0.0F, 5.0F, 0.0F, false);

		cone = new ModelRenderer(this);
		cone.setRotationPoint(0.0F, 0.0F, 0.5F);
		head.addChild(cone);
		cone.setTextureOffset(48, 0).addBox(-1.0F, -10.5F, -1.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);
		cone.setTextureOffset(48, 4).addBox(-1.0F, -9.5F, 4.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

		cone1 = new ModelRenderer(this);
		cone1.setRotationPoint(0.0F, -5.0F, 0.0F);
		cone.addChild(cone1);
		setRotationAngle(cone1, 0.0F, 0.7854F, 0.0F);
		cone1.setTextureOffset(38, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, false);

		cone2 = new ModelRenderer(this);
		cone2.setRotationPoint(0.0F, -5.0F, 0.0F);
		cone.addChild(cone2);
		setRotationAngle(cone2, 0.0F, -0.7854F, 0.0F);
		cone2.setTextureOffset(38, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, false);

		hero_hair1 = new ModelRenderer(this);
		hero_hair1.setRotationPoint(0.0F, -4.25F, 0.5F);
		head.addChild(hero_hair1);
		setRotationAngle(hero_hair1, 0.0F, 0.0F, -0.6981F);
		hero_hair1.setTextureOffset(0, 17).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		hero_hair2 = new ModelRenderer(this);
		hero_hair2.setRotationPoint(0.0F, -4.25F, 0.5F);
		head.addChild(hero_hair2);
		setRotationAngle(hero_hair2, 0.0F, 0.0F, 0.6981F);
		hero_hair2.setTextureOffset(0, 17).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		dark_hair = new ModelRenderer(this);
		dark_hair.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(dark_hair);
		dark_hair.setTextureOffset(34, 0).addBox(0.0F, -7.0F, 0.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-1.75F, -1.5F, 0.0F);
		body.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.2618F);
		right_arm.setTextureOffset(30, 0).addBox(-1.75F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(1.75F, -1.5F, 0.0F);
		body.addChild(left_arm);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.2618F);
		left_arm.setTextureOffset(30, 0).addBox(-0.25F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(0.0F, -1.0F, 1.5F);
		body.addChild(right_wing);
		setRotationAngle(right_wing, 0.0F, 0.6981F, 0.0F);
		right_wing.setTextureOffset(14, 11).addBox(-4.0F, -2.0F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(0.0F, -1.0F, 1.5F);
		body.addChild(left_wing);
		setRotationAngle(left_wing, 0.0F, -0.6981F, 0.0F);
		left_wing.setTextureOffset(14, 11).addBox(0.0F, -2.0F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, true);

		dark_tail = new ModelRenderer(this);
		dark_tail.setRotationPoint(0.0F, 0.0F, 1.0F);
		body.addChild(dark_tail);
		setRotationAngle(dark_tail, 0.3491F, 0.0F, 0.0F);
		dark_tail.setTextureOffset(0, 17).addBox(0.0F, -1.25F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-4.0F, 3.5F, 3.0F);
		main.addChild(right_leg);
		right_leg.setTextureOffset(18, 0).addBox(-1.0F, -0.5F, -2.25F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-2.0F, 3.5F, 3.0F);
		main.addChild(left_leg);
		left_leg.setTextureOffset(18, 0).addBox(-1.0F, -0.5F, -2.25F, 2.0F, 1.0F, 4.0F, 0.0F, true);
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
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}