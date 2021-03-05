package application;

import java.util.Scanner;

public class Program_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira os valores M e N: ");
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		System.out.println();
		System.out.println("Insira os valores da matriz:");

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Insira um valor pertencente a matriz: ");
		int x = sc.nextInt();

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				if (mat[l][c] == x) {
					System.out.println();
					System.out.println("Posição " + l +"," + c + ":");
					if (c > 0) {
						System.out.println();
						System.out.println("Esquerda: " + mat[l][c-1]);
					}
					if (l > 0) {
						System.out.println("Acima: " + mat[l-1][c]);
					}
					if (c < mat[l].length-1) {
						System.out.println("Direita: " + mat[l][c+1]);
					}
					if (l < mat.length-1) {
						System.out.println("Abaixo: " + mat[l+1][c]);
					}

				}
			}
		}

		sc.close();
	}

}
