package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String mail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.println("How many items to this order? ");
		int i = sc.nextInt();
		
		for (int x=1; x<=i; x++) {
			System.out.println("Enter #" + x + "item data:");
			System.out.print("Product name: ");
			String product = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
		}
		
		sc.close();

	}

}
