package Personajes;

import Personajes.Personaje;

public class GinnyWeasley extends Personaje
{
    public static void main(String[] args)
    {

    }
    int edad;
    String padres, fechaNacimiento;
    public GinnyWeasley()
    {
        this.padres = padres;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getEdad(){  return edad;  }
    public String getFechaNacimiento() {  return fechaNacimiento;  }
    public String getPadres () {  return padres;  }

    public boolean setEdad (int edad)
    {
        if ( edad > 10)
        {
            this.edad = edad;
            return true;
        }
        else return false;
    }
    public boolean setFechaNacimiento ( String fechaNacimiento)
    {
        if (!fechaNacimiento.isEmpty())
        {
            this.fechaNacimiento = fechaNacimiento;
            return true;
        } else return false;
    }
    public boolean setPadres(String padres)
    {
        if (!padres.isEmpty())
        {
            this.padres = padres;
            return true;
        }
        return false;
    }
}
