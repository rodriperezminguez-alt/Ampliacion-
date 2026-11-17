
import java.util.Scanner;

public class LLenandoPiscinas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce los litros de agua de tu piscina: ");
		int p1 = teclado.nextInt();
		System.out.print("Introduce los litros de tu barreño: ");
		int b1 = teclado.nextInt();
		System.out.print("Introduce los litros de agua que pierde tu piscina durante el viaje: ");
		int l1 = teclado.nextInt();
		System.out.print("Introduce los litros de agua de la piscina de tu vecino: ");
		int p2 = teclado.nextInt();
		System.out.print("Introduce los litros del barreño de tu vecino: ");
		int b2 = teclado.nextInt();
		System.out.print("Introduce los litros de agua que pierde la piscina de tu vecino durante el viaje: ");
		int l2 = teclado.nextInt();
		int resultado = quienGana(p1, b1, l1, p2, b2, l2);
		if (resultado == 0) {
			System.out.println("Empate");
		} else if (resultado == -1) {
			System.out.println("Gana el vecino");
		} else {
			System.out.println("Ganas tú");
		}
	}
	public static int quienGana(int p1, int b1, int l1, int p2, int b2, int l2) {
		int viajes1 = (p1 + (b1 - l1) - 1) / (b1 - l1);
		int viajes2 = (p2 + (b2 - l2) - 1) / (b2 - l2);
		if (viajes1 < viajes2) {
			return 1;
		} else if (viajes1 > viajes2) {
			return -1;
		} else {
			return 0;
		}
	}
}
