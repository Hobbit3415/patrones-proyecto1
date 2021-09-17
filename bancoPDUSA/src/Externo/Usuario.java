package Externo;

public class Usuario {

    int id;
    int edad;
    boolean esEmpleado;
    String nombre;

    public Usuario(String nombre, int edad, boolean esEmpleado) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.esEmpleado = esEmpleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getEsEmpleado() {
        return esEmpleado;
    }

    public void setEstado_laboral(String estado_laboral) {
        this.esEmpleado = esEmpleado;
    }
}
