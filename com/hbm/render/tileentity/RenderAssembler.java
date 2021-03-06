package com.hbm.render.tileentity;

import org.lwjgl.opengl.GL11;

import com.hbm.lib.RefStrings;
import com.hbm.tileentity.machine.TileEntityMachineAssembler;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class RenderAssembler extends TileEntitySpecialRenderer {

	private static final ResourceLocation body = new ResourceLocation(/*"/assets/" + */RefStrings.MODID, "models/assembler_main.obj");
	private static final ResourceLocation bolt = new ResourceLocation(/*"/assets/" + */RefStrings.MODID, "models/assembler_wheel.obj");

	private IModelCustom bodyModel;
    private ResourceLocation bodyTexture;
	private IModelCustom boltModel;
    private ResourceLocation boltTexture;
	
	public RenderAssembler()
    {
		bodyModel = AdvancedModelLoader.loadModel(body);
		bodyTexture = new ResourceLocation(RefStrings.MODID, "textures/models/assembler.png");
		boltModel = AdvancedModelLoader.loadModel(bolt);
		boltTexture = new ResourceLocation(RefStrings.MODID, "textures/models/textureIGenRotor.png");
    }

    @Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5D, y, z + 0.5D);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glRotatef(180, 0F, 1F, 0F);
		switch(tileEntity.getBlockMetadata())
		{
		case 2:
			GL11.glRotatef(180, 0F, 1F, 0F);
	        GL11.glTranslated(0.5D, 0.0D, -0.5D); break;
		case 4:
			GL11.glRotatef(270, 0F, 1F, 0F);
	        GL11.glTranslated(0.5D, 0.0D, -0.5D); break;
		case 3:
			GL11.glRotatef(0, 0F, 1F, 0F);
	        GL11.glTranslated(0.5D, 0.0D, -0.5D); break;
		case 5:
			GL11.glRotatef(90, 0F, 1F, 0F);
	        GL11.glTranslated(0.5D, 0.0D, -0.5D); break;
		}

        bindTexture(bodyTexture);
        
        bodyModel.renderAll();

        GL11.glPopMatrix();
        
        renderTileEntityAt2(tileEntity, x, y, z, f);
    }
    
	public void renderTileEntityAt2(TileEntity tileEntity, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated(x, y, z);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glRotatef(180, 0F, 1F, 0F);
		switch(tileEntity.getBlockMetadata())
		{
		case 2:
			GL11.glTranslated(-1, 0, 0);
			GL11.glRotatef(90, 0F, 1F, 0F); break;
		case 4:
			GL11.glRotatef(180, 0F, 1F, 0F); break;
		case 3:
			GL11.glTranslated(0, 0, -1);
			GL11.glRotatef(270, 0F, 1F, 0F); break;
		case 5:
			GL11.glTranslated(-1, 0, -1);
			GL11.glRotatef(0, 0F, 1F, 0F); break;
		}
		
		
		GL11.glRotatef(((TileEntityMachineAssembler)tileEntity).rotation, 0F, 1F, 0F);

        bindTexture(boltTexture);
        boltModel.renderAll();

        GL11.glPopMatrix();
    }
}
