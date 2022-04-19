package SemanaOneJava;

public class PruebaBicicleta
{
    public static void main(String[] args)
    {
        def();
    }

    public static void def()
    {
        Bicicleta biciMountain = new Bicicleta();
        biciMountain.setColor("Negra");
        biciMountain.setPins(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(13.2);

        String msg = "Soy una bici de montaña con estas caracteristicas: ";
        msg += "\nColor: "+biciMountain.getColor();
        msg += "\nVelocidad: "+biciMountain.getVelocidad();
        msg += "\nRodada: "+biciMountain.getRodada();
        msg += "\nPins:  "+biciMountain.getPins();

        System.out.print(msg);
    }
}
