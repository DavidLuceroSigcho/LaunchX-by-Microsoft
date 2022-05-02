package Forma1;

public abstract class Personaje
{
    private String
            Nombre = "Mona",
            Color_Ojos = "Marrón claro",
            Hobby;

    public Personaje()
    {
    }

    public String getNombre() {  return Nombre;  }
    public String getHobby() {  return Hobby;  }
    public String getColor_Ojos() {  return Color_Ojos;  }

    public void setNombre(String Nombre) {this.Nombre = Nombre;}
    public void setColor_Ojos(String color_Ojos) {this.Color_Ojos = color_Ojos;}
    public void setHobby(String hobby) {this.Hobby = hobby;}

    @Override
    public String toString()
    {return String.format("\nHola! Mi nombre es %s, mis ojos son de color %s. Mi hobby es %s ", Nombre, Color_Ojos, Hobby);}

    public abstract String Actividad();
}
