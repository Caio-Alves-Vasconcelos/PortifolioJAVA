/* Exercício 5 (Raquel) com base na tabela abaixo, escreva um programa que leia o código de um item
 * e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar
 */

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int quantidade;
		double valor;

		System.out.println("Digite o código de um dos itens abaixo: \n");
		System.out.print("1 - Cachorro quente \t R$4,00 unidade \n");
		System.out.print("2 - X-salada         \t R$4,50 unidade  \n");
		System.out.print("3 - X-bacon  	\t R$5,00 unidade \n");
		System.out.print("4 - Torrada simples  \t R$2,00 unidade \n");
		System.out.print("5 - Refrigerante \t R$1,50 unidade  \n");
		System.out.print("\nEscolha um destes: ");
		int escolha = scanner.nextInt();

		switch (escolha) {
		case 1:
			System.out.print("\nQual a quantidade de cachorros quentes deseja? ");
			quantidade = scanner.nextInt();

			valor = quantidade * 4.00;

			System.out.print("Valor a ser pago: R$" + valor);
			break;

		case 2:
			System.out.print("\nQual a quantidade de X-salada deseja? ");
			quantidade = scanner.nextInt();

			valor = quantidade * 4.50;

			System.out.print("Valor a ser pago: R$" + valor);
			break;

		case 3:
			System.out.print("\nQual a quantidade de X-bacon deseja? ");
			quantidade = scanner.nextInt();

			valor = quantidade * 5.00;

			System.out.print("Valor a ser pago: R$" + valor);
			break;

		case 4:
			System.out.print("\nQual a quantidade de Torradas simples deseja? ");
			quantidade = scanner.nextInt();

			valor = quantidade * 2.00;

			System.out.print("Valor a ser pago: R$" + valor);
			break;

		case 5:
			System.out.print("\nQual a quantidade de refrigerantes deseja? ");
			quantidade = scanner.nextInt();

			valor = quantidade * 1.50;

			System.out.print("Valor a ser pago: R$" + valor);
			break;

		default:
			System.out.println("Não existe tal opção. Tente novamente.");
		}

	}

}
