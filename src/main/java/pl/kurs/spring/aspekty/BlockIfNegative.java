package pl.kurs.spring.aspekty;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class BlockIfNegative {

	@Around("@annotation(blockIfNegative)")
	public Object checkNegativeNumbers(ProceedingJoinPoint joinPoint, BlockIfNegative blockIfNegative)
			throws Throwable {
		double[] args = convertToDouble(joinPoint.getArgs());
		boolean hasNegatives = false;
		for (double arg : args) {
			if (arg < 0) {
				hasNegatives = true;
				break;
			}
		}
		if (!hasNegatives) {
			return joinPoint.proceed();
		}
		if(hasNegatives){
			throw new IllegalArgumentException("ERRROR");
		}
		return null;
	}

	private double[] convertToDouble(Object[] args) {
		double[] result = new double[args.length];
		for (int i = 0; i < args.length; i++) {
			result[i] = (double) args[i];
		}
		return result;
	}
}
