
import java.util.Scanner;

public class Reversible {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
if  (esReversible(num)) {
			System.out.println("El número " + num + " es reversible.");
		} else {
			System.out.println("El número " + num + " no es reversible.");
		}
	}
	public static boolean esReversible(int num) {
		int original = num;
		int invertido = 0;
		int digitosOriginal = 0;
		int digitosInvertido = 0;

		for (int i = num; i > 0; i = i / 10) {
			invertido = invertido * 10 + i % 10;
			digitosOriginal++;
		}
		for (int i = invertido; i > 0; i = i / 10) {
			digitosInvertido++;
		}
		if (digitosOriginal != digitosInvertido) {
			return false;
		}
		int suma = original + invertido;
		for (int i = suma; i > 0; i = i / 10) {
			if ((i % 10) % 2 == 0) {
				return false;
			}
		}
		return true;
	}
}

