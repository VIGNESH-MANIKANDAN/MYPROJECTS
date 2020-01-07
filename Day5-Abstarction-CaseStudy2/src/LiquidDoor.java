import java.util.Scanner;

public class LiquidDoor extends Door
{
   float flowQuotient;
   public LiquidDoor(String sname) 
   {
	   super(sname);
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter flow");
	   this.flowQuotient=s.nextFloat();
	
   }
public void unlock()
   {
	   int n=(int)this.flowQuotient;
	   int count=1;
	   for(int i=2;count<=n;i++)
	   {
		   int flag=1;
		   for(int k = 2;k<=i/2;k++)
		   {
			   if(i%k==0)
			   {
				   flag=0;
				   break;
			   }
		   }
		   if(flag==1)
		   {
			   System.out.print((int)(Math.pow(2, i)-1)+" ");
			   count++;
		   }
		   }
	   }
   }

