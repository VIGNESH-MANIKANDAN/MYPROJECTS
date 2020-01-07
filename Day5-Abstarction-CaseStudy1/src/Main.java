import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
    {
		int ch;
		float a,b,c;
		String sname;
		double ans=0;
		Scanner s=new Scanner(System.in);
		System.out.println("1.Cuboidal Planet\r\n" + 
				"\r\n" + 
				"2.Spherical Planet\r\n" + 
				"\r\n" + 
				"3.Cubical Planet\r\n" + 
				"\r\n" + 
				"4.Conical Planet\r\n" + 
				"\r\n" + 
				"Enter choice:")		;
          ch=s.nextInt();
          System.out.println("Enter name:");
    	  sname=s.next();

          switch(ch)
          {
          case 1:
        	 
        	  System.out.println("Enter length:");
        	  a=s.nextFloat();
        	  System.out.println("Enter breadth:");
        	  b=s.nextFloat();
        	  System.out.println("Enter Height:");
        	  c=s.nextFloat();
        	  CuboidPlanet cube=new CuboidPlanet(sname,a,b,c);
        	  ans=cube.calculateVolume();
        	  break;
          case 2:
          	 
  
        	  System.out.println("Enter radius:");
        	  a=s.nextFloat();
        	  SphericalPlanet sphere=new SphericalPlanet(sname,a);
        	  ans=sphere.calculateVolume();
        	  break;
          case 3:
           	 
        	  
        	  System.out.println("Enter side:");
        	  a=s.nextFloat();
        	  CubicalPlanet cube1=new CubicalPlanet(sname,a);
        	  ans=cube1.calculateVolume();
        	  break;   
          case 4:
           	 
        	  
        	  System.out.println("Enter radius:");
        	  a=s.nextFloat();
        	  System.out.println("Enter height:");
        	  b=s.nextFloat();
        	  ConicalPlanet cone=new ConicalPlanet(sname,a,b);
        	  ans=cone.calculateVolume();
        	  break;    
          }
          System.out.printf("Volume:%fkm3",ans);
	}

}
