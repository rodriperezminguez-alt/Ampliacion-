import java.util.Scanner;

public class escaleraDeColor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el primer número de carta: ");
		int carta1 = teclado.nextInt();
		System.out.print("Introduce el segundo número de carta: ");
		int carta2 = teclado.nextInt();
		System.out.print("Introduce el tercer número de carta: ");
		int carta3 = teclado.nextInt();
		System.out.print("Introduce el cuarto número de carta: ");
		int carta4 = teclado.nextInt();
		int cartaNecesaria = escalera(carta1, carta2, carta3, carta4);
		if (cartaNecesaria == -1) {
			System.out.println("No es posible formar una escalera de color con las cartas dadas.");
		} else {
			System.out.println("La carta necesaria para formar la escalera de color más alta posible es: " + cartaNecesaria);
		}
	}
	public static int escalera(int carta1, int carta2, int carta3, int carta4) {
		int[] cartas = {carta1, carta2, carta3, carta4};
		java.util.Arrays.sort(cartas);
		int maxCarta = cartas[3];
		for (int i = 1; i <= 13; i++) {
			if (i != cartas[0] && i != cartas[1] && i != cartas[2] && i != cartas[3]) {
				int[] nuevaEscalera = {cartas[0], cartas[1], cartas[2], i};
				java.util.Arrays.sort(nuevaEscalera);
				if (nuevaEscalera[3] - nuevaEscalera[0] == 3) {
					return i;
				}
			}
		}
		return -1;
	}
}
