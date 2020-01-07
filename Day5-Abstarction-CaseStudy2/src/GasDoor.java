import java.util.Scanner;

public class GasDoor extends Door
{
	String nameofgas;
	public GasDoor(String sname) {
		
		super(sname);
		Scanner s=new Scanner(System.in);
		   System.out.println("Enter gas");
		   this.nameofgas=s.next();
	}
	public void unlock()
	{
		int length = this.nameofgas.length();
		 String rev="";
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + this.nameofgas.charAt(i);
	 
	      if (this.nameofgas.equals(rev))
	         System.out.println(this.nameofgas+" is a palindrome");
	      else
	         System.out.println(this.nameofgas+" is not a palindrome");	
	}
}
