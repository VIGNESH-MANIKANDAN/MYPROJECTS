
public class CuboidPlanet extends Planet 
{
	public CuboidPlanet(String pname,float radius, float height, float length1) {
		super(pname);
		this.radius = radius;
		this.height = height;
		this.length1 = length1;
	}
	float              radius,height,length1;
	public float calculateVolume() 
	{
		return (float)(radius*height*length1);
		
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getLength1() {
		return length1;
	}
	public void setLength1(float length1) {
		this.length1 = length1;
	}
}
