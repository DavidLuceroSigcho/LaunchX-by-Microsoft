package SemanaOneJava.Viernes;
/*
Overload: Sobrecarga = Tenemos el mismo nombre pero diferentes asignaturas
Override: Redefine = Existe en varias clases en Java. Ej. Hijo, Hija
Overwrite: Sobreescribe
 */
public class Bike {
    private int velocidad;
    private String color, marca;

    public Bike ()
    {

    }
    public Bike (String color){  this.color = color;  }
    public Bike (String color, int velocidad)
    {
        this.velocidad = velocidad;
        this.color = color;
    }
    public Bike (String color, String marca, int velocidad)
    {
        this.velocidad = velocidad;
        this.color = color;
        this.marca = marca;
    }
    public int getVelocidad() {  return velocidad;  }
    public String getColor() {  return color;  }
    public String getMarca() {  return marca;  }
}
