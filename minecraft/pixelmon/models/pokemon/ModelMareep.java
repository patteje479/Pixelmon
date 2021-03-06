// Date: 14/07/2012 3:27:41 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelMareep extends ModelBase {
	// fields
	ModelRenderer Body1;
	ModelRenderer butt;
	ModelRenderer wool1;
	ModelRenderer backlegleft;
	ModelRenderer frontlegleft;
	ModelRenderer frontlegright;
	ModelRenderer backlegright;
	ModelRenderer TAIL1PIECE;
	ModelRenderer NECKPIECE;
	ModelRenderer Tail1;
	ModelRenderer Tail2;
	ModelRenderer Tail3;
	ModelRenderer Tailtip;
	ModelRenderer nose1;
	ModelRenderer nose2;
	ModelRenderer wool2;
	ModelRenderer wool3;
	ModelRenderer wool4;
	ModelRenderer wool5;
	ModelRenderer wool6;
	ModelRenderer wool7;
	ModelRenderer wool8;
	ModelRenderer wool9;
	ModelRenderer wool10;
	ModelRenderer Head;
	ModelRenderer Head2;
	ModelRenderer head3;
	ModelRenderer TAIL2PIECE;
	ModelRenderer TAIL3PIECE;
	ModelRenderer HEADPIECE;
	ModelRenderer EAR1PIECE;
	ModelRenderer EAR2PIECE;
	ModelRenderer leftear;
	ModelRenderer rightear;

	public ModelMareep() {
		textureWidth = 128;
		textureHeight = 128;
		setTextureOffset("NECKPIECE.NeckFolder", 0, 0);

		Body1 = new ModelRenderer(this, 32, 0);
		Body1.addBox(0F, 0F, 0F, 7, 6, 15);
		Body1.setRotationPoint(-3F, 12F, -2F);
		Body1.setTextureSize(128, 128);
		Body1.mirror = true;
		setRotation(Body1, 0F, 0F, 0F);

		butt = new ModelRenderer(this, 0, 58);
		butt.addBox(0F, 0F, 0F, 2, 2, 4);
		butt.setRotationPoint(-0.5F, 14F, 12.2F);
		butt.setTextureSize(128, 128);
		butt.mirror = true;
		setRotation(butt, 0.0743572F, 0F, 0F);

		wool1 = new ModelRenderer(this, 71, 41);
		wool1.addBox(0F, 0F, 0F, 9, 8, 17);
		wool1.setRotationPoint(-4F, 11F, -3F);
		wool1.setTextureSize(128, 128);
		wool1.mirror = true;
		setRotation(wool1, 0F, 0F, 0F);

		backlegleft = new ModelRenderer(this, 0, 37);
		backlegleft.addBox(0F, 0F, -1F, 2, 7, 2);
		backlegleft.setRotationPoint(2.9F, 17F, 11.5F);
		backlegleft.setTextureSize(128, 128);
		backlegleft.mirror = true;
		setRotation(backlegleft, 0F, 0F, 0F);

		frontlegleft = new ModelRenderer(this, 0, 37);
		frontlegleft.addBox(0F, 0F, -1F, 2, 7, 2);
		frontlegleft.setRotationPoint(2.9F, 17F, 0.5F);
		frontlegleft.setTextureSize(128, 128);
		frontlegleft.mirror = true;
		setRotation(frontlegleft, 0F, 0F, 0F);

		frontlegright = new ModelRenderer(this, 0, 37);
		frontlegright.addBox(-2F, 0F, -1F, 2, 7, 2);
		frontlegright.setRotationPoint(-1.9F, 17F, 0.5F);
		frontlegright.setTextureSize(128, 128);
		frontlegright.mirror = true;
		setRotation(frontlegright, 0F, 0F, 0F);

		backlegright = new ModelRenderer(this, 0, 37);
		backlegright.addBox(-2F, 0F, -1F, 2, 7, 2);
		backlegright.setRotationPoint(-1.9F, 17F, 11.5F);
		backlegright.setTextureSize(128, 128);
		backlegright.mirror = true;
		setRotation(backlegright, 0F, 0F, 0F);

		TAIL1PIECE = new ModelRenderer(this, "TAIL1PIECE");
		TAIL1PIECE.setRotationPoint(0.5F, 15F, 14F);
		setRotation(TAIL1PIECE, 0F, 0F, 0F);
		TAIL1PIECE.mirror = true;
		Tail1 = new ModelRenderer(this, 0, 48);
		Tail1.addBox(-1.01F, -0.4F, 2F, 2, 2, 3);
		Tail1.setRotationPoint(0F, 0F, 0F);
		Tail1.setTextureSize(128, 128);
		Tail1.mirror = true;
		setRotation(Tail1, 0.4089647F, 0F, 0F);

		TAIL2PIECE = new ModelRenderer(this, "TAIL2PIECE");
		TAIL2PIECE.setRotationPoint(0.5F, -1.5F, 5F);
		setRotation(TAIL2PIECE, 0.1858931F, 0F, 0F);
		TAIL2PIECE.mirror = true;
		// 1 , 13.5, 19
		Tail2 = new ModelRenderer(this, 0, 57);
		Tail2.addBox(-1.5F, -1.2F, -0.7F, 2, 2, 3);
		Tail2.setRotationPoint(0F, 0F, 0F);
		Tail2.setTextureSize(128, 128);
		Tail2.mirror = true;
		setRotation(Tail2, 0.7063936F, 0F, 0F);

		// 1, 11.5, 21

		TAIL3PIECE = new ModelRenderer(this, "TAIL3PIECE");
		TAIL3PIECE.setRotationPoint(0F, -2F, 2F);
		setRotation(TAIL3PIECE, 0F, 0F, 0F);
		TAIL3PIECE.mirror = true;

		Tailtip = new ModelRenderer(this, 0, 69);
		Tailtip.addBox(-1.5F, -3F, -1.7F, 3, 3, 3);
		Tailtip.setRotationPoint(0F, 0F, 0F);
		Tailtip.setTextureSize(128, 128);
		Tailtip.mirror = true;
		setRotation(Tailtip, -0.5205006F, 0F, 0F);

		Tail3 = new ModelRenderer(this, 0, 49);
		Tail3.addBox(-1.51F, -1.2F, -1F, 2, 2, 2);
		Tail3.setRotationPoint(0F, 0F, 0F);
		Tail3.setTextureSize(128, 128);
		Tail3.mirror = true;
		setRotation(Tail3, 1.152537F, 0F, 0F);

		NECKPIECE = new ModelRenderer(this, "NECKPIECE");
		NECKPIECE.setRotationPoint(0F, 15F, -3F);
		setRotation(NECKPIECE, 0F, 0F, 0F);
		NECKPIECE.mirror = true;

		wool2 = new ModelRenderer(this, 80, 40);
		wool2.addBox(-1.5F, -2.5F, -4F, 4, 4, 8);
		wool2.setRotationPoint(0F, 0F, 0F);
		wool2.setTextureSize(128, 128);
		wool2.mirror = true;
		setRotation(wool2, -0.7435722F, 0F, 0F);

		HEADPIECE = new ModelRenderer(this, "HEADPIECE");
		HEADPIECE.setRotationPoint(0F, -5F, -3F);
		setRotation(HEADPIECE, 0F, 0F, 0F);
		HEADPIECE.mirror = true;

		// 15
		// -3

		// -5
		// -3

		// 10
		// -6
		wool9 = new ModelRenderer(this, 70, 60);
		wool9.addBox(0F, 0F, 0F, 1, 1, 2);
		wool9.setRotationPoint(0F, -2.5F, -1F);
		wool9.setTextureSize(128, 128);
		wool9.mirror = true;
		setRotation(wool9, 0F, 0F, 0F);

		wool8 = new ModelRenderer(this, 70, 60);
		wool8.addBox(0F, -2F, -2.4F, 1, 2, 3);
		wool8.setRotationPoint(0F, 0F, 1F);
		wool8.setTextureSize(128, 128);
		wool8.mirror = true;
		setRotation(wool8, -0.2602503F, 0F, 0F);

		wool7 = new ModelRenderer(this, 70, 60);
		wool7.addBox(0F, -3.1F, -0.1F, 1, 1, 1);
		wool7.setRotationPoint(0F, 0F, 0F);
		wool7.setTextureSize(128, 128);
		wool7.mirror = true;
		setRotation(wool7, 0.669215F, 0F, 0F);

		wool6 = new ModelRenderer(this, 70, 60);
		wool6.addBox(0F, -3.2F, -0.9F, 1, 1, 1);
		wool6.setRotationPoint(0F, 0F, 0F);
		wool6.setTextureSize(128, 128);
		wool6.mirror = true;
		setRotation(wool6, 0.1487144F, 0F, 0F);

		wool5 = new ModelRenderer(this, 70, 60);
		wool5.addBox(0F, -2.9F, -1.3F, 1, 1, 1);
		wool5.setRotationPoint(0F, 0F, 0F);
		wool5.setTextureSize(128, 128);
		wool5.mirror = true;
		setRotation(wool5, -0.3346075F, 0F, 0F);

		wool4 = new ModelRenderer(this, 75, 60);
		wool4.addBox(0F, -2.3F, -2F, 1, 1, 2);
		wool4.setRotationPoint(0F, 0F, 0F);
		wool4.setTextureSize(128, 128);
		wool4.mirror = true;
		setRotation(wool4, -0.8922867F, 0F, 0F);

		wool3 = new ModelRenderer(this, 88, 60);
		wool3.addBox(-1F, -1F, 0.5F, 3, 3, 1);
		wool3.setRotationPoint(0F, 0F, 0F);
		wool3.setTextureSize(128, 128);
		wool3.mirror = true;
		setRotation(wool3, 0.1858931F, 0F, 0F);

		Head = new ModelRenderer(this, 0, 19);
		Head.addBox(0F, 0F, 0F, 5, 5, 5);
		Head.setRotationPoint(-2F, -1F, -3F);
		Head.setTextureSize(128, 128);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);

		wool10 = new ModelRenderer(this, 70, 60);
		wool10.addBox(-0.5F, -1.6F, -2.9F, 2, 2, 5);
		wool10.setRotationPoint(0F, 0F, 0F);
		wool10.setTextureSize(128, 128);
		wool10.mirror = true;
		setRotation(wool10, 0F, 0F, 0F);

		EAR2PIECE = new ModelRenderer(this, "EAR2PIECE");
		EAR2PIECE.setRotationPoint(0F, 0F, 0F);
		setRotation(EAR2PIECE, 0F, 0F, 0F);
		EAR2PIECE.mirror = true;

		// -1 10 -6
		rightear = new ModelRenderer(this, 12, 32);
		rightear.addBox(-4.5F, -1F, -1F, 3, 2, 2);
		rightear.setRotationPoint(0F, 0F, 0F);
		rightear.setTextureSize(128, 128);
		rightear.mirror = true;
		setRotation(rightear, 0F, 0F, -0.1373574F);

		EAR1PIECE = new ModelRenderer(this, "EAR1PIECE");
		EAR1PIECE.setRotationPoint(0F, 0F, 0F);
		setRotation(EAR1PIECE, 0F, 0F, 0F);
		EAR1PIECE.mirror = true;

		// 2, 8.3, -5.1

		leftear = new ModelRenderer(this, 0, 32);
		leftear.addBox(2.7F, -1F, -1F, 3, 2, 2);
		leftear.setRotationPoint(0F, 0F, 0F);
		leftear.setTextureSize(128, 128);
		leftear.mirror = true;
		setRotation(leftear, 0F, 0F, 0.1373543F);

		TAIL1PIECE.addChild(Tail1);
		TAIL1PIECE.addChild(TAIL2PIECE);
		TAIL2PIECE.addChild(Tail2);
		TAIL2PIECE.addChild(TAIL3PIECE);
		TAIL3PIECE.addChild(Tailtip);
		TAIL3PIECE.addChild(Tail3);

		NECKPIECE.addChild(wool2);
		NECKPIECE.addChild(HEADPIECE);
		HEADPIECE.addChild(wool3);
		HEADPIECE.addChild(wool4);
		HEADPIECE.addChild(wool5);
		HEADPIECE.addChild(wool6);
		HEADPIECE.addChild(wool7);
		HEADPIECE.addChild(wool8);
		HEADPIECE.addChild(wool9);
		HEADPIECE.addChild(wool10);

		HEADPIECE.addChild(Head);
		HEADPIECE.addChild(EAR1PIECE);
		HEADPIECE.addChild(EAR2PIECE);
		EAR1PIECE.addChild(leftear);
		EAR2PIECE.addChild(rightear);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body1.render(f5);
		butt.render(f5);
		wool1.render(f5);
		backlegleft.render(f5);
		frontlegleft.render(f5);
		frontlegright.render(f5);
		backlegright.render(f5);
		TAIL1PIECE.render(f5);
		NECKPIECE.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
	}

}
