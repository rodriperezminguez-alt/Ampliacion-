
import java.util.Scanner;

public class CodigoBarras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un código de barras (EAN-8 o EAN-13): ");
		String codigo = teclado.nextLine();
		if (codigo.length() == 8 || codigo.length() == 13) {
			boolean esValido = check(codigo);
			if (esValido) {
				System.out.println("El código de barras es válido.");
			} else {
				System.out.println("El código de barras no es válido.");
			}
		} else {
			System.out.println("El código de barras debe tener 8 o 13 dígitos.");
		}
		teclado.close();
	}
	public static boolean check(String codigo) {
		int longitud = codigo.length();
		if (longitud != 8 && longitud != 13) {
			return false;
		}
		if (!codigo.matches("[0-9]+")) {
			return false;
		}
		int suma = 0;
		for (int i = 0; i < longitud - 1; i++) {
			int digito = Character.getNumericValue(codigo.charAt(i));
			if ((longitud == 8 && i % 2 == 0) ||
					(longitud == 13 && i % 2 == 1)) {
				suma += digito * 3;
			} else {
				suma += digito;
			}
		}
		int digitoControlCalculado = (10 - (suma % 10)) % 10;
		int digitoControlReal = Character.getNumericValue(
				codigo.charAt(longitud - 1)
		);
		return digitoControlCalculado == digitoControlReal;
	}
}
