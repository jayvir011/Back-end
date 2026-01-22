package constructor;
class cons
{
	cons(int a,int b)
	{
		System.out.println("sum ="+(a+b));
	}
	cons(int a,int b,int c)
	{
		System.out.println("sum ="+(a+b+c));
	}
	
}
public class parameterized_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons c1=new cons(10,20,30);

	}

}
