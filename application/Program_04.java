package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program_04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? $ ");
		double value = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(value, dollarPrice);
		
		System.out.printf("Amount to be paid in reais = R$ %.2f", result);
		
		sc.close();

	} // Fim do método main

} // Fim da classe Program_04
