
public class RadiumStar extends Star
{
	int ans=0;
	int            calculateYearsRemaining   (int currentAge)
	{
		
		ans=(this.decayIndex*(this.decayIndex+1))/2;
		return ans-currentAge;
				
	}
	RadiumStar()
	{
		super();
	}
}
