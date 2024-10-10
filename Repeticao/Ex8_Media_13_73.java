/* Exercício H - Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73. Utilize
o laço que lhe for mais conveniente.

Caio Alves
*/

public class Ex8_Media_13_73 {
	public static void main(String[] args) {

		int quant_par = 0; // Variável tipo inteiro, com valor inicial valendo 0
		int soma_par = 0; // Variável tipo inteiro, com valor inicial valendo 0
		float media = 0; // Variável tipo decimal, com valor inicial valendo 0

		for (int i = 13; i <= 73; i++) { // Laço for que vai de 13 até 73
			if (i % 2 == 0) { // Se o o resto da divisão do contador por 2 for igual a 0
				quant_par++; // Contador quant_par soma a quantidade de números pares presentes neste
								// intervalo
				soma_par = soma_par + i; // Soma_par faz a soma de todos os números pares do intervalo
				media = media + i; // Media faz a soma dos números pares para posteriormente realizar a média
									// aritmética
			}
		}
		media = media / quant_par; // Média aritmética

		System.out.printf("Quantidade de números pares: %d%n", quant_par); // Imprime o total de pares
		System.out.printf("Soma total dos números pares: %d%n", soma_par); // Imprime a soma dos valores de todos os
																			// números pares do intervalo
		System.out.printf("Média aritmética dos números pares: %.0f", media); // Imprime a média aritmética dos números
																				// pares

	}

}
