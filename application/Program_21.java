package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Order_01;
import entities.Product_02;
import entities.enums.OrderStatus_01;

public class Program_21 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String mail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, mail, birthDate);
		
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus_01 status = OrderStatus_01.valueOf(sc.next());
		
		Order_01 order = new Order_01(new Date(), status, client);
	
		System.out.print("How many items to this order? ");
		int i = sc.nextInt();
		
		for (int x=1; x<=i; x++) {
			System.out.println("Enter #" + x + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			
			Product_02 prod = new Product_02(prodName, prodPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, prodPrice, prod);
			
			order.addItem(orderItem);
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();

	}

}
