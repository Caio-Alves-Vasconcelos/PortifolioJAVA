/* 1.11 Você resolveu dar uma força para a NASA, que deseja calcular o peso das pessoas em diferentes planetas do sistema solar. 
 * (Isso vai ter importantes consequências na expansão da humanidade pelos planetas). 
 * Escreva um algoritmo que recebe o peso de uma pessoa (em Newtons) e calcula o novo peso nos corpos celestes, de acordo com as conversões gravitacionais de cada planeta 
 * (estas constantes estão normalizadas em relação à constante da Terra), dadas abaixo:

| Corpo celeste | Fator de conversão       |
|---------------|--------------------------|
| Mercúrio      | 0.3649337410              |
| Vênus         | 0.9041794087              |
| Marte         | 0.3812436289              |
| Lua           | 0.1651376146              |
| Terra         | 1                         |
| Júpiter       | 2.6513761467              |
| Saturno       | 1.1386340468              |
| Urano         | 1.0693170234              |
| Netuno        | 1.3506625891              |
| Plutão        | 0.2252803261              |

Depois de fazer as conversões, informe o quanto as pessoas pesariam se estivessem na Terra.
*/

import java.util.Scanner;

public class Peso_Outros_Planetas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] Fator_Conversao = { 0.3649337410, // Mercúrio
				0.9041794087, // Vênus
				0.3812436289, // Marte
				0.1651376146, // Lua
				1, // Terra
				2.6513761467, // Júpter
				1.1386340468, // Saturno
				1.0693170234, // Urano
				1.3506625861, // Netuno
				0.2252803261 // Plutão
		};

		String[] planetas = { "Mercúrio", "Vênus", "Marte", "Lua", "Terra", "Júpter", "Saturno", "Urano", "Netuno",
				"Plutão" };

		System.out.print("Digite o peso da pessoa em Newtons na Terra: ");
		double peso_pessoa = sc.nextDouble();

		System.out.println("\nPeso da pessoa em diferentes planetas: ");

		for (int i = 0; i < Fator_Conversao.length; i++) {
			double peso_planeta = peso_pessoa * Fator_Conversao[i];
			System.out.printf("%s: %.2f N%n", planetas[i], peso_planeta);
		}
	}

}
