package Methods_in_Java;
class static1
{
	static int count=0;
	
	static1()
	{
		count++;
	}
	void disp()
	{
		System.out.println("Number of objects created :"+count);
	}
}

public class Static_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static1 s1=new static1();
		static1 s2=new static1();
		static1 s3=new static1();
		s2.disp();

	}

}
