package pl.kurs.spring.service;

import pl.kurs.spring.anotacje.BlockIfNegative;

public interface Operator {
	@BlockIfNegative
	double calculate(double a, double b);
	String operator();
}
