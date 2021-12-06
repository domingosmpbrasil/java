import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			double nota1, nota2, media;
			System.out.println("dijite a primeira nota:");
			nota1= teclado.nextDouble();
			System.out.println("dijite a segunda nota:");
			nota2= teclado.nextDouble();
			media=(nota1+nota2)/2;
			System.out.println("Assua nota vale"+media);
			if(media>=8 && media<=10) {
				System.out.println("aprovado com louvor");
			}
			else if(media>=6 && media<8) {
				System.out.println("você estar aprovado!");
			}
			else if (media>=5 && media<6) {
				System.out.println("você estar de recomperação!");
			}else {
				System.out.println("você estar reprovado.");
			}
	}
}
