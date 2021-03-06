package com.hbm.potion;

import java.lang.reflect.Field;

import com.hbm.explosion.ExplosionLarge;
import com.hbm.lib.ModDamageSource;
import com.hbm.main.MainRegistry;

import cpw.mods.fml.relauncher.ReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class HbmPotion extends Potion {

	public static HbmPotion taint;
	public static HbmPotion radiation;
	public static HbmPotion bang;

	public HbmPotion(int id, boolean isBad, int color) {
		super(id, isBad, color);
	}

	public static void init() {
		taint = registerPotion(MainRegistry.taintID, true, 8388736, "potion.hbm_taint", 0, 0);
		radiation = registerPotion(MainRegistry.radiationID, true, 8700200, "potion.hbm_radiation", 1, 0);
		bang = registerPotion(MainRegistry.bangID, true, 1118481, "potion.hbm_bang", 3, 0);
	}

	public static HbmPotion registerPotion(int id, boolean isBad, int color, String name, int x, int y) {

		if (id >= Potion.potionTypes.length) {

			Potion[] newArray = new Potion[Math.max(256, id)];
			System.arraycopy(Potion.potionTypes, 0, newArray, 0, Potion.potionTypes.length);
			
			Field field = ReflectionHelper.findField(Potion.class, new String[] { "field_76425_a", "potionTypes" });
			field.setAccessible(true);
			
			try {
				
				Field modfield = Field.class.getDeclaredField("modifiers");
				modfield.setAccessible(true);
				modfield.setInt(field, field.getModifiers() & 0xFFFFFFEF);
				field.set(null, newArray);
				
			} catch (Exception e) {
				
			}
		}
		
		HbmPotion effect = new HbmPotion(id, isBad, color);
		effect.setPotionName(name);
		effect.setIconIndex(x, y);
		
		return effect;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getStatusIconIndex() {
		ResourceLocation loc = new ResourceLocation("hbm","textures/gui/potions.png");
		Minecraft.getMinecraft().renderEngine.bindTexture(loc);
		return super.getStatusIconIndex();
	}

	public void performEffect(EntityLivingBase entity, int level) {

		if(this == taint) {
			
	    	entity.attackEntityFrom(ModDamageSource.taint, (level + 1));
		}
		if(this == radiation) {
			
			if (entity.getHealth() > entity.getMaxHealth() - (level + 1)) {
				entity.attackEntityFrom(ModDamageSource.radiation, 1);
			}
		}
		if(this == bang) {
			
			entity.attackEntityFrom(ModDamageSource.bang, 1000);
			entity.setHealth(0.0F);

			if (!(entity instanceof EntityPlayer))
				entity.setDead();

			entity.worldObj.playSoundEffect(entity.posX, entity.posY, entity.posZ, "hbm:weapon.laserBang", 100.0F, 1.0F);
			ExplosionLarge.spawnParticles(entity.worldObj, entity.posX, entity.posY, entity.posZ, 10);
		}
	}

	public boolean isReady(int par1, int par2) {
		
		if(this == taint) {

			int k = 80 >> par2;
	        return k > 0 ? par1 % k == 0 : true;
		}
		if(this == radiation) {
			int k = 40 >> par2;
			return k > 0 ? par1 % k == 0 : true;
		}
		if(this == bang) {

			return par1 <= 10;
		}
		
		return false;
	}

}
