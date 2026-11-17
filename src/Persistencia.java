import java.util.Scanner;

public class Persistencia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();
		int persistencia = calcularPersistencia(numero);
		System.out.println("La persistencia multiplicativa de " + numero + " es: " + persistencia);
	}
	public static int calcularPersistencia(int numero) {
		int persistencia = 0;
		while (numero >= 10) {
			numero = multiplicarDigitos(numero);
			persistencia++;
		}
		return persistencia;
	}
	public static int multiplicarDigitos(int numero) {
		int producto = 1;
		while (numero > 0) {
			producto *= numero % 10;
			numero /= 10;
		}
		return producto;
	}
}
