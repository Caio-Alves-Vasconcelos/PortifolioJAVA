/* Crie um programa chamado "teste de ansiedade" onde o usuário responderá a 10 perguntas específicas para o resultado final. 
 * O usuário pode responder apenas com "sim" ou "não" para cada pergunta. 
 * As perguntas específicas são:
 * 1. Você se sente com dificuldade de concentração?
 * 2. Você se sente cansado facilmente?
 * 3. Tem dificuldade em adormecer ou permanecer a dormir?
 * 4. Você se preocupa muito com o futuro?
 * 5. Tem dificuldade em relaxar?
 * 6. Sentiu-se tão preocupado que foi dificil ficar parado?
 * 7. Sentiu-se facilmente irritável ou chateado?
 * 8. Sentiu medo como se algo de muito ruim fosse acontecer?
 * 9. Você se preocupa com a opinião dos outros?
 * 10. Você está com dificuldade em lembrar dos detalhes?
 * 
 * Se o user digitar 'sim' em sete ou mais perguntas, a impressão será: 
 * "Você possui fortes indícios de ansiedade. Faça terapia."
 * 
 * Se o user responder 'sim' em menos de 5 perguntas a impressão será:
 * "Você está aparentemente bem e sem riscos de ansiedade. "
 * 
 * --> Se o user responder 'sim' em 5 ou 6 perguntas a impressão será:
 * "Você precisa cuidar do seu corpo e da mente. Procure orientação médica. "
 */

import java.util.Scanner;

public class Teste_de_Ansiedade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		String[] perguntas = { 
				"1. Você se sente com dificuldade de concentração?",
				"2. Você se sente cansado facilmente?", 
				"3. Tem dificuldade em adormecer ou permanecer a dormir?",
				"4. Você se preocupa muito com o futuro?", "5. Tem dificuldade em relaxar?",
				"6. Sentiu-se tão preocupado que foi dificil ficar parado?",
				"7. Sentiu-se facilmente irritável ou chateado?",
				"8. Sentiu medo como se algo de muito ruim fosse acontecer?",
				"9. Você se preocupa com a opinião dos outros?",
				"10. Você está com dificuldade em lembrar dos detalhes?" };

		for (String pergunta : perguntas) { // Laço for que fará as perguntas contidas no array
			System.out.println(pergunta);
			boolean respostaValida = false; // Booleano para verificar se as respostas aceitas - 'sim' ou 'não' vão ser
											// aceitas
			while (!respostaValida) { // Enquanto respostaValida não for verdadeira ele não sairá do loop.
				String resposta = sc.nextLine();
				if (resposta.equalsIgnoreCase("Sim")) {
					cont++;
					respostaValida = true;
				} else if (resposta.equalsIgnoreCase("Não")) {
					respostaValida = true;
				} else {
					System.out.println("Resposta inválida!");
					System.out.println(pergunta);
				}
			}
		}

		if (cont >= 7) {
			System.out.println("Você possui fortes indícios de ansiedade. Faça terapia.");
		} else if (cont >= 5 && cont <= 6) {
			System.out.println("Você precisa cuidar do seu corpo e da mente. Procure orientação médica.");
		} else {
			System.out.println("Você está aparentemente bem e sem riscos de ansiedade. ");
		}
		
		sc.close();
	}

}
