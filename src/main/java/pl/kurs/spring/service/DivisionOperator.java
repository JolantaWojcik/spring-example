package pl.kurs.spring.service;

import org.springframework.stereotype.Service;

import pl.kurs.spring.anotacje.BlockIfNegative;

@Service("division")
public class DivisionOperator implements Operator{

	@Override
	@BlockIfNegative
	public double calculate(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public String operator() {
		// TODO Auto-generated method stub
		return "/";
	}

}
