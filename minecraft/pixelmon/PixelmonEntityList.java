package pixelmon;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.CustomSpawner;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityEggInfo;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EnumCreatureType;
import net.minecraft.src.ModLoader;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.RenderLiving;
import net.minecraft.src.World;
import net.minecraft.src.mod_Pixelmon;
import net.minecraft.src.forge.MinecraftForge;
import pixelmon.Pokemon.*;
import pixelmon.Trainers.EntityTrainerBugCatcher;
import pixelmon.Trainers.EntityTrainerYoungster;
import pixelmon.Trainers.EntityTrainerYoungster02;
import pixelmon.Trainers.ModelBugCatcher;
import pixelmon.Trainers.ModelYoungster;
import pixelmon.Trainers.ModelYoungster02;
import pixelmon.database.DatabaseStats;
import pixelmon.database.DatabaseTrainers;
import pixelmon.render.RenderFreeWaterPixelmon;
import pixelmon.render.RenderPixelmon;
import pixelmon.render.RenderTrainer;

public class PixelmonEntityList {
	/** Provides a mapping between entity classes and a string */
	private static Map<String, Class<?>> stringToClassMapping = new HashMap<String, Class<?>>();

	/** Provides a mapping between a string and an entity classes */
	private static Map<Class<?>, String> classToStringMapping = new HashMap<Class<?>, String>();

	/** provides a mapping between an entityID and an Entity Class */
	private static Map<Integer, Class<?>> IDtoClassMapping = new HashMap<Integer, Class<?>>();

	private static Map<Class<?>, RenderLiving> classToRendererMapping = new HashMap<Class<?>, RenderLiving>();

	private static Map<Integer, ClassType> IDtoTypeMapping = new HashMap<Integer, ClassType>();

	/** provides a mapping between an Entity Class and an entity ID */
	private static Map<Class<?>, Integer> classToIDMapping = new HashMap<Class<?>, Integer>();

	/** Maps entity names to their numeric identifiers */
	private static Map<String, Integer> stringToIDMapping = new HashMap<String, Integer>();

	/** This is a HashMap of the Creative Entity Eggs/Spawners. */
	public static HashMap<Integer, EntityEggInfo> entityEggs = new HashMap<Integer, EntityEggInfo>();

	/**
	 * adds a mapping between Entity classes and both a string representation
	 * and an ID
	 */
	private static void addMapping(Class<?> par0Class, String par1Str, int par2, RenderLiving renderer, ClassType type) {
		stringToClassMapping.put(par1Str, par0Class);
		classToStringMapping.put(par0Class, par1Str);
		IDtoClassMapping.put(Integer.valueOf(par2), par0Class);
		IDtoTypeMapping.put(Integer.valueOf(par2), type);
		classToIDMapping.put(par0Class, Integer.valueOf(par2));
		stringToIDMapping.put(par1Str, Integer.valueOf(par2));
		classToRendererMapping.put(par0Class, renderer);
	}

	/**
	 * Create a new instance of an entity in the world by using the entity name.
	 */
	public static Entity createEntityByName(String par0Str, World par1World) {
		Entity var2 = null;

		try {
			Class<?> var3 = (Class<?>) stringToClassMapping.get(par0Str);

			if (var3 != null) {
				var2 = (Entity) var3.getConstructor(new Class[] { World.class }).newInstance(new Object[] { par1World });
			}
		} catch (Exception var4) {
			var4.printStackTrace();
		}

		return var2;
	}

	/**
	 * create a new instance of an entity from NBT store
	 */
	public static Entity createEntityFromNBT(NBTTagCompound par0NBTTagCompound, World par1World) {
		EntityLiving var2 = null;

		try {
			Class<?> var3 = (Class<?>) stringToClassMapping.get(par0NBTTagCompound.getString("id"));

			if (var3 != null) {
				var2 = (EntityLiving) var3.getConstructor(new Class[] { World.class }).newInstance(new Object[] { par1World });
			}
		} catch (Exception var4) {
			var4.printStackTrace();
		}

		if (var2 != null) {
			var2.readFromNBT(par0NBTTagCompound);
		} else {
			System.out.println("Skipping Entity with id " + par0NBTTagCompound.getString("id"));
		}

		return var2;
	}

	/**
	 * Create a new instance of an entity in the world by using an entity ID.
	 */
	public static Entity createEntityByID(int par0, World par1World) {
		Entity var2 = null;

		try {
			Class<?> var3 = (Class<?>) IDtoClassMapping.get(Integer.valueOf(par0));

			if (var3 != null) {
				var2 = (Entity) var3.getConstructor(new Class[] { World.class }).newInstance(new Object[] { par1World });
			}
		} catch (Exception var4) {
			var4.printStackTrace();
		}

		if (var2 == null) {
			System.out.println("Skipping Entity with id " + par0);
		}

		return var2;
	}

	/**
	 * gets the entityID of a specific entity
	 */
	public static int getEntityID(Entity par0Entity) {
		return ((Integer) classToIDMapping.get(par0Entity.getClass())).intValue();
	}

	/**
	 * Gets the string representation of a specific entity.
	 */
	public static String getEntityString(Entity par0Entity) {
		return (String) classToStringMapping.get(par0Entity.getClass());
	}

	/**
	 * Finds the class using IDtoClassMapping and classToStringMapping
	 */
	public static String getStringFromID(int par0) {
		Class<?> var1 = (Class<?>) IDtoClassMapping.get(Integer.valueOf(par0));
		return var1 != null ? (String) classToStringMapping.get(var1) : null;
	}

	public static ClassType getClassTypeFromID(int par0) {
		return (ClassType) IDtoTypeMapping.get(Integer.valueOf(par0));
	}

	static {
		addMapping(EntityAbra.class, "Abra", IDListPixelmon.abraId, new RenderPixelmon(new ModelAbra(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityArbok.class, "Arbok", IDListPixelmon.arbokId, new RenderPixelmon(new ModelArbok(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityBlastoise.class, "Blastoise", IDListPixelmon.blastoiseId, new RenderPixelmon(new ModelBlastoise(), 0.8F), ClassType.Pixelmon);
		addMapping(EntityBulbasaur.class, "Bulbasaur", IDListPixelmon.bulbasaurId, new RenderPixelmon(new ModelBulbasaur(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityButterfree.class, "Butterfree", IDListPixelmon.butterfreeId, new RenderPixelmon(new ModelButterfree(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityCaterpie.class, "Caterpie", IDListPixelmon.caterpieId, new RenderPixelmon(new ModelCaterpie(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityCharizard.class, "Charizard", IDListPixelmon.charizardId, new RenderPixelmon(new ModelCharizard(), 0.8F), ClassType.Pixelmon);
		addMapping(EntityCharmander.class, "Charmander", IDListPixelmon.charmanderId, new RenderPixelmon(new ModelCharmander(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityCharmeleon.class, "Charmeleon", IDListPixelmon.charmeleonId, new RenderPixelmon(new ModelCharmeleon(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityCubone.class, "Cubone", IDListPixelmon.cuboneId, new RenderPixelmon(new ModelCubone(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityDiglett.class, "Diglett", IDListPixelmon.diglettId, new RenderPixelmon(new ModelDiglett(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityDugtrio.class, "Dugtrio", IDListPixelmon.dugtrioId, new RenderPixelmon(new ModelDugtrio(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityEevee.class, "Eevee", IDListPixelmon.eeveeId, new RenderPixelmon(new ModelEevee(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityEkans.class, "Ekans", IDListPixelmon.ekansId, new RenderPixelmon(new ModelEkans(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityElectrode.class, "Electrode", IDListPixelmon.electrodeId, new RenderPixelmon(new ModelElectrode(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityFlareon.class, "Flareon", IDListPixelmon.flareonId, new RenderPixelmon(new ModelFlareon(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityGastly.class, "Gastly", IDListPixelmon.gastlyId, new RenderPixelmon(new ModelGastly(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityGeodude.class, "Geodude", IDListPixelmon.geodudeId, new RenderPixelmon(new ModelGeodude(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityGoldeen.class, "Goldeen", IDListPixelmon.goldeenId, new RenderFreeWaterPixelmon(new ModelGoldeen(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityGrowlithe.class, "Growlithe", IDListPixelmon.growlitheId, new RenderPixelmon(new ModelGrowlithe(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityGyarados.class, "Gyarados", IDListPixelmon.gyaradosId, new RenderFreeWaterPixelmon(new ModelGyarados(), 2.5F), ClassType.Pixelmon);
		addMapping(EntityHorsea.class, "Horsea", IDListPixelmon.horseaId, new RenderFreeWaterPixelmon(new ModelHorsea(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityIvysaur.class, "Ivysaur", IDListPixelmon.ivysaurId, new RenderPixelmon(new ModelIvysaur(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityJolteon.class, "Jolteon", IDListPixelmon.jolteonId, new RenderPixelmon(new ModelJolteon(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityJigglypuff.class, "Jigglypuff", IDListPixelmon.jigglypuffId, new RenderPixelmon(new ModelJigglypuff(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityMagikarp.class, "Magikarp", IDListPixelmon.magikarpId, new RenderFreeWaterPixelmon(new ModelMagikarp(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityMagnemite.class, "Magnemite", IDListPixelmon.magnemiteId, new RenderPixelmon(new ModelMagnemite(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityMankey.class, "Mankey", IDListPixelmon.mankeyId, new RenderPixelmon(new ModelMankey(), 0.4F), ClassType.Pixelmon);
		addMapping(EntityMetapod.class, "Metapod", IDListPixelmon.metapodId, new RenderPixelmon(new ModelMetapod(), 0.3F), ClassType.Pixelmon);
		addMapping(EntityMew.class, "Mew", IDListPixelmon.mewId, new RenderPixelmon(new ModelMew(), 0.5F), ClassType.Pixelmon);
		addMapping(EntitySandile.class, "Sandile", IDListPixelmon.sandileId, new RenderPixelmon(new ModelSandile(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityKrokorok.class, "Krokorok", IDListPixelmon.krokorokId, new RenderPixelmon(new ModelKrokorok(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityMiltank.class, "Miltank", IDListPixelmon.miltankId, new RenderPixelmon(new ModelMiltank(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityPidgey.class, "Pidgey", IDListPixelmon.pidgeyId, new RenderPixelmon(new ModelPidgey(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityPikachu.class, "Pikachu", IDListPixelmon.pikachuId, new RenderPixelmon(new ModelPikachu(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityPidgeotto.class, "Pidgeotto", IDListPixelmon.pidgeottoId, new RenderPixelmon(new ModelPidgeotto(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityPidgeot.class, "Pidgeot", IDListPixelmon.pidgeotId, new RenderPixelmon(new ModelPidgeot(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityNinetales.class, "Ninetales", IDListPixelmon.ninetalesId, new RenderPixelmon(new ModelNinetales(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityOddish.class, "Oddish", IDListPixelmon.oddishId, new RenderPixelmon(new ModelOddish(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityOmanyte.class, "Omanyte", IDListPixelmon.omanyteId, new RenderFreeWaterPixelmon(new ModelOmanyte(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityOmastar.class, "Omastar", IDListPixelmon.omastarId, new RenderFreeWaterPixelmon(new ModelOmastar(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityPsyduck.class, "Psyduck", IDListPixelmon.psyduckId, new RenderPixelmon(new ModelPsyduck(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityRattata.class, "Rattata", IDListPixelmon.rattataId, new RenderPixelmon(new ModelRattata(), 0.5F), ClassType.Pixelmon);
		addMapping(EntitySeaking.class, "Seaking", IDListPixelmon.seakingId, new RenderFreeWaterPixelmon(new ModelSeaking(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityShellder.class, "Shellder", IDListPixelmon.shellderId, new RenderPixelmon(new ModelShellder(), 0.5F), ClassType.Pixelmon);
		addMapping(EntitySnorlax.class, "Snorlax", IDListPixelmon.snorlaxId, new RenderPixelmon(new ModelSnorlax(), 0.9F), ClassType.Pixelmon);
		addMapping(EntitySquirtle.class, "Squirtle", IDListPixelmon.squirtleId, new RenderPixelmon(new ModelSquirtle(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityStaryu.class, "Staryu", IDListPixelmon.staryuId, new RenderFreeWaterPixelmon(new ModelStaryu(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityStarmie.class, "Starmie", IDListPixelmon.starmieId, new RenderFreeWaterPixelmon(new ModelStarmie(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityTrapinch.class, "Trapinch", IDListPixelmon.trapinchId, new RenderPixelmon(new ModelTrapinch(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityVenusaur.class, "Venusaur", IDListPixelmon.venusaurId, new RenderPixelmon(new ModelVenusaur(), 0.8F), ClassType.Pixelmon);
		addMapping(EntityVoltorb.class, "Voltorb", IDListPixelmon.voltorbId, new RenderPixelmon(new ModelVoltorb(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityVulpix.class, "Vulpix", IDListPixelmon.vulpixId, new RenderPixelmon(new ModelVulpix(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityWartortle.class, "Wartortle", IDListPixelmon.wartortleId, new RenderPixelmon(new ModelWartortle(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityWigglytuff.class, "Wigglytuff", IDListPixelmon.wigglytuffId, new RenderPixelmon(new ModelWigglytuff(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityZubat.class, "Zubat", IDListPixelmon.zubatId, new RenderPixelmon(new ModelZubat(), 0.3F), ClassType.Pixelmon);
		addMapping(EntityMagneton.class, "Magneton", IDListPixelmon.magnetonId, new RenderPixelmon(new ModelMagneton(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityVibrava.class, "Vibrava", IDListPixelmon.vibravaId, new RenderPixelmon(new ModelVibrava(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityMareep.class, "Mareep", IDListPixelmon.mareepId, new RenderPixelmon(new ModelMareep(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityTentacool.class, "Tentacool", IDListPixelmon.tentacoolId, new RenderFreeWaterPixelmon(new ModelTentacool(), 0.5F), ClassType.Pixelmon);
		addMapping(EntitySolrock.class, "Solrock", IDListPixelmon.solrockId, new RenderPixelmon(new ModelSolrock(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityLunatone.class, "Lunatone", IDListPixelmon.lunatoneId, new RenderPixelmon(new ModelLunatone(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityNidoranMale.class, "NidoranMale", IDListPixelmon.nidoranMaleId, new RenderPixelmon(new ModelNidoranMale(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityVaporeon.class, "Vaporeon", IDListPixelmon.vaporeonId, new RenderPixelmon(new ModelVaporeon(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityGloom.class, "Gloom", IDListPixelmon.gloomId, new RenderPixelmon(new ModelGloom(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityKrabby.class, "Krabby", IDListPixelmon.krabbyId, new RenderPixelmon(new ModelKrabby(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityWeedle.class, "Weedle", IDListPixelmon.weedleId, new RenderPixelmon(new ModelWeedle(), 0.5F), ClassType.Pixelmon);
		addMapping(EntityTrainerYoungster.class, "Youngster", IDListTrainer.trainerYoungsterId, new RenderTrainer(new ModelYoungster(), 0.5F), ClassType.Trainer);
		addMapping(EntityTrainerYoungster02.class, "Youngster2", IDListTrainer.trainerYoungster2Id, new RenderTrainer(new ModelYoungster02(), 0.5F), ClassType.Trainer);
		addMapping(EntityTrainerBugCatcher.class, "BugCatcher", IDListTrainer.trainerBugCatcherId, new RenderTrainer(new ModelBugCatcher(), 0.5F), ClassType.Trainer);
	}

	public static void registerEntities() {
		Iterator i = IDtoClassMapping.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry entry = (Map.Entry) i.next();
			ModLoader.registerEntityID((Class) entry.getValue(), getStringFromID((Integer) entry.getKey()), (Integer) entry.getKey());
			MinecraftForge.registerEntity((Class) entry.getValue(), mod_Pixelmon.instance, (Integer) entry.getKey(), 50, 1, true);
		}
	}

	public static void despawnPixelmon(CustomSpawner myCustomSpawner) {
		List<Class> pokemonList = new ArrayList<Class>();
		Iterator i = IDtoClassMapping.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry entry = (Map.Entry) i.next();
			pokemonList.add((Class) entry.getValue());
		}
		myCustomSpawner.despawnMob(ModLoader.getMinecraftInstance().theWorld, pokemonList);
	}

	public static void addRenderer(Map map) {
		Iterator i = classToRendererMapping.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry entry = (Map.Entry) i.next();
			map.put(entry.getKey(), entry.getValue());
		}
	}

	public static void addSpawns(CustomSpawner myCustomSpawner) {
		Iterator i = IDtoClassMapping.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry entry = (Map.Entry) i.next();
			String name = getStringFromID((Integer) entry.getKey());
			ClassType type = getClassTypeFromID((Integer) entry.getKey());
			BiomeGenBase[] biomes;
			if (type == ClassType.Pixelmon) {
				biomes = DatabaseStats.GetSpawnBiomes(name);
				int rarity = DatabaseStats.GetRarity(name);
				int groupMin = DatabaseStats.GetMinGroupSize(name);
				int groupMax = DatabaseStats.GetMaxGroupSize(name);
				EnumCreatureType creaturetype = DatabaseStats.GetCreatureType(name);
				if (rarity != -1) {
					myCustomSpawner.AddCustomSpawn((Class) entry.getValue(), rarity, groupMin, groupMax, creaturetype, biomes);
				}
				ModLoader.getMinecraftInstance().installResource("newsound/pixelmon/" + name.toLowerCase() + ".ogg", new File("resources/newsound/pixelmon/" + name.toLowerCase() + ".ogg"));
			} else if (type == ClassType.Trainer) {
				biomes = DatabaseTrainers.GetSpawnBiomes(name);
				myCustomSpawner.AddCustomSpawn((Class) entry.getValue(), 10, 1, 1, EnumCreatureType.creature, biomes);
			}
		}
	}

	public enum ClassType {
		Trainer, Pixelmon
	}
}
