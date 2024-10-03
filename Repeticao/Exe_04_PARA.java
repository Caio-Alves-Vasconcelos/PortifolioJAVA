/* Exercício 4 - Ler um número inteiro N e calcular todos os seus divisores.
 * 
 * 23/09/24
 * DEV: Caio Alves
 */

import java.util.Scanner;

public class Exe_04_PARA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num, i;

		System.out.print("Digite um número e veja seus divisores: ");
		num = scanner.nextInt();

		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		scanner.close();
	}

}
