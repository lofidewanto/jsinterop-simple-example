package com.github.lofi.client;

import java.util.List;
import java.util.logging.Logger;

import jsinterop.annotations.JsType;

@JsType(namespace = "Calculator")
public class Calculator {
	
	private static Logger logger = Logger
			.getLogger(Calculator.class.getName());

	public Calculator() {
		logger.info("Calculator...");
	}

	public int calculateSum(List<Integer> values) {
		int sum = values.stream().mapToInt(Integer::intValue).sum();
		return sum;
	}

}