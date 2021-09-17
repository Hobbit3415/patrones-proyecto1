package launcher;

import Producto.CDT;
import Producto.CreditoRotativo;
import model.PrototipoCDT;
import model.PrototipoCRotativo;

public class LauncherProtorype {

	public static void main(String[] args) throws CloneNotSupportedException {

		CreditoRotativo a = new PrototipoCRotativo(16, 18, 29, 50);
		CDT c = new PrototipoCDT(1100000);
		CDT x = c.clone();
		System.out.println(c);
		System.out.println(x);

	}
}
