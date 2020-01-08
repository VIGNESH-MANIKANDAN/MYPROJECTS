package com.interfaceCase1;

public class Canvas 
{
	public Canvas(String typeOfPaint, int canvasSize) {
		super();
		this.typeOfPaint = typeOfPaint;
		this.canvasSize = canvasSize;
	}
	String           typeOfPaint;
	int              canvasSize;
	public String getTypeOfPaint() {
		return typeOfPaint;
	}
	public void setTypeOfPaint(String typeOfPaint) {
		this.typeOfPaint = typeOfPaint;
	}
	public int getCanvasSize() {
		return canvasSize;
	}
	public void setCanvasSize(int canvasSize) {
		this.canvasSize = canvasSize;
	}

}
