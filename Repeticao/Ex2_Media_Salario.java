/* Exercício B - Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade
de funcionários e os salários, e devolvendo a média salarial.

Data: 10/10/24
Caio Alves
*/

import java.util.Scanner;

public class Ex2_Media_Salario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario, media = 0;

		System.out.print("Digite a quantidade de funcionários de sua empresa: ");
		int quant = sc.nextInt();

		for (int i = 1; i <= quant; i++) {
			System.out.print("Digite o salário do colaborador(a) " + i + ": ");
			salario = sc.nextDouble();
			media = media + salario;
		}

		media = (media/quant);
		System.out.printf("A média salarial da empresa é: R$ %.2f", media);

		sc.close();
	}

}
