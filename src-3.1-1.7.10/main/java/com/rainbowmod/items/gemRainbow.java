package com.rainbowmod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class gemRainbow extends Item {
	
	public gemRainbow(int id){
		super();
		this.setMaxStackSize(16);

	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("rainbow:gemRainbow");
	}
	

}
