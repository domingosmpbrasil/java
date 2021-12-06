import java.util.Scanner;

public class b2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double area, base, altura;
		System.out.println("vamos caucular a área de um retângulo, dados sua base:");
		base = teclado.nextDouble();
		System.out.println("dijite agora à altura:");
		altura = teclado.nextDouble();
		area = base * altura;
		System.out.println("A área cauculada é:" + area);
	}
}
