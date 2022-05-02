import Forma1.*;

public class TestMona1
{
    public static void main(String[] args)
    {
        Personaje[] myMona = new Personaje[7];
        Personaje Luchadora = new Luchadortocat("Luchador", true, "Turquoise");
        Personaje Miner = new MinerTocat();
        Personaje SaintClous = new SaintNicktocat();
        Personaje LabMona = new Labtocat();
        Personaje Sentry = new Sentrytocat();
        Personaje FinTech = new Fintechtocat();
        Personaje ElectroMona = new Electrocat();

        myMona[0] = Luchadora;
        myMona[1] = Miner;
        myMona[2] = SaintClous;
        myMona[3] = LabMona;
        myMona[4] = Sentry;
        myMona[5] = FinTech;
        myMona[6] = ElectroMona;

        for (Personaje mona: myMona)
            System.out.println(mona);
    }
}
