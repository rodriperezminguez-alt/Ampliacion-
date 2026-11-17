import java.util.Scanner;

public class vampiros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número de cuatro dígitos: ");
		int numero = teclado.nextInt();
		if (numero >= 1000 && numero <= 9999) {
			if (esNumeroVampiro(numero)) {
				System.out.println("El número " + numero + " es un número vampiro.");
			} else {
				System.out.println("El número " + numero + " no es un número vampiro.");
			}
		} else {
			System.out.println("El número no es válido. Debe tener cuatro dígitos.");
		}
	}
	public static boolean esNumeroVampiro (int numero) {
		int[] digitos = new int[4];
		for (int i = 0; i < 4; i++) {
			digitos[i] = numero % 10;
			numero /= 10;
		}
		java.util.Arrays.sort(digitos);
		for (int i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				if (i * j == numero) {
					int[] colmillos = new int[4];
					colmillos[0] = i / 10;
					colmillos[1] = i % 10;
					colmillos[2] = j / 10;
					colmillos[3] = j % 10;
					java.util.Arrays.sort(colmillos);
					if (java.util.Arrays.equals(digitos, colmillos)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
