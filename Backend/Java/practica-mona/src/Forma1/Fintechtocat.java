package Forma1;

public class Fintechtocat extends Personaje
{
    public Fintechtocat()
    {this("Tech");}

    public Fintechtocat(String Hobby)
    {super.setHobby(Hobby);}

    @Override
    public String toString()
    {return super.toString() + String.format("and %s", Actividad());}
    @Override
    public String Actividad()
    {return "¡La mejor parte de la Tecnologia es cuando desarrollar algo innovador!";}
}
