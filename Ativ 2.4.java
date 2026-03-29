import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int inc = 0;
		int cor = 0;


		do {
			System.out.println("QuestC#o 1");
			System.out.println("Considerando os princC-pios e fundamentos da LGPD, qual das aC'C5es a seguir seria mais adequada para corrigir o problema do Aprendi+, alC)m de garantir recomendaC'C5es mais justas e equitativas?");
			System.out.println("a) ReforC'ar o consentimento dos usuC!rios atuais, mas manter os dados histC3ricos intactos para preservar a coerC*ncia do algoritmo.");
			System.out.println("b) Ampliar a coleta de dados sensC-veis, como etnia e renda, sem consentimento explC-cito, para ajustar melhor as recomendaC'C5es.");
			System.out.println("c) Realizar auditoria e limpeza da base de dados, reequilibrando as informaC'C5es coletadas para que sejam adequadas, atualizadas e sem vieses, respeitando o princC-pio da qualidade dos dados previsto na LGPD."); // Correta
			System.out.println("d) Desativar o algoritmo de recomendaC'C#o atC) segunda ordem, evitando qualquer uso de dados pessoais enquanto o problema nC#o for resolvido.");
			System.out.println("e) Todas as alternativas");

			System.out.println(" ");
			System.out.print("Resposta: ");
			char res = in.next().charAt(0);

			if(res < 'a' || res > 'e') {
				System.out.println("Resposta InvC!lida");
			} else {
				if(res == 'a' || res == 'b' || res == 'd' || res == 'e') {
					System.out.println("Resposta Incorreta");
					inc++;
				} else {
					System.out.println("Resposta Correta");
					cor++;
				}
			}

		} while(inc < 3 && cor == 0);

		if (inc >= 3) {
			System.out.println("Resposta incorreta nas 3 tentativas");
		} else {
			System.out.println("Resposta Correta na tentativa "+(inc+1));
		}
	}
}