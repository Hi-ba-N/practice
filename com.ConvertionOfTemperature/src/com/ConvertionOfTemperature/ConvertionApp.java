package com.ConvertionOfTemperature;

import java.util.Scanner;

public class ConvertionApp {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Welcome to the Temperature Convertion Tool!\nSelect an option:\n1. Convert Celsius to Fahrenheit\n2. Convert Fahrenheit to Celsius\nEnter your choice:");
int choice=scan.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter temperature in celsius:");
 double celsius=scan.nextDouble();
// CelciusToFahrenheit convert=new CelciusToFahrenheit();
 double fahrenheit= CelciusToFahrenheit.celsiusToFahrenheit(celsius);
 System.out.println(celsius+"C is equivalent to "+fahrenheit+"F");
 break;
case 2:
System.out.println("Enter temperature in fahrenheit:");
 double Fahrenheit=scan.nextDouble();
 //FahrenheitToCelsius convertion=new FahrenheitToCelsius();
 double Celsius= FahrenheitToCelsius.fahrenheitToCelsius(Fahrenheit);
 System.out.println(Fahrenheit+"F is equivalent to "+Celsius+"C");
 break;
}
	}
}
