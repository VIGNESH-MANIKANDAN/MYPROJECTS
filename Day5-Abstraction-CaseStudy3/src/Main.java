import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int age,energy,ch;;
		Scanner s=new Scanner(System.in);
		System.out.println("\r\n" + 
				"1.Plasma Star\r\n" + 
				"\r\n" + 
				"2.Radium Star\r\n" + 
				"\r\n" + 
				"3.Dark Star\r\n" + 
				"\r\n" + 
				"Enter choice: ");
		ch=s.nextInt();
		 
				System.out.println("Enter Age : "); 
		age=s.nextInt();
			
				System.out.println("Enter energy consumed: " );
				energy=s.nextInt();
				switch(ch)
				{
				case 1:
					PlasmaStar p=new PlasmaStar();
					p.calculateEmissionRate(age, energy);
					p.displaystardetail(age, energy);
					break;
				case 2:
					RadiumStar r=new RadiumStar();
					r.calculateEmissionRate(age, energy);
					r.displaystardetail(age, energy);
					break;
				case 3:
					DarkStar d=new DarkStar();
					d.calculateEmissionRate(age, energy);
					d.displaystardetail(age, energy);
					break;
				}
				

	}

}
