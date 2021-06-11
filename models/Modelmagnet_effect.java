// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelmagnet_effect extends EntityModel<Entity> {
	private final ModelRenderer block_effect;
	private final ModelRenderer spin_x;
	private final ModelRenderer spin_xy;
	private final ModelRenderer spin_y;
	private final ModelRenderer spin_yz;
	private final ModelRenderer spin_z;
	private final ModelRenderer spin_zx;
	private final ModelRenderer beam1;
	private final ModelRenderer beam1_1;
	private final ModelRenderer beam1_2;
	private final ModelRenderer beam1_3;
	private final ModelRenderer beam1_4;
	private final ModelRenderer beam1_6;
	private final ModelRenderer beam1_8;
	private final ModelRenderer beam1_10;
	private final ModelRenderer beam1_5;
	private final ModelRenderer beam1_7;
	private final ModelRenderer beam1_9;
	private final ModelRenderer beam2;
	private final ModelRenderer beam1_11;
	private final ModelRenderer beam1_12;
	private final ModelRenderer beam1_13;
	private final ModelRenderer beam1_14;
	private final ModelRenderer beam1_15;
	private final ModelRenderer beam1_16;
	private final ModelRenderer beam1_17;
	private final ModelRenderer beam1_18;
	private final ModelRenderer beam1_19;
	private final ModelRenderer beam1_20;
	private final ModelRenderer beam3;
	private final ModelRenderer beam1_21;
	private final ModelRenderer beam1_22;
	private final ModelRenderer beam1_23;
	private final ModelRenderer beam1_24;
	private final ModelRenderer beam1_25;
	private final ModelRenderer beam1_26;
	private final ModelRenderer beam1_27;
	private final ModelRenderer beam1_28;
	private final ModelRenderer beam1_29;
	private final ModelRenderer beam1_30;
	private final ModelRenderer beam4;
	private final ModelRenderer beam1_31;
	private final ModelRenderer beam1_32;
	private final ModelRenderer beam1_33;
	private final ModelRenderer beam1_34;
	private final ModelRenderer beam1_35;
	private final ModelRenderer beam1_36;
	private final ModelRenderer beam1_37;
	private final ModelRenderer beam1_38;
	private final ModelRenderer beam1_39;
	private final ModelRenderer beam1_40;

	public Modelmagnet_effect() {
		textureWidth = 128;
		textureHeight = 128;

		block_effect = new ModelRenderer(this);
		block_effect.setRotationPoint(0.0F, 40.0F, 0.0F);

		spin_x = new ModelRenderer(this);
		spin_x.setRotationPoint(0.0F, 0.0F, 0.0F);
		block_effect.addChild(spin_x);

		spin_xy = new ModelRenderer(this);
		spin_xy.setRotationPoint(0.0F, 0.0F, 0.0F);
		spin_x.addChild(spin_xy);
		spin_xy.setTextureOffset(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 1.0F, false);

		spin_y = new ModelRenderer(this);
		spin_y.setRotationPoint(0.0F, 0.0F, 0.0F);
		block_effect.addChild(spin_y);

		spin_yz = new ModelRenderer(this);
		spin_yz.setRotationPoint(0.0F, 0.0F, 0.0F);
		spin_y.addChild(spin_yz);
		spin_yz.setTextureOffset(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.75F, false);

		spin_z = new ModelRenderer(this);
		spin_z.setRotationPoint(0.0F, 0.0F, 0.0F);
		block_effect.addChild(spin_z);

		spin_zx = new ModelRenderer(this);
		spin_zx.setRotationPoint(0.0F, 0.0F, 0.0F);
		spin_z.addChild(spin_zx);
		spin_zx.setTextureOffset(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 1.5F, false);

		beam1 = new ModelRenderer(this);
		beam1.setRotationPoint(0.0F, 24.0F, 0.0F);

		beam1_1 = new ModelRenderer(this);
		beam1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		beam1.addChild(beam1_1);
		beam1_1.setTextureOffset(76, 0).addBox(-8.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, false);

		beam1_2 = new ModelRenderer(this);
		beam1_2.setRotationPoint(0.0F, -128.0F, 0.0F);
		beam1.addChild(beam1_2);
		beam1_2.setTextureOffset(76, 0).addBox(-7.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, true);

		beam1_3 = new ModelRenderer(this);
		beam1_3.setRotationPoint(1.0F, -256.0F, 0.0F);
		beam1.addChild(beam1_3);
		beam1_3.setTextureOffset(76, 0).addBox(-9.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, false);

		beam1_4 = new ModelRenderer(this);
		beam1_4.setRotationPoint(0.0F, -384.0F, 0.0F);
		beam1.addChild(beam1_4);
		beam1_4.setTextureOffset(76, 0).addBox(-7.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, true);

		beam1_6 = new ModelRenderer(this);
		beam1_6.setRotationPoint(0.0F, -640.0F, 0.0F);
		beam1.addChild(beam1_6);
		beam1_6.setTextureOffset(76, 0).addBox(-7.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, true);

		beam1_8 = new ModelRenderer(this);
		beam1_8.setRotationPoint(0.0F, -896.0F, 0.0F);
		beam1.addChild(beam1_8);
		beam1_8.setTextureOffset(76, 0).addBox(-7.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, true);

		beam1_10 = new ModelRenderer(this);
		beam1_10.setRotationPoint(0.0F, -1152.0F, 0.0F);
		beam1.addChild(beam1_10);
		beam1_10.setTextureOffset(76, 0).addBox(-7.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, true);

		beam1_5 = new ModelRenderer(this);
		beam1_5.setRotationPoint(0.0F, -512.0F, 0.0F);
		beam1.addChild(beam1_5);
		beam1_5.setTextureOffset(76, 0).addBox(-8.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, false);

		beam1_7 = new ModelRenderer(this);
		beam1_7.setRotationPoint(0.0F, -768.0F, 0.0F);
		beam1.addChild(beam1_7);
		beam1_7.setTextureOffset(76, 0).addBox(-8.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, false);

		beam1_9 = new ModelRenderer(this);
		beam1_9.setRotationPoint(0.0F, -1024.0F, 0.0F);
		beam1.addChild(beam1_9);
		beam1_9.setTextureOffset(76, 0).addBox(-8.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, false);

		beam2 = new ModelRenderer(this);
		beam2.setRotationPoint(0.0F, -1256.0F, 0.0F);

		beam1_11 = new ModelRenderer(this);
		beam1_11.setRotationPoint(0.0F, 0.0F, 0.0F);
		beam2.addChild(beam1_11);
		beam1_11.setTextureOffset(76, 0).addBox(-8.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, false);

		beam1_12 = new ModelRenderer(this);
		beam1_12.setRotationPoint(0.0F, -128.0F, 0.0F);
		beam2.addChild(beam1_12);
		beam1_12.setTextureOffset(76, 0).addBox(-7.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, true);

		beam1_13 = new ModelRenderer(this);
		beam1_13.setRotationPoint(1.0F, -256.0F, 0.0F);
		beam2.addChild(beam1_13);
		beam1_13.setTextureOffset(76, 0).addBox(-9.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, false);

		beam1_14 = new ModelRenderer(this);
		beam1_14.setRotationPoint(0.0F, -384.0F, 0.0F);
		beam2.addChild(beam1_14);
		beam1_14.setTextureOffset(76, 0).addBox(-7.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, true);

		beam1_15 = new ModelRenderer(this);
		beam1_15.setRotationPoint(0.0F, -640.0F, 0.0F);
		beam2.addChild(beam1_15);
		beam1_15.setTextureOffset(76, 0).addBox(-7.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, true);

		beam1_16 = new ModelRenderer(this);
		beam1_16.setRotationPoint(0.0F, -896.0F, 0.0F);
		beam2.addChild(beam1_16);
		beam1_16.setTextureOffset(76, 0).addBox(-7.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, true);

		beam1_17 = new ModelRenderer(this);
		beam1_17.setRotationPoint(0.0F, -1152.0F, 0.0F);
		beam2.addChild(beam1_17);
		beam1_17.setTextureOffset(76, 0).addBox(-7.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, true);

		beam1_18 = new ModelRenderer(this);
		beam1_18.setRotationPoint(0.0F, -512.0F, 0.0F);
		beam2.addChild(beam1_18);
		beam1_18.setTextureOffset(76, 0).addBox(-8.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, false);

		beam1_19 = new ModelRenderer(this);
		beam1_19.setRotationPoint(0.0F, -768.0F, 0.0F);
		beam2.addChild(beam1_19);
		beam1_19.setTextureOffset(76, 0).addBox(-8.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, false);

		beam1_20 = new ModelRenderer(this);
		beam1_20.setRotationPoint(0.0F, -1024.0F, 0.0F);
		beam2.addChild(beam1_20);
		beam1_20.setTextureOffset(76, 0).addBox(-8.0F, -128.0F, 0.0F, 16.0F, 128.0F, 0.0F, 0.0F, false);

		beam3 = new ModelRenderer(this);
		beam3.setRotationPoint(0.0F, 24.0F, 0.0F);

		beam1_21 = new ModelRenderer(this);
		beam1_21.setRotationPoint(0.0F, 0.0F, 0.0F);
		beam3.addChild(beam1_21);
		beam1_21.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -8.0F, 0.0F, 128.0F, 16.0F, 0.0F, false);

		beam1_22 = new ModelRenderer(this);
		beam1_22.setRotationPoint(0.0F, -128.0F, 0.0F);
		beam3.addChild(beam1_22);
		beam1_22.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -9.0F, 0.0F, 128.0F, 16.0F, 0.0F, true);

		beam1_23 = new ModelRenderer(this);
		beam1_23.setRotationPoint(1.0F, -256.0F, 0.0F);
		beam3.addChild(beam1_23);
		beam1_23.setTextureOffset(96, 0).addBox(-1.0F, -128.0F, -8.0F, 0.0F, 128.0F, 16.0F, 0.0F, false);

		beam1_24 = new ModelRenderer(this);
		beam1_24.setRotationPoint(0.0F, -384.0F, 0.0F);
		beam3.addChild(beam1_24);
		beam1_24.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -9.0F, 0.0F, 128.0F, 16.0F, 0.0F, true);

		beam1_25 = new ModelRenderer(this);
		beam1_25.setRotationPoint(0.0F, -640.0F, 0.0F);
		beam3.addChild(beam1_25);
		beam1_25.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -9.0F, 0.0F, 128.0F, 16.0F, 0.0F, true);

		beam1_26 = new ModelRenderer(this);
		beam1_26.setRotationPoint(0.0F, -896.0F, 0.0F);
		beam3.addChild(beam1_26);
		beam1_26.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -9.0F, 0.0F, 128.0F, 16.0F, 0.0F, true);

		beam1_27 = new ModelRenderer(this);
		beam1_27.setRotationPoint(0.0F, -1152.0F, 0.0F);
		beam3.addChild(beam1_27);
		beam1_27.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -9.0F, 0.0F, 128.0F, 16.0F, 0.0F, true);

		beam1_28 = new ModelRenderer(this);
		beam1_28.setRotationPoint(0.0F, -512.0F, 0.0F);
		beam3.addChild(beam1_28);
		beam1_28.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -8.0F, 0.0F, 128.0F, 16.0F, 0.0F, false);

		beam1_29 = new ModelRenderer(this);
		beam1_29.setRotationPoint(0.0F, -768.0F, 0.0F);
		beam3.addChild(beam1_29);
		beam1_29.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -8.0F, 0.0F, 128.0F, 16.0F, 0.0F, false);

		beam1_30 = new ModelRenderer(this);
		beam1_30.setRotationPoint(0.0F, -1024.0F, 0.0F);
		beam3.addChild(beam1_30);
		beam1_30.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -8.0F, 0.0F, 128.0F, 16.0F, 0.0F, false);

		beam4 = new ModelRenderer(this);
		beam4.setRotationPoint(0.0F, -1256.0F, 0.0F);

		beam1_31 = new ModelRenderer(this);
		beam1_31.setRotationPoint(0.0F, 0.0F, 0.0F);
		beam4.addChild(beam1_31);
		beam1_31.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -8.0F, 0.0F, 128.0F, 16.0F, 0.0F, false);

		beam1_32 = new ModelRenderer(this);
		beam1_32.setRotationPoint(0.0F, -128.0F, 0.0F);
		beam4.addChild(beam1_32);
		beam1_32.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -9.0F, 0.0F, 128.0F, 16.0F, 0.0F, true);

		beam1_33 = new ModelRenderer(this);
		beam1_33.setRotationPoint(1.0F, -256.0F, 0.0F);
		beam4.addChild(beam1_33);
		beam1_33.setTextureOffset(96, 0).addBox(-1.0F, -128.0F, -8.0F, 0.0F, 128.0F, 16.0F, 0.0F, false);

		beam1_34 = new ModelRenderer(this);
		beam1_34.setRotationPoint(0.0F, -384.0F, 0.0F);
		beam4.addChild(beam1_34);
		beam1_34.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -9.0F, 0.0F, 128.0F, 16.0F, 0.0F, true);

		beam1_35 = new ModelRenderer(this);
		beam1_35.setRotationPoint(0.0F, -640.0F, 0.0F);
		beam4.addChild(beam1_35);
		beam1_35.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -9.0F, 0.0F, 128.0F, 16.0F, 0.0F, true);

		beam1_36 = new ModelRenderer(this);
		beam1_36.setRotationPoint(0.0F, -896.0F, 0.0F);
		beam4.addChild(beam1_36);
		beam1_36.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -9.0F, 0.0F, 128.0F, 16.0F, 0.0F, true);

		beam1_37 = new ModelRenderer(this);
		beam1_37.setRotationPoint(0.0F, -1152.0F, 0.0F);
		beam4.addChild(beam1_37);
		beam1_37.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -9.0F, 0.0F, 128.0F, 16.0F, 0.0F, true);

		beam1_38 = new ModelRenderer(this);
		beam1_38.setRotationPoint(0.0F, -512.0F, 0.0F);
		beam4.addChild(beam1_38);
		beam1_38.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -8.0F, 0.0F, 128.0F, 16.0F, 0.0F, false);

		beam1_39 = new ModelRenderer(this);
		beam1_39.setRotationPoint(0.0F, -768.0F, 0.0F);
		beam4.addChild(beam1_39);
		beam1_39.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -8.0F, 0.0F, 128.0F, 16.0F, 0.0F, false);

		beam1_40 = new ModelRenderer(this);
		beam1_40.setRotationPoint(0.0F, -1024.0F, 0.0F);
		beam4.addChild(beam1_40);
		beam1_40.setTextureOffset(96, 0).addBox(0.0F, -128.0F, -8.0F, 0.0F, 128.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		block_effect.render(matrixStack, buffer, packedLight, packedOverlay);
		beam1.render(matrixStack, buffer, packedLight, packedOverlay);
		beam2.render(matrixStack, buffer, packedLight, packedOverlay);
		beam3.render(matrixStack, buffer, packedLight, packedOverlay);
		beam4.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.spin_xy.rotateAngleY = f2;
		this.spin_x.rotateAngleX = f2;
		this.spin_y.rotateAngleY = f2;
		this.spin_z.rotateAngleZ = f2;
		this.spin_yz.rotateAngleZ = f2;
		this.spin_zx.rotateAngleX = f2;
		this.beam3.rotateAngleY = f2 / 20.f;
		this.beam4.rotateAngleY = f2 / 20.f;
		this.beam1.rotateAngleY = f2;
		this.beam2.rotateAngleY = f2;
	}
}