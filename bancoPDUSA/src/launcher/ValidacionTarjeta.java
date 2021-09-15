package launcher;

public class ValidacionTarjeta {
	
	private static ValidacionTarjeta v;
	
	public static ValidacionTarjeta getValidacionTarjeta(long n) {
		
		long[] digito = new long [16];
		long[] numero = new long [16];
		
		int s = 15;
		int cifras = 0;
		for(int i = 0; i < 16; i++) {
			long t = n % 10;
			n = n/10;
			digito[s]=t;
			cifras++;     
			s--;
		}
		
		if(v == null){
	      v = new ValidacionTarjeta();
	    }
	    
	    if(cifras==16) {
	    	int b=0;
	    	for(int i=0; i<16; i++) {
	    		if(b==0) {
	    			long c = digito[i];
	    			long d = dosdigitos(c*2);
	    			numero[i] = d;
	    			b=1;
	    		}else {
	    			numero[i] = digito[i];
	    			b=0;
	    		}
	    	}
	    	
	    	long sumaTotal = 0;
	    	for(int i=0; i<16; i++) {
	    		sumaTotal = sumaTotal+numero[i];
	    	}
	    	System.out.print(sumaTotal);
	    	
	    	long fin = sumaTotal % 10;
	    	if(fin == 0) {
	    		System.out.print("Número de tarjeta válido");
	    	}else {
	    		System.out.print("Número de tarjeta NO valido");
	    	}
	    	
	    }else {
	    	System.out.print("Los digitos de la tarjeta no tienen la dimensión correcta");
	    }
	    
	    return v;
	  }

	private static long dosdigitos(long variable) {
		
		long resultado = variable;
		long [] digito = new long [2];
		int cifras = 0;
		for(int i = 0; i < 2; i++) {
			long t = variable % 10;
			variable = variable/10;
			digito[i]=t;
			cifras++;     
		}
		if (cifras==2) {
			resultado = digito[0] + digito[1];
			return resultado;
		}else {
			return resultado;
		}
	}
}
