/* Exercício C - Informar um saldo e imprimir o saldo com reajuste de 1%
 * 
 * Data: 10/10/24
 * Caio Alves
 */

import java.util.Scanner;

public class Ex3_Salario_Arredondado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu salário: R$");
		double salario = sc.nextDouble();

		double reajuste = ((salario * 1 / 100) + salario);
		System.out.println("Salário reajustado em 1%: R$" + reajuste);

		sc.close();
	}

}
