import java.util.Scanner;

public class NumerosAfortunados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		if (!sc.hasNextInt()) {
			System.out.println("ERROR! Introduce un numero entero.");
			return;
		}
		int n = sc.nextInt();
		if (n < 2) {
			System.out.println("El numero debe ser mayor o igual a 2.");
			return;
		}
		int[] n_array = new int[n];
		int cantidad = n;
		for (int i = 0; i < n; i++) {
			n_array[i] = i + 1;
		}
		int numero_m = 2;
		while (cantidad >= numero_m) {
			cantidad = eliminar(n_array, cantidad, numero_m);
			numero_m++;
		}
		System.out.print("Numeros afortunados: ");
		for (int i = 0; i < cantidad; i++) {
			System.out.print(n_array[i] + " ");
		}
	}
	public static int eliminar ( int[] numeros, int cantidad, int m){
		for (int i = 0; i < cantidad; i += m - 1) {
			for (int j = i; j < cantidad - 1; j++) {
				numeros[j] = numeros[j + 1];
			}
				cantidad--;
			}
			return cantidad;
		}
	}



