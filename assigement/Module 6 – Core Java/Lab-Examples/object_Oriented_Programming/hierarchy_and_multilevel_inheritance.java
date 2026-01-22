package object_Oriented_Programming;
class A
{
	void dispA()
	{
		System.out.println(" this is A class");
	}
}
class B extends A
{
	void dispB()
	{
		System.out.println(" this is B class");
	}
}
class C extends A
{
	void dispC()
	{
		System.out.println(" this is C class");
	}
}
class D extends B
{
	void dispD()
	{
		System.out.println(" this is D class");
	}
}
public class hierarchy_and_multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		D d1=new D();
		d1.dispA();
		d1.dispB();
		d1.dispD();

	}

}
