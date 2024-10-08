/* Escreva um algoritmo que leia a temperatura em Fahrenheit e converta para celsius
 * (212°F - 32) * 5/9 = C°
 */

import java.util.Scanner;

public class Conversor_Temperatura {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em Fahrenheit: ");
		float Fah = sc.nextFloat();

		float cel = ((Fah - 32) * 5 / 9);

		System.out.printf("Temperatura em Celsius: %.1f °C", cel);

	}

}
