import java.util.Scanner;

public class Radares {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce la distancia entre los radares (en metros): ");
		int distancia = teclado.nextInt();
		System.out.print("Introduce la velocidad máxima permitida (en km/h): ");
		int velocidadMaxima = teclado.nextInt();
		System.out.print("Introduce el tiempo empleado (en segundos): ");
		int tiempo = teclado.nextInt();
		int velocidadMedia = calcularVelocidadMedia(distancia, tiempo);
		if (velocidadMedia > velocidadMaxima) {
			System.out.println("El coche ha superado la velocidad máxima permitida.");
		} else {
			System.out.println("El coche no ha superado la velocidad máxima permitida.");
		}
	}
public static int calcularVelocidadMedia(int distancia, int tiempo) {
		double distanciaKm = distancia / 1000.0;
		double tiempoHoras = tiempo / 3600.0;
		return (int)(distanciaKm / tiempoHoras);
	}
}
