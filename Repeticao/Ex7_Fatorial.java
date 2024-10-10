/* Exercício G - Faça um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse
número. Fatorial de N é representado por N! e calculado da seguinte maneira: ��! = �� ∗ (�� − 1) ∗ (�� − 2) ∗. . .∗
3 ∗ 2 ∗ 1 Utilize o laço que lhe for mais conveniente.

Caio Alves
*/

import java.util.Scanner;

public class Ex7_Fatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long num = 0;

		while (num <= 0) {
			System.out.print("Digite um número e veja seu fatorial: ");
			num = sc.nextLong();
			if (num <= 0) {
				System.out.println("Número inválido. ");
			}
		}
		double fatorial = 1;
		for (int n = 1; n <= num; n++) {
			fatorial *= n;
		}
		System.out.println("Fatorial de " + num + " é: " + fatorial);

		sc.close();
	}

}
