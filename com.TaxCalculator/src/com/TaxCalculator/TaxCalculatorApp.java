package com.TaxCalculator;

import java.util.Scanner;

public class TaxCalculatorApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the purchase amount:");
	double purchaseAmount=scan.nextDouble();
	System.out.println("Enter the tax rate(in decimal form):");
	double taxRate=scan.nextDouble();
	TaxCalculator taxCalculator=new TaxCalculator();
	double totalCost=taxCalculator.calculateTotalWithTax(purchaseAmount,taxRate);
	System.out.println("Total cost including tax:"+totalCost);
}
}