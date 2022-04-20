package AquaticAnimals.Fish;

public class KinderFish
{
    //Caracteristicas
    public String tipo, alimentacion, color, autor;
    public double velocidad, peso;
    public char simb1 = 10;

    //
    public String getTipo () {  return tipo;  }
    public String getAlimentacion () {  return alimentacion;  }
    public String getAutor () {  return autor;  }
    public String getColor () {  return color;  }
    public double getVelocidad () {  return velocidad;  }
    public double getPeso () {  return peso;  }
    public char getSimb1 () {  return simb1;  }

    public boolean setTipo (String tipo)
    {
        if (!tipo.isEmpty())
        {
            this.tipo = tipo;
            return true;
        }
        else return false;
    }
    public boolean setAlimentacion (String alimentacion)
    {
        if (!alimentacion.isEmpty())
        {
            this.alimentacion = tipo;
            return true;
        }
        else return false;
    }
    public boolean setColor (String color)
    {
        if (!color.isEmpty())
        {
            this.color = color;
            return true;
        }
        else return false;
    }
    public boolean setVelocidad (double velocidad)
    {
        if (velocidad >= 3)
        {
            this.velocidad = velocidad;
            return true;
        }
        else return false;
    }
    public boolean setPeso (double peso)
    {
        if (peso >= 50)
        {
            this.peso = peso;
            return true;
        }
        else return false;
    }
    // Simb1 es el Line Feed cdg Ascii #10
    public String printState ()
    {
        return "Tipo: "+tipo+simb1+
                "Alimentacion: "+alimentacion+simb1+
                "Color: "+color+simb1+
                "Velocidad: "+velocidad+simb1+
                "Peso: "+peso;
    }

}
