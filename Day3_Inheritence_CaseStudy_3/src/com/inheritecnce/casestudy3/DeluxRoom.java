package com.inheritecnce.casestudy3;

public class DeluxRoom extends HotelRoom 
{

	public DeluxRoom() 
	{
		super();
		//this.ratePerSqClaw=10;
		if(this.hasWifi==true)
		{
			this.ratePerSqClaw=this.ratePerSqClaw+10;
		}
		else
		{
			this.ratePerSqClaw=this.ratePerSqClaw;
		}
	}
	public int getRateperSqClaw()
	{
		
		
				return this.ratePerSqClaw;
		
	}
	

}
