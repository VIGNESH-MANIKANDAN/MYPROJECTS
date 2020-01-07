
public class DarkStar extends Star
{
	int            calculateYearsRemaining   (int currentAge)
	{
		int num=1,i,flag=1,count=0,ans=0;
		while(count<this.decayIndex)
		{
			num=num+1;
			flag=1;
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				count++;
			}
			
		}
		ans=ans+num;
		return ans-currentAge;
	}
	DarkStar()
	{
		super();
	}
	
}
