package Forma1;

public class Luchadortocat extends Personaje
{
    private boolean Mascara;
    private String ColorTraje;

    public Luchadortocat()
    {this("Luchador", true, "Turquoise");}

    public Luchadortocat(String Hobby,boolean Mascara, String ColorTraje)
    {
        super.setHobby(Hobby);
        this.Mascara = Mascara;
        this.ColorTraje = ColorTraje;
    }

    public boolean isMascara() {  return Mascara;  }

    public void setMascara(boolean Mascara) {this.Mascara = Mascara;}
    public void setColorTraje(String ColorTraje) {this.ColorTraje = ColorTraje;}

    public String getColorTraje() {return ColorTraje;}

    @Override
    public String toString()
    {return super.toString() + String.format("and %s", Actividad());}

    @Override
    public String Actividad()
    {
        return "Me gusta la Lucha Libre";
    }
}
