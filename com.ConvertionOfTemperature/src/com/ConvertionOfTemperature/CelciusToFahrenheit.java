package com.ConvertionOfTemperature;

import java.util.Scanner;

public class CelciusToFahrenheit {
	Scanner scan=new Scanner(System.in);
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
}
