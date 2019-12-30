//parent class//
public class User 
{
	public User(String fnamne2, String lname2, String email2, String mobile2, int age2)
	{
		// TODO Auto-generated constructor stub
		this.fnamne=fnamne2;
		this.lname=lname2;
		this.email=email2;
		this.mobile=mobile2;
		this.age=age2;
	}
	private String fnamne,lname,email,mobile;
	private int age;
	
	public void display()
	{
		System.out.println("First name "+this.fnamne);
		System.out.println("Last name "+this.lname);
		System.out.println("email "+this.email);
		System.out.println("mobile "+this.mobile);
		System.out.println("age "+this.age);
	}
	
}
