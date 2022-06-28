public class Empleado {

public Empleado(String nombre, String apellido, int dni, int horasTrabajadas, int valorPorHora){
    this.nombre=nombre;
    this.apellido=apellido;
    this.dni=dni;
    this.horasTrabajadas=horasTrabajadas;
    this.valorPorHora=valorPorHora;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(int valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    private String nombre;
    private String apellido;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHora;
}
