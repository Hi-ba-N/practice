package com.Calculatordillema;

import java.util.Scanner;

public class CalculatorApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two numbers:");
	int num1= scan.nextInt();
	int num2=scan.nextInt();
	Calculator c1=new Calculator();
	c1.arithmeticOperation(num1,num2);
	
}
}
