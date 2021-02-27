//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TAPBullet
// Model Creator: TechnoDante
// Created on:26.02.2021 - 22:00:52
// Last changed on: 26.02.2021 - 22:00:52

package com.flansmod.client.model.tap;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTAPBullet extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelTAPBullet()
	{
		tapbulletModel = new ModelRendererTurbo[2];
		tapbulletModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		tapbulletModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1

		tapbulletModel[0].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 0
		tapbulletModel[0].setRotationPoint(0F, 0F, 0F);

		tapbulletModel[1].addShapeBox(-0.5F, -3F, -0.5F, 1, 3, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 1
		tapbulletModel[1].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 2; i++)
		{
			tapbulletModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo tapbulletModel[];
}