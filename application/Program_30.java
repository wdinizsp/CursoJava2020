/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Seção 15: Tratamento de exceções
 * 146. Exercicio de Fixação
 */

package application;

import java.util.Scanner;

import entities.Account_02;
import entities.exceptions.DomainException;

public class Program_30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		System.out.println();
		
		Account_02 ac = new Account_02(number, holder, balance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		try {
			ac.withdraw(amount);
			System.out.printf("New balance: " + String.format("%.2f",ac.getBalance()));
		}
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();

	} // Fim do método main

} // Fim da classe Program_30
