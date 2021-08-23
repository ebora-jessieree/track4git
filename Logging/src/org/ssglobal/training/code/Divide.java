package org.ssglobal.training.code;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Divide {
	
	private static Logger logger = Logger.getLogger(Divide.class.getName());

	public Divide() {
		logger.setLevel(Level.INFO);
	}
	
	public int div(int x, int y) throws ArithmeticException, Exception{
		logger.info("Validation: Denominator should not be zero");
		if(y == 0) {
			logger.severe("Error: division by zero not allowed");
			throw new ArithmeticException("Division by zero not allowed");
		}else {
			logger.info("exit without errors div");
			return x / y;
		}
		
	}
}
