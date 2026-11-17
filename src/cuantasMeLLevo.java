import java.util.Scanner;

public class cuantasMeLLevo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int num1 = teclado.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = teclado.nextInt();
		int llevadas = contarLlevadas(num1, num2);
		System.out.println("Número de llevadas: " + llevadas);
	}
	public static int contarLlevadas(int num1, int num2) {
		int llevadas = 0;
		while (num1 > 0 || num2 > 0) {
			int digito1 = num1 % 10;
			int digito2 = num2 % 10;
			if (digito1 + digito2 >= 10) {
				llevadas++;
			}
			num1 /= 10;
			num2 /= 10;
		}
		return llevadas;
	}
}
