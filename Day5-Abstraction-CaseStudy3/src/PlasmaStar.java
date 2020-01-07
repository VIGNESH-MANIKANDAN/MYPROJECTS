
public class PlasmaStar extends Star 

{
	int ans;
	int            calculateYearsRemaining   (int currentAge)
	{
		int a=0,b=1,sum=0;
		for(int i=1;i<=currentAge;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			
		}
		return sum-currentAge;
	}
	PlasmaStar()
	{
		super();
		
	}
}
