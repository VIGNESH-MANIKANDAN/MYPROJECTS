import java.util.Scanner;

public class StarDoor extends Door
{
	int  numberOfStars;
	public StarDoor(String sname) 
	{
		super(sname);
		Scanner s=new Scanner(System.in);
		   System.out.println("Enter stars");
		   this.numberOfStars=s.nextInt();
	}
	public void unlock()
	{
		for(int i=this.numberOfStars;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=this.numberOfStars;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		}
		
	}


