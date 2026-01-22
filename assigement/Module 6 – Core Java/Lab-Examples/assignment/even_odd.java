package assignment;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("this number is a even.");
		}
		else
		{
			System.out.println("this number is a odd.");
		}

	}

}
