import java.util.Scanner;

public class EvaluarExpresion {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una expresión en notación postfija: ");
		String expresion = teclado.nextLine();
		int resultado = evaluarExpresion(expresion);
		System.out.println("El resultado de la expresión es: " + resultado);
	}

	public static int evaluarExpresion(String expresion) {
		String[] elementos = expresion.split(" ");
		int[] pila = new int[elementos.length];
		int tope = -1;
		for (int i = 0; i < elementos.length; i++) {
			String elemento = elementos[i];
			if (esOperando(elemento)) {
				tope++;
				pila[tope] = Integer.parseInt(elemento);
			} else {
				int operando2 = pila[tope];
				tope--;
				int operando1 = pila[tope];
				tope--;
				int resultado = aplicarOperacion(operando1, operando2, elemento);
				tope++;
				pila[tope] = resultado;
			}
		}
		return pila[tope];
	}
	public static boolean esOperando(String elemento) {
		if (elemento.equals("+") || elemento.equals("-") || elemento.equals("*") || elemento.equals("/")) {
			return false;
		} else {
			return true;
		}
	}
	public static int aplicarOperacion(int operando1, int operando2, String operador) {
		switch (operador) {
			case "+":
				return operando1 + operando2;
			case "-":
				return operando1 - operando2;
			case "*":
				return operando1 * operando2;
			case "/":
				return operando1 / operando2;
			default:
				return 0;
		}
	}
}


