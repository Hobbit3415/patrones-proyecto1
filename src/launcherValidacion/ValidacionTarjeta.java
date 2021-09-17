package launcherValidacion;

public class ValidacionTarjeta {

	public static boolean getValidacionTarjeta(long n) {

		long[] digito = new long[16];
		long[] numero = new long[16];
		boolean f = false;

		int s = 15;
		int cifras = 0;
		for (int i = 0; i < 16; i++) {
			long t = n % 10;
			n = n / 10;
			digito[s] = t;
			cifras++;
			s--;
		}

		if (cifras == 16) {
			int b = 0;
			for (int i = 0; i < 16; i++) {
				if (b == 0) {
					long c = digito[i];
					long d = dosdigitos(c * 2);
					numero[i] = d;
					b = 1;
				} else {
					numero[i] = digito[i];
					b = 0;
				}
			}

			long sumaTotal = 0;
			for (int i = 0; i < 16; i++) {
				sumaTotal = sumaTotal + numero[i];
			}

			long fin = sumaTotal % 10;
			if (fin == 0) {
				// System.out.print("Numero de tarjeta valido");
				f = true;
			} else {
				// System.out.print("Numero de tarjeta NO valido");
				f = false;
			}

		} else {
			System.out.print("Los digitos de la tarjeta no tienen la dimension correcta");
		}

		return f;
	}

	private static long dosdigitos(long variable) {

		long resultado = variable;
		long[] digito = new long[2];
		int cifras = 0;
		for (int i = 0; i < 2; i++) {
			long t = variable % 10;
			variable = variable / 10;
			digito[i] = t;
			cifras++;
		}
		if (cifras == 2) {
			resultado = digito[0] + digito[1];
			return resultado;
		} else {
			return resultado;
		}
	}
}
