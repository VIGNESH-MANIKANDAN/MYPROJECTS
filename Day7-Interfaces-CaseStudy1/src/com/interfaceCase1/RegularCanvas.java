package com.interfaceCase1;

public class RegularCanvas extends Canvas implements IPaint 
{
  public RegularCanvas(String typeOfPaint, int canvasSize) {
		super(typeOfPaint, canvasSize);
		// TODO Auto-generated constructor stub
	}

public void paint()
  {
	  if(this.typeOfPaint.equalsIgnoreCase("water")==true)
	  {
		  System.out.println("\nA flower will be painted in canvas of size "+this.canvasSize);
	  }
	  else
	  {
		  System.out.println("Cannot paint Type mismatch. Water Paints required for Regular Canvas");
	  }
		  
  }
}
