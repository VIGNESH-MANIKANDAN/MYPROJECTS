package com.interfaceCase1;

public class GlassCanvas extends Canvas implements IPaint 
{
   
	public GlassCanvas(String typeOfPaint, int canvasSize) {
		super(typeOfPaint, canvasSize);
		// TODO Auto-generated constructor stub
	}

	public void paint()
	  {if(this.typeOfPaint.equalsIgnoreCase("glass")==true)
	  {
		  System.out.println("\nA Hour glassr will be painted in canvas of size "+this.canvasSize);
	  }
	  else
	  {
		  System.out.println("Cannot paint Type mismatch. Glass Paints required for glass Canvas");
	  }
		  
	  }
}
