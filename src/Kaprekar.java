import java.util.Scanner;

public class Kaprekar {
	public static void main(String[] args) {
		//haz q salgan las sumas y restas de cada iteracion y el numero de iteraciones hasta llegar a 6174

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número de cuatro dígitos (al menos dos dígitos diferentes): ");
		int numero = teclado.nextInt();
		int iteraciones = 0;
		if (numero >= 1000 && numero <= 9999) {
			while (numero != 6174) {
				numero = rutinaKaprekar(numero);
				iteraciones++;
				System.out.println("Iteración " + iteraciones + ": " + numero);
			}
			System.out.println("Se ha alcanzado la constante de Kaprekar: 6174 en " + iteraciones + " iteraciones.");
		} else {
			System.out.println("El número no es válido. Debe tener cuatro dígitos y al menos dos dígitos diferentes.");
		}
	}
	public static int rutinaKaprekar(int numero) {
		int ascendente = ordenarAscendente(numero);
		int descendente = ordenarDescendente(numero);
		return descendente - ascendente;
	}

	public static int ordenarAscendente(int numero) {
		int[] digitos = new int[4];
		for (int i = 0; i < 4; i++) {
			digitos[i] = numero % 10;
			numero /= 10;
		}
		java.util.Arrays.sort(digitos);
		return digitos[0] * 1000 + digitos[1] * 100 + digitos[2] * 10 + digitos[3];
	}

	public static int ordenarDescendente(int numero) {
		int[] digitos = new int[4];
		for (int i = 0; i < 4; i++) {
			digitos[i] = numero % 10;
			numero /= 10;
		}
		java.util.Arrays.sort(digitos);
		return digitos[3] * 1000 + digitos[2] * 100 + digitos[1] * 10 + digitos[0];
	}
}