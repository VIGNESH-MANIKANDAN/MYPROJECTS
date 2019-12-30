import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		String fnamne,lname,email,mobile;
		int age;
		float cgpa;
		String dept;
		int roll,year;
		Scanner sc=new Scanner(System.in);
		fnamne=sc.next();
		lname=sc.next();
		email=sc.next();
		mobile=sc.next();
		age=sc.nextInt();
		cgpa=sc.nextFloat();
		dept=sc.next();
		roll=sc.nextInt();
		year=sc.nextInt();
		Student obj=new Student(fnamne,lname,email,mobile,age,cgpa,dept,roll,year);
		obj.display();
		
		sc.close();

	}

}
