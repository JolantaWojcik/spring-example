package pl.kurs.spring.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperatorSolver {

	// wstrzyknie mi wszystkie beany z kontekstu ktore implementuja interfejs
	// operator
	@Autowired
	private Set<Operator> operators;

	private Map<String, Operator> operatorMap;

	// adnotacja @postConstruct daje ten sam efekt co init-method w xml'u
	@PostConstruct
	public void initBean() {
		operatorMap = new HashMap<>();
		operators.forEach(o -> operatorMap.put(o.operator(), o));
	}

	public double calculate(String source) {
		String[] args = source.split(" ");
		return operatorMap.get(args[1]).calculate(Double.parseDouble(args[0]), Double.parseDouble(args[2]));
	}
}
