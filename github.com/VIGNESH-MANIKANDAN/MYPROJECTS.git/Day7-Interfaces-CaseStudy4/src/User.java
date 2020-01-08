

public  abstract class User implements iuser
{
	String           userName;
	String           emailID;
	int              mobileNo;
	float            bCash;
	Booking[]        bookingList;
	int count;
	User()
	{
		bCash=(float)0.0;
		count=0;
		bookingList=new Booking[20];
	}
	public void updateDetails(String details)
	{
	String a[]=details.split(":");
	this.userName=a[0];
	this.emailID=a[1];
	this.mobileNo=Integer.parseInt(a[2]);
	System.out.printf("Your Details\nName; %s\nEmailId: %s\n Mobilenumber:%d\n",this.userName,this.emailID,this.mobileNo);
	}
	public void recharge(float amount)
	{
	this.bCash+=amount;
	}
	abstract public float bookroom(Booking bdetails);
	
		
	
	abstract public float cancelBooking(String bdate);
	
}
