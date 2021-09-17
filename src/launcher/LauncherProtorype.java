package launcher;

import Producto.CDT;
import Producto.CreditoRotativo;
import model.PrototipoCDT;
import model.PrototipoCRotativo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LauncherProtorype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Calendar date = new GregorianCalendar(2021, 9, 17);
		int month = date.get(Calendar.MONTH);

		CreditoRotativo a = new PrototipoCRotativo(16,  month+6, 29, 50);
		CDT c = new PrototipoCDT(1100000);
		CDT x = c.clone();
		System.out.println(c);
		System.out.println(x);

	}
}
