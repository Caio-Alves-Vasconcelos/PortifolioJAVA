/*  12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
 * pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
 * 
 Tabela de Código de Condições de Pagamento

 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

 2 - À Vista no cartão de crédito, recebe 10% de desconto

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

 DEV: Caio Alves
 */

import java.util.Scanner;

public class TabelaDePrecos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do produto: ");
		String nome = sc.nextLine();

		System.out.printf("Digite o preço unitário de %s: R$", nome);
		double preco = sc.nextDouble();

		System.out.println("Qual meio de pagamento: " + "\n1 - Dinheiro ou Pix " + "\n2 - Cartão de Crédito (à vista) "
				+ "\n3 - Cartão de crédito (parcelado 2x) " + "\n4 - Cartão de crédito (parcelado 3x)");
		byte escolha = sc.nextByte();

		double resposta;
		switch (escolha) {
		case 1:
			resposta = ((preco * 15 / 100) - preco) * (-1);
			System.out.printf("Total a pagar: R$%.2f", resposta);
			break;

		case 2:
			resposta = ((preco * 10 / 100) - preco) * (-1);
			System.out.printf("Total a pagar: R$%.2f", resposta);
			break;

		case 3:
			System.out.printf("Total a pagar: R$%.2f", preco);
			break;
			
		case 4:
			resposta = ((preco * 10 / 100) + preco);
			System.out.printf("Total a pagar: R$%.2f", resposta);
			break;
			
		}
		sc.close();
	}

}
