//Construa uma  calculadora simples. Porém, se o divisor for 0, na divisão, deverá pedir para inserir o segundo número novamente. 
//Dev: Caio Alves
//Data: 02/09/2024

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcao = 0;
		double n1, n2, result;

		while (opcao != 5) {
			System.out.println("\n=== CALCULADORA SIMPLES ===");
			System.out.println("1- Adição");
			System.out.println("2- Subtração");
			System.out.println("3- Divisão");
			System.out.println("4- Multiplicação");
			System.out.println("5- Sair");
			System.out.print("Escolha uma dessas opções: ");
			opcao = scanner.nextInt();

			if (opcao == 1) {
				System.out.print("Digite o primeiro número: ");
				n1 = scanner.nextDouble();
				System.out.print("Digite o segundo número: ");
				n2 = scanner.nextDouble();

				result = n1 + n2;
				System.out.println("Resultado da adição: " + result);
			} else if (opcao == 2) {
				System.out.print("Digite o primeiro número: ");
				n1 = scanner.nextDouble();
				System.out.print("Digite o segundo número: ");
				n2 = scanner.nextDouble();

				result = n1 - n2;
				System.out.println("Resultado da subtração: " + result);
			} else if (opcao == 3) {
				System.out.print("Digite o primeiro número: ");
				n1 = scanner.nextDouble();
				System.out.print("Digite o segundo número: ");
				n2 = scanner.nextDouble();

				while (n2 == 0) {
					System.out.println("Erro matemático. Não é possível dividir por 0");
					System.out.print("Digite o segundo número: ");
					n2 = scanner.nextDouble();
				}
				result = n1 / n2;
				System.out.println("O resultado da divisão: " + result);
			} else if (opcao == 4) {
				System.out.print("Digite o primeiro número: ");
				n1 = scanner.nextDouble();
				System.out.print("Digite o segundo número: ");
				n2 = scanner.nextDouble();

				result = n1 * n2;
				System.out.println("Resultado da multiplicação: " + result);
			} else if (opcao <= 0 || opcao >= 6) {
				System.out.println("Não há essa opção.");
			}
		}
		System.out.println("Saindo...");
	}

}
