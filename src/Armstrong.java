import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número de tres cifras: ");
		int numero = teclado.nextInt();
		boolean esArmstrong = esNumeroArmstrong(numero);
		if (esArmstrong) {
			System.out.println("El número " + numero + " es un número Armstrong.");
		} else {
			System.out.println("El número " + numero + " no es un número Armstrong.");
		}
	}

	public static boolean esNumeroArmstrong(int numero) {
		int suma = 0;
		while (numero> 0) {
			int digito = numero % 10;
			suma += digito * digito * digito;
			numero /= 10;
		}
		return suma == numero;
	}
}
