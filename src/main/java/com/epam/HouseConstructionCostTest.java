package com.epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseConstructionCostTest {

	@Test
	public void testCost() {
		HouseConstructionCost h=new HouseConstructionCost();
		assertEquals(12000.0,h.counstructionCost("StandardMaterials",10.0,false),0);
	}
	@Test
	public void testCost1() {
		HouseConstructionCost h=new HouseConstructionCost();
		assertEquals(22500.0,h.counstructionCost("Above_standardMaterials",15.0,false),0);
	}
	@Test
	public void testCost2() {
		HouseConstructionCost h=new HouseConstructionCost();
		assertEquals(18000.0,h.counstructionCost("High_standardMaterials",10.0,false),0);
	}
	@Test
	public void testCost3() {
		HouseConstructionCost h=new HouseConstructionCost();
		assertEquals(25000.0,h.counstructionCost("High_standardMaterials",10.0,true),0);
	}
}
