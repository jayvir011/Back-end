package exception;
class mymessage extends Exception
{
	public mymessage(String ms)
	{
		super(ms);
	}
	void disp()
	{
		System.out.println("devided by zero is not valid");
	}
}

public class custom_exception_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		try
		{
			if(b==0)
			{
				throw new mymessage("denominator can not be zero");
			}
			int c=a/b;
			System.out.println("result "+c);
		}
		catch(mymessage e)
		{
			e.disp();
		}
		
		

	}

}
