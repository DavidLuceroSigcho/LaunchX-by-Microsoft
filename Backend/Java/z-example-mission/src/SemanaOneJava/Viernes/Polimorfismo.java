package SemanaOneJava.Viernes;

class Bike2
{
    void run()
    {
        System.out.println("running");
    }
}

public class Polimorfismo extends Bike2
{
    @Override
    void run()
    {
        System.out.println("running safely with 60miles por hora");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new Polimorfismo();
        bike2.run();
    }
}
