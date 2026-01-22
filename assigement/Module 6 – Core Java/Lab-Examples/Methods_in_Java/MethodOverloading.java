package Methods_in_Java;
class overloading
{
	void sum(int a,int b)
	{
		System.out.println("sum of "+a+ " + "+b+" = "+(a+b));
	}
	void sum(double a,double b)
	{
		System.out.println("sum of "+a+" + "+b+" = "+(a+b));
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading obj=new overloading();
		obj.sum(10,20);
		obj.sum(10.80,20.20);

	}

}
