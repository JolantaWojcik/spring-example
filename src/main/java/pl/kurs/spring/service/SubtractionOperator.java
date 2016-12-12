package pl.kurs.spring.service;

import org.springframework.stereotype.Service;

@Service("subtraction")
public class SubtractionOperator implements Operator {
	@Override
	public double calculate(double a, double b) {
		return a - b;
	}

	@Override
	public String operator() {
		return "-";
	}
}
