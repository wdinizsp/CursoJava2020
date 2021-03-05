package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_00;

public class Program_05 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product_00 product_00 = new Product_00(name, price);
		
		product_00.setName("Computer");
		System.out.println("Updated name: " + product_00.getName());
		product_00.setPrice(1200.00);
		System.out.println("Update price: " + product_00.getPrice());
		
		System.out.println();
		System.out.println("Product_00 data: " + product_00);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product_00.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product_00);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product_00.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product_00);
		
		sc.close();
		
	} // Fim do método main
	
} // Fim da classe Program_05
