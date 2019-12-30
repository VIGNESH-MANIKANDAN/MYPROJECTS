package Team_setterAndGetter_package;

public class Team 
{
	String TeamName,cityrepresented;
	public void setTeamName(String tname)
	{
		this.TeamName=tname;
	}
	public void setcityrepresented(String city)
	{
		this.cityrepresented=city;
	}
	public String getTeamName()
	{
		return this.TeamName;
	}
	public String getcityrepresented()
	{
		return this.cityrepresented;
	}
	public void display()
	{
		System.out.println("Teamname :"+this.getTeamName());
		System.out.println("City :"+this.getcityrepresented());
	}
	

}
