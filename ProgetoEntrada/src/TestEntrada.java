import java.util.Scanner;

public class TestEntrada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		System.out.println("Dijite um valor num" + "érico");
		valor = teclado.nextInt();
		System.out.println("você dijitou:" + valor);
	}
}
