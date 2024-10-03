/*Leia um valor em dólar e converta para real (CAMILA)

Dev: Caio Alves
*/

import java.util.Scanner;

public class ConversorDolarReal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double dolar, real, cotacao;
		
		System.out.print("Digite o valor da cotação do dólar: ");
		cotacao = scanner.nextDouble();
		
		System.out.print("Digite um valor em dólar: R$");
		dolar = scanner.nextDouble();

		real = cotacao * dolar;

		System.out.println("O valor em real é: US$" + real);

		scanner.close();
	}

}