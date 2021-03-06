package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelBellsprout extends ModelBase {
	// fields
	ModelRenderer Stem_1;
	ModelRenderer Stem_2;
	ModelRenderer Stem_3;
	ModelRenderer Stem_4;
	ModelRenderer Stem_5;
	ModelRenderer Stem_6;
	ModelRenderer Stem_7;
	ModelRenderer Stem_8;
	ModelRenderer Stem_9;
	ModelRenderer Stem_10;
	ModelRenderer Stem_11;
	ModelRenderer Leaf_L;
	ModelRenderer Leaf_R;
	ModelRenderer EyeL;
	ModelRenderer EyeR;
	ModelRenderer HeadTip;
	ModelRenderer HeadTop;
	ModelRenderer Head2;
	ModelRenderer Head1;
	ModelRenderer HeadMain;
	ModelRenderer MouthUpper;
	ModelRenderer Lip1;
	ModelRenderer Lip2;
	ModelRenderer Lip3;
	ModelRenderer Lip4;
	ModelRenderer RootR1;
	ModelRenderer RootR2;
	ModelRenderer AnkleR;
	ModelRenderer RootL1;
	ModelRenderer RootL2;
	ModelRenderer AnkleL;
	ModelRenderer FootR;
	ModelRenderer FootL;
	ModelRenderer StemBase;
	ModelRenderer StemPiece1;
	ModelRenderer StemPiece2;
	ModelRenderer StemPiece3;
	ModelRenderer StemHead;

	public ModelBellsprout() {
		textureWidth = 128;
		textureHeight = 128;
		setTextureOffset("StemBase.DeleteMe1", 0, 0);

		Stem_11 = new ModelRenderer(this, 49, 6);
		Stem_11.addBox(0F, -1F, -1F, 5, 2, 2);
		Stem_11.setRotationPoint(1F, 11.2F, 2.4F);
		Stem_11.setTextureSize(128, 128);
		Stem_11.mirror = true;
		setRotation(Stem_11, 0F, -1.58825F, 1.675516F);
		RootR1 = new ModelRenderer(this, 49, 69);
		RootR1.addBox(0F, -1F, -1F, 5, 2, 2);
		RootR1.setRotationPoint(1F, 15F, 2.1F);
		RootR1.setTextureSize(128, 128);
		RootR1.mirror = true;
		setRotation(RootR1, 0.1745329F, -0.2268928F, 2.216568F);
		RootR2 = new ModelRenderer(this, 50, 74);
		RootR2.addBox(0F, -1F, -1F, 4, 2, 2);
		RootR2.setRotationPoint(-1.8F, 18.8F, 1.4F);
		RootR2.setTextureSize(128, 128);
		RootR2.mirror = true;
		setRotation(RootR2, 0.1745329F, -0.1745329F, 1.972222F);
		AnkleR = new ModelRenderer(this, 53, 85);
		AnkleR.addBox(-1F, 0F, -1F, 2, 2, 2);
		AnkleR.setRotationPoint(-3.2F, 22F, 1.2F);
		AnkleR.setTextureSize(128, 128);
		AnkleR.mirror = true;
		setRotation(AnkleR, 0F, 0F, 0F);
		FootR = new ModelRenderer(this, 0, 33);
		FootR.addBox(-4.5F, 0F, -6F, 8, 0, 11);
		FootR.setRotationPoint(-3F, 24F, 1F);
		FootR.setTextureSize(128, 128);
		FootR.mirror = true;
		setRotation(FootR, 0F, 0F, 0F);
		RootL1 = new ModelRenderer(this, 49, 0);
		RootL1.addBox(0F, -1F, -1F, 5, 2, 2);
		RootL1.setRotationPoint(1.1F, 15F, 2.1F);
		RootL1.setTextureSize(128, 128);
		RootL1.mirror = true;
		setRotation(RootL1, 0F, 0.0872665F, 0.9424778F);
		RootL2 = new ModelRenderer(this, 50, 79);
		RootL2.addBox(0F, -1F, -1F, 4, 2, 2);
		RootL2.setRotationPoint(3.9F, 18.8F, 1.8F);
		RootL2.setTextureSize(128, 128);
		RootL2.mirror = true;
		setRotation(RootL2, 0F, 0.0872665F, 1.204277F);
		FootL = new ModelRenderer(this, 0, 20);
		FootL.addBox(-4F, 0F, -5F, 8, 0, 11);
		FootL.setRotationPoint(5F, 24F, 1F);
		FootL.setTextureSize(128, 128);
		FootL.mirror = true;
		setRotation(FootL, 0F, 0F, 0F);
		AnkleL = new ModelRenderer(this, 44, 85);
		AnkleL.addBox(-1F, 0F, -1F, 2, 2, 2);
		AnkleL.setRotationPoint(5.3F, 22F, 1.7F);
		AnkleL.setTextureSize(128, 128);
		AnkleL.mirror = true;
		setRotation(AnkleL, 0F, 0.1047198F, 0F);
		StemBase = new ModelRenderer(this, "StemBase");
		StemBase.setRotationPoint(1F, 11.2F, 2.4F);
		setRotation(StemBase, 0F, 0F, 0F);
		StemBase.mirror = true;
		Stem_10 = new ModelRenderer(this, 49, 11);
		Stem_10.addBox(0F, -1F, -1F, 5, 2, 2);
		Stem_10.setRotationPoint(0F, -4.5F, 1.3F);
		Stem_10.setTextureSize(128, 128);
		Stem_10.mirror = true;
		setRotation(Stem_10, -1.58825F, 0F, 1.867502F);
		Stem_9 = new ModelRenderer(this, 49, 17);
		Stem_9.addBox(-4F, -1F, -1F, 5, 2, 2);
		Stem_9.setRotationPoint(0F, -3.2F, 0.9F);
		Stem_9.setTextureSize(128, 128);
		Stem_9.mirror = true;
		setRotation(Stem_9, -1.58825F, 0F, 1.867502F);

		StemBase.addChild(Stem_10);
		StemBase.addChild(Stem_9);

		StemPiece1 = new ModelRenderer(this, "StemPiece1");
		StemPiece1.setRotationPoint(0F, -6.7F, 2.1F);
		setRotation(StemPiece1, 0F, 0F, 0F);
		StemPiece1.mirror = true;
		Stem_8 = new ModelRenderer(this, 49, 23);
		Stem_8.addBox(0F, -1F, -1F, 6, 2, 2);
		Stem_8.setRotationPoint(0F, -5.5F, 1.4F);
		Stem_8.setTextureSize(128, 128);
		Stem_8.mirror = true;
		setRotation(Stem_8, -1.58825F, 0F, 1.867502F);
		Stem_7 = new ModelRenderer(this, 49, 29);
		Stem_7.addBox(0F, -1F, -1F, 5, 2, 2);
		Stem_7.setRotationPoint(0F, -9.5F, 2.2F);
		Stem_7.setTextureSize(128, 128);
		Stem_7.mirror = true;
		setRotation(Stem_7, -1.58825F, 0F, 1.780236F);

		StemPiece1.addChild(Stem_8);
		StemPiece1.addChild(Stem_7);
		StemBase.addChild(StemPiece1);

		StemPiece2 = new ModelRenderer(this, "StemPiece2");
		StemPiece2.setRotationPoint(0F, -9.5F, 2.1F);
		setRotation(StemPiece2, 0F, 0F, 0F);
		StemPiece2.mirror = true;
		Stem_6 = new ModelRenderer(this, 49, 36);
		Stem_6.addBox(0F, -1F, -1F, 5, 2, 2);
		Stem_6.setRotationPoint(0F, -3.3F, 0.1F);
		Stem_6.setTextureSize(128, 128);
		Stem_6.mirror = true;
		setRotation(Stem_6, -1.58825F, 0F, 1.623156F);
		Stem_5 = new ModelRenderer(this, 49, 42);
		Stem_5.addBox(0F, -1F, -1F, 5, 2, 2);
		Stem_5.setRotationPoint(0F, -9.2F, -0.1F);
		Stem_5.setTextureSize(128, 128);
		Stem_5.mirror = true;
		setRotation(Stem_5, -1.58825F, 0F, 1.53589F);
		Leaf_L = new ModelRenderer(this, 66, 57);
		Leaf_L.addBox(-4F, 0F, -19F, 14, 0, 18);
		Leaf_L.setRotationPoint(0F, -5F, 0F);
		Leaf_L.setTextureSize(128, 128);
		Leaf_L.mirror = false;
		setRotation(Leaf_L, -1.383618F, 0F, -1.58825F);
		Leaf_R = new ModelRenderer(this, 65, 77);
		Leaf_R.addBox(-5F, 0F, 1F, 14, 0, 18);
		Leaf_R.setRotationPoint(0F, -5F, 0F);
		Leaf_R.setTextureSize(128, 128);
		Leaf_R.mirror = false;
		setRotation(Leaf_R, -1.62441F, 0F, -1.58825F);

		StemPiece2.addChild(Stem_6);
		StemPiece2.addChild(Stem_5);
		StemPiece2.addChild(Leaf_L);
		StemPiece2.addChild(Leaf_R);
		StemPiece1.addChild(StemPiece2);

		StemPiece3 = new ModelRenderer(this, "StemPiece3");
		StemPiece3.setRotationPoint(0F, -8F, -0.1F);
		setRotation(StemPiece3, 0F, 0F, 0F);
		StemPiece3.mirror = true;
		Stem_4 = new ModelRenderer(this, 49, 48);
		Stem_4.addBox(0F, -1F, -1F, 5, 2, 2);
		Stem_4.setRotationPoint(0F, -4.6F, -0.8F);
		Stem_4.setTextureSize(128, 128);
		Stem_4.mirror = true;
		setRotation(Stem_4, -1.58825F, 0F, 1.37881F);
		Stem_3 = new ModelRenderer(this, 49, 54);
		Stem_3.addBox(0F, -1F, -1F, 5, 2, 2);
		Stem_3.setRotationPoint(0F, -8.8F, -2.1F);
		Stem_3.setTextureSize(128, 128);
		Stem_3.mirror = true;
		setRotation(Stem_3, -1.58825F, 0F, 1.27409F);

		StemPiece3.addChild(Stem_4);
		StemPiece3.addChild(Stem_3);
		StemPiece2.addChild(StemPiece3);

		StemHead = new ModelRenderer(this, "StemHead");
		StemHead.setRotationPoint(1F, -8.5F, -2.1F);
		setRotation(StemHead, 0F, 0F, 0F);
		StemHead.mirror = true;
		Stem_2 = new ModelRenderer(this, 49, 59);
		Stem_2.addBox(0F, -1F, -1F, 5, 2, 2);
		Stem_2.setRotationPoint(0F, -3.8F, -3.5F);
		Stem_2.setTextureSize(128, 128);
		Stem_2.mirror = true;
		setRotation(Stem_2, 0F, -1.58825F, 0.8901179F);
		EyeL = new ModelRenderer(this, 41, 32);
		EyeL.addBox(0F, -1F, -1F, 1, 1, 1);
		EyeL.setRotationPoint(1F, -7.2F, -11.6F);
		EyeL.setTextureSize(128, 128);
		EyeL.mirror = true;
		setRotation(EyeL, 0.0349066F, 0F, 0F);
		EyeR = new ModelRenderer(this, 40, 36);
		EyeR.addBox(0F, -1F, -1F, 1, 1, 1);
		EyeR.setRotationPoint(-4F, -7.2F, -11.6F);
		EyeR.setTextureSize(128, 128);
		EyeR.mirror = true;
		setRotation(EyeR, 0.0349066F, 0F, 0F);
		HeadTip = new ModelRenderer(this, 3, 2);
		HeadTip.addBox(-3F, -4F, 0F, 6, 6, 2);
		HeadTip.setRotationPoint(0F, -8.4F, -5.5F);
		HeadTip.setTextureSize(128, 128);
		HeadTip.mirror = true;
		setRotation(HeadTip, 1.832596F, 0F, 0F);
		HeadTop = new ModelRenderer(this, 3, 2);
		HeadTop.addBox(-3F, -3F, 0F, 7, 8, 2);
		HeadTop.setRotationPoint(-0.5F, -7.4F, -7.5F);
		HeadTop.setTextureSize(128, 128);
		HeadTop.mirror = true;
		setRotation(HeadTop, 1.832596F, 0F, 0F);
		Head2 = new ModelRenderer(this, 1, 54);
		Head2.addBox(-3F, -3F, 0F, 6, 5, 2);
		Head2.setRotationPoint(0F, -6.5F, -1.5F);
		Head2.setTextureSize(128, 128);
		Head2.mirror = true;
		setRotation(Head2, 0.2443461F, 0F, 0F);
		Head1 = new ModelRenderer(this, 18, 53);
		Head1.addBox(-5F, -4F, 0F, 8, 6, 2);
		Head1.setRotationPoint(1F, -5.8F, -2.5F);
		Head1.setTextureSize(128, 128);
		Head1.mirror = true;
		setRotation(Head1, 0.2443461F, 0F, 0F);
		HeadMain = new ModelRenderer(this, 0, 91);
		HeadMain.addBox(-5F, -3F, -10F, 8, 7, 10);
		HeadMain.setRotationPoint(1F, -7.5F, -1.5F);
		HeadMain.setTextureSize(128, 128);
		HeadMain.mirror = true;
		setRotation(HeadMain, 0.2443461F, 0F, 0F);
		MouthUpper = new ModelRenderer(this, 1, 110);
		MouthUpper.addBox(-3F, -2F, -6F, 6, 5, 6);
		MouthUpper.setRotationPoint(0F, -4.5F, -9.5F);
		MouthUpper.setTextureSize(128, 128);
		MouthUpper.mirror = true;
		setRotation(MouthUpper, 0.3346075F, 0F, 0F);
		Lip1 = new ModelRenderer(this, 44, 94);
		Lip1.addBox(-3F, -0.5F, 0F, 7, 1, 1);
		Lip1.setRotationPoint(-0.5F, -0.5F, -14.5F);
		Lip1.setTextureSize(128, 128);
		Lip1.mirror = true;
		setRotation(Lip1, -1.222541F, 0F, 0F);
		Lip2 = new ModelRenderer(this, 43, 113);
		Lip2.addBox(-4F, 0F, -0.5F, 7, 1, 1);
		Lip2.setRotationPoint(0.6F, -4.4F, -14F);
		Lip2.setTextureSize(128, 128);
		Lip2.mirror = true;
		setRotation(Lip2, -1.222541F, 0F, 0F);
		Lip3 = new ModelRenderer(this, 48, 100);
		Lip3.addBox(-2F, 0F, -1F, 5, 1, 1);
		Lip3.setRotationPoint(2.5F, -2.7F, -14.2F);
		Lip3.setTextureSize(128, 128);
		Lip3.mirror = true;
		setRotation(Lip3, -1.58825F, 0F, 1.239184F);
		Lip4 = new ModelRenderer(this, 48, 107);
		Lip4.addBox(-2F, 0F, -1F, 5, 1, 1);
		Lip4.setRotationPoint(-3.4F, -2.7F, -14.2F);
		Lip4.setTextureSize(128, 128);
		Lip4.mirror = true;
		setRotation(Lip4, -1.58825F, 0F, 1.239184F);

		StemHead.addChild(Stem_2);
		StemHead.addChild(HeadMain);
		StemHead.addChild(Head1);
		StemHead.addChild(Head2);
		StemHead.addChild(HeadTip);
		StemHead.addChild(HeadTop);
		StemHead.addChild(EyeL);
		StemHead.addChild(EyeR);
		StemHead.addChild(MouthUpper);
		StemHead.addChild(Lip1);
		StemHead.addChild(Lip2);
		StemHead.addChild(Lip3);
		StemHead.addChild(Lip4);
		StemPiece3.addChild(StemHead);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Stem_11.render(f5);
		RootR1.render(f5);
		RootR2.render(f5);
		AnkleR.render(f5);
		FootR.render(f5);
		RootL1.render(f5);
		RootL2.render(f5);
		FootL.render(f5);
		AnkleL.render(f5);
		StemBase.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
