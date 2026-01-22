package exception;

public class multiple_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0,c;
		try
		{
			c=a/b;
			System.out.println("result :"+c);
			int[] arr =new int[3];
			arr[5]=100;
		}
		catch(ArithmeticException e)
		{
			System.out.println("devided by zero is not valid try again!"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Is Out Of Bound");
		}

	}

}
