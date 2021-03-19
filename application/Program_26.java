/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Se��o 14: Heran�a e Polimorfismo
 * 133. M�todos Abstratos
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Shape;
import entities.Rectangle_01;
import entities.Circle;
import entities.enums.Color;

public class Program_26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(ch == 'r') {
				
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle_01(color, width, height));
				System.out.println();
			}
			else {
				
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
				System.out.println();
			}
			
		} // Fim do la�o for
		
		System.out.println("SHAPE AREAS:");
		
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
		
	} // Fim do m�todo main

} // Fim da classe Program_26
