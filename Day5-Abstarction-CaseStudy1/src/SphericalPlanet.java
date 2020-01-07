
public class SphericalPlanet extends Planet
{
	public SphericalPlanet(String planetName, float a) {
		super(planetName);
		// TODO Auto-generated constructor stub
	}
	float              radius;
	public float calculateVolume() 
	{
		return (float) (1.3*3.14*radius*radius*radius);
		
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
}
