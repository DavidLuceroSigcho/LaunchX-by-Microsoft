package Forma1;

public class Labtocat extends Personaje
{
    public Labtocat()
    {this("Lab");}

    public Labtocat(String Hobby)
    {super.setHobby(Hobby);}

    @Override
    public String toString()
    {return super.toString() + String.format("and %s", Actividad());}
    @Override
    public String Actividad()
    {return "¡La mejor parte de ser Cientifico es descubir algo para ayudar a la sociedad!";}
}
