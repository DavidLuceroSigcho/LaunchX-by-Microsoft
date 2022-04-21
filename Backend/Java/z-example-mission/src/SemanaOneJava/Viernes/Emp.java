package SemanaOneJava.Viernes;

import java.util.EmptyStackException;

class Persona
{
    int id;
    String nombre;

    Persona(int id, String nombre)
    {
        this.id = id;
        this.nombre = nombre;
    }
}
public class Emp extends Persona
{
    double salario;
    Emp(int id, String nombre, double salario)
    {
        super(id, nombre);
        this.salario = salario;
    }
    void display ()
    {
        System.out.println(id+" "+nombre+" "+salario);
    }
}
class TestPersonaEmpleado
{
    public static void main(String[] args) {
        Emp e = new Emp(1,"David",4550.35);
        e.display();
    }

}
