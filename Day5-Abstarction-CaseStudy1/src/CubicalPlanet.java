
public class CubicalPlanet extends Planet
{
	public CubicalPlanet(String pname,float side) {
		super(pname);
		this.side = side;
	}
	float              side;
	public float calculateVolume() 
	{
		return (side*side*side);
		
	}
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}

}
