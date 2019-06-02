package com.github.lofi.client;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL)
public class Calculator {

	private static Logger logger = Logger.getLogger(Calculator.class.getName());

	public Calculator() {
		logger.info("Calculator...");
	}

	public double calculateSum(Double[] values) {
		List<Double> integers = Arrays.asList(values);
		if (values != null) {
			logger.info("Values: " + integers.size());
			Double sum = integers.stream().mapToDouble(Double::doubleValue).sum();
			return sum;
		} else {
			logger.info("Values: null");
			return 0.0;
		}
	}

}