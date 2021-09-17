package Producto;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Cuenta {

    private int id_Cuenta;
    private int cupo;



    public Cuenta(int id_Cuenta, int limite_Transaccion, int cupo) {
        this.id_Cuenta = id_Cuenta;
        this.cupo = cupo;
       
    }

    public int getId_Cuenta() {
        return id_Cuenta;
    }

    public void setId_Cuenta(int id_Cuenta) {
        this.id_Cuenta = id_Cuenta;
    }


    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

}
