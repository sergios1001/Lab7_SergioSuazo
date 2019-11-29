
package lab.pkg7_sergiosuazo;

import java.awt.Color;
import java.util.ArrayList;

public class Autobuses {
    private String ID,placa;
    private int velocidad;
    private Color color;
    private ArrayList<Estudiantes> pasajeros=new ArrayList<>();

    public Autobuses() {
    }

    public Autobuses(String ID, String placa, int velocidad, Color color) {
        this.ID = ID;
        this.placa = placa;
        this.velocidad = velocidad;
        this.color = color;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Estudiantes> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Estudiantes> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Autobuses{" + "ID=" + ID + ", placa=" + placa + ", velocidad=" + velocidad + ", color=" + color + ", pasajeros=" + pasajeros + '}';
    }
    
}
