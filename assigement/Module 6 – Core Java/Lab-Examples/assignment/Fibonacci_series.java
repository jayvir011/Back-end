package assignment;
import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		int a=0,b=1,c;
		System.out.println("enter n : ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" , ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
