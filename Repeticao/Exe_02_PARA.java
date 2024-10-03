/* Exercício 2 – Leia um valor inteiro N. Este valor será a quantidade de valores
inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão
dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
informações conforme exemplo (use a palavra “dentro” e “fora”).

23/09/2024
DEV: Caio Alves de Vasconcelos
*/

import java.util.Scanner;

public class Exe_02_PARA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quant, i, num, dentro = 0, fora = 0;

		System.out.print("Digite um número: ");
		quant = scanner.nextInt();

		for (i = 1; i <= quant; i++) {
			System.out.print("Digite o " + i + "° número para verificação: ");
			num = scanner.nextInt();
			if (num >= 10 && num <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		System.out.println("\nHá " + dentro + " dentro do intervalo.");
		System.out.println("Há " + fora + " fora do intervalo.");

		scanner.close();
	}

}
