/* Exercício 1 – Leia um valor inteiro X (1<= X <= 1000). Em seguida mostre os
ímpares de 1 até X, valor por linha, inclusive o X se for o caso.

23/09/2024
DEV: Caio Alves de Vasconcelos
*/

import java.util.Scanner;

public class Exe_01_PARA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero, i;

		System.out.print("Digite um número e veja os ímpares: ");
		numero = scanner.nextInt();
		if (numero > 1000) {
			System.out.println("Não é autorizado exceder valores maiores que 1000!");
		} else {
			for (i = 0; i <= numero; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
		scanner.close();
	}

}
