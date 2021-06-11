// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelblast_processing_primed extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer spin_xy;
	private final ModelRenderer spin_xy2;
	private final ModelRenderer spin_yz;
	private final ModelRenderer spin_yz2;
	private final ModelRenderer spin_zx;
	private final ModelRenderer spin_zx2;

	public Modelblast_processing_primed() {
		textureWidth = 64;
		textureHeight = 64;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 16.0F, 0.0F);
		main.setTextureOffset(0, 0).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);

		spin_xy = new ModelRenderer(this);
		spin_xy.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(spin_xy);

		spin_xy2 = new ModelRenderer(this);
		spin_xy2.setRotationPoint(0.0F, 0.0F, 0.0F);
		spin_xy.addChild(spin_xy2);
		spin_xy2.setTextureOffset(0, 32).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, 2.0F, false);

		spin_yz = new ModelRenderer(this);
		spin_yz.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(spin_yz);

		spin_yz2 = new ModelRenderer(this);
		spin_yz2.setRotationPoint(0.0F, 0.0F, 0.0F);
		spin_yz.addChild(spin_yz2);
		spin_yz2.setTextureOffset(0, 32).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, 2.0F, false);

		spin_zx = new ModelRenderer(this);
		spin_zx.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(spin_zx);

		spin_zx2 = new ModelRenderer(this);
		spin_zx2.setRotationPoint(0.0F, 0.0F, 0.0F);
		spin_zx.addChild(spin_zx2);
		spin_zx2.setTextureOffset(0, 32).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, 2.0F, false);
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
		this.spin_xy.rotateAngleX = f2;
		this.spin_yz.rotateAngleY = f2;
		this.main.rotateAngleY = f2 / 20.f;
		this.spin_xy2.rotateAngleY = f2;
		this.spin_yz2.rotateAngleZ = f2;
		this.spin_zx.rotateAngleZ = f2;
		this.spin_zx2.rotateAngleX = f2;
	}
}