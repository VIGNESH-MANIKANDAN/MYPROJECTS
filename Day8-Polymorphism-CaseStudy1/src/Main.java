import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Machine m=new Machine();
		int a;
		float f;
		String S;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the quantity of coalPieces");
		a=s.nextInt();
		System.out.println("Answer(int)"+m.produceShoePolish(a));
		System.out.println("Enter the quantity of hairStrand");
		f=s.nextFloat();
		System.out.println("Answer(float)"+m.produceShoePolish(f));
		System.out.println("Enter the quantity as String");
		f=s.nextFloat();
		System.out.println("Answer(string)"+m.produceShoePolish(f));

	}

}
