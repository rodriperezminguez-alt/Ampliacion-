import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la cantidad de números que quieres introducir: ");
		int cantidad = sc.nextInt();
		int[] numeros = new int[cantidad];
		for (int i = 0; i < cantidad; i++) {
			System.out.print("Introduce el número " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}
		bubbleSort(numeros);
		System.out.println("Números ordenados: ");
		for (int i = 0; i < cantidad; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
	public static void bubbleSort(int[] numeros) {
		int n = numeros.length;
			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n - i - 1; j++) {
					if (numeros[j] > numeros[j + 1]) {
						int temp = numeros[j];
						numeros[j] = numeros[j + 1];
						numeros[j + 1] = temp;
					}
				}
			}
		}
	}

