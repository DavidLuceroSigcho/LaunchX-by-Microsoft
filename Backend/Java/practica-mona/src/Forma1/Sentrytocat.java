package Forma1;

public class Sentrytocat extends Personaje
{
    public Sentrytocat()
    {this("Tech");}

    public Sentrytocat(String Hobby)
    {super.setHobby(Hobby);}

    @Override
    public String toString()
    {return super.toString() + String.format("and %s", Actividad());}
    @Override
    public String Actividad()
    {return "¡La mejor parte de ser Bomber es ayudar a la gente en los incendios!";}
}
