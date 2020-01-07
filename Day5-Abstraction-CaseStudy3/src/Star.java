import java.util.Scanner;

abstract public class Star 
{
	String         starName;
	String         constellationName;
	int            decayIndex;
	int            energyToEmit;
	float result;
	abstract int            calculateYearsRemaining   (int currentAge);
	public float calculateEmissionRate(int age,int emitted)
	{
		result=(float)(energyToEmit-emitted)/((float)(this.calculateYearsRemaining(age)));
		return result;
	
	}
	
	public void displaystardetail(int age,int emited)
	{
		System.out.println("Star details:"+this.starName);
		System.out.println("Constalleation:"+this.constellationName);
		System.out.println("DecayIndex:"+this.decayIndex);
		System.out.println("Energy to emit"+this.result);
	}
	Star()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Star Details\r\n");
		 
				System.out.println("Enter star name: "); 
		this.starName=s.nextLine();
			
				System.out.println("Enter constellation: " );
				this.constellationName=s.nextLine();
				
				System.out.println("Enter decay index: "); 
				this.decayIndex=s.nextInt();
				System.out.println("Enter energy to emit:");
		        this.energyToEmit=s.nextInt();
	}
}
	


