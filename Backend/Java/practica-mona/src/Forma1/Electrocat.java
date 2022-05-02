package Forma1;

public class Electrocat extends Personaje
{
    public Electrocat()
    {this("Electr");}

    public Electrocat(String Hobby)
    {super.setHobby(Hobby);}

    @Override
    public String toString()
    {return super.toString() + String.format("and %s", Actividad());}
    @Override
    public String Actividad()
    {return "¡La mejor parte de ser Electrico es ayudar a la gente que tenga electricidad en su casa!";}
}
