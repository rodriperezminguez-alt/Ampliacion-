
import java.util.Scanner;
import java.util.ArrayList;

public class Cubifinitos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = teclado.nextInt();
		if (esCubifinito(numero)) {
			System.out.println("El número " + numero +
					" es un número cubifinito.");
		} else {
			System.out.println("El número " + numero +
					" no es un número cubifinito.");
		}
		teclado.close();
	}
	public static boolean esCubifinito(int numero) {
		int contador = 0;

		while (numero != 1 && contador < 100) {
			numero = sumaCubosDigitos(numero);
			contador++;
		}
		return numero == 1;
	}
	public static int sumaCubosDigitos(int numero) {
		int suma = 0;
		while (numero > 0) {
			int digito = numero % 10;
			suma += digito * digito * digito;
			numero = numero / 10;
		}
		return suma;
	}
}
