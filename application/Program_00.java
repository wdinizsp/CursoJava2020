package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle_00;

public class Program_00 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle_00 rect = new Rectangle_00();

		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();

		System.out.println();
		System.out.printf("AREA = %.2f%n", rect.Area());
		System.out.printf("PERIMETER = %.2f%n", rect.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.Diagonal());

		sc.close();
		
	} // Fim do método main

} // Fim da classe Program_00
