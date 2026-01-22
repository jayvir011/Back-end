package assignment;
class calc1
{
	int add;
	calc1()
	{
		System.out.println("constructor called !");
	}
	void sum(int a,int b)
	{
		System.out.println("sum :"+(a+b));
	}
	void sum(int a,int b,int c)
	{
		System.out.println("sum :"+(a+b+c));
	}
	void sum(int a,int b,int c,int d)
	{
		System.out.println("sum :"+(a+b+c+d));
	}
}

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc1 obj=new calc1();
		obj.sum(10,20);
		obj.sum(10,20,30);

	}

}
