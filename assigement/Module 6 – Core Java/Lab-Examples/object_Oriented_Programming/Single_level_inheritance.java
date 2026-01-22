package object_Oriented_Programming;
class one
{
	void disp()
	{
		System.out.println("this is parent class");
	}
}
class  two extends one
{
	void show()
	{
		System.out.println("this is child class");
	}
}

public class Single_level_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two t1=new two();
		t1.disp();
		t1.show();

	}

}
