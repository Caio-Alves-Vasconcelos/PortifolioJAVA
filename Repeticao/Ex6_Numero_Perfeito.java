/* Exercício F - Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus
divisores positivos próprios (excluindo-o) é igual ao próprio número. Por exemplo o número 6 é perfeito, pois
1+2+3 é igual a 6. Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou
não. Utilize o laço que lhe for mais conveniente.

Caio Alves
*/

import java.util.Scanner;

public class Ex6_Numero_Perfeito {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int soma = 0;

		System.out.print("Digite um número e veja se ele é perfeito: ");
		num = sc.nextInt();

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				soma = (soma + i);
			}
		}
		if (soma == num) {
			System.out.print(num + " é um número perfeito.");
		} else {
			System.out.print(num + " não é um número perfeito.");
		}

		sc.close();
	}

}
