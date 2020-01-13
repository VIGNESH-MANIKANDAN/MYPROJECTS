

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		int ch,op;
		Scanner s=new Scanner(System.in);
		System.out.println("Are you a Regular user(1) or Premium User(2) ");
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("1.Booking 2.Cancellation:");
			op=s.nextInt();
			RegularUser regular=new RegularUser();
			Booking details=new Booking();
			if(op==1)
			{ 
				String str;
				System.out.println("Please enter all your name,email,mobilenumber separater by :");
				str=s.next();
				regular.updateDetails(str);
			    System.out.println("Please pay rs "+regular.bookroom(details) );
			}
			else
			{
				System.out.println("50% amount rs "+ regular.cancelBooking("8/1/2020")+"is refunded");
			}
			break;
		case 2:
			System.out.println("1.Booking 2.Cancellation:");
			op=s.nextInt();
			PremiumUser pre=new PremiumUser();
			Booking det=new Booking();
			if(op==1)
			{ 
				String str;
				System.out.println("Please enter all your name,email,mobilenumber separater by :");
				str=s.next();	
				pre.updateDetails(str);
			    System.out.println("Please pay rs "+pre.bookroom(det) );
			}
			else
			{
				System.out.println("50% amount rs "+ pre.cancelBooking("8/1/2020")+"is refunded");
			}
			break;
			
			}
				
		}

	

}
