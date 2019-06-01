package com.github.lofi;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.github.lofi.client.Calculator;

public class CalculatorTest {

	private Calculator calculator;

	public CalculatorTest() {
		this.calculator = new Calculator();
	}

	@Test
	public void testApp() {
		assertNotNull(calculator);
	}
}
