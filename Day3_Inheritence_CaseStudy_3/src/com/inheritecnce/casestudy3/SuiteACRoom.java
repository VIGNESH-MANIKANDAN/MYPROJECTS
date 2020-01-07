package com.inheritecnce.casestudy3;

public class SuiteACRoom extends HotelRoom
{
	public SuiteACRoom() 
	{
		super();
		if(this.hasWifi==true)
		{
			this.ratePerSqClaw+=10;
		}
	if(this.hasAC==true)
		{
			this.ratePerSqClaw+=50;
		}
		
	}
	public int getRateperSqClaw()
	{
		if(this.hasWifi==true)
		{
			this.ratePerSqClaw+=10;
		}
	if(this.hasAC==true)
		{
			this.ratePerSqClaw+=50;
		}
	return this.ratePerSqClaw;
	}
}
