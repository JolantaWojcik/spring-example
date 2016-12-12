package pl.kurs.spring.service;

import org.springframework.stereotype.Service;

@Service
public class ToPowerOperator implements Operator{

	@Override
	public double calculate(double a, double b) {
		// TODO Auto-generated method stub
		return Math.pow(a, b);
	}

	@Override
	public String operator() {
		// TODO Auto-generated method stub
		return "^";
	}

}
