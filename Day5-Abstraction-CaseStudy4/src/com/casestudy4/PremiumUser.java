package com.casestudy4;

public class PremiumUser extends User 
{
	
	int              discount;
	int              coupon;
	boolean          isNextBookingFree;
	public float bookroom(Booking details)//    Add new booking to the 
	{
		
		this.bookingList[this.count]=details;
		this.recharge((float)5000.00);
		this.isNextBookingFree=false;
		return this.bCash;
		
	}
    public float cancelBooking(String bDate)//      Cancel booking on bDate
    {
    	System.out.println("Your Booking done for date "+bDate+" has been canceled on request");
    	return bCash-(bCash/2);
	
	
    }
    public void addCoupon()
    {
    	this.coupon=this.coupon+100;
    	
    }
    void applyDiscount (float amount )
    {
    	this.discount=10;
    }

}
