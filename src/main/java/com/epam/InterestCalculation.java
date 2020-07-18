package com.epam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class InterestCalculation {
	private static final Logger logger = LogManager.getLogger(InterestCalculation.class.getName());
	double SimpleInterest(double principal,double rate,double time)
	{
		logger.info("Simple Interest is being Calculated:"+(principal*time*rate)/100);
		return (principal*time*rate)/100;
	}
	double CompoundInterest(double principal,double rate,double time)
	{
		logger.info("Compound Interest is being Calculated:"+(principal*(Math.pow((1+rate/100),time))));
		return (principal*(Math.pow((1+rate/100),time)));
	}

}
