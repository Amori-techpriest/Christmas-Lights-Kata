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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ChristmasLightsTests {
	@Test
	void TurnOnAllLightsTest(){
		ChristmasLights christmasLights = new ChristmasLights();
		assertEquals(1000000, christmasLights.TurnOnAllLights(), 
		"turns on all lights");
	}
	@Test 
	void ToggleFirstOneThousandLights(){
		ChristmasLights christmasLights = new ChristmasLights();
		assertEquals(1000, christmasLights.ToggleFirstOneThousandLights(0, 0, 999, 0), 
		"toggles first 1000 lights");
	}
	void TurnOnFirstHalfOfLights(){
		ChristmasLights christmasLights = new ChristmasLights();
		assertEquals(500000, christmasLights.TurnOnFirstHalfOfLights(0, 0, 499, 999),
		"turns on first half of lights");
	}
	@Test
    public void TestOutOfArrayException() throws Exception {
        ChristmasLights christmasLights = new ChristmasLights();
        assertThrows(ChristmasLights.OutOfArrayExeption.class, 
            () -> {christmasLights.ToggleLights(0,0,1500,1200);},
            "Turn on lights out of array bounds should throw exception" 
            );
    }
}
