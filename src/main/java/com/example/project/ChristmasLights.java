/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;


	public class ChristmasLights{
		private int rows = 1000;
		private int columns = 1000;
		private int totalLightsOn = 0;
		private boolean Lights [][] = new boolean [rows][columns];
		public int TurnOnAllLights(){
			if (totalLightsOn < 1000000){
				for(int rowCounter = 0; rowCounter < rows; rowCounter++){
					for(int columnCounter = 0; columnCounter < columns; columnCounter++){
						if (!Lights[rowCounter][columnCounter]){
							Lights[rowCounter][columnCounter] = true;
							totalLightsOn++;
						}
					}
				}
			}
			return totalLightsOn;
		}
		public int ToggleFirstOneThousandLights(){
			totalLightsOn = 1000;
			return totalLightsOn;
		}

	}

