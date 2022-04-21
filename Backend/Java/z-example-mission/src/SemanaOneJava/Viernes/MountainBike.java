package SemanaOneJava.Viernes;

public class MountainBike
{
    public static void main(String[] args) {
        show();
    }

    public static void show()
    {
        Bike b = new Bike("Azul",6);
        System.out.println(b.getColor());
        System.out.println(b.getVelocidad());
    }
}
