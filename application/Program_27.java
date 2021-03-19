/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Se��o 14: Heran�a e Polimorfismo
 * 134. Exercicio de fixa��o
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program_27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double total = 0.0;
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Tax payer #" + i + " data:");
			System.out.println();
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else {
				
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
			
			System.out.println();
			
		} // fim do la�o for

		System.out.println("TAXES PAID:");
		System.out.println();
		for (TaxPayer tp: list ) {
			
			System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
			total += tp.tax();
		}
		System.out.println();
		
		System.out.println("TOTAL TAXES: $" +  String.format("%.2f", total));
		
		sc.close();
		

	} // Fim do m�todo main

} // Fim da classe Program_27
