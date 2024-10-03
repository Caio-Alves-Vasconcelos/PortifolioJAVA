/* Exercício 3 – Fazer um programa para ler um número N. Depois leia N pares de
números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a
zero, mostrar a mensagem "Divisão impossível".

23/09/24
DEV: Caio Alves de Vasconcelos
*/

import java.util.Scanner;

public class Exe_03_PARA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double par_1, par_2;
		int num, i;

		System.out.print("Digite um número inteiro: ");
		num = scanner.nextInt();

		for (i = 1; i <= num; i++) {
			System.out.print("\nDigite o primeiro número do " + i + "° par: ");
			par_1 = scanner.nextDouble();

			System.out.print("Digite o segundo número do " + i + "° par: ");
			par_2 = scanner.nextDouble();

			double div = (par_1 / par_2);
			if (par_2 == 0) {
				System.out.println("Divisão impossível.");
			} else {
				System.out.printf("Resultado: %.2f%n", div);
			}
		}
		scanner.close();
	}

}
