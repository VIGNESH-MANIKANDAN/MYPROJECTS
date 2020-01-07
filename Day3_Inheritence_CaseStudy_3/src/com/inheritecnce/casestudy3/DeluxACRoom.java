package com.inheritecnce.casestudy3;

public class DeluxACRoom extends DeluxRoom
{
	public DeluxACRoom() 
	{
		super();
		if(this.hasAC==true)
		{
			this.ratePerSqClaw=this.ratePerSqClaw+50;
		}
		else
		{
		   this.ratePerSqClaw=this.ratePerSqClaw;
		}

	}
	public int getRateperSqClaw()
	{
		if(this.hasAC==true)
		{
			return this.ratePerSqClaw+50;
		}
		else
		{
			return this.ratePerSqClaw;
		}
	}
}
