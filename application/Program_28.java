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
		
		method1();
		
		System.out.println("End of Program");
		
	} // Fim do método main
	
	public static void method1() {
		
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		
		System.out.println("***METHOD2 START***");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			}
			
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid position");
				e.printStackTrace();
				sc.next();
			}
			catch (InputMismatchException e) {
				System.out.println("Input error");
			}
		
		sc.close();
		System.out.println("***METHOD2 END***");
	}

} // Fim da classe Program_28
