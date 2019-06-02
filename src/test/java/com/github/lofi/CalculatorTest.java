package com.github.lofi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.logging.Logger;

import com.github.lofi.client.Calculator;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private static Logger logger = Logger.getLogger(CalculatorTest.class.getName());

	private Calculator calculator;

	public CalculatorTest() {
		this.calculator = new Calculator();
	}

	@Test
	public void calculateSum() {
		assertNotNull(calculator);

		Integer[] values = { 12, 14 };

		int result = calculator.calculateSum(values);
		assertEquals(26, result);

		logger.info("Result: " + result);
	}

	@Test
	public void calculateSum_With_Null() {
		assertNotNull(calculator);

		Integer[] values = {};

		int result = calculator.calculateSum(values);
		assertEquals(0, result);

		logger.info("Result: " + result);
	}
}
