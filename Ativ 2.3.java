import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int chars = 0;
		int nums = 0;
		int schars = 0;
		int spess = 0;

		System.out.println("Digite frase:");
		String txt = in.nextLine();

		for (int i = 0; i < txt.length(); i++) {
			char c = Character.toLowerCase(txt.charAt(i));

			if(Character.isLetter(c)) {
				chars++;
			}
			else {
				if(Character.isDigit(c)) {
					nums++;
				}
				else {
					if(c == ' ') {
						spess++;
					} else {
						schars++;
					}
				}
			}

		}
		System.out.println("Letras: "+chars);
		System.out.println("NC:meros: "+nums);
		System.out.println("Caracteres Especiais: "+schars);
		System.out.println("EspaC'o: "+spess);

	}
}