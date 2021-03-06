package pixelmon.gui.pc;

import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;
import pixelmon.comm.EnumPackets;
import pixelmon.comm.PacketCreator;
import pixelmon.comm.PixelmonDataPacket;
import pixelmon.gui.pokechecker.GuiScreenPokeChecker;
import cpw.mods.fml.common.network.PacketDispatcher;

public class GuiScreenPokeCheckerPC extends GuiScreenPokeChecker {

	protected GuiScreen parent;
	private int index, box;

	public GuiScreenPokeCheckerPC(PixelmonDataPacket packet, GuiScreen parent, int box, int index) {
		super(packet);
		this.parent = parent;
		this.index = index;
		this.box = box;
	}

	public void initGui() {
		super.initGui();
		controlList.clear();
		controlList.add(new GuiButton(0, width / 2 - 100, (int) (height * 0.8), "Back to PC"));
	}

	public void onGuiClosed() {
		super.onGuiClosed();
	}

	public void actionPerformed(GuiButton button) {
		switch (button.id) {
		case 0:

			PacketDispatcher.sendPacketToServer(PacketCreator.createPacket(EnumPackets.PCClick, -5));
			mc.displayGuiScreen(parent);
			break;
		}

	}
	
	public void keyTyped(char c, int i){
		if(i == 1){
			mc.displayGuiScreen(parent);
		}
	}

}
