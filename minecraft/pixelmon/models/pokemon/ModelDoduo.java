package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelDoduo extends ModelBase {
	// fields
	ModelRenderer LegLB;
	ModelRenderer FootL3;
	ModelRenderer LegRB;
	ModelRenderer FootR2;
	ModelRenderer FootR3;
	ModelRenderer FootR1;
	ModelRenderer FootL1;
	ModelRenderer FootL4;
	ModelRenderer LegLT;
	ModelRenderer LegRT;
	ModelRenderer RightNeckB;
	ModelRenderer LeftNeckB;
	ModelRenderer RightHead;
	ModelRenderer LeftHead;
	ModelRenderer RightHeadBeakT;
	ModelRenderer RightHeadBeakB;
	ModelRenderer LeftHeadBeakT;
	ModelRenderer LeftHeadBeakB;
	ModelRenderer FootR4;
	ModelRenderer FootL2;
	ModelRenderer LeftHeadR;
	ModelRenderer LeftHeadL;
	ModelRenderer RightHeadL;
	ModelRenderer RightHeadR;
	ModelRenderer Body9;
	ModelRenderer Body2;
	ModelRenderer Body3;
	ModelRenderer BodyMain;
	ModelRenderer Body4;
	ModelRenderer Body10;
	ModelRenderer Body6;
	ModelRenderer Body8;
	ModelRenderer Body7;
	ModelRenderer Body5;
	ModelRenderer Body1;
	ModelRenderer LeftNeckT;
	ModelRenderer RightNeckT;
	ModelRenderer BodyBase;
	ModelRenderer LegR;
	ModelRenderer LegL;
	ModelRenderer NeckLBase;
	ModelRenderer NeckLTop;
	ModelRenderer HeadLBase;
	ModelRenderer NeckRBase;
	ModelRenderer NeckRTop;
	ModelRenderer HeadRBase;

	public ModelDoduo() {
		textureWidth = 64;
		textureHeight = 32;

		BodyBase = new ModelRenderer(this, "BodyBase");
		BodyBase.setRotationPoint(0F, 0F, 0F);
		setRotation(BodyBase, 0F, 0F, 0F);
		BodyBase.mirror = true;
		BodyMain = new ModelRenderer(this, 26, 13);
		BodyMain.addBox(0F, 0F, 0F, 12, 12, 7);
		BodyMain.setRotationPoint(-5.5F, 0F, -3F);
		BodyMain.setTextureSize(64, 32);
		BodyMain.mirror = true;
		setRotation(BodyMain, 0F, 0F, 0F);
		Body1 = new ModelRenderer(this, 42, 20);
		Body1.addBox(0F, 0F, -6F, 9, 9, 1);
		Body1.setRotationPoint(-4F, 1.5F, 1.5F);
		Body1.setTextureSize(64, 32);
		Body1.mirror = true;
		setRotation(Body1, 0F, 0F, 0F);
		Body2 = new ModelRenderer(this, 37, 16);
		Body2.addBox(0F, 0F, 0F, 10, 10, 1);
		Body2.setRotationPoint(-4.5F, 1F, -4F);
		Body2.setTextureSize(64, 32);
		Body2.mirror = true;
		setRotation(Body2, 0F, 0F, 0F);
		Body3 = new ModelRenderer(this, 36, 17);
		Body3.addBox(0F, 0F, 0F, 1, 10, 5);
		Body3.setRotationPoint(6.5F, 1F, -2F);
		Body3.setTextureSize(64, 32);
		Body3.mirror = true;
		setRotation(Body3, 0F, 0F, 0F);
		Body4 = new ModelRenderer(this, 35, 14);
		Body4.addBox(0F, 0F, 0F, 11, 11, 1);
		Body4.setRotationPoint(-5F, 0.5F, -3.5F);
		Body4.setTextureSize(64, 32);
		Body4.mirror = true;
		setRotation(Body4, 0F, 0F, 0F);
		Body5 = new ModelRenderer(this, 35, 14);
		Body5.addBox(0F, 0F, 0F, 11, 11, 1);
		Body5.setRotationPoint(-5F, 0.5F, 3.5F);
		Body5.setTextureSize(64, 32);
		Body5.mirror = true;
		setRotation(Body5, 0F, 0F, 0F);
		Body6 = new ModelRenderer(this, 37, 16);
		Body6.addBox(0F, 0F, 0F, 10, 10, 1);
		Body6.setRotationPoint(-4.5F, 1F, 4F);
		Body6.setTextureSize(64, 32);
		Body6.mirror = true;
		setRotation(Body6, 0F, 0F, 0F);
		Body7 = new ModelRenderer(this, 42, 20);
		Body7.addBox(0F, 0F, 0F, 9, 9, 1);
		Body7.setRotationPoint(-4F, 1.5F, 4.5F);
		Body7.setTextureSize(64, 32);
		Body7.mirror = true;
		setRotation(Body7, 0F, 0F, 0F);
		Body8 = new ModelRenderer(this, 37, 14);
		Body8.addBox(0F, 0F, 0F, 1, 10, 5);
		Body8.setRotationPoint(-6F, 1F, -2F);
		Body8.setTextureSize(64, 32);
		Body8.mirror = true;
		setRotation(Body8, 0F, 0F, 0F);
		Body9 = new ModelRenderer(this, 37, 17);
		Body9.addBox(0F, 0F, 0F, 1, 8, 3);
		Body9.setRotationPoint(-6.5F, 2F, -1F);
		Body9.setTextureSize(64, 32);
		Body9.mirror = true;
		setRotation(Body9, 0F, 0F, 0F);
		Body10 = new ModelRenderer(this, 40, 15);
		Body10.addBox(0F, 0F, 0F, 1, 11, 6);
		Body10.setRotationPoint(6F, 0.5F, -2.5F);
		Body10.setTextureSize(64, 32);
		Body10.mirror = true;
		setRotation(Body10, 0F, 0F, 0F);

		BodyBase.addChild(BodyMain);
		BodyBase.addChild(Body1);
		BodyBase.addChild(Body2);
		BodyBase.addChild(Body3);
		BodyBase.addChild(Body4);
		BodyBase.addChild(Body5);
		BodyBase.addChild(Body6);
		BodyBase.addChild(Body7);
		BodyBase.addChild(Body8);
		BodyBase.addChild(Body9);
		BodyBase.addChild(Body10);

		LegL = new ModelRenderer(this, "LegL");
		LegL.setRotationPoint(3F, 12F, 0F);
		setRotation(LegL, 0F, 0F, 0F);
		LegL.mirror = true;
		LegLT = new ModelRenderer(this, 36, 0);
		LegLT.addBox(0F, 0F, 0F, 1, 5, 1);
		LegLT.setRotationPoint(-0.6F, 0.1F, -0.6F);
		LegLT.setTextureSize(64, 32);
		LegLT.mirror = true;
		setRotation(LegLT, 0.122173F, 0F, -0.122173F);
		LegLB = new ModelRenderer(this, 40, 0);
		LegLB.addBox(0F, 0F, 0F, 1, 7, 1);
		LegLB.setRotationPoint(0F, 4.7F, 0F);
		LegLB.setTextureSize(64, 32);
		LegLB.mirror = true;
		setRotation(LegLB, -0.1047198F, 0F, 0F);
		FootL1 = new ModelRenderer(this, 0, 0);
		FootL1.addBox(0F, 0F, 0F, 1, 1, 3);
		FootL1.setRotationPoint(3F, 11F, -0.8F);
		FootL1.setTextureSize(64, 32);
		FootL1.mirror = true;
		setRotation(FootL1, 0F, -1.570796F, 0F);
		FootL2 = new ModelRenderer(this, 0, 0);
		FootL2.addBox(0F, 0F, 0F, 1, 1, 3);
		FootL2.setRotationPoint(1.9F, 11F, -3F);
		FootL2.setTextureSize(64, 32);
		FootL2.mirror = true;
		setRotation(FootL2, 0F, -0.6108652F, 0F);
		FootL3 = new ModelRenderer(this, 0, 0);
		FootL3.addBox(0F, 0F, 0F, 1, 1, 3);
		FootL3.setRotationPoint(-1.5F, 11F, -2.3F);
		FootL3.setTextureSize(64, 32);
		FootL3.mirror = true;
		setRotation(FootL3, 0F, 0.6108652F, 0F);
		FootL4 = new ModelRenderer(this, 0, 0);
		FootL4.addBox(0F, 0F, 0F, 1, 1, 3);
		FootL4.setRotationPoint(-2.1F, 11F, 0.2F);
		FootL4.setTextureSize(64, 32);
		FootL4.mirror = true;
		setRotation(FootL4, 0F, 1.570796F, 0F);

		LegL.addChild(LegLT);
		LegL.addChild(LegLB);
		LegL.addChild(FootL1);
		LegL.addChild(FootL2);
		LegL.addChild(FootL3);
		LegL.addChild(FootL4);
		BodyBase.addChild(LegL);

		NeckLBase = new ModelRenderer(this, "NeckLBase");
		NeckLBase.setRotationPoint(5.5F, 0F, -2F);
		setRotation(NeckLBase, 0F, 0F, 0F);
		NeckLBase.mirror = true;
		LeftNeckB = new ModelRenderer(this, 44, 0);
		LeftNeckB.addBox(0F, 0F, 0F, 1, 3, 1);
		LeftNeckB.setRotationPoint(-0.5F, -2F, -1F);
		LeftNeckB.setTextureSize(64, 32);
		LeftNeckB.mirror = true;
		setRotation(LeftNeckB, 0.2443461F, 0F, 0F);

		NeckLBase.addChild(LeftNeckB);
		BodyBase.addChild(NeckLBase);

		NeckLTop = new ModelRenderer(this, "NeckLTop");
		NeckLTop.setRotationPoint(0F, -2F, -0.5F);
		setRotation(NeckLTop, 0F, 0F, 0F);
		NeckLTop.mirror = true;
		LeftNeckT = new ModelRenderer(this, 44, 0);
		LeftNeckT.addBox(0F, 0F, 0F, 1, 5, 1);
		LeftNeckT.setRotationPoint(-0.5F, -5F, -0.5F);
		LeftNeckT.setTextureSize(64, 32);
		LeftNeckT.mirror = true;
		setRotation(LeftNeckT, 0F, 0F, 0F);

		NeckLTop.addChild(LeftNeckT);
		NeckLBase.addChild(NeckLTop);

		HeadLBase = new ModelRenderer(this, "HeadLBase");
		HeadLBase.setRotationPoint(0F, -5F, 0F);
		setRotation(HeadLBase, 0F, 0F, 0F);
		HeadLBase.mirror = true;
		LeftHeadR = new ModelRenderer(this, 36, 17);
		LeftHeadR.addBox(0F, 0F, 0F, 1, 6, 6);
		LeftHeadR.setRotationPoint(-4F, -6.5F, -2F);
		LeftHeadR.setTextureSize(64, 32);
		LeftHeadR.mirror = true;
		setRotation(LeftHeadR, 0F, 0F, 0F);
		LeftHeadL = new ModelRenderer(this, 36, 17);
		LeftHeadL.addBox(0F, 0F, 0F, 1, 6, 6);
		LeftHeadL.setRotationPoint(3F, -6.5F, -2F);
		LeftHeadL.setTextureSize(64, 32);
		LeftHeadL.mirror = true;
		setRotation(LeftHeadL, 0F, 0F, 0F);
		LeftHead = new ModelRenderer(this, 0, 17);
		LeftHead.addBox(0F, 0F, 0F, 7, 7, 7);
		LeftHead.setRotationPoint(-3.5F, -7F, -2.5F);
		LeftHead.setTextureSize(64, 32);
		LeftHead.mirror = true;
		setRotation(LeftHead, 0F, 0F, 0F);
		LeftHeadBeakT = new ModelRenderer(this, 0, 9);
		LeftHeadBeakT.addBox(0F, 0F, 0F, 2, 1, 4);
		LeftHeadBeakT.setRotationPoint(-1F, -3F, -6.5F);
		LeftHeadBeakT.setTextureSize(64, 32);
		LeftHeadBeakT.mirror = true;
		setRotation(LeftHeadBeakT, 0F, 0F, 0F);
		LeftHeadBeakB = new ModelRenderer(this, 12, 10);
		LeftHeadBeakB.addBox(-1F, 0F, -3F, 2, 1, 3);
		LeftHeadBeakB.setRotationPoint(0F, -2F, -2.5F);
		LeftHeadBeakB.setTextureSize(64, 32);
		LeftHeadBeakB.mirror = true;
		setRotation(LeftHeadBeakB, 0F, 0F, 0F);

		HeadLBase.addChild(LeftHeadR);
		HeadLBase.addChild(LeftHeadL);
		HeadLBase.addChild(LeftHead);
		HeadLBase.addChild(LeftHeadBeakT);
		HeadLBase.addChild(LeftHeadBeakB);
		NeckLTop.addChild(HeadLBase);

		NeckRBase = new ModelRenderer(this, "NeckRBase");
		NeckRBase.setRotationPoint(-4.5F, 0F, -2F);
		setRotation(NeckRBase, 0F, 0F, 0F);
		NeckRBase.mirror = true;
		RightNeckB = new ModelRenderer(this, 44, 0);
		RightNeckB.addBox(0F, 0F, 0F, 1, 4, 1);
		RightNeckB.setRotationPoint(-0.5F, -3F, -1F);
		RightNeckB.setTextureSize(64, 32);
		RightNeckB.mirror = true;
		setRotation(RightNeckB, 0.2443461F, 0.1396263F, 0F);

		NeckRBase.addChild(RightNeckB);
		BodyBase.addChild(NeckRBase);

		NeckRTop = new ModelRenderer(this, "NeckRTop");
		NeckRTop.setRotationPoint(0F, -3.5F, -0.5F);
		setRotation(NeckRTop, 0F, 0F, 0F);
		NeckRTop.mirror = true;
		RightNeckT = new ModelRenderer(this, 44, 0);
		RightNeckT.addBox(0F, 0F, 0F, 1, 5, 1);
		RightNeckT.setRotationPoint(-0.5F, -4.5F, -0.5F);
		RightNeckT.setTextureSize(64, 32);
		RightNeckT.mirror = true;
		setRotation(RightNeckT, 0F, 0.1396263F, 0F);

		NeckRTop.addChild(RightNeckT);
		NeckRBase.addChild(NeckRTop);

		HeadRBase = new ModelRenderer(this, "HeadRBase");
		HeadRBase.setRotationPoint(0F, -4.5F, 0.5F);
		setRotation(HeadRBase, 0F, 0F, 0F);
		HeadRBase.mirror = true;
		RightHeadBeakB = new ModelRenderer(this, 12, 10);
		RightHeadBeakB.addBox(-1F, 0F, -3F, 2, 1, 3);
		RightHeadBeakB.setRotationPoint(-0.5F, -2F, -2.5F);
		RightHeadBeakB.setTextureSize(64, 32);
		RightHeadBeakB.mirror = true;
		setRotation(RightHeadBeakB, 0F, 0.1396263F, 0F);
		RightHeadR = new ModelRenderer(this, 36, 17);
		RightHeadR.addBox(0F, 0F, 0F, 1, 6, 6);
		RightHeadR.setRotationPoint(-4.5F, -6.5F, -1.5F);
		RightHeadR.setTextureSize(64, 32);
		RightHeadR.mirror = true;
		setRotation(RightHeadR, 0F, 0.1396263F, 0F);
		RightHead = new ModelRenderer(this, 0, 17);
		RightHead.addBox(0F, 0F, 0F, 7, 7, 7);
		RightHead.setRotationPoint(-4F, -7F, -2F);
		RightHead.setTextureSize(64, 32);
		RightHead.mirror = true;
		setRotation(RightHead, 0F, 0.1396263F, 0F);
		RightHeadL = new ModelRenderer(this, 36, 17);
		RightHeadL.addBox(0F, 0F, 0F, 1, 6, 6);
		RightHeadL.setRotationPoint(2.5F, -6.5F, -2.5F);
		RightHeadL.setTextureSize(64, 32);
		RightHeadL.mirror = true;
		setRotation(RightHeadL, 0F, 0.1396263F, 0F);
		RightHeadBeakT = new ModelRenderer(this, 0, 9);
		RightHeadBeakT.addBox(0F, 0F, 0F, 2, 1, 4);
		RightHeadBeakT.setRotationPoint(-2F, -3F, -6F);
		RightHeadBeakT.setTextureSize(64, 32);
		RightHeadBeakT.mirror = true;
		setRotation(RightHeadBeakT, 0F, 0.1396263F, 0F);

		HeadRBase.addChild(RightHeadR);
		HeadRBase.addChild(RightHeadL);
		HeadRBase.addChild(RightHead);
		HeadRBase.addChild(RightHeadBeakT);
		HeadRBase.addChild(RightHeadBeakB);
		NeckRTop.addChild(HeadRBase);

		LegR = new ModelRenderer(this, "LegR");
		LegR.setRotationPoint(-2F, 12F, 0F);
		setRotation(LegR, 0F, 0F, 0F);
		LegR.mirror = true;
		LegRT = new ModelRenderer(this, 36, 0);
		LegRT.addBox(0F, 0F, 0F, 1, 5, 1);
		LegRT.setRotationPoint(-0.4F, 0.1F, -0.6F);
		LegRT.setTextureSize(64, 32);
		LegRT.mirror = true;
		setRotation(LegRT, 0.122173F, 0F, 0.122173F);
		LegRB = new ModelRenderer(this, 40, 0);
		LegRB.addBox(0F, 0F, 0F, 1, 7, 1);
		LegRB.setRotationPoint(-1F, 4.7F, 0F);
		LegRB.setTextureSize(64, 32);
		LegRB.mirror = true;
		setRotation(LegRB, -0.1047198F, 0F, 0F);
		FootR1 = new ModelRenderer(this, 0, 0);
		FootR1.addBox(0F, 0F, 0F, 1, 1, 3);
		FootR1.setRotationPoint(-3F, 11F, 0.2F);
		FootR1.setTextureSize(64, 32);
		FootR1.mirror = true;
		setRotation(FootR1, 0F, 1.570796F, 0F);
		FootR2 = new ModelRenderer(this, 0, 0);
		FootR2.addBox(0F, 0F, 0F, 1, 1, 3);
		FootR2.setRotationPoint(-2.5F, 11F, -2.4F);
		FootR2.setTextureSize(64, 32);
		FootR2.mirror = true;
		setRotation(FootR2, 0F, 0.6108652F, 0F);
		FootR3 = new ModelRenderer(this, 0, 0);
		FootR3.addBox(0F, 0F, 0F, 1, 1, 3);
		FootR3.setRotationPoint(2F, 11F, -0.8F);
		FootR3.setTextureSize(64, 32);
		FootR3.mirror = true;
		setRotation(FootR3, 0F, -1.570796F, 0F);
		FootR4 = new ModelRenderer(this, 0, 0);
		FootR4.addBox(0F, 0F, 0F, 1, 1, 3);
		FootR4.setRotationPoint(1F, 11F, -3F);
		FootR4.setTextureSize(64, 32);
		FootR4.mirror = true;
		setRotation(FootR4, 0F, -0.6108652F, 0F);

		LegR.addChild(LegRT);
		LegR.addChild(LegRB);
		LegR.addChild(FootR1);
		LegR.addChild(FootR2);
		LegR.addChild(FootR3);
		LegR.addChild(FootR4);
		BodyBase.addChild(LegR);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		BodyBase.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity entity) {
	}

}
