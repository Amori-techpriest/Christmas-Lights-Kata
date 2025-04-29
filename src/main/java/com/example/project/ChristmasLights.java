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
		private boolean lights [][] = new boolean [rows][columns];
		public int TurnOnAllLights(){
			if (totalLightsOn < 1000000){
				for(int rowCounter = 0; rowCounter < rows; rowCounter++){
					for(int columnCounter = 0; columnCounter < columns; columnCounter++){
						if (!lights[rowCounter][columnCounter]){
							lights[rowCounter][columnCounter] = true;
							totalLightsOn++;
						}
					}
				}
			}
			return totalLightsOn;
		}
		public int ToggleFirstOneThousandLights(int startRows, int startColumns, int endRows, int endColumns){
			for(int rowCounter = startRows; rowCounter <= endRows; rowCounter++){
				for(int columnCounter = startColumns; columnCounter <= endColumns; columnCounter++) {
					if(lights[rowCounter][columnCounter]){
						totalLightsOn--;
					}
					else{
						totalLightsOn++;
					}
					lights[rowCounter][columnCounter] = !lights[rowCounter][columnCounter];
				}
			}
			return totalLightsOn;
		}
		public int TurnOnFirstHalfOfLights(int startRows, int startColumns, int endRows, int endColumns){
			for(int rowCounter = startRows; rowCounter <= endRows; rowCounter++){
				for(int columnCounter = startColumns; columnCounter <= endColumns; columnCounter++){
					if (!lights[rowCounter][columnCounter]) {
							lights[rowCounter][columnCounter] = true;
							totalLightsOn++;	
					}
				}

			}
			return totalLightsOn;
		}
		public int ToggleLights(int startRow, int startColumn, int endRow, int endColumn) throws OutOfArrayExeption {
			if (startRow < 0 || startRow >= rows || endRow < 0 || endRow >= rows || startColumn < 0 || startColumn >= columns|| endColumn < 0 || endColumn >= columns) {
				throw new OutOfArrayExeption();
			}
			for (int rowCounter = startRow; rowCounter <= endRow; rowCounter++) {
				for (int columnCounter = startColumn; columnCounter <= endColumn; columnCounter++) {
					if (lights[rowCounter][columnCounter]) {
						totalLightsOn--;
					} else {
						totalLightsOn++;
					}
					lights[rowCounter][columnCounter] = !lights[rowCounter][columnCounter];
				}
			}
			return totalLightsOn;
		}
		public class OutOfArrayExeption extends Exception {
		}

	}

