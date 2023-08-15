package com.Calculatordillema;

import java.util.Scanner;

public class Calculator {
public void arithmeticOperation(int num1,int num2)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("1:Addition\n2:Subraction\n3:Multiplication\n4:Division\nEnter your choice:");
    int choice=scan.nextInt();
       	
	switch(choice)
	{
	case 1:
		System.out.println(num1+num2);
		break;
	case 2:
		System.out.println(num1-num2);
		break;
	case 3:
		System.out.println(num1*num2);
		break;
	case 4 :
		System.out.println(num1/num2);
		break;
	default:
		System.out.println("Invalid");
	}
     
}
}
