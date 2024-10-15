/* 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
*/

import java.util.Scanner;

public class Valores_Booleanos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean valor_1;
		boolean valor_2;
		boolean result;

		System.out.print("Digite o valor lógico da 1° proposição: ");
		valor_1 = sc.nextBoolean();
		System.out.print("Digite o valor lógico da 2° proposição: ");
		valor_2 = sc.nextBoolean();

		result = valor_1 && valor_2;

		System.out.println("Resposta da proposição: " + result);

		sc.close();
	}

}
