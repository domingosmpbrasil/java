import java.util.Scanner;

public class TestEntrada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		System.out.println("Dijite um valor num" + "�rico");
		valor = teclado.nextInt();
		System.out.println("voc� dijitou:" + valor);
	}
}
