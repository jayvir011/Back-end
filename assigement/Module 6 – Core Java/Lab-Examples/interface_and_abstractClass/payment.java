package interface_and_abstractClass;
interface pay
{
	void disp(int rupees);
}
class paymentbyupi implements pay
{
	public void disp(int rupees)
	{
		System.out.println("rupees "+rupees+" paid succesfully through upi");
	}
}
class paymentbycreditcard implements pay
{
	public void disp(int rupees)
	{
		System.out.println("rupees "+rupees+" paid succesfully through credit card");
	}
}


public class payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paymentbyupi p1=new paymentbyupi();
		p1.disp(800);
		paymentbycreditcard p2=new paymentbycreditcard();
		p2.disp(900);
	
	}

}
