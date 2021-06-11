package net.mcreator.sonicraft.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class TikalRightClickedOnEntityProcedure extends SonicraftModElements.ModElement {
	public TikalRightClickedOnEntityProcedure(SonicraftModElements instance) {
		super(instance, 648);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure TikalRightClickedOnEntity!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double tikal_hints = 0;
		tikal_hints = (double) Math.random();
		if (((tikal_hints) < 0.05)) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(
						new StringTextComponent(
								"<Tikal> The background music of Sonic's world can be disabled using the ambience controls in the Sound settings. "),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 2))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> You can get Special Stage Keys by defeating bosses or, on a rare occasion, finding one in a Chemical Plant Zone treasure chest."),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 3))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(
						new StringTextComponent("<Tikal> Chaos really is a loving and gentle creature. Please don't do anything to make him mad!"),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 4))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(
						new StringTextComponent("<Tikal> Destroying those harmful machines (badniks) will release the little creatures inside them."),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 5))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> If you come across an animal capsule but don't have a pickaxe, you can just jump on the yellow button on top to set the creatures free."),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 6))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> Right-click Tails with an empty hand to make him fly. While he's flying, right-click him again and he'll lift you into the air!"),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 7))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> I am a 3,000-year-old spirit who hates violence, so please excuse me if I shrink a little when I'm near danger."),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 8))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(
						new StringTextComponent(
								"<Tikal> Whatever you do, please don't hurt the little animals roaming around Sonic's world! They're harmless!"),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 9))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> The servers are the seven Chaos. Chaos is power... Power enriched by the heart. The controller is the one that unifies the chaos."),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 10))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(
						new StringTextComponent("<Tikal> Rings are a form of defense, and should not be used for greed."), (false));
			}
		} else if (((tikal_hints) < (0.05 * 11))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> You can still lose a shield in Creative Mode if you touch something that would normally hurt you in Survival Mode."),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 12))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> Chemical Plant Zone has giant syringes that you need to use in order to access some treasure."), (false));
			}
		} else if (((tikal_hints) < (0.05 * 13))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> The main attractions of Marble Zone are its dangerous dungeons, which lie underneath the ground."), (false));
			}
		} else if (((tikal_hints) < (0.05 * 14))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(
						new StringTextComponent("<Tikal> I only have so much advice to give, so I may end up repeating myself every now and then."),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 15))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> Chaostone, pronounced \"chow-stone\", is what we call the underground material of Sonic's world."), (false));
			}
		} else if (((tikal_hints) < (0.05 * 16))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> Starposts were originally intended to set your spawnpoint when walked into, but I guess EnderPreston couldn't figure out how to do it yet, so they're only a decoration for now."),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 17))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> I know that \"Black Market\" means something else where you come from, but in Sonic's world, the Black Market is actually a good place to get special items like Chao Fruit, Earth minerals, and other fascinating stuff."),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 18))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> Chao are friendly creatures that hatch from eggs found in Chao Gardens. You can feed them, name them, and pet them!"),
						(false));
			}
		} else if (((tikal_hints) < (0.05 * 19))) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> If you ever get worried about my safety, or just want me to go away, let me know with a friendly tap. I'll fly away and leave behind a Totem of Guidance, which you can use to summon me again."),
						(false));
			}
		} else {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent(
						"<Tikal> Fake Chaos Emeralds have the same wavelength and properties as a real Chaos Emerald, but if you hit a robot with it, the robot will explode! That being said, please make sure no harmless creatures get hurt in the process!"),
						(false));
			}
		}
	}
}
