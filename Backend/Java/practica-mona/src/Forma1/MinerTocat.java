package Forma1;

public class MinerTocat extends Personaje
{
    public MinerTocat()
    {this("Miner");}

    public MinerTocat(String Hobby)
    {super.setHobby(Hobby);}

    @Override
    public String toString()
    {return super.toString() + String.format("and %s", Actividad());}
    @Override
    public String Actividad()
    {return "¡La mejor parte de la minería es cuando encuentras oro!";}
}
