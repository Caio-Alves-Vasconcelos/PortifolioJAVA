// Algoritmo que calcula o índice de massa corporal
//Dev: Caio Alves
//Data: 05/09/2024
//Fórmula: PESO/(ALTURA*ALTURA)

import java.util.Scanner;

public class Calc_IMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome;
		char sexo;
		int idade;
		double peso, altura, imc;

		System.out.println("=== CALCULADORA DE IMC ===");
		System.out.print("Digite seu nome: ");
		nome = scanner.nextLine();

		System.out.print("Digite seu sexo (M - Masculino ou F - Feminino): ");
		sexo = scanner.next().charAt(0);
		while (sexo != 'M' && sexo != 'F') {
			if (sexo != 'M' && sexo != 'F') {
				System.out.print("Não existe esse sexo. Digite novamente: ");
				sexo = scanner.next().charAt(0);
			}
		}

		System.out.print("Digite sua idade: ");
		idade = scanner.nextInt();

		System.out.print("Digite seu peso: ");
		peso = scanner.nextDouble();

		System.out.print("Digite sua altura: ");
		altura = scanner.nextDouble();

		imc = peso / (altura * altura);

		System.out.println("\nRESULTADO: ");
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);

		if (imc <= 18.5) {
			System.out.println("IMC: Abaixo do peso.");
		} else if (imc >= 18.6 && imc <= 24.9) {
			System.out.println("IMC: Peso ideial (Parabéns).");
		} else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("IMC: Levemente acima do peso.");
		} else if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("IMC: Obesidade grau I.");
		} else if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("IMC: Obesidade grau II (Severa).");
		} else if (imc >= 40) {
			System.out.println("IMC: Obdesidade grau III (Mórbida).");
		} else {
			System.out.println("IMC: Não foi possível identificar seu IMC.");
		}

	}

}
