import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
	   int ch;
	   String sname;
	   Scanner s=new Scanner(System.in);
	   System.out.println("1.Star Door\r\n" + 
	   		"\r\n" + 
	   		"2.Gas Door\r\n" + 
	   		"\r\n" + 
	   		"3.Liquid Door\r\n" + 
	   		"\r\n" + 
	   		"Enter choice: ");
	   ch=s.nextInt();
	   System.out.println("Enter name");
	   sname=s.next();
	   switch(ch)
	   {
	   case 1:
		   StarDoor star=new StarDoor(sname);
		   star.unlock();
		   break;
	   case 2:
		   GasDoor gas=new GasDoor(sname);
		   gas.unlock();
		   break;
	   case 3:
		   LiquidDoor l=new LiquidDoor(sname);
		   l.unlock();
		   break;
	   }
	   

	}

}
