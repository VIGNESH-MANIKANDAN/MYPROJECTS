
public class ConicalPlanet extends Planet
{
	public ConicalPlanet(String pname,float radius, float height) {
		super(pname);
		this.radius = radius;
		this.height = height;
	}
	float              radius,height;
	public float calculateVolume() 
	{
		return (float)(3.14*radius*radius*radius*(height/3));
		
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

}
