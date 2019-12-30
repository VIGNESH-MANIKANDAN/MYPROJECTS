
//derived or child class//
public class Student extends User
{
public Student(String fnamne, String lname, String email, String mobile, int age, float cgpa2, String dept2,
			int roll2, int year2) 
{
		super(fnamne,lname,email,mobile,age);
		this.cgpa=cgpa2;
		this.dept=dept2;
		this.roll=roll2;
		this.year=year2;
}
float cgpa;
private String dept;
private int roll,year;
public void display()
{
	super.display();
	System.out.println("CGPA "+this.cgpa);
	System.out.println("DEPARTEMNT "+this.dept);
	System.out.println("ROLL NUMBER "+this.roll);
	System.out.println("YEAR "+this.year);
	
}

}
