package com.LogicalOperator;

import java.util.Scanner;

public class LogicalOperator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Is input valid (true/false):");
	boolean inputIsValid=scan.nextBoolean();
	System.out.println("Does input meet a certain condition (true/false):");
	boolean inputMeetsCondition=scan.nextBoolean();
	boolean res=isValidInput(inputIsValid,inputMeetsCondition);
}

public static boolean isValidInput(boolean inputIsValid,boolean inputMeetsCondition) {
	if (inputIsValid&&inputMeetsCondition==true)
	{
		System.out.println("Input is valid");
	}
	else {
		System.out.println("Input is invalid");
	}
	return true;
}
}