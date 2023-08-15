package com.BitwiseOperator;

import java.util.Scanner;

public class BitwiseSwap {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first number:");
	int x=scan.nextInt();
	System.out.println("Enter the second number:");
	int y=scan.nextInt();
	swapUsingBitWise( x, y);
	
}
public static void swapUsingBitWise(int x,int y)
{
int temp=x^y;
x=x^y;
y=temp^y;
x=x^y;
System.out.println("After swapping: x="+x+",y="+y);
}
}
