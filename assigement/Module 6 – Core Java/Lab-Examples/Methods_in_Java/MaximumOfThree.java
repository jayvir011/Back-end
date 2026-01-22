package Methods_in_Java;

import java.util.Scanner;

class max
{
	int num1,num2,num3;
	void max()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1:");
		num1=sc.nextInt();
		System.out.println("enter num2:");
		num2=sc.nextInt();
		System.out.println("enter num3:");
		num3=sc.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1+" is max");
			}
		}
		else if(num2>num1)
		{
			if(num2>num3)
			{
				System.out.println(num2+"is max");
			}
		}
		else
		{
			System.out.println(num3+"is max");
		}
	}
	
}

public class MaximumOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max obj=new max();
		obj.max();
		

	}

}
