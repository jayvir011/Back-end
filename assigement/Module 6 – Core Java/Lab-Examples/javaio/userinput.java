package javaio;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		String name;
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		System.out.println("Enter your name:");
		name=sc.next();
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("name="+name);

	}

}
