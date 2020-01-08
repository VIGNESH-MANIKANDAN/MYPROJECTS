package com.interface2;

public class Expo 
{
	public Expo() {
		list=new Painting[3];
		list[0]=new Painting((float)100,"Water");
		list[1]=new Painting((float)200,"Oil");
		list[2]=new Painting((float)100,"Canvas");
		
		
		
	
		//display();
	}
	Painting[]      list;
	public void display()
	{
	    int i=0;
	    System.out.println("Base prices of Paint");
	    for(i=0;i<3;i++)
	    {
	    	System.out.printf("\n%s\t%f ",this.list[i].typeOfPainting,this.list[i].value);
	    	
	    }
	}
}
