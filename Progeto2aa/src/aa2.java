import java.util.Scanner;

public class aa2 {
public static void main(String[] args) {
Scanner teclado =new Scanner(System.in);
double lado, area, media;
System.out.println("escreva aqui o lado:");
	lado=teclado.nextDouble();
	System.out.println("dijite � �rea para ser cauculada!");
	area=teclado.nextDouble();
	media=lado*area;
	System.out.println("� �rea cauculada �:"+media);
}
}
