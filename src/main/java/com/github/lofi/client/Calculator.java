package com.github.lofi.client;

import java.util.List;
import java.util.logging.Logger;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name = "Calculator")
public class Calculator {

	private static Logger logger = Logger.getLogger(Calculator.class.getName());

	public Calculator() {
		logger.info("Calculator...");
	}

	public int calculateSum(List<Integer> values) {
		if (values != null) {
			logger.info("Values: " + values.size());
			int sum = values.stream().mapToInt(Integer::intValue).sum();
			return sum;
		} else {
			logger.info("Values: null");
			return 0;
		}
	}

}