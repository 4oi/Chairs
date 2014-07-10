package com.cnaude.chairs.vehiclearrow.nmsV17R1;

import net.minecraft.server.v1_7_R1.EntityArrow;

import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.craftbukkit.v1_7_R1.CraftServer;
import org.bukkit.craftbukkit.v1_7_R1.CraftWorld;
import org.bukkit.entity.Arrow;

import com.cnaude.chairs.vehiclearrow.NMSChairsArrowInterface;

public class NMSChairsArrow extends EntityArrow implements NMSChairsArrowInterface {

	public NMSChairsArrow(CraftWorld cworld) {
		super(cworld.getHandle());
	}

	@Override
	public void h() {
	}

	@Override
	public void setBukkitEntity(Server server) {
		bukkitEntity = new CraftChairsArrow((CraftServer) server, this);
	}

	@Override
	public Arrow getBukkitArrow() {
		return (Arrow) bukkitEntity;
	}

	@Override
	public void setArrowLocation(Location location) {
		setPositionRotation(location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());
	}

	@Override
	public void addToWorld() {
		world.addEntity(this);
	}

}