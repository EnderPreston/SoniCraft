
package net.mcreator.sonicraft.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;

import net.mcreator.sonicraft.itemgroup.SonicraftMiscItemGroup;
import net.mcreator.sonicraft.entity.renderer.RougeRenderer;
import net.mcreator.sonicraft.SonicraftModElements;

@SonicraftModElements.ModElement.Tag
public class RougeEntity extends SonicraftModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(94).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.4f, 1.1f)).build("rouge").setRegistryName("rouge");
	public RougeEntity(SonicraftModElements instance) {
		super(instance, 115);
		FMLJavaModLoadingContext.get().getModEventBus().register(new RougeRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13434778, -26164, new Item.Properties().group(SonicraftMiscItemGroup.tab))
				.setRegistryName("rouge_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.4);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 36);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 2);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 16);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 4);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends CreatureEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
			enablePersistence();
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new AvoidEntityGoal(this, EggmanBombEntity.CustomEntity.class, (float) 6, 1, 1.2));
			this.goalSelector.addGoal(2, new TemptGoal(this, 1, Ingredient.fromItems(new ItemStack(Items.DIAMOND, (int) (1)).getItem()), false));
			this.goalSelector.addGoal(3, new TemptGoal(this, 1, Ingredient.fromItems(new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem()), false));
			this.goalSelector.addGoal(4, new TemptGoal(this, 1, Ingredient.fromItems(new ItemStack(Items.EMERALD, (int) (1)).getItem()), false));
			this.goalSelector.addGoal(5, new TemptGoal(this, 1, Ingredient.fromItems(new ItemStack(Items.NETHER_STAR, (int) (1)).getItem()), false));
			this.goalSelector.addGoal(6, new MeleeAttackGoal(this, 1.2, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, MetalSonicEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, EggmanBossEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MotobugEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, BuzzBomberEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, CrabmeatEntity.CustomEntity.class, false, false));
			this.goalSelector.addGoal(12, new RandomWalkingGoal(this, 1));
			this.targetSelector.addGoal(13, new HurtByTargetGoal(this));
			this.goalSelector.addGoal(14, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(15, new SwimGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.rougeidle"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.rougehurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.rougedie"));
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.FALL)
				return false;
			return super.attackEntityFrom(source, amount);
		}
	}
}
