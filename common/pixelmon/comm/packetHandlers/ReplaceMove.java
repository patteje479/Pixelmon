package pixelmon.comm.packetHandlers;

import java.io.DataInputStream;
import java.io.IOException;

import cpw.mods.fml.common.network.Player;

import pixelmon.battles.attacks.Attack;
import pixelmon.comm.ChatHandler;
import pixelmon.comm.EnumPackets;
import pixelmon.database.DatabaseMoves;
import pixelmon.entities.pixelmon.EntityPixelmon;
import pixelmon.storage.PixelmonStorage;
import pixelmon.storage.PlayerStorage;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerMP;

public class ReplaceMove extends PacketHandlerBase {

	public ReplaceMove() {
		packetsHandled.add(EnumPackets.ReplaceMove);
	}

	@Override
	public void handlePacket(int index, Player pl, DataInputStream dataStream) throws IOException {
		int pokemonID = dataStream.readInt();
		int moveToLearnIndex = dataStream.readInt();
		int replaceIndex = dataStream.readInt();

		EntityPlayerMP player = (EntityPlayerMP) pl;
		Attack a = DatabaseMoves.getAttack(moveToLearnIndex);
		PlayerStorage storage = PixelmonStorage.PokeballManager.getPlayerStorage(player);
		EntityPixelmon p;
		if (storage.EntityAlreadyExists(pokemonID, player.worldObj))
			p = storage.getAlreadyExists(pokemonID, player.worldObj);
		else
			p = storage.sendOut(pokemonID, player.worldObj);
		ChatHandler.sendChat(player, "Your " + p.getName() + " forgot " + p.moveset.get(replaceIndex).attackName + ", and learned " + a.attackName);
		p.moveset.set(replaceIndex, a);
		storage.updateNBT(p);
	}
}
