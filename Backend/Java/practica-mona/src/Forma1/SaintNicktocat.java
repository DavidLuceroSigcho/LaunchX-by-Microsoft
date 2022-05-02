package Forma1;

public class SaintNicktocat extends Personaje
{
    public SaintNicktocat()
    {this("Saint Clous");}

    public SaintNicktocat(String Hobby)
    {super.setHobby(Hobby);}

    @Override
    public String toString()
    {return super.toString() + String.format("and %s", Actividad());}
    @Override
    public String Actividad()
    {return "¡La mejor parte de ser Santa es entregar felicidad a todos los niñxs!";}
}
