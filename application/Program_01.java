package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee_00;

public class Program_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee_00 em = new Employee_00();
		
		System.out.print("Name: ");
		em.name = sc.nextLine();
		System.out.print("Gross salary: ");
		em.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		em.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee_00: " + em.toString());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		em.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + em.toString());
				
		sc.close();
		
	} // fim da método main

} // fim da classe Program_01
