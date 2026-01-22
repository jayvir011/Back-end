package object_Oriented_Programming;
class parent
{
	void show()
	{
		System.out.println("this is parent class");
	}
}
class child extends parent
{
	void show()
	{
		System.out.println("this is child class");
	}
}

public class overridingg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1=new child();
		c1.show();

	}

}
