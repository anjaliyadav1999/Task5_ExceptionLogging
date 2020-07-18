package com.epam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseConstructionCost {
	private static final Logger LOGGER = LogManager .getLogger(HouseConstructionCost.class);
	double counstructionCost(String standardType,double area,boolean FullyAutomated)
	{
		double cost=area;
		if(standardType.equals("StandardMaterials") && FullyAutomated==false)
		{
			cost=cost*1200;
		}
		else if(standardType.equals("Above_standardMaterials") && FullyAutomated==false)
		{
			cost=cost*1500;
		}
		else if(standardType.equals("High_standardMaterials") && FullyAutomated==false)
		{
			cost=cost*1800;
		}
		else if(standardType.equals("High_standardMaterials") && FullyAutomated==true)
		{
			cost=cost*2500;
		}
		LOGGER.info("FinalBill:"+cost);
		return cost;
	}
}
