/* Exercício I - Crie um programa que armazene 10 números inteiros e então determine e exiba o maior e o menor
número digitado.

Caio Alves
*/

import java.util.Scanner;

public class Ex9_Maior_Menor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numers = new int[10];
		int maior = -9999, menor = 9999;

		for (int i = 0; i <= 9; i++) {
			System.out.print("Digite um número: ");
			numers[i] = sc.nextInt();
			if (numers[i] > maior) {
				maior = numers[i];
			}
			if (numers[i] < menor) {
				menor = numers[i];
			}
		}
		System.out.println("\nMaior número: " + maior);
		System.out.println("Menor número: " + menor);

		sc.close();
	}

}
