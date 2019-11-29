package lab.pkg7_sergiosuazo;

import java.io.Serializable;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Paradas implements Serializable{
    private String nombre;
    private int distancia,angulo,x,y;

    private static final long SerialVersionUID=1002L;
    
    public Paradas() {
    }

    public Paradas(String nombre, int distancia, int angulo) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.angulo = angulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public int getX() {
        return x;
    }

    public void setX() {
        this.x = (int) (this.distancia*cos(this.angulo));
    }

    public int getY() {
        return y;
    }

    public void setY() {
        this.y = (int) (this.distancia*sin(this.angulo));;
    }

    @Override
    public String toString() {
        return "Paradas{" + "nombre=" + nombre + ", distancia=" + distancia + ", angulo=" + angulo + ", x=" + x + ", y=" + y + '}';
    }
    
}
