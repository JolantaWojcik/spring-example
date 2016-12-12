package pl.kurs.spring.service;

import org.springframework.stereotype.Service;

import pl.kurs.spring.anotacje.BlockIfNegative;

@Service("modulo")
public class ModuloOperator implements Operator {

	@Override
	public double calculate(double a, double b) {
		return a % b;
	}

	@Override
	public String operator() {
		return "%";
	}

}
