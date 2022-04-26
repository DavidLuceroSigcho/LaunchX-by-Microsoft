package SemanaTwoJava.Lunes;

abstract class Mountain
{
    Mountain ()
    {
        System.out.println("Se ha creado una bicileta de montaña");
    }
    abstract void cambiarVelocidad();
    void cambiarColor ()
    {
        System.out.println("Cambiando color a rojo");
    }
}
class Magistroni extends Mountain
{
    @Override
    void cambiarVelocidad()
    {
        System.out.println("Se debe desbloquear modificar las perillas del manubio primero");
    }
}



public class Bicicleta
{
    void cambiarVelocidad()
    {
        System.out.println("Gira la perrilla");
    }

    public static void main(String[] args)
    {
        Mountain bici1 = new Magistroni();
        Bicicleta bici2 = new Bicicleta();

        bici2.cambiarVelocidad();
        bici1.cambiarVelocidad();
        bici1.cambiarColor();
    }
}
