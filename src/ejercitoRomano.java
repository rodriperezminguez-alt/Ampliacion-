import java.util.Scanner;

public class ejercitoRomano {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el número de legionarios: ");
		int legionarios = teclado.nextInt();
		int escudos = cuantosEscudos(legionarios);
		System.out.println("Número de escudos necesarios: " + escudos);
	}
	public static int cuantosEscudos(int legionarios) {
		int escudos = 0;
		while (legionarios > 0) {
			int lado = 1;
			while (lado * lado <= legionarios) {
				lado++;
			}
			lado--;
			int legionariosEnFormacion = lado * lado;
			escudos += legionariosEnFormacion + 4 * lado;
			legionarios -= legionariosEnFormacion;
		}
		return escudos;
	}
}
