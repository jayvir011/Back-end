package exception;

public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0,c;
		try
		{
			c=a/b;
			System.out.println("result :"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("devided by zero is not valid try again!"+e.getMessage());
		}
		finally
		{
			System.out.println("finally block execeuted");
		}
		
		
		

	}

}
