package com.overloading.casestudy2;

public class Cat extends Machine
{
	public Cat(int i) {
		super(i);
	}
	public float   generateEnergy   (float jumpHeight)
	{
		float energy=(float)((jumpHeight/10.75)*7.2);
		this.addEnergy(energy);
		return energy;
	}
	public float   generateEnergy   (int distance)
	{
		float energy=(float)((distance/172)*12.35);
		this.addEnergy(energy);
		return energy;
	}
	public float   generateEnergy   (String sounds)
	{
		String s[]=sounds.split(",");
		int count=0;
		float energy=0;
		System.out.println(s.length);
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals("meow")==true)
			{
				count++;
			}
			System.out.println(s[i]);
		}
		System.out.println("count: "+count);
		if(count>=5)
		   energy=(float)(count/5.0)*15;
		this.addEnergy(energy);
		return energy;
		
		
	
	}
	
}
