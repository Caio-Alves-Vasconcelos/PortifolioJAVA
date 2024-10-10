/* Exercício A - Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba
em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C +
273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67

Data: 10/10/24
Caio Alves 
*/

import java.util.Scanner;

public class Ex1_Temperatura {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em celsius: ");
		double celsius = sc.nextDouble();

		double Fahrenheit = celsius * 1.8 + 32;
		System.out.printf("Temperatura em Fahrenheit: %.2f °F %n", Fahrenheit);

		double Kelvin = celsius + 273.15;
		System.out.printf("Temperatura em Kelvin: %.2f °K %n", Kelvin);

		// Os resultados obtidos nessa operação matemática estão invertidos em relação
		// ao exemplo dado no pdf.
		double Reaumur = celsius * 0.8;
		System.out.printf("Temperatura em Réaumur: %.2f °Re %n", Reaumur);

		// Os resultados obtidos nessa operação matemática estão invertidos em relação
		// ao exemplo dado no pdf.
		double Rankine = celsius * 1.8 + 32 + 459.67;
		System.out.printf("Temperatura em Rankine: %.2f °Ra", Rankine);

		sc.close();
	}

}
