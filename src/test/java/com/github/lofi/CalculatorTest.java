package com.github.lofi;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import com.github.lofi.client.Calculator;

public class CalculatorTest {

	private static Logger logger = Logger
			.getLogger(CalculatorTest.class.getName());

	private Calculator calculator;

	public CalculatorTest() {
		this.calculator = new Calculator();
	}

	@Test
	public void calculateSum() {
		assertNotNull(calculator);

		List<Integer> values = new ArrayList<>();
		values.add(12);
		values.add(14);
		
		int result = calculator.calculateSum(values);
		logger.info("Result: " + result);
	}
}
