package inheritance_and_polymophism;
class parentA
{
	void dips()
	{
		System.out.println("this is a parent class");
	}
}
class childA extends parentA
{
	void show ()
	{
		System.out.println("this is a child calss");
	}
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childA c1=new childA();
		c1.dips();
		c1.show();

	}

}
