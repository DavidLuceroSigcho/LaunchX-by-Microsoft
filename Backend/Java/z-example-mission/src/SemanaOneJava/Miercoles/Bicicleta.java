package SemanaOneJava.Miercoles;

public class Bicicleta {
    // Caracteristicas - Campos - Propiedades del Objeto
    public int pins, rodada;
    public double velocidad;
    public String color;
    public char simb1 = 10;

    public double getVelocidad () {  return velocidad;  }
    public String getColor () {  return  color;  }
    public int getRodada () {  return rodada;  }
    public int getPins () {  return pins;  }

    public boolean setPins (int pins)
    {
        if (pins > 0) {
            this.pins = pins;
            return true;
        } else
            return false;
    }
    public boolean setRodada (int rodada)
    {
        if (rodada > 0) {
            this.rodada = rodada;
            return true;
        } else
            return false;
    }
    public boolean setVelocidad (double velocidad)
    {
        if (velocidad >= 0) {
            this.velocidad = velocidad;
            return true;
        } else
            return false;
    }
    public boolean setColor (String color)
    {
        if (!color.isEmpty()) {
            this.color = color;
            return true;
        } else
            return false;
    }
    // Simb1 es el Line Feed como codigo ascii numero 10
    public String printState (){
        return "pins: "+pins+simb1+
                "rodada: "+rodada+simb1+
                "color: "+color+simb1+
                "velocidad: "+velocidad;
    }
}