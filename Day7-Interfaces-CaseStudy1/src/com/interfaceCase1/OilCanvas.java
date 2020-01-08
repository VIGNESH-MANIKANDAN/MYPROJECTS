package com.interfaceCase1;

public class OilCanvas extends Canvas implements IPaint 
{

	public OilCanvas(String typeOfPaint, int canvasSize) {
		super(typeOfPaint, canvasSize);
		// TODO Auto-generated constructor stub
	}

	public void paint()
	  {
		if(this.typeOfPaint.equalsIgnoreCase("oilr")==true)
		  {
			  System.out.println("A windmill will be painted in canvas of size "+this.canvasSize);
		  }
		  else
		  {
			  System.out.println("Cannot paint Type mismatch. Oil Paints required for oil Canvas");
		  }
	  }
}
