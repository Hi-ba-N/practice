package com.TaxCalculator;

public class TaxCalculator {
public  double calculateTotalWithTax(double purchaseAmount, double taxRate)
{
	return (purchaseAmount * taxRate)+purchaseAmount;
}
}
