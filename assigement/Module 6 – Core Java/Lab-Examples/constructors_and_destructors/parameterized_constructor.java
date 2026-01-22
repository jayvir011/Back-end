package constructors_and_destructors;
class sum
{
	sum(int a,int b)
	{
		int c=a+b;
		System.out.println("the sum is "+c);
	}
	sum(int a,int b,int d)
	{
		int c=a+b+d;
		System.out.println("the sum is "+c);
	}
}

public class parameterized_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum s1=new sum(10,20,50);
		sum s2=new sum(90,80);

	}

}
