// O código pede um número determinado de bytes e informa quantos bits são equivalentes
/* Caio Alves de Vasconcelos
 * 19/09/2024
 */
import java.util.Scanner;

public class Numero_Bytes_Melhorado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Declarando variável
		long Bits, bytes, restantes;

		// Entrada de dados
		System.out.print("Digite um determinado número de bits: ");
		Bits = scanner.nextLong();

		// Condicional: se Bits for menor que zero, o programa retorna erro.
		if (Bits < 0) {
			System.out.println("Não há dados!");
		} else {
			// Operações
			bytes = Bits / 8;
			restantes = Bits % 8;

			// Saída de dados
			System.out.println("Quantidade: " + bytes + " bytes " + restantes + " bits.");
			scanner.close(); // Fecha a leitura de dados (Scanner)
		}
	}

}
