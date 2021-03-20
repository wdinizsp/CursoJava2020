/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Seção 15: Tratamento de exceções
 * 139. Estrutura try-catch
 */

package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("End of Program");
		
		sc.close();
		

	} // Fim do método main

} // Fim da classe Program_28
