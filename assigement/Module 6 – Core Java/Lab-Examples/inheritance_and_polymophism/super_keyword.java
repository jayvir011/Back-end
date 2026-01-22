package inheritance_and_polymophism;
class parent1
{
	parent1()
	{
		System.out.println("i am parent class constructor");
	}
}
class child1 extends parent1
{
	child1()
	{
		super();
		System.out.println("i am child class constructor");
	}
}

public class super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c1=new child1();

	}

}
