package com.overloading.casestudy2;

public class Machine 
{
	float  energyReserve;
	public void addEnergy(float energy)
	{
		this.energyReserve+=energy;
	}
	public void             runFan           (float remainingEnergy)
	{
		if(this.energyReserve>100)
			System.out.printf("Extra energy %f is used to run the fan,fan running",(this.energyReserve-100));
		else
			System.out.printf("Not enough energy to run the fan , Machine has only %f energy(less than 100)",(this.energyReserve));
	}
	Machine(int i)
	{
		this.energyReserve=i;
	}

}
