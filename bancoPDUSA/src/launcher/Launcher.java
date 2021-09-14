package launcher;

import model.PrototipoCDT;
import model.PrototipoCRotativo;
import producto.CDT;
import producto.CreditoRotativo;


public class Launcher {

	public static void main (String[] args) throws CloneNotSupportedException{
		
		CreditoRotativo a = new PrototipoCRotativo(16,18,29,50);
		CDT c = new PrototipoCDT(15,24,32);
		
		System.out.println(a);
		System.out.println(c);
		
	}
}
