package com.epam;

import org.junit.Test;

import junit.framework.TestCase;

public class InterestCalculationTest extends TestCase {
	@Test
	public void testSimpleInterest() {
		InterestCalculation ic=new InterestCalculation();
		assertEquals(3500.0,ic.SimpleInterest(10000,7,5),0);
	}
	
	@Test
	public void testCompoundInterest() {
		InterestCalculation ic=new InterestCalculation();
		assertEquals(14025.517307000004,ic.CompoundInterest(10000,7,5),0);
	}

}
