import java.util.Scanner;

public class Lucky_Number {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce tu fecha de nacimiento (DDMMYYYY): ");
		String fecha = teclado.nextLine();
		int suma = sumarDigitos(fecha);
		int numeroSuerte = reducirNumero(suma);
		System.out.println("Tu número de la suerte es: " + numeroSuerte);
	}

	public static int sumarDigitos(String fecha) {
		int suma = 0;
		for (int i = 0; i < fecha.length(); i++) {
			suma += Character.getNumericValue(fecha.charAt(i));
		}
		return suma;
	}

	public static int reducirNumero(int numero) {
		while (numero >= 10) {
			int suma = 0;
			while (numero > 0) {
				suma += numero % 10;
				numero /= 10;
			}
			numero = suma;
		}
		return numero;
	}
}






