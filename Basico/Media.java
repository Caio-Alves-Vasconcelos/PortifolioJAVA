// Pede números e depois faz a média

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nome;
		double nota1, nota2, nota3, nota4, media;

		System.out.print("Escreva seu nome: ");
		nome = scanner.nextLine();

		System.out.print("\nDigite a nota 1: ");
		nota1 = scanner.nextDouble();

		System.out.print("Escreva a nota 2: ");
		nota2 = scanner.nextDouble();

		System.out.print("Escreva a nota 3: ");
		nota3 = scanner.nextDouble();

		System.out.print("Escreva a nota 4: ");
		nota4 = scanner.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("\n" + nome + ", suas notas são: \n" + "Prova 1: " + nota1 + "\nProva 2: " + nota2
				+ "\nProva 3: " + nota3 + "\nProva 4: " + nota4);
		System.out.print("\nA média de notas é: " + media);

	}

}
