package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account_00;

public class Program_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Account_00 account_00;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account_00 = new Account_00(number, holder, initialDeposit);
		}
		else {
			
			account_00 = new Account_00(number, holder);
		}
		
		System.out.println();
		System.out.println("Account_00 data:");
		System.out.println(account_00);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account_00.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account_00);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account_00.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account_00);

		sc.close();

	} // Fim do método main

} // Fim da classe Program_06
