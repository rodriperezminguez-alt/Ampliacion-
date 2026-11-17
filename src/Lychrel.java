
import java.util.Scanner;

public class Lychrel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		System.out.println("Iteraciones: " + iteraciones(num));
	}
	public static int iteraciones(int num) {
		int contador = 0;
		while (num < 1000000000) {
			int invertido = 0;
			int aux = num;
			while (aux > 0) {
				invertido = invertido * 10 + aux % 10;
				aux = aux / 10;
			}
			num = num + invertido;
			contador++;
			aux = num;
			invertido = 0;
			while (aux > 0) {
				invertido = invertido * 10 + aux % 10;
				aux = aux / 10;
			}
			if (num == invertido) {
				return contador;
			}
		}
		return -1;
	}
}
