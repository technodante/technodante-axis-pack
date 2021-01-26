//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ki61
// Model Creator: TechnoDante
// Created on: 27.12.2020 - 10:42:16
// Last changed on: 27.12.2020 - 10:42:16

package com.flansmod.client.model.tap; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKi61 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelKi61() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[172];
		yawFlapModel = new ModelRendererTurbo[6];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		leftWingWheelModel = new ModelRendererTurbo[7];
		rightWingWheelModel = new ModelRendererTurbo[7];

		initbodyModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 705, 41, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 585, 73, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 45
		bodyModel[43] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 46
		bodyModel[44] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 49
		bodyModel[47] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 50
		bodyModel[48] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 51
		bodyModel[49] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 53
		bodyModel[51] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 54
		bodyModel[52] = new ModelRendererTurbo(this, 777, 9, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Box 59
		bodyModel[56] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 68
		bodyModel[64] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 72
		bodyModel[65] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 74
		bodyModel[66] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 76
		bodyModel[67] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 78
		bodyModel[68] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 79
		bodyModel[69] = new ModelRendererTurbo(this, 585, 9, textureX, textureY); // Box 80
		bodyModel[70] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 81
		bodyModel[71] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Box 82
		bodyModel[72] = new ModelRendererTurbo(this, 569, 97, textureX, textureY); // Box 83
		bodyModel[73] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 84
		bodyModel[74] = new ModelRendererTurbo(this, 825, 89, textureX, textureY); // Box 85
		bodyModel[75] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 86
		bodyModel[76] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 76
		bodyModel[77] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 77
		bodyModel[78] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 78
		bodyModel[79] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Box 79
		bodyModel[80] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 89
		bodyModel[88] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Box 90
		bodyModel[89] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Box 91
		bodyModel[90] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 92
		bodyModel[91] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 93
		bodyModel[92] = new ModelRendererTurbo(this, 697, 113, textureX, textureY); // Box 95
		bodyModel[93] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 96
		bodyModel[94] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 97
		bodyModel[95] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 98
		bodyModel[96] = new ModelRendererTurbo(this, 153, 249, textureX, textureY); // Box 99
		bodyModel[97] = new ModelRendererTurbo(this, 689, 249, textureX, textureY); // Box 100
		bodyModel[98] = new ModelRendererTurbo(this, 305, 369, textureX, textureY); // Box 101
		bodyModel[99] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 102
		bodyModel[100] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 103
		bodyModel[101] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 104
		bodyModel[102] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 105
		bodyModel[103] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 106
		bodyModel[104] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 111
		bodyModel[105] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 114
		bodyModel[106] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 115
		bodyModel[107] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 116
		bodyModel[108] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 117
		bodyModel[109] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 118
		bodyModel[110] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Box 119
		bodyModel[111] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 120
		bodyModel[112] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Box 121
		bodyModel[113] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 123
		bodyModel[114] = new ModelRendererTurbo(this, 705, 137, textureX, textureY); // Box 124
		bodyModel[115] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 125
		bodyModel[116] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 126
		bodyModel[117] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 127
		bodyModel[118] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 129
		bodyModel[120] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 143
		bodyModel[121] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 144
		bodyModel[122] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 145
		bodyModel[123] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 146
		bodyModel[124] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 147
		bodyModel[125] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 148
		bodyModel[126] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 149
		bodyModel[127] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 150
		bodyModel[128] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 151
		bodyModel[129] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 152
		bodyModel[130] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 153
		bodyModel[131] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 154
		bodyModel[132] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 155
		bodyModel[133] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 156
		bodyModel[134] = new ModelRendererTurbo(this, 777, 9, textureX, textureY); // Box 157
		bodyModel[135] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 158
		bodyModel[136] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 159
		bodyModel[137] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 160
		bodyModel[138] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 161
		bodyModel[139] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 162
		bodyModel[140] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 163
		bodyModel[141] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 164
		bodyModel[142] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 165
		bodyModel[143] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 166
		bodyModel[144] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 167
		bodyModel[145] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 168
		bodyModel[146] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 169
		bodyModel[147] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 170
		bodyModel[148] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 171
		bodyModel[149] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 172
		bodyModel[150] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 173
		bodyModel[151] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 174
		bodyModel[152] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Box 175
		bodyModel[153] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 176
		bodyModel[154] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 177
		bodyModel[155] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 179
		bodyModel[156] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Box 180
		bodyModel[157] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 181
		bodyModel[158] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 182
		bodyModel[159] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 183
		bodyModel[160] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 184
		bodyModel[161] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 185
		bodyModel[162] = new ModelRendererTurbo(this, 705, 41, textureX, textureY); // Box 186
		bodyModel[163] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 187
		bodyModel[164] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 188
		bodyModel[165] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 189
		bodyModel[166] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 190
		bodyModel[167] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 191
		bodyModel[168] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 192
		bodyModel[169] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 193
		bodyModel[170] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 194
		bodyModel[171] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 194

		bodyModel[0].addShapeBox(0F, 0F, 0F, 24, 6, 22, 0F,0F, 0.1F, 0F, 0.1F, 0.1F, -0.8F, 0.1F, 0.1F, -0.8F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-35F, -34.25F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 19, 7, 22, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.05F, -1F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, -1F); // Box 1
		bodyModel[1].setRotationPoint(-54F, -34.2F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 2, 22, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.3F, -4.5F, 0F, 0.7F, -4.5F, 0F, 0.7F, -4.5F, 0F, -0.3F, -4.5F); // Box 2
		bodyModel[2].setRotationPoint(-54F, -28.25F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 29, 2, 22, 0F,0.35F, 2.55F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0.35F, 2.55F, -3F, 0.35F, -3.2F, -5.75F, 0F, -0.3F, -4.5F, 0F, -0.3F, -4.5F, 0.35F, -3.2F, -5.75F); // Box 3
		bodyModel[3].setRotationPoint(-83F, -28.25F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 19, 13, 22, 0F,0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -1.05F, -0.5F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, -0.5F); // Box 4
		bodyModel[4].setRotationPoint(-54F, -46.15F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 7, 22, 0F,0F, -0.4F, -3.85F, 0F, 0F, -3.45F, 0F, 0F, -3.45F, 0F, -0.4F, -3.85F, 0F, -0.05F, -1.2F, 0F, -0.05F, -1.2F, 0F, -0.05F, -1.2F, 0F, -0.05F, -1.2F); // Box 5
		bodyModel[5].setRotationPoint(-54F, -53.1F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 19, 5, 16, 0F,0F, -2.55F, -4.4F, 0F, -0.8F, -4.4F, 0F, -0.8F, -4.4F, 0F, -2.55F, -4.4F, 0F, -0.65F, -0.85F, 0F, -1.05F, -0.45F, 0F, -1.05F, -0.45F, 0F, -0.65F, -0.85F); // Box 6
		bodyModel[6].setRotationPoint(-54F, -57.05F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 29, 7, 22, 0F,0.35F, 0F, -1.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.35F, 0F, -1.4F, 0.35F, -3.6F, -3F, 0F, -1.05F, -1F, 0F, -1.05F, -1F, 0.35F, -3.6F, -3F); // Box 7
		bodyModel[7].setRotationPoint(-83F, -34.2F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 29, 13, 22, 0F,0.35F, -0.65F, -2.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0.35F, -0.65F, -2.5F, 0.35F, -1.05F, -1.4F, 0F, -1.05F, -0.5F, 0F, -1.05F, -0.5F, 0.35F, -1.05F, -1.4F); // Box 9
		bodyModel[8].setRotationPoint(-83F, -46.15F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 29, 8, 22, 0F,0.35F, -4.4F, -4.75F, 0F, -0.4F, -3.85F, 0F, -0.4F, -3.85F, 0.35F, -4.4F, -4.75F, 0.35F, -0.4F, -2.5F, 0F, -1.05F, -1.2F, 0F, -1.05F, -1.2F, 0.35F, -0.4F, -2.5F); // Box 10
		bodyModel[9].setRotationPoint(-83F, -53.1F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 37, 2, 22, 0F,-0.1F, 0F, -0.8F, -0.45F, 1.9F, -1.9F, -0.45F, 1.9F, -1.9F, -0.1F, 0F, -0.8F, -0.1F, -1.05F, -4.5F, -0.45F, -1.3F, -5.55F, -0.45F, -1.3F, -5.55F, -0.1F, -1.05F, -4.5F); // Box 11
		bodyModel[10].setRotationPoint(-11F, -28.25F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 37, 7, 22, 0F,-0.1F, 0F, -0.8F, -0.4F, 0F, -1.2F, -0.4F, 0F, -1.2F, -0.1F, 0F, -0.8F, -0.1F, -0.9F, -0.8F, -0.45F, -2.8F, -1.9F, -0.45F, -2.8F, -1.9F, -0.1F, -0.9F, -0.8F); // Box 12
		bodyModel[11].setRotationPoint(-11F, -34.35F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 37, 13, 22, 0F,-0.1F, -0.55F, -1.15F, -0.4F, -1.05F, -1.45F, -0.4F, -1.05F, -1.45F, -0.1F, -0.55F, -1.15F, -0.1F, -1.2F, -0.8F, -0.4F, -1.2F, -1.2F, -0.4F, -1.2F, -1.2F, -0.1F, -1.2F, -0.8F); // Box 13
		bodyModel[12].setRotationPoint(-11F, -46.15F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 37, 10, 22, 0F,-0.45F, -1F, -3.25F, -0.5F, -1.3F, -3.9F, -0.5F, -1.3F, -3.9F, -0.45F, -1F, -3.25F, -0.1F, -2.2F, -1.15F, -0.4F, -1.7F, -1.45F, -0.4F, -1.7F, -1.45F, -0.1F, -2.2F, -1.15F); // Box 14
		bodyModel[13].setRotationPoint(-11F, -53.4F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 24, 13, 2, 0F,0F, 0F, -1.2F, 0.1F, -0.55F, -1.15F, 0.1F, -0.55F, 0.65F, 0F, 0F, 0.45F, 0F, -1.2F, 0F, 0.1F, -1.2F, -0.8F, 0.1F, -1.2F, 0F, 0F, -1.2F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-35F, -46.15F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 24, 13, 2, 0F,0F, 0F, 0.45F, 0.1F, -0.55F, 0.65F, 0.1F, -0.55F, -1.15F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0.1F, -1.2F, 0F, 0.1F, -1.2F, -0.8F, 0F, -1.2F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-35F, -46.15F, 9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 30, 9, 18, 0F,-7.4F, -0.75F, -4.75F, -0.45F, -2.7F, -4.9F, -0.45F, -2.7F, -4.9F, -7.4F, -0.75F, -4.75F, 0.05F, -1.95F, -1.37F, -0.5F, -1.7F, -1.9F, -0.5F, -1.7F, -1.9F, 0.05F, -1.95F, -1.37F); // Box 17
		bodyModel[16].setRotationPoint(-4F, -59.4F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 22, 3, 9, 0F,-2.05F, -1.35F, -2.7F, 0.35F, -3.25F, -2.7F, 0.35F, -3.25F, -3.2F, -2.05F, -1.35F, -3.2F, -0.2F, -0.05F, 0F, 0.35F, 1.9F, -0.15F, 0.35F, 1.9F, -0.65F, -0.2F, -0.05F, -0.5F); // Box 19
		bodyModel[17].setRotationPoint(3.2F, -61.6F, -4.25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 19, 3, 20, 0F,0.45F, -0.1F, -0.9F, 0F, 1.65F, -3F, 0F, 1.65F, -3F, 0.45F, -0.1F, -0.9F, 0.45F, -0.3F, -4.5F, 0F, -2.45F, -6.1F, 0F, -2.45F, -6.1F, 0.45F, -0.3F, -4.5F); // Box 20
		bodyModel[18].setRotationPoint(26F, -30.25F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 19, 4, 22, 0F,0.45F, 0.1F, -1.2F, 0F, 0.6F, -3.1F, 0F, 0.6F, -3.1F, 0.45F, 0.1F, -1.2F, 0.45F, 0.1F, -1.9F, 0F, -1.65F, -4F, 0F, -1.65F, -4F, 0.45F, 0.1F, -1.9F); // Box 21
		bodyModel[19].setRotationPoint(26F, -34.25F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 19, 13, 22, 0F,0.4F, -1.05F, -1.45F, 0F, -1.2F, -3.1F, 0F, -1.2F, -3.1F, 0.4F, -1.05F, -1.45F, 0.4F, -1.2F, -1.2F, 0F, -1.7F, -3.1F, 0F, -1.7F, -3.1F, 0.4F, -1.2F, -1.2F); // Box 22
		bodyModel[20].setRotationPoint(26F, -46.15F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 19, 9, 22, 0F,0.5F, -1.05F, -3.9F, 0F, -2.4F, -4.8F, 0F, -2.4F, -4.8F, 0.5F, -1.05F, -3.9F, 0.4F, -0.95F, -1.45F, 0F, -0.8F, -3.1F, 0F, -0.8F, -3.1F, 0.4F, -0.95F, -1.45F); // Box 23
		bodyModel[21].setRotationPoint(26F, -53.15F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 19, 7, 18, 0F,0.5F, -1.45F, -4.9F, 0F, -3.35F, -5.35F, 0F, -3.35F, -5.35F, 0.5F, -1.45F, -4.9F, 0.5F, -0.95F, -1.9F, 0F, 0.4F, -2.8F, 0F, 0.4F, -2.8F, 0.5F, -0.95F, -1.9F); // Box 24
		bodyModel[22].setRotationPoint(26F, -58.15F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 19, 4, 12, 0F,0.5F, -1.45F, -4.45F, 0F, -3.55F, -4.45F, 0F, -3.55F, -4.45F, 0.5F, -1.45F, -4.45F, 0.5F, -0.9F, -1.9F, 0F, 1F, -2.35F, 0F, 1F, -2.35F, 0.5F, -0.9F, -1.9F); // Box 25
		bodyModel[23].setRotationPoint(26F, -59.8F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 51, 13, 18, 0F,0F, -1.2F, -1.1F, -0.5F, -1.2F, -7.6F, -0.5F, -1.2F, -7.6F, 0F, -1.2F, -1.1F, 0F, -1.7F, -1.1F, -0.5F, -4.3F, -7.5F, -0.5F, -4.3F, -7.5F, 0F, -1.7F, -1.1F); // Box 26
		bodyModel[24].setRotationPoint(45F, -46.15F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 35, 9, 18, 0F,0F, -1.4F, -2.8F, -0.35F, -1.4F, -7.15F, -0.35F, -1.4F, -7.15F, 0F, -1.4F, -2.8F, 0F, -1.8F, -1.1F, -0.35F, -1.8F, -5.5F, -0.35F, -1.8F, -5.5F, 0F, -1.8F, -1.1F); // Box 27
		bodyModel[25].setRotationPoint(45F, -52.15F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 28, 7, 14, 0F,0F, -1.35F, -3.35F, -0.75F, -2.8F, -6.25F, -0.75F, -2.8F, -6.25F, 0F, -1.35F, -3.35F, 0F, -1.6F, -0.8F, -0.75F, -1.6F, -4.2F, -0.75F, -1.6F, -4.2F, 0F, -1.6F, -0.8F); // Box 28
		bodyModel[26].setRotationPoint(45F, -56.15F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 28, 4, 8, 0F,0F, -0.9F, -2.45F, -1F, -3.55F, -4F, -1F, -3.55F, -4F, 0F, -0.9F, -2.45F, 0F, -1.65F, -0.35F, -0.75F, -0.2F, -3.25F, -0.75F, -0.2F, -3.25F, 0F, -1.65F, -0.35F); // Box 29
		bodyModel[27].setRotationPoint(45F, -57.15F, -4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 51, 4, 18, 0F,0F, 0.6F, -1.1F, -0.5F, 3.2F, -7.5F, -0.5F, 3.2F, -7.5F, 0F, 0.6F, -1.1F, 0F, -1.65F, -2F, -0.5F, -5.7F, -7.7F, -0.5F, -5.7F, -7.7F, 0F, -1.65F, -2F); // Box 30
		bodyModel[28].setRotationPoint(45F, -34.25F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 51, 3, 16, 0F,0F, 0.65F, -1F, -0.5F, 4.7F, -6.7F, -0.5F, 4.7F, -6.7F, 0F, 0.65F, -1F, 0F, -1.45F, -4.1F, -0.5F, -7.1F, -7.3F, -0.5F, -7.1F, -7.3F, 0F, -1.45F, -4.1F); // Box 31
		bodyModel[29].setRotationPoint(45F, -31.25F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 9, 8, 0F,-0.65F, -1.4F, -2.15F, -0.5F, -1.4F, -2.65F, -0.5F, -1.4F, -2.65F, -0.65F, -1.4F, -2.15F, -0.65F, -1.8F, -0.5F, -0.5F, -1.8F, -2.6F, -0.5F, -1.8F, -2.6F, -0.65F, -1.8F, -0.5F); // Box 32
		bodyModel[30].setRotationPoint(79F, -52.15F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,-0.25F, 0F, -2.25F, -0.35F, 0F, -1.5F, -0.35F, 0F, -1.5F, -0.25F, 0F, -2.25F, -0.25F, -0.4F, -0.2F, -0.35F, -0.4F, -1.15F, -0.35F, -0.4F, -1.15F, -0.25F, -0.4F, -0.2F); // Box 33
		bodyModel[31].setRotationPoint(72F, -53.35F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, -2.75F, -1F, -2.95F, 0F, -1F, -2.95F, 0F, -1F, 0F, -2.75F, -1F, -0.25F, 0F, -0.25F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.25F, 0F, -0.25F); // Box 34
		bodyModel[32].setRotationPoint(72F, -56.35F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F,0F, 0F, -0.5F, -0.15F, 0F, -0.75F, -0.15F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.4F, -0.15F, -0.15F, -0.4F, -0.65F, -0.15F, -0.4F, -0.65F, 0F, -0.4F, -0.15F); // Box 36
		bodyModel[33].setRotationPoint(79.65F, -53.35F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 16, 18, 4, 0F,-11.05F, -0.1F, -1.25F, -0.15F, -0.1F, -1.25F, -0.15F, -0.1F, -1.25F, -11.05F, -0.1F, -1.25F, 0F, 0F, -0.5F, -0.15F, 0F, -0.75F, -0.15F, 0F, -0.75F, 0F, 0F, -0.5F); // Box 37
		bodyModel[34].setRotationPoint(79.65F, -71.35F, -2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 26, 2, 0F,-0.35F, -0.75F, -0.75F, -0.05F, -4.95F, -0.25F, -0.05F, -4.95F, -0.25F, -0.35F, -0.75F, -0.75F, 0.7F, -1.2F, -1F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.7F, -1.2F, -1F); // Box 38
		bodyModel[35].setRotationPoint(90.8F, -77F, -1F);
		bodyModel[35].rotateAngleZ = -0.55850536F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 15, 7, 2, 0F,0F, 0F, -2.23F, 0.2F, 0F, -2.25F, 0.2F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, -0.5F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.35F, 0F, -0.5F, -0.5F); // Box 39
		bodyModel[36].setRotationPoint(-25.75F, -52.4F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 15, 7, 2, 0F,0F, 0F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, -2.25F, 0F, 0F, -2.23F, 0F, -0.5F, -0.5F, -0.15F, -0.2F, -0.35F, -0.15F, -0.2F, -0.15F, 0F, -0.5F, -0.15F); // Box 40
		bodyModel[37].setRotationPoint(-25.75F, -52.4F, 8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 9, 6, 2, 0F,0.05F, 0F, -2.4F, 0.2F, 0F, -2.4F, 0.2F, 0F, 0.9F, 0.05F, 0F, 0.8F, 0.05F, -0.75F, -0.7F, 0.2F, -0.5F, -0.65F, 0.2F, -0.5F, 0F, 0.05F, -0.75F, -0.05F); // Box 41
		bodyModel[38].setRotationPoint(-34.95F, -51.4F, -10.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 9, 6, 2, 0F,0.05F, 0F, 0.8F, 0.2F, 0F, 0.9F, 0.2F, 0F, -2.4F, 0.05F, 0F, -2.4F, 0.05F, -0.75F, -0.05F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, -0.65F, 0.05F, -0.75F, -0.7F); // Box 42
		bodyModel[39].setRotationPoint(-34.95F, -51.4F, 8.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 17, 2, 8, 0F,-0.35F, -2.05F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.35F, -2.05F, -0.4F, -0.35F, 2.1F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.35F, 2.1F, -0.4F); // Box 43
		bodyModel[40].setRotationPoint(-71F, -54.5F, -4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F,-0.35F, -2.6F, -0.65F, 0F, -1.4F, -0.65F, 0F, -1.4F, -0.6F, -0.35F, -2.05F, -0.6F, -0.35F, 2.1F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.6F, -0.35F, 2.1F, -0.6F); // Box 44
		bodyModel[41].setRotationPoint(-71F, -54.5F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F,-0.35F, -2.05F, -0.6F, 0F, -1.4F, -0.6F, 0F, -1.4F, -0.65F, -0.35F, -2.6F, -0.65F, -0.35F, 2.1F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.65F, -0.35F, 2.1F, -0.65F); // Box 45
		bodyModel[42].setRotationPoint(-71F, -54.5F, 3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F,-0.35F, -2.6F, -2.4F, 0F, -0.85F, -2.4F, 0F, -0.85F, -0.6F, -0.35F, -2.6F, -0.6F, -0.35F, 2.1F, -1.1F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, -0.35F, 2.1F, -0.6F); // Box 46
		bodyModel[43].setRotationPoint(-71F, -54.5F, -7.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F,-0.35F, -2.6F, -0.6F, 0F, -0.85F, -0.6F, 0F, -0.85F, -2.4F, -0.35F, -2.6F, -2.4F, -0.35F, 2.1F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, -0.35F, 2.1F, -1.1F); // Box 47
		bodyModel[44].setRotationPoint(-71F, -54.5F, 4.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F,-0.3F, -2.15F, -0.55F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -0.3F, -2.15F, -0.55F, -0.3F, 1.75F, -0.55F, 0F, 0.05F, 0.6F, 0F, 0.05F, 0.6F, -0.3F, 1.75F, -0.55F); // Box 48
		bodyModel[45].setRotationPoint(-83.65F, -52.45F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,-0.3F, -2.7F, -1.5F, 0F, -0.55F, -0.65F, 0F, 0F, -0.6F, -0.3F, -2.15F, 0.55F, -0.3F, 1.75F, 0.25F, 0F, 0.05F, 0.65F, 0F, 0.05F, -0.6F, -0.3F, 1.75F, 0.55F); // Box 49
		bodyModel[46].setRotationPoint(-83.65F, -52.45F, -6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,-0.3F, -2.15F, 0.55F, 0F, 0F, -0.6F, 0F, -0.55F, -0.65F, -0.3F, -2.7F, -1.5F, -0.3F, 1.75F, 0.55F, 0F, 0.05F, -0.6F, 0F, 0.05F, 0.65F, -0.3F, 1.75F, 0.25F); // Box 50
		bodyModel[47].setRotationPoint(-83.65F, -52.45F, 3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 13, 20, 0F,0.35F, -5F, -2.35F, -0.35F, -0.65F, -1.5F, -0.35F, -0.65F, -1.5F, 0.35F, -5F, -2.35F, 0.35F, -3.9F, -2.35F, -0.35F, -1.05F, -0.4F, -0.35F, -1.05F, -0.4F, 0.35F, -3.9F, -2.35F); // Box 51
		bodyModel[48].setRotationPoint(-90F, -46.15F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 7, 20, 0F,0.35F, 2.85F, -2.35F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, 0.35F, 2.85F, -2.35F, 0.35F, -5.95F, -4.2F, -0.35F, -3.6F, -2F, -0.35F, -3.6F, -2F, 0.35F, -5.95F, -4.2F); // Box 52
		bodyModel[49].setRotationPoint(-90F, -34.2F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 7, 7, 18, 0F,0.35F, -3.45F, -3.4F, -0.35F, 0.5F, -2.75F, -0.35F, 0.5F, -2.75F, 0.35F, -3.45F, -3.4F, 0.35F, 0.05F, -1.35F, -0.35F, -4.3F, -0.5F, -0.35F, -4.3F, -0.5F, 0.35F, 0.05F, -1.35F); // Box 53
		bodyModel[50].setRotationPoint(-90F, -48.2F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 3, 22, 0F,0.35F, 1.9F, -5.2F, -0.35F, -0.45F, -3F, -0.35F, -0.45F, -3F, 0.35F, 1.9F, -5.2F, 0.35F, -3.15F, -8.95F, -0.35F, -1.2F, -5.65F, -0.35F, -1.2F, -5.65F, 0.35F, -3.15F, -8.95F); // Box 54
		bodyModel[51].setRotationPoint(-90F, -31.25F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,-0.3F, -3.65F, -3F, 0.3F, -0.15F, -0.55F, 0.3F, -0.15F, -0.55F, -0.3F, -3.65F, -3F, -0.3F, 3.7F, -3F, 0.3F, -0.3F, -0.55F, 0.3F, -0.3F, -0.55F, -0.3F, 3.7F, -3F); // Box 55
		bodyModel[52].setRotationPoint(-90.65F, -50.45F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,-0.3F, -3.65F, 2F, 0.3F, -0.15F, -0.45F, 0.3F, -0.7F, -0.5F, -0.3F, -3.65F, -2.95F, -0.3F, 3.7F, 2F, 0.3F, 0.05F, -0.6F, 0.3F, -0.25F, 1.25F, -0.3F, 3.7F, 0.6F); // Box 56
		bodyModel[53].setRotationPoint(-90.65F, -50.45F, 2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,-0.3F, -3.65F, -2.95F, 0.3F, -0.7F, -0.5F, 0.3F, -0.15F, -0.45F, -0.3F, -3.65F, 2F, -0.3F, 3.7F, 0.6F, 0.3F, -0.25F, 1.25F, 0.3F, 0.05F, -0.6F, -0.3F, 3.7F, 2F); // Box 57
		bodyModel[54].setRotationPoint(-90.65F, -50.45F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 15, 4, 16, 0F,0F, -2F, -8F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, 0F, -2F, -8F, 0F, -2F, -8F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, -2F, -8F); // Box 59
		bodyModel[55].setRotationPoint(-105F, -41F, -8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 15, 4, 16, 0F,0F, 2F, -8F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 2F, -8F, 0F, -6F, -8F, -0.35F, -0.15F, -2.2F, -0.35F, -0.15F, -2.2F, 0F, -6F, -8F); // Box 60
		bodyModel[56].setRotationPoint(-105F, -37F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 15, 4, 16, 0F,0F, -6F, -8F, -0.35F, -0.25F, -2.4F, -0.35F, -0.25F, -2.4F, 0F, -6F, -8F, 0F, 2F, -8F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, 0F, 2F, -8F); // Box 61
		bodyModel[57].setRotationPoint(-105F, -45F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, -8F, -6F, -0.35F, -0.2F, -3.95F, -0.35F, -0.2F, -3.95F, 0F, -8F, -6F, 0F, 6F, -6F, -0.35F, 0.25F, -0.4F, -0.35F, 0.25F, -0.4F, 0F, 6F, -6F); // Box 62
		bodyModel[58].setRotationPoint(-105F, -47F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, 6F, -6F, -0.35F, 0.15F, -0.2F, -0.35F, 0.15F, -0.2F, 0F, 6F, -6F, 0F, -8F, -6F, -0.35F, -0.4F, -3.9F, -0.35F, -0.4F, -3.9F, 0F, -8F, -6F); // Box 63
		bodyModel[59].setRotationPoint(-105F, -33F, -6F);

		bodyModel[60].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 64
		bodyModel[60].setRotationPoint(-63.3F, -53.8F, -4.95F);

		bodyModel[61].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 65
		bodyModel[61].setRotationPoint(-60.6F, -53.8F, 3.95F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 36, 3, 5, 0F,0F, -0.65F, -0.95F, 0.1F, -1.15F, -2.85F, 0.5F, -0.85F, 0.4F, 0F, -0.15F, 0.15F, 0F, -1.5F, 0.1F, 0.1F, -1.25F, -2.3F, 0.5F, -0.45F, 0.4F, 0F, -0.15F, 0F); // Box 66
		bodyModel[62].setRotationPoint(74.5F, -49.75F, -3F);
		bodyModel[62].rotateAngleY = -1.37881011F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 40, 3, 13, 0F,0F, 0F, 0.05F, 0.25F, -0.8F, -8.05F, 0.25F, -1F, 0.1F, 0.7F, -0.5F, 0.15F, 0F, -0.3F, 0.2F, 0.25F, -0.65F, -8.05F, 0.25F, -0.9F, 0.1F, 0.7F, -0.6F, 0.15F); // Box 68
		bodyModel[63].setRotationPoint(79.6F, -49.6F, -2F);
		bodyModel[63].rotateAngleY = -1.57079633F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0.1F, -0.4F, -0.2F, 0.25F, -0.95F, -1.7F, 0.25F, -0.2F, 0.65F, 0.2F, -0.1F, -0.25F, 0F, -1F, 0.35F, 0.25F, -1.05F, -1.7F, 0.25F, -0.25F, 0.65F, 0.2F, -0.2F, -0.25F); // Box 72
		bodyModel[64].setRotationPoint(84F, -49F, -38F);
		bodyModel[64].rotateAngleY = -1.57079633F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0.05F, 0F, 0F, -0.6F, -0.75F, -1.45F, 0.1F, -0.75F, 0F, 0.05F, -0.2F, 0.05F, 0.05F, -0.45F, 0F, -0.6F, -1.25F, -1.45F, 0.1F, -1.25F, 0F, 0.05F, -0.7F, 0.05F); // Box 74
		bodyModel[65].setRotationPoint(87.65F, -48.8F, -42.3F);
		bodyModel[65].rotateAngleY = -1.57079633F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.05F, -0.75F, -0.05F, -0.6F, -0.75F, -1.45F, 0.4F, -0.75F, 0.45F, 0.05F, 0F, -1F, 0.05F, -1.25F, -0.05F, -0.6F, -1.25F, -1.45F, 0.4F, -1.25F, 0.45F, 0.05F, -0.45F, -1F); // Box 76
		bodyModel[66].setRotationPoint(85.65F, -48.8F, -42.3F);
		bodyModel[66].rotateAngleY = -1.57079633F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0.05F, -0.2F, 0F, 0.1F, -0.75F, 0.05F, -1F, -0.75F, -2.25F, 0.05F, -0.7F, -0.3F, 0.05F, -0.7F, 0F, 0.1F, -1.25F, 0.05F, -1F, -1.25F, -2.25F, 0.05F, -1.3F, -0.3F); // Box 78
		bodyModel[67].setRotationPoint(92.7F, -48.8F, -42.3F);
		bodyModel[67].rotateAngleY = -1.57079633F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0.05F, -0.7F, -0.3F, -1F, -0.75F, -2.25F, 0.1F, -0.75F, 0.05F, 0.05F, -0.2F, 0F, 0.05F, -1.3F, -0.3F, -1F, -1.25F, -2.25F, 0.1F, -1.25F, 0.05F, 0.05F, -0.7F, 0F); // Box 79
		bodyModel[68].setRotationPoint(97.7F, -48.8F, 42.3F);
		bodyModel[68].rotateAngleY = -4.71238898F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0.05F, -0.2F, 0.05F, 0.1F, -0.75F, 0F, -0.6F, -0.75F, -1.45F, 0.05F, 0F, 0F, 0.05F, -0.7F, 0.05F, 0.1F, -1.25F, 0F, -0.6F, -1.25F, -1.45F, 0.05F, -0.45F, 0F); // Box 80
		bodyModel[69].setRotationPoint(92.65F, -48.8F, 42.3F);
		bodyModel[69].rotateAngleY = -4.71238898F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 40, 3, 13, 0F,0.7F, -0.5F, 0.15F, 0.25F, -1F, 0.1F, 0.25F, -0.8F, -8.05F, 0F, 0F, 0.05F, 0.7F, -0.6F, 0.15F, 0.25F, -0.9F, 0.1F, 0.25F, -0.65F, -8.05F, 0F, -0.3F, 0.2F); // Box 81
		bodyModel[70].setRotationPoint(92.6F, -49.6F, 1.99999999999999F);
		bodyModel[70].rotateAngleY = -4.71238898F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0.2F, -0.1F, -0.25F, 0.25F, -0.2F, 0.65F, 0.25F, -0.95F, -1.7F, 0.1F, -0.4F, -0.15F, 0.2F, -0.2F, -0.25F, 0.25F, -0.25F, 0.65F, 0.25F, -1.05F, -1.7F, 0F, -1F, 0.35F); // Box 82
		bodyModel[71].setRotationPoint(87F, -49F, 38F);
		bodyModel[71].rotateAngleY = -4.71238898F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 36, 3, 5, 0F,0F, -0.15F, 0.15F, 0.5F, -0.85F, 0.4F, 0.1F, -1.15F, -2.85F, 0F, -0.65F, -0.95F, 0F, -0.15F, 0F, 0.5F, -0.45F, 0.4F, 0.1F, -1.25F, -2.3F, 0F, -1.5F, 0.1F); // Box 83
		bodyModel[72].setRotationPoint(79.4F, -49.75F, 1.99999999999999F);
		bodyModel[72].rotateAngleY = -4.9043752F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.05F, 0F, -1F, 0.4F, -0.75F, 0.45F, -0.6F, -0.75F, -1.45F, 0.05F, -0.75F, -0.05F, 0.05F, -0.45F, -1F, 0.4F, -1.25F, 0.45F, -0.6F, -1.25F, -1.45F, 0.05F, -1.25F, -0.05F); // Box 84
		bodyModel[73].setRotationPoint(88.65F, -48.8F, 42.3F);
		bodyModel[73].rotateAngleY = -4.71238898F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 17, 8, 20, 0F,0F, -0.05F, 0.2F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, -0.05F, 0.2F, -1.2F, -0.45F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -1.2F, -0.45F, 0F); // Box 85
		bodyModel[74].setRotationPoint(-10.9F, -28.3F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 15, 8, 20, 0F,0F, 0.8F, -0.3F, -0.3F, 1.6F, -0.75F, -0.3F, 1.6F, -0.75F, 0F, 0.8F, -0.3F, 0F, -0.5F, -0.3F, -2.25F, -2.15F, -1.2F, -2.25F, -2.15F, -1.2F, 0F, -0.5F, -0.3F); // Box 86
		bodyModel[75].setRotationPoint(6.1F, -28.3F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 76
		bodyModel[76].setRotationPoint(8.15F, -77.5F, -0.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.5F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.1F, 0F, -0.45F); // Box 77
		bodyModel[77].setRotationPoint(89.85F, -76.9F, -0.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 82, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, -0.95F); // Box 78
		bodyModel[78].setRotationPoint(8.5F, -77.4F, 0F);
		bodyModel[78].rotateAngleZ = -0.00698132F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 24, 9, 8, 0F,0F, 1.5F, -2.95F, 0.1F, 0.25F, -2.95F, -0.3F, -2.35F, 0.3F, 0F, 0.1F, 0F, 0F, -0.3F, 0.5F, 0.25F, -2.05F, 0.5F, -0.3F, -2.55F, 0.3F, 0F, -0.8F, 0F); // Box 79
		bodyModel[79].setRotationPoint(-35F, -34.25F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 21, 6, 5, 0F,-0.1F, 1.25F, 0.05F, 0.1F, -3.5F, 0.8F, -9.65F, -3.8F, 2.35F, 0.3F, -1.35F, 0.3F, -0.25F, -0.05F, 3.5F, 0.1F, -2.5F, 0.8F, -9.65F, -2.2F, 2.35F, 0.3F, -0.55F, 0.3F); // Box 81
		bodyModel[80].setRotationPoint(-11F, -33.25F, 10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 14, 10, 9, 0F,0.1F, -1.5F, 0.15F, 0F, 1.75F, 0.8F, 0F, -0.9F, 0F, 0.1F, -2.3F, 0F, 0.1F, -1.05F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.8F, 0F, 0.1F, -1.25F, 0F); // Box 82
		bodyModel[81].setRotationPoint(-49F, -35.25F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 5, 7, 9, 0F,-0.1F, -2.45F, 0.15F, -0.1F, 0.5F, 0.15F, -0.1F, -0.3F, 0F, -0.75F, -2.45F, 0F, 0.55F, -1.4F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.25F, 0F, -0.2F, -2.4F, 0F); // Box 83
		bodyModel[82].setRotationPoint(-54F, -33.25F, 6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 24, 3, 22, 0F,0F, 0F, 0F, 0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.3F, -4.5F, 0.1F, -2.05F, -4.5F, 0.1F, -2.05F, -4.5F, 0F, -0.3F, -4.5F); // Box 84
		bodyModel[83].setRotationPoint(-35F, -28.25F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 7, 118, 0F,-0.75F, -2.45F, 0F, -0.1F, -0.3F, 0F, 6.3F, 8.8F, -0.25F, -9.15F, 8.05F, -0.15F, -0.2F, -2.4F, 0F, -0.1F, -0.25F, 0F, 6.3F, -13.55F, 0F, -8.9F, -14.15F, 0F); // Box 85
		bodyModel[84].setRotationPoint(-54F, -33.25F, 15F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 14, 10, 118, 0F,0.1F, -2.3F, 0F, 0F, -0.9F, 0F, -1.05F, 7.4F, -0.3F, -6.3F, 6.8F, -0.25F, 0.1F, -1.25F, 0F, 0F, -0.8F, 0F, -1.05F, -14.3F, 0F, -6.3F, -14.55F, 0F); // Box 86
		bodyModel[85].setRotationPoint(-49F, -35.25F, 15F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 24, 8, 117, 0F,0F, 0.1F, 0F, -0.3F, -2.35F, -0.3F, -14.7F, 7.9F, 0.7F, 1.05F, 8.4F, 0.7F, 0F, 0.2F, 0F, -0.3F, -1.55F, -0.3F, -14.7F, -14.15F, 0.9F, 1.05F, -13.3F, 1F); // Box 87
		bodyModel[86].setRotationPoint(-35F, -34.25F, 15F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 21, 5, 118, 0F,0.3F, -0.35F, -0.3F, -9.65F, -2.8F, -2.35F, -27.9F, 9F, -0.15F, 14.7F, 9.9F, -0.3F, 0.3F, -0.55F, -0.3F, -9.65F, -2.2F, -2.35F, -27.9F, -14F, -0.15F, 14.7F, -13.15F, -0.1F); // Box 89
		bodyModel[87].setRotationPoint(-11F, -32.25F, 15F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.15F, -0.7F, 0.15F, 0.3F, 0.05F, 0.25F, 1.2F, -0.45F, -0.2F, -0.6F, -0.9F, -4.65F, 0.1F, -0.4F, 0F, 0.3F, 0.2F, 0F, 1.2F, -1.55F, -0.2F, -0.6F, -1.1F, -4.65F); // Box 90
		bodyModel[88].setRotationPoint(-45F, -42F, 133F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,-0.3F, 0.05F, 0.25F, -0.05F, 0.65F, 0.3F, -0.2F, -0.1F, -0.25F, -1.2F, -0.45F, -3.2F, -0.3F, 0.2F, 0F, -0.05F, 0.45F, 0F, -0.2F, -1.9F, -0.25F, -1.2F, -1.55F, -3.2F); // Box 91
		bodyModel[89].setRotationPoint(-43F, -42F, 133F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,0.05F, 0.65F, 0.3F, 0.3F, 0.15F, 0.3F, -1.05F, 0.05F, -1.35F, 0.2F, -0.1F, -0.25F, 0.05F, 0.45F, 0F, 0.3F, -0.4F, 0.1F, -1.05F, -2.05F, -1.35F, 0.2F, -1.9F, -0.25F); // Box 92
		bodyModel[90].setRotationPoint(-36F, -42F, 133F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F,-0.3F, 0.15F, 0.3F, 0.1F, -0.75F, 0.15F, -3.6F, -0.3F, -5.2F, 1.05F, 0.05F, -1.35F, -0.3F, -0.4F, 0.1F, 0.1F, -1.25F, 0.15F, -3.6F, -1.7F, -5.2F, 1.05F, -2.05F, -1.35F); // Box 93
		bodyModel[91].setRotationPoint(-26F, -42F, 133F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 24, 9, 8, 0F,0F, 0.1F, 0F, -0.3F, -2.35F, 0.3F, 0.1F, 0.25F, -2.95F, 0F, 1.5F, -2.95F, 0F, -0.8F, 0F, -0.3F, -2.55F, 0.3F, 0.25F, -2.05F, 0.5F, 0F, -0.3F, 0.5F); // Box 95
		bodyModel[92].setRotationPoint(-35F, -34.25F, -15F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 14, 10, 9, 0F,0.1F, -2.3F, 0F, 0F, -0.9F, 0F, 0F, 1.75F, 0.8F, 0.1F, -1.5F, 0.15F, 0.1F, -1.25F, 0F, 0F, -0.8F, 0F, 0F, -0.3F, -0.5F, 0.1F, -1.05F, -0.5F); // Box 96
		bodyModel[93].setRotationPoint(-49F, -35.25F, -15F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 7, 9, 0F,-0.75F, -2.45F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0.5F, 0.15F, -0.1F, -2.45F, 0.15F, -0.2F, -2.4F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, -0.5F, 0.55F, -1.4F, -0.5F); // Box 97
		bodyModel[94].setRotationPoint(-54F, -33.25F, -15F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 7, 118, 0F,-9.15F, 8.05F, -0.15F, 6.3F, 8.8F, -0.25F, -0.1F, -0.3F, 0F, -0.75F, -2.45F, 0F, -8.9F, -14.15F, 0F, 6.3F, -13.55F, 0F, -0.1F, -0.25F, 0F, -0.2F, -2.4F, 0F); // Box 98
		bodyModel[95].setRotationPoint(-54F, -33.25F, -133F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 14, 10, 118, 0F,-6.3F, 6.8F, -0.25F, -1.05F, 7.4F, -0.3F, 0F, -0.9F, 0F, 0.1F, -2.3F, 0F, -6.3F, -14.55F, 0F, -1.05F, -14.3F, 0F, 0F, -0.8F, 0F, 0.1F, -1.25F, 0F); // Box 99
		bodyModel[96].setRotationPoint(-49F, -35.25F, -133F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 24, 8, 117, 0F,1.05F, 8.4F, 0.7F, -14.7F, 7.9F, 0.7F, -0.3F, -2.35F, -0.3F, 0F, 0.1F, 0F, 1.05F, -13.3F, 1F, -14.7F, -14.15F, 0.9F, -0.3F, -1.55F, -0.3F, 0F, 0.2F, 0F); // Box 100
		bodyModel[97].setRotationPoint(-35F, -34.25F, -132F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 21, 5, 118, 0F,14.7F, 9.9F, -0.3F, -27.9F, 9F, -0.15F, -9.65F, -2.8F, -2.35F, 0.3F, -0.35F, -0.3F, 14.7F, -13.15F, -0.1F, -27.9F, -14F, -0.15F, -9.65F, -2.2F, -2.35F, 0.3F, -0.55F, -0.3F); // Box 101
		bodyModel[98].setRotationPoint(-11F, -32.25F, -133F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F,1.05F, 0.05F, -1.35F, -3.6F, -0.3F, -5.2F, 0.1F, -0.75F, 0.15F, -0.3F, 0.15F, 0.3F, 1.05F, -2.05F, -1.35F, -3.6F, -1.7F, -5.2F, 0.1F, -1.25F, 0.15F, -0.3F, -0.4F, 0.1F); // Box 102
		bodyModel[99].setRotationPoint(-26F, -42F, -144F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,0.2F, -0.1F, -0.25F, -1.05F, 0.05F, -1.35F, 0.3F, 0.15F, 0.3F, 0.05F, 0.65F, 0.3F, 0.2F, -1.9F, -0.25F, -1.05F, -2.05F, -1.35F, 0.3F, -0.4F, 0.1F, 0.05F, 0.45F, 0F); // Box 103
		bodyModel[100].setRotationPoint(-36F, -42F, -144F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,-1.2F, -0.45F, -3.2F, -0.2F, -0.1F, -0.25F, -0.05F, 0.65F, 0.3F, -0.3F, 0.05F, 0.25F, -1.2F, -1.55F, -3.2F, -0.2F, -1.9F, -0.25F, -0.05F, 0.45F, 0F, -0.3F, 0.2F, 0F); // Box 104
		bodyModel[101].setRotationPoint(-43F, -42F, -144F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.6F, -0.9F, -4.65F, 1.2F, -0.45F, -0.2F, 0.3F, 0.05F, 0.25F, -0.15F, -0.7F, 0.15F, -0.6F, -1.1F, -4.65F, 1.2F, -1.55F, -0.2F, 0.3F, 0.2F, 0F, 0.1F, -0.4F, 0F); // Box 105
		bodyModel[102].setRotationPoint(-45F, -42F, -141F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 21, 6, 5, 0F,0.3F, -1.35F, 0.3F, -9.65F, -3.8F, 2.35F, 0.1F, -3.5F, 0.8F, -0.1F, 1.25F, 0.05F, 0.3F, -0.55F, 0.3F, -9.65F, -2.2F, 2.35F, 0.1F, -2.5F, 0.8F, -0.25F, -0.05F, 3.5F); // Box 106
		bodyModel[103].setRotationPoint(-11F, -33.25F, -15F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[104].setRotationPoint(-61.8F, -34.7F, 53.95F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,-1F, -0.25F, -0.3F, 0.3F, -0.7F, -1.1F, 0.3F, -0.35F, 0F, 0F, 0F, 0F, -1F, -0.25F, -0.3F, 0.3F, -0.7F, -1.1F, 0.3F, -0.1F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[105].setRotationPoint(-57.4F, -44.3F, -13F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-0.3F, -0.25F, -0.1F, 0.3F, -1.4F, -1.6F, 0.3F, -0.75F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.15F, -0.1F, 0.3F, -1.3F, -1.6F, 0.3F, -0.75F, 0F, -0.3F, 0.45F, 0F); // Box 115
		bodyModel[106].setRotationPoint(-48.4F, -43.85F, -12F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 2, 23, 0F,0F, -0.4F, -0.55F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, -0.15F, 0F, -0.4F, -0.65F, 0F, -0.3F, -0.55F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.15F, 0F, -0.3F, -0.65F); // Box 116
		bodyModel[107].setRotationPoint(-59.7F, -37.15F, -11.45F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 2, 23, 0F,0F, -0.4F, -0.55F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, -0.15F, 0F, -0.4F, -0.65F, 0F, -0.3F, -0.55F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.15F, 0F, -0.3F, -0.65F); // Box 117
		bodyModel[108].setRotationPoint(-64F, -37.15F, -11.45F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 2, 23, 0F,0F, -0.4F, -0.55F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, -0.15F, 0F, -0.4F, -0.65F, 0F, -0.3F, -0.55F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.15F, 0F, -0.3F, -0.65F); // Box 118
		bodyModel[109].setRotationPoint(-68.25F, -37.15F, -11.45F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 2, 23, 0F,0F, -0.4F, -0.55F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, -0.15F, 0F, -0.4F, -0.65F, 0F, -0.3F, -0.55F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.15F, 0F, -0.3F, -0.65F); // Box 119
		bodyModel[110].setRotationPoint(-72.5F, -37.15F, -11.45F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 2, 23, 0F,0F, -0.4F, -0.55F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, -0.15F, 0F, -0.4F, -0.65F, 0F, -0.3F, -0.55F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.15F, 0F, -0.3F, -0.65F); // Box 120
		bodyModel[111].setRotationPoint(-76.75F, -37.15F, -11.45F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F,0F, -0.55F, -0.8F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, -0.15F, 0F, -0.55F, -0.9F, 0F, -0.45F, -0.8F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.15F, 0F, -0.45F, -0.9F); // Box 121
		bodyModel[112].setRotationPoint(-83F, -37.15F, -11.45F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 22, 1, 22, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.95F, 0F, 0.3F, -0.95F, 0F, 0.3F, -0.95F, 0.1F, 0F, -0.95F, 0.1F); // Box 123
		bodyModel[113].setRotationPoint(-77.65F, -35F, -11.05F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 22, 1, 22, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.95F, 0F, 0.3F, -0.95F, 0F, 0.3F, -0.95F, 0.4F, 0F, -0.95F, 0.4F); // Box 124
		bodyModel[114].setRotationPoint(-77.65F, -37.2F, -11.2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 125
		bodyModel[115].setRotationPoint(84F, -35F, -0.25F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 126
		bodyModel[116].setRotationPoint(84F, -31F, -0.25F);
		bodyModel[116].rotateAngleZ = 0.78539816F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[117].setRotationPoint(84.6F, -29.7F, -0.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[118].setRotationPoint(84.6F, -28.7F, -0.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 129
		bodyModel[119].setRotationPoint(84.6F, -26.95F, -0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, -0.6F, 0F, -0.3F, -0.6F); // Box 143
		bodyModel[120].setRotationPoint(-35F, -53.1F, -8.1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.15F, -3.95F, 0.25F, 0.15F, -3.75F, 0.25F, 0.15F, 2.95F, 0F, 0.15F, 4.6F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 144
		bodyModel[121].setRotationPoint(-35F, -56.1F, -7.55F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.15F, -0.3F, -1.5F, 0.25F, -0.5F, -1.05F, 0.25F, -0.5F, 0.4F, 0.15F, -0.3F, 0.85F, 0.15F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, -0.5F, 0.15F, -0.3F, -0.5F); // Box 145
		bodyModel[122].setRotationPoint(-27F, -55.1F, -8.1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0.3F, 0.65F, 0F, 0.3F, -1.5F, 0F, 0F, -1F, 0F, -0.7F, 0.55F, 0F, -0.5F, 1.35F, 0F, -0.5F, -2.2F, 0F, -0.7F, -1.3F); // Box 146
		bodyModel[123].setRotationPoint(-33.75F, -56.25F, -3.6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.7F, -0.4F, -1.75F, 1.65F, -0.4F, -1.75F, -2.3F, 0F, 0F, -0.15F, 0F, -0.2F, 0F, -0.4F, 1.55F, 2F, -0.4F, 1.55F, -2.6F, 0F, -0.2F, -0.85F); // Box 147
		bodyModel[124].setRotationPoint(-31.75F, -56.55F, -4.95F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, -1F, 0F, -0.55F, -1F, 0F, -0.5F, 3.25F, -0.5F, -0.45F, 3.4F, -0.5F, -0.45F, -4.05F, 0F, -0.5F, -3.9F); // Box 148
		bodyModel[125].setRotationPoint(-26.25F, -61.15F, -3.65F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, -0.3F, -0.5F, 3.7F, -0.45F, -0.5F, 3.35F, -0.55F, 0F, -1F, -0.5F, -2F, -0.3F, 0.15F, -0.5F, -4.05F, -0.12F, -0.5F, -4.05F, -0.7F, -2F, -0.3F, -1F); // Box 149
		bodyModel[126].setRotationPoint(-33.75F, -57.25F, -4.1F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.95F, 0F, -0.1F, -0.03F, -0.2F, 1.73F, 0.05F, -0.2F, -2.55F, -0.95F, 0F, -0.9F, 0.4F, 0.05F, 0F, -1.15F, -0.1F, 1.75F, -1.15F, -0.1F, -2.55F, -0.6F, -0.1F, -0.9F); // Box 150
		bodyModel[127].setRotationPoint(-35.6F, -57.15F, -2.05F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, 0F, 0.8F, -0.5F, 0F, -0.45F, 0F, -0.5F, -0.65F, 0F, -0.5F, -1.8F, -0.5F, 0F, -1.8F, -0.5F); // Box 151
		bodyModel[128].setRotationPoint(-26.25F, -61.15F, -3.65F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.15F, 4.6F, 0.25F, 0.15F, 2.95F, 0.25F, 0.15F, -3.75F, 0F, 0.15F, -3.95F, 0F, 0F, -0.6F, 0.25F, 0F, -0.6F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[129].setRotationPoint(-35F, -56.1F, 6.55F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.95F, 0F, -0.9F, 0.05F, -0.2F, -2.55F, -0.03F, -0.2F, 1.73F, -0.95F, 0F, -0.1F, -0.6F, -0.1F, -0.9F, -1.15F, -0.1F, -2.55F, -1.15F, -0.1F, 1.75F, 0.4F, 0.05F, 0F); // Box 153
		bodyModel[130].setRotationPoint(-35.6F, -57.15F, 1.05F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0.3F, -1.5F, 0F, 0.3F, 0.65F, 0F, 0F, 0.2F, 0F, -0.7F, -1.3F, 0F, -0.5F, -2.2F, 0F, -0.5F, 1.35F, 0F, -0.7F, 0.55F); // Box 154
		bodyModel[131].setRotationPoint(-33.75F, -56.25F, 2.6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, -0.5F, -0.5F, 3.35F, -0.55F, -0.5F, 3.7F, -0.45F, 0F, -1F, -0.3F, -2F, -0.3F, -1F, -0.5F, -4.05F, -0.7F, -0.5F, -4.05F, -0.12F, -2F, -0.3F, 0.15F); // Box 155
		bodyModel[132].setRotationPoint(-33.75F, -57.25F, 3.1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.15F, -0.4F, -1.75F, -2.3F, -0.4F, -1.75F, 1.65F, 0F, 0F, -0.7F, 0F, -0.2F, -0.85F, -0.4F, 1.55F, -2.6F, -0.4F, 1.55F, 2F, 0F, -0.2F, 0F); // Box 156
		bodyModel[133].setRotationPoint(-31.75F, -56.55F, 3.95F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.15F, -0.3F, 0.85F, 0.25F, -0.5F, 0.4F, 0.25F, -0.5F, -1.05F, 0.15F, -0.3F, -1.5F, 0.15F, -0.3F, -0.5F, 0.25F, -0.3F, -0.5F, 0.25F, -0.3F, 0F, 0.15F, -0.3F, 0F); // Box 157
		bodyModel[134].setRotationPoint(-27F, -55.1F, 7.1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.3F, -0.6F, 0.25F, -0.3F, -0.6F, 0.25F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 158
		bodyModel[135].setRotationPoint(-35F, -53.1F, 7.1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.55F, -1F, -0.5F, -0.35F, -1F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -3.9F, -0.5F, -0.45F, -4.05F, -0.5F, -0.45F, 3.4F, 0F, -0.5F, 3.25F); // Box 159
		bodyModel[136].setRotationPoint(-26.25F, -61.15F, 2.65F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.8F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1.8F, -0.5F, -0.5F, -1.8F, -0.5F, -0.5F, -0.65F, 0F, 0F, -0.45F, 0F); // Box 160
		bodyModel[137].setRotationPoint(-26.25F, -61.15F, 0.65F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.35F, 0F, -0.1F, 0.35F, 0F, -0.1F, 0.35F, 0F, 0F, -1.35F, 0F, 0F, 0F, 0.05F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, 0.05F, 0.1F); // Box 161
		bodyModel[138].setRotationPoint(-36F, -57.15F, -2.05F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.05F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, 0.3F, 0F, -0.05F, 0.3F, 0F, -0.95F, 0F, -0.5F, -0.95F, 0F, -0.5F, -0.95F, 0.3F, 0F, -0.95F, 0.3F); // Box 162
		bodyModel[139].setRotationPoint(-26.25F, -62F, -1.15F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 9, 2, 16, 0F,-0.15F, 0F, -1.2F, -0.07F, 0F, -1.47F, -0.07F, 0F, -1.47F, -0.15F, 0F, -1.2F, 0F, 0F, -0.25F, -2.5F, 0.05F, -0.37F, -2.5F, 0.05F, -0.37F, 0F, 0F, -0.25F); // Box 163
		bodyModel[140].setRotationPoint(-10.55F, -54.4F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.05F, 0F, -0.35F, -0.57F, -0.15F, -0.54F, -0.57F, -0.15F, -0.25F, -0.05F, 0F, -0.5F, 0F, -0.3F, 0F, -1.22F, -0.3F, -0.27F, -1.2F, -0.3F, -0.3F, 0F, -0.3F, -0.85F); // Box 164
		bodyModel[141].setRotationPoint(-10.4F, -55.1F, -6.8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.4F, 0F, -0.8F, -0.05F, -0.15F, -0.75F, -0.05F, -0.35F, -0.05F, -0.4F, -0.2F, -0.05F, -0.05F, -0.55F, 1.45F, -0.4F, -0.5F, 1.4F, -0.4F, -0.5F, -2.25F, -0.05F, -0.55F, -2.3F); // Box 165
		bodyModel[142].setRotationPoint(-10.4F, -59.55F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1.45F, 0F, -0.45F, -1.6F, 0.05F, -0.3F, 0.08F, -0.35F, -0.15F, 0.25F, -0.35F, 0F, 0.65F, -0.15F, -0.45F, 0.8F, -0.15F, -0.3F, -0.85F, -0.3F, -0.15F, -1.05F, -0.3F); // Box 166
		bodyModel[143].setRotationPoint(-10F, -61F, -4.2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.15F, 0.25F, -0.35F, -0.3F, 0.08F, -0.35F, -0.45F, -1.6F, 0.05F, 0F, -1.45F, 0F, -0.15F, -1.05F, -0.3F, -0.3F, -0.85F, -0.3F, -0.45F, 0.8F, -0.15F, 0F, 0.65F, -0.15F); // Box 167
		bodyModel[144].setRotationPoint(-10F, -61F, 1.2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.4F, -0.2F, -0.05F, -0.05F, -0.35F, -0.05F, -0.05F, -0.15F, -0.75F, -0.4F, 0F, -0.8F, -0.05F, -0.55F, -2.3F, -0.4F, -0.5F, -2.25F, -0.4F, -0.5F, 1.4F, -0.05F, -0.55F, 1.45F); // Box 168
		bodyModel[145].setRotationPoint(-10.4F, -59.55F, 4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.05F, 0F, -0.5F, -0.57F, -0.15F, -0.25F, -0.57F, -0.15F, -0.54F, -0.05F, 0F, -0.35F, 0F, -0.3F, -0.85F, -1.2F, -0.3F, -0.3F, -1.22F, -0.3F, -0.27F, 0F, -0.3F, 0F); // Box 169
		bodyModel[146].setRotationPoint(-10.4F, -55.1F, 5.8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,-0.15F, 0.05F, 0.05F, 0.25F, -0.95F, 0.05F, 0.25F, -0.95F, 0.05F, -0.15F, 0.05F, 0.05F, -0.15F, -0.85F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, -0.15F, -0.85F, 0F); // Box 170
		bodyModel[147].setRotationPoint(-10F, -61.2F, -1.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,-0.5F, -0.4F, -3.55F, -0.3F, -0.4F, -3.55F, -0.3F, -0.4F, -3.55F, -0.5F, -0.4F, -3.55F, -0.15F, 0F, 0.4F, -0.7F, 0F, 0.4F, -0.7F, 0F, 0.4F, -0.15F, 0F, 0.4F); // Box 171
		bodyModel[148].setRotationPoint(-10.55F, -59.4F, -5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.2F, 0.05F, -0.05F, -0.6F, 0.05F, -0.05F, -0.6F, 0.05F, -0.05F, -0.2F, 0.05F, -0.05F, 0F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 172
		bodyModel[149].setRotationPoint(-10.05F, -61F, -1.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[150].setRotationPoint(-11.05F, -61F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 10, 10, 0F,-1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 174
		bodyModel[151].setRotationPoint(-12.8F, -52F, -4.9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,-0.65F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.95F, -0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.95F, -0.25F, -0.2F); // Box 175
		bodyModel[152].setRotationPoint(-23F, -38F, -5.85F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 176
		bodyModel[153].setRotationPoint(-13F, -41F, -5.85F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0.1F, -0.3F, -0.2F, -0.65F, -0.35F, -0.2F, -0.65F, -0.35F, -0.2F, 0.1F, -0.3F, -0.2F, -0.65F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.65F, 0F, -0.2F); // Box 177
		bodyModel[154].setRotationPoint(-23F, -40F, -5.85F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,-0.35F, -0.85F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.3F, -0.35F, -0.85F, -0.3F, -1.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.3F, -1.5F, -0.5F, -0.3F); // Box 179
		bodyModel[155].setRotationPoint(-23F, -40.5F, -5.85F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,-0.35F, -0.85F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.3F, -0.35F, -0.85F, -0.3F, -1.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.3F, -1.5F, -0.5F, -0.3F); // Box 180
		bodyModel[156].setRotationPoint(-23F, -40.5F, 5.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[157].setRotationPoint(-26.5F, -48F, -0.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 9, 5, 6, 0F,0F, 0F, -0.8F, -1.3F, 0F, -0.85F, -4.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.05F, 0F, 0F, -0.05F, -2.95F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 182
		bodyModel[158].setRotationPoint(-35.8F, -51.4F, -8.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 9, 5, 6, 0F,0F, 0F, -0.3F, -4.2F, 0F, -0.3F, -1.3F, 0F, -0.85F, 0F, 0F, -0.8F, 0F, 0F, -0.3F, -2.95F, 0F, -0.3F, 0F, 0F, -0.05F, 0F, 0F, 0.05F); // Box 183
		bodyModel[159].setRotationPoint(-35.8F, -51.4F, 2.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F,0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.55F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 184
		bodyModel[160].setRotationPoint(-35F, -55.9F, -2.8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 185
		bodyModel[161].setRotationPoint(-35F, -51.4F, -2.8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -0.65F, 0.2F, -0.4F, -0.65F, 0.2F, -0.4F, -1.8F, -0.5F, 0F, -1.8F, -0.5F); // Box 186
		bodyModel[162].setRotationPoint(-15.45F, -60.65F, -3.65F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.15F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0.3F, 0F, 0.15F, 0.3F, 0F, -0.95F, 0F, -0.4F, -0.95F, 0F, -0.4F, -0.95F, 0.3F, 0F, -0.95F, 0.3F); // Box 187
		bodyModel[163].setRotationPoint(-15.45F, -61.5F, -1.15F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1.8F, -0.5F, -0.4F, -1.8F, -0.5F, -0.4F, -0.65F, 0.2F, 0F, -0.65F, 0.2F); // Box 188
		bodyModel[164].setRotationPoint(-15.45F, -60.65F, 0.65F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, -0.7F, -0.5F, 0.2F, -0.7F, -0.17F, -0.3F, 0F, 0.22F, -0.45F, 0F, -0.65F, 0F, -0.7F, -0.15F, 0.2F, -0.7F, -0.53F, -0.3F, 0F, -0.9F, -0.45F); // Box 189
		bodyModel[165].setRotationPoint(-25.75F, -61.15F, -3.65F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0.2F, -0.13F, -0.84F, 0.15F, -0.08F, -0.3F, -0.3F, 0F, 0.32F, -0.35F, 0F, -0.65F, 0.2F, -0.15F, 0.14F, 0.15F, -0.08F, -0.43F, -0.3F, 0F, -1F, -0.35F); // Box 190
		bodyModel[166].setRotationPoint(-14.85F, -60.65F, -3.65F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, -0.75F, 3.9F, -0.4F, -0.75F, 3.9F, -0.4F, -0.75F, -4.6F, 0F, -0.75F, -4.6F); // Box 191
		bodyModel[167].setRotationPoint(-15.45F, -60.65F, -3.85F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, -0.35F, -1F, -0.4F, -0.35F, -1F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -4.6F, -0.4F, -0.75F, -4.6F, -0.4F, -0.75F, 3.9F, 0F, -0.75F, 3.9F); // Box 192
		bodyModel[168].setRotationPoint(-15.45F, -60.65F, 2.85F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.32F, -0.35F, -0.08F, -0.3F, -0.3F, -0.13F, -0.84F, 0.15F, 0F, 0F, 0.2F, 0F, -1F, -0.35F, -0.08F, -0.43F, -0.3F, -0.15F, 0.14F, 0.15F, 0F, -0.65F, 0.2F); // Box 193
		bodyModel[169].setRotationPoint(-14.85F, -60.65F, 2.65F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0.22F, -0.45F, -0.7F, -0.17F, -0.3F, -0.7F, -0.5F, 0.2F, 0F, 0F, 0F, 0F, -0.9F, -0.45F, -0.7F, -0.53F, -0.3F, -0.7F, -0.15F, 0.2F, 0F, -0.65F, 0F); // Box 194
		bodyModel[170].setRotationPoint(-25.75F, -61.15F, 2.65F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[171].setRotationPoint(-61.8F, -34.7F, -54.95F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 108
		yawFlapModel[1] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 109
		yawFlapModel[2] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 110
		yawFlapModel[3] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 111
		yawFlapModel[4] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 112
		yawFlapModel[5] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 113

		yawFlapModel[0].addShapeBox(-5F, 0F, -1F, 5, 8, 2, 0F,-0.2F, -2.35F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, -0.2F, -2.35F, -0.75F, -0.2F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.2F, -0.75F, -0.25F); // Box 108
		yawFlapModel[0].setRotationPoint(95.5F, -78.5F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -1F, 9, 8, 2, 0F,0F, 0F, -1F, -3.35F, -2.5F, -1F, -3.35F, -2.5F, -1F, 0F, 0F, -1F, 0F, -0.75F, -0.25F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -0.25F); // Box 109
		yawFlapModel[1].setRotationPoint(95.5F, -78.5F, 0F);

		yawFlapModel[2].addShapeBox(0F, 0F, -1F, 11, 21, 2, 0F,0F, 0F, -0.25F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -0.25F, 0F, -0.5F, 0.35F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.35F); // Box 110
		yawFlapModel[2].setRotationPoint(95.5F, -71.25F, 0F);

		yawFlapModel[3].addShapeBox(0F, 0F, -1F, 11, 14, 2, 0F,0F, 0F, 0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.35F, 0F, -0.7F, 0.5F, -0.5F, -0.7F, -1F, -0.5F, -0.7F, -1F, 0F, -0.7F, 0.5F); // Box 111
		yawFlapModel[3].setRotationPoint(95.5F, -50.75F, 0F);

		yawFlapModel[4].addShapeBox(0F, 0F, -1F, 11, 2, 2, 0F,0F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.3F, -1.4F, -0.5F, -1F, -1.4F, -0.5F, -1F, 0F, -0.5F, 0.3F); // Box 112
		yawFlapModel[4].setRotationPoint(95.5F, -37.45F, 0F);

		yawFlapModel[5].addShapeBox(0F, 0F, -1F, 10, 1, 2, 0F,0F, 0F, 0.3F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0F, 0F, 0.3F, 0F, -0.4F, -0.3F, -2.5F, -0.5F, -1F, -2.5F, -0.5F, -1F, 0F, -0.4F, -0.3F); // Box 113
		yawFlapModel[5].setRotationPoint(95.5F, -35.95F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 601, 121, textureX, textureY); // Box 109

		pitchFlapLeftModel[0].addShapeBox(0F, -0.4F, 0F, 8, 1, 41, 0F,-0.05F, 0.5F, -0.25F, 0F, -0.5F, -4.25F, -3.3F, -0.5F, 0F, 0F, 0F, 0F, -0.05F, 0.4F, -0.3F, 0F, -0.5F, -4.25F, -3.3F, -0.5F, 0F, 0F, 0.1F, 0F); // Box 109
		pitchFlapLeftModel[0].setRotationPoint(92.7F, -48.2F, 1.25F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 107

		pitchFlapRightModel[0].addShapeBox(0F, -0.4F, -41F, 8, 1, 41, 0F,0F, 0F, 0F, -3.3F, -0.5F, 0F, 0F, -0.5F, -4.25F, -0.05F, 0.5F, -0.25F, 0F, 0.1F, 0F, -3.3F, -0.5F, 0F, 0F, -0.5F, -4.25F, -0.05F, 0.4F, -0.3F); // Box 107
		pitchFlapRightModel[0].setRotationPoint(92.7F, -48.2F, -1.25F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 134
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 135
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 136
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 137
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 138
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 139
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 140

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 134
		leftWingWheelModel[0].setRotationPoint(-49F, -32F, -51.05F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 11, 10, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 135
		leftWingWheelModel[1].setRotationPoint(-49F, -16F, -51.05F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 10, 1, 0F,-3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.95F, -3F, 0F, -0.95F, -0.1F, 0F, 0F, 0.5F, -3.1F, 0F, 0.5F, -3.1F, -0.95F, -0.1F, 0F, -0.95F); // Box 136
		leftWingWheelModel[2].setRotationPoint(-52F, -6F, -51.05F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		leftWingWheelModel[3].setRotationPoint(-52F, -6F, -50.95F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		leftWingWheelModel[4].setRotationPoint(-52F, -1F, -50.95F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 139
		leftWingWheelModel[5].setRotationPoint(-52F, 4F, -50.95F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		leftWingWheelModel[6].setRotationPoint(-45.5F, -32F, -49.95F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 141
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 142
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Box 143
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Box 144
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 809, 89, textureX, textureY); // Box 145
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 146
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 147

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		rightWingWheelModel[0].setRotationPoint(-45.5F, -32F, 47.95F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		rightWingWheelModel[1].setRotationPoint(-52F, -6F, 46.95F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		rightWingWheelModel[2].setRotationPoint(-52F, -1F, 46.95F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 144
		rightWingWheelModel[3].setRotationPoint(-52F, 4F, 46.95F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 15, 10, 1, 0F,-3F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -3F, 0F, 0F, -0.1F, 0F, -0.95F, 0.5F, -3.1F, -0.95F, 0.5F, -3.1F, 0F, -0.1F, 0F, 0F); // Box 145
		rightWingWheelModel[4].setRotationPoint(-52F, -6F, 50.05F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 11, 10, 1, 0F,0F, 0F, -0.95F, -5F, 0F, -0.95F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		rightWingWheelModel[5].setRotationPoint(-49F, -16F, 50.05F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		rightWingWheelModel[6].setRotationPoint(-49F, -32F, 50.05F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-94F, -39F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 170, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 170, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 170, textureX, textureY);
		prop[0].addBox(-0.5F, -37F, -2F, 1, 37, 4, 0.0F);
		prop[1].addBox(-0.5F, -37F, -2F, 1, 37, 4, 0.0F);
		prop[2].addBox(-0.5F, -37F, -2F, 1, 37, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}
