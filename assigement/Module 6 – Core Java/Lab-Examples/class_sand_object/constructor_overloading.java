package class_sand_object;
class cons
{
	int age;
	String name;
	cons()
	{
		name="ram";
		age=99;
	}
	cons(int a,String n)
	{
		age=a;
		name=n;
	}
	void disp()
	{
		System.out.println(name+ " "+age);
	}
}

public class constructor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons c1=new cons(19,"jay");
		cons c2=new cons();
		c1.disp();
		c2.disp();
		
		

	}

}
