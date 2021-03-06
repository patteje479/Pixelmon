package pixelmon.storage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.google.common.eventbus.Subscribe;

import pixelmon.comm.ChatHandler;
import pixelmon.config.PixelmonEntityList;
import pixelmon.entities.pixelmon.EntityPixelmon;
import pixelmon.enums.EnumGui;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.network.Player;

import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.AnvilSaveHandler;
import net.minecraft.src.Chunk;
import net.minecraft.src.CompressedStreamTools;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityList;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.ISaveFormat;
import net.minecraft.src.ISaveHandler;
import net.minecraft.src.ModLoader;

import net.minecraft.src.NBTBase;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Packet1Login;
import net.minecraft.src.SaveHandler;
import net.minecraft.src.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.WorldEvent;

public class PokeballManager {
	private File workingDir;

	private ArrayList<PlayerStorage> playerPokemonList = new ArrayList<PlayerStorage>();

	public enum PokeballManagerMode {
		Player, Trainer
	}

	public PokeballManager() {
	}

	public PlayerStorage getPlayerStorage(EntityPlayerMP owner) {

		for (PlayerStorage p : playerPokemonList) {
			if (p.player != null && owner != null && p.player.username.equals(owner.username))
				return p;
		}
		loadPlayer(owner);
		return getPlayerStorage(owner);
	}

	@SuppressWarnings("unchecked")
	public void loadPlayer(EntityPlayerMP player) {
		File saveDirPath = new File(getSaveFolder(player));
		if (!saveDirPath.exists())
			saveDirPath.mkdirs();
		File playerFile = new File(getSaveFolder(player) + player.username + ".pk");
		if (playerFile.exists()) {
			PlayerStorage p = new PlayerStorage(player);
			try {
				p.readFromNBT(CompressedStreamTools.read(new DataInputStream(new FileInputStream(playerFile))));
			} catch (FileNotFoundException e) {
				System.out.println("Couldn't read player data file for " + player.username);
			} catch (IOException e) {
				System.out.println("Couldn't read player data file for " + player.username);
			}
			playerPokemonList.add(p);
		} else {
			PlayerStorage p = new PlayerStorage(player);
			playerPokemonList.add(p);
		}
	}

	public void save() {
		try {
			for (int i = 0; i < playerPokemonList.size(); i++) {
				String userName = playerPokemonList.get(i).userName;
				File playerSaveFile = new File(playerPokemonList.get(i).saveFile);
				FileOutputStream f = new FileOutputStream(playerSaveFile);
				DataOutputStream s = new DataOutputStream(f);
				NBTTagCompound nbt = new NBTTagCompound();
				playerPokemonList.get(i).writeToNBT(nbt);
				CompressedStreamTools.write(nbt, s);
				s.close();
				f.close();
				if (playerPokemonList.get(i).player == null || playerPokemonList.get(i).player.playerNetServerHandler.connectionClosed) {
					playerPokemonList.remove(i);
					System.out.println("Saved dc'd player's data - " + userName);
					i--;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String getSaveFolder(EntityPlayer player) {
		return "saves/" + player.worldObj.getSaveHandler().getSaveDirectoryName() + "/pokemon/";
	}

	@ForgeSubscribe
	public void onWorldLoad(WorldEvent.Load event) {
		ArrayList<EntityPlayerMP> playerList = new ArrayList<EntityPlayerMP>();
		for (int i = 0; i < playerPokemonList.size(); i++) {
			playerList.add(playerPokemonList.get(i).player);
		}
		playerPokemonList.clear();
		for (EntityPlayerMP player : playerList) {
			loadPlayer(player);
		}
	}

	@ForgeSubscribe
	public void onWorldSave(WorldEvent.Save event) {
		save();
	}

	public boolean hasPlayerFile(Player player) {
		File playerSaveFile = new File(getSaveFolder((EntityPlayerMP) player) + ((EntityPlayerMP) player).username + ".pk");
		return playerSaveFile.exists();
	}

	public void unloadDCPlayers() {
		save();
	}
}
