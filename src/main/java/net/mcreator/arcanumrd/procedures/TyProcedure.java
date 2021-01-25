package net.mcreator.arcanumrd.procedures;

import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.animation.builder.AnimationBuilder;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.entity.Entity;

import net.mcreator.arcanumrd.ArcanumrDModElements;

import java.util.Map;

@ArcanumrDModElements.ModElement.Tag
public class TyProcedure extends ArcanumrDModElements.ModElement {
	public TyProcedure(ArcanumrDModElements instance) {
		super(instance, 12);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure Ty!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity.getMotion().getX()) != 0) && ((entity.getMotion().getZ()) != 0))
				|| (((entity.getMotion().getX()) != 0) || ((entity.getMotion().getZ()) != 0)))) {
			entity.getPersistentData().putBoolean("animacionandar", (true));
			if (((entity.getPersistentData().getBoolean("animacionandar")) == (true))) {
				if (entity instanceof IAnimatedEntity) {
					new Object() {
						@OnlyIn(Dist.CLIENT)
						void playAnimation(Entity entity, String animationID) {
							IAnimatedEntity aniEntity = (IAnimatedEntity) entity;
							aniEntity.getAnimationManager().get("controller").setAnimation(new AnimationBuilder().addAnimation(animationID, (false)));
						}
					}.playAnimation(entity, "animacionandar");
				}
				entity.getPersistentData().putBoolean("animacionandar", (false));
			}
		} else if (((((entity.getMotion().getX()) == 0) && ((entity.getMotion().getZ()) == 0))
				|| (((entity.getMotion().getX()) == 0) || ((entity.getMotion().getZ()) == 0)))) {
			entity.getPersistentData().putBoolean("animacionandar", (false));
			if (((entity.getPersistentData().getBoolean("animacionandar")) == (false))) {
				if (entity instanceof IAnimatedEntity) {
					new Object() {
						@OnlyIn(Dist.CLIENT)
						void playAnimation(Entity entity, String animationID) {
							IAnimatedEntity aniEntity = (IAnimatedEntity) entity;
							aniEntity.getAnimationManager().get("controller").setAnimation(new AnimationBuilder().addAnimation(animationID, (true)));
						}
					}.playAnimation(entity, "animacionestatica");
				}
			}
		}
	}
}
