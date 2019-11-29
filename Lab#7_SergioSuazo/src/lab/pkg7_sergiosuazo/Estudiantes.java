
package lab.pkg7_sergiosuazo;

import java.io.Serializable;

public class Estudiantes implements Serializable{
    private String nombre;
    private int edad,cuenta;
    private Paradas parada;

    private static final long SerialVersionUID=1000L;
    public Estudiantes() {
    }

    public Estudiantes(String nombre, int edad, int cuenta, Paradas parada) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = cuenta;
        this.parada = parada;
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

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public Paradas getParada() {
        return parada;
    }

    public void setParada(Paradas parada) {
        this.parada = parada;
    }

    @Override
    public String toString() {
        return nombre + " " + edad+" "+cuenta+" ";
    }
    
    
}
