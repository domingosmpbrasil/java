import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double km, litros, media;
		System.out.println("dijite a quilometragem pecorrida!");
		km = teclado.nextDouble();
		System.out.println("quantos litros for�o necessarios?");
		litros = teclado.nextDouble();
		media=km/litros;
System.out.println("o consumo m�ximo foi:"+media);

	}
}
