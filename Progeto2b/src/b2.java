import java.util.Scanner;

public class b2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double area, base, altura;
		System.out.println("vamos caucular a �rea de um ret�ngulo, dados sua base:");
		base = teclado.nextDouble();
		System.out.println("dijite agora � altura:");
		altura = teclado.nextDouble();
		area = base * altura;
		System.out.println("A �rea cauculada �:" + area);
	}
}
