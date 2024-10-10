/* Exercício D - Desenvolva um algoritmo em Java que leia um número inteiro e imprima
o seu antecessor e seu sucessor.

Caio Alves
*/

import java.util.Scanner;

public class Ex4_Sucessor_Antecessor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();

		System.out.println("Antecessor: " + (num - 1));
		System.out.println("Sucessor: " + (num + 1));

		sc.close();
	}

}
