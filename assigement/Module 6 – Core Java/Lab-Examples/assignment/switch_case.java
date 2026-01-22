package assignment;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1,num2;
		Scanner sc=new Scanner(System.in);
		int i,flag;
		do
		{
		System.out.println("1. addition");
		System.out.println("2. substraction");
		System.out.println("3. multiplication");
		System.out.println("4. division");
		
		System.out.println("choice option to operat :");
		int choice=sc.nextInt();
		
		System.out.println("enter Number 1 :");
		num1=sc.nextFloat();
		System.out.println("enter Number 2 :");
		num2=sc.nextFloat();
		
			switch(choice)
			{
			case 1:
				System.out.println("addition: "+num1 +" + "+num2+" = "+ (num1+num2));
				break;
			case 2:
				System.out.println("substraction: "+num1 +" - "+num2+" = "+ (num1-num2));
				break;
			case 3:
				System.out.println("multiplication: "+num1 +" * "+num2+" = "+ (num1*num2));
				break;
			case 4:
				System.out.println("addition: "+num1 +" / "+num2+" = "+ (num1/num2));
				break;
			default:
				System.out.println("Enter appropriate choice");
			}
			System.out.println("Eneter 5 for contineu");
			flag=sc.nextInt();
		}
		while(flag==5);
		
		

	}

}
