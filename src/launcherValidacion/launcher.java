package launcherValidacion;

import java.util.Scanner;

public class launcher {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long numero;

		System.out.println("Ingrese el numero de la tarjeta: ");
		numero = sc.nextLong();
		boolean v = ValidacionTarjeta.getValidacionTarjeta(numero);
		System.out.println("\n");

	}
}
//3379513561108795