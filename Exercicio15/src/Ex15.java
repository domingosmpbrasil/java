
public class Ex15 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double lado1, lado2, lado3;
	System.out.println("dijite o primeiro lado:");
	lado1= teclado.nextDouble();
	System.out.println("dijite o segundo lado OBS maior de que o primeiro:");
	lado2= teclado.nextDouble();
	lado3=(lado1+lado2)/2;
	System.out.println("seu triango tem a soma de:"+lado3);
	if(lado3>=9 && lado3<=8) {
		System.out.println("Valeu! você acertou o primeiro lado!");
	}
	else if(lado3>=7 && lado3<7) {
		System.out.println("boa! estou gostando!");
	}
	else if(lado3>=4 && lado3<3) {
		System.out.println("falta pouco!");
	}
	else {
		System.out.println("A! que peninh!a você errou:");
		
	}
}
}
