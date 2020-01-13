
public interface iuser 
{

	void             updateDetails        (String details);
	void             rechargeBCash        (float amount);
	float            bookRoom             (String[] details);
	float            cancelBooking       ( String bDate);
	void             addCoupon();
	void             applyDiscount       ( float amount);

}
