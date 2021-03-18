/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Seção 14: Herança e Polimorfismo
 * 131. Exercício de Fixação
 */

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product_03;
import entities.UsedProduct;

public class Program_25 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product_03> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		System.out.println("************************************************");
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("Product # " + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
					
			if(ch == 'u') {
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				System.out.println("************************************************");
				
				list.add(new UsedProduct(name, price, manufactureDate));
				
			}
			else if(ch == 'i') {
				
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				System.out.println("************************************************");
				
				list.add(new ImportedProduct(name, price, customsFee));
				
			}
			else {
				list.add(new Product_03(name, price));
				System.out.println("************************************************");
			}
				
			
			
		} // Fim do laço for
				
		System.out.println("PRICE TAGS:");
		System.out.println();
		
		for(Product_03 prod: list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();

	} // Fim do método main

} // Fim da classe Program_25
