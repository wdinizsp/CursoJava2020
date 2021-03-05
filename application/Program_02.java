package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student st = new Student();

		System.out.print("Name: ");
		st.name = sc.nextLine();
		System.out.println("Grades:");
		st.grade1 = sc.nextDouble();
		st.grade2 = sc.nextDouble();
		st.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE: %.2f POINTS%n", st.finalGrade());
		
		if (st.finalGrade() > 60.0) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", st.missingPoint());
		}
		
		sc.close();

	} // Fim do método main

} // Fim da classe Program_02
