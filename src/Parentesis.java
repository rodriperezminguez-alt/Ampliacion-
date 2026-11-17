import java.util.Scanner;

public class Parentesis {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una cadena de caracteres: ");
		String cadena = teclado.nextLine();
		if (estaBalanceada(cadena)) {
			System.out.println("La cadena está correctamente balanceada.");
		} else {
			System.out.println("La cadena no está correctamente balanceada.");
		}
	}
	public static boolean estaBalanceada(String cadena) {
		int balance = 0;
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				balance++;
			} else if (c == ')' || c == ']' || c == '}') {
				balance--;
		}
		}
		return balance == 0;
	}


}
