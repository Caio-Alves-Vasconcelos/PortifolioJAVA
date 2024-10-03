/* Exercício 5 - Fazer um programa para ler um número inteiro positivo N. O
programa deve então mostrar na tela N linhas, começando de 1 até N. Para cada
linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.

23/09/24
DEV: Caio Alves de Vasconcelos
*/

import java.util.Scanner;

public class Exe_05_PARA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num, i;

		System.out.print("Digite um número: ");
		num = scanner.nextInt();

		for (i = 1; i <= num; i++) {
			System.out.println(i + " " + i * i + " " + i * i * i);
		}
		scanner.close();
	}

}
