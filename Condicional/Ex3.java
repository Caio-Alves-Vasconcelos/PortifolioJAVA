/* Exercício 3 ( Raquel) leia a hora e a hora final de um jogo. A seguir calcule a duração do jogo,
 * sabendo que o mesmo pode começar no mesmo dia e acabar em outro, tendo uma duração máxima de 24 hrs
 */

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int horas = 0;

		System.out.print("Qual a hora de inicio do jogo: ");
		int inicial = scanner.nextInt();

		System.out.print("Qual a hora de finalização do jogo: ");
		int fim = scanner.nextInt();

		if (inicial < fim) {
			horas = (fim - inicial);
			System.out.println("\nDuração do jogo: " + horas + " horas.");
		} else if (inicial == fim) {
			System.out.println("\nDuração do jogo: 24 horas.");
		} else {
			horas = 24 - inicial + fim;
			System.out.println("\nDuração do jogo: " + horas + " horas.");
		}
		scanner.close();
	}

}
