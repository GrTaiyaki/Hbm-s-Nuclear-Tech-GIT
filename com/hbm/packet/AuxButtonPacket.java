package com.hbm.packet;

import com.hbm.explosion.ExplosionLarge;
import com.hbm.saveddata.SatelliteSaveStructure;
import com.hbm.saveddata.SatelliteSavedData;
import com.hbm.tileentity.bomb.TileEntityTurretCIWS;
import com.hbm.tileentity.bomb.TileEntityTurretCheapo;
import com.hbm.tileentity.machine.TileEntityAMSBase;
import com.hbm.tileentity.machine.TileEntityAMSEmitter;
import com.hbm.tileentity.machine.TileEntityAMSLimiter;
import com.hbm.tileentity.machine.TileEntityMachineDiesel;
import com.hbm.tileentity.machine.TileEntityMachineReactorSmall;
import com.hbm.tileentity.machine.TileEntityMachineSeleniumEngine;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;

public class AuxButtonPacket implements IMessage {

	int x;
	int y;
	int z;
	int value;
	int id;

	public AuxButtonPacket()
	{
		
	}

	public AuxButtonPacket(int x, int y, int z, int value, int id)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.value = value;
		this.id = id;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		x = buf.readInt();
		y = buf.readInt();
		z = buf.readInt();
		value = buf.readInt();
		id = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(x);
		buf.writeInt(y);
		buf.writeInt(z);
		buf.writeInt(value);
		buf.writeInt(id);
	}

	public static class Handler implements IMessageHandler<AuxButtonPacket, IMessage> {

		@Override
		public IMessage onMessage(AuxButtonPacket m, MessageContext ctx) {
			
			EntityPlayer p = ctx.getServerHandler().playerEntity;
			
			//try {
				TileEntity te = p.worldObj.getTileEntity(m.x, m.y, m.z);
				
				if (te instanceof TileEntityMachineReactorSmall) {
					TileEntityMachineReactorSmall reactor = (TileEntityMachineReactorSmall)te;
					
					reactor.retracting = m.value == 1;
				}
				
			//} catch (Exception x) { }
			
			return null;
		}
	}
}
