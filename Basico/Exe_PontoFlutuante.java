//Dev: Caio Alves
// Código testa várias operações matemáticas e explora a variável tipo double

import java.util.Scanner;

public class Exe_PontoFlutuante {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a, b, c, area;

		System.out.print("Digite o 1° valor: ");
		a = scanner.nextDouble();
		System.out.print("Digite o 2° valor: ");
		b = scanner.nextDouble();
		System.out.print("Digite o 3° valor: ");
		c = scanner.nextDouble();

		// Cálculo da área do triângulo retângulo
		area = (a * c) / 2;
		System.out.printf("Área do triângulo retângulo: %.3f%n", area);

		// Cálculo da área do círculo de raio c
		area = 3.14159 * (c * c);
		System.out.printf("Área do círculo: %.3f%n", area);

		// Cálculo da área do trapézio
		area = (a + b) * c / 2;
		System.out.printf("Área do trapézio: %.3f%n", area);

		// Cálculo da área do quadrado
		area = b * b;
		System.out.printf("Área do quadrado: %.3f%n", area);

		// Cálculo da área do retângulo
		area = a * b;
		System.out.printf("Área do retângulo: %.3f%n", area);

		scanner.close();
	}

}
