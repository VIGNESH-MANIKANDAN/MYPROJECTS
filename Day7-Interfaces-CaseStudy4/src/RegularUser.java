

public class RegularUser extends User
{
	public float            bookroom(Booking details)//    Add new booking to the 
	{
		
		this.bookingList[this.count]=details;
		this.recharge((float)2000.00);
		return this.bCash;
		
	}
    public float            cancelBooking(String bDate)//      Cancel booking on bDate
{
    	System.out.println("Your Booking done for date "+bDate+" has been canceled on request");
    	return bCash-(bCash/2);
	
}
	@Override
	public void rechargeBCash(float amount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public float bookRoom(String[] details) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void addCoupon() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void applyDiscount(float amount) {
		// TODO Auto-generated method stub
		
	}
	
	
}
