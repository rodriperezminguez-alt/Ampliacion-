import java.util.Scanner;

public class Año2013 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un año: ");
		int año = teclado.nextInt();
		int primerAño = primerSerie(año);
		System.out.println("El primer año de la serie es: " + primerAño);
	}
	public static int primerSerie(int año) {
		boolean tieneDigitosRepetidos = tieneDigitosRepetidos(año);
		if (tieneDigitosRepetidos) {
			while (tieneDigitosRepetidos) {
				año--;
				tieneDigitosRepetidos = tieneDigitosRepetidos(año);
			}
			return año + 1;
		} else {
			while (!tieneDigitosRepetidos) {
				año--;
				tieneDigitosRepetidos = tieneDigitosRepetidos(año);
			}
			return año + 1;
		}
	}
	public static boolean tieneDigitosRepetidos(int año) {
		String añoStr = Integer.toString(año);
		for (int i = 0; i < añoStr.length(); i++) {
			for (int j = i + 1; j < añoStr.length(); j++) {
				if (añoStr.charAt(i) == añoStr.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
}