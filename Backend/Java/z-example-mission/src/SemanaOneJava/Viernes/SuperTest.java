package SemanaOneJava.Viernes;

class Animal
{
    //Caso 1
    String color = "Blanco";
    //Caso2
    void eat()
    {System.out.println("Comiendo...");}
    //Caso3
    Animal()
    {System.out.println("Se crea un animal");}
}

class Gato extends Animal
{
    //Caso 1
    String color = "Cafe";
    void printColor ()
    {
        System.out.println("Colo de la clase Gato: "+color);
        System.out.println("Color de la clase Animal: "+ super.color);
    }
    //Caso2
    void eat()
    {
        System.out.println("Come Atun");
    }
    void dormir()
    {
        System.out.println("Ya se durmio el michi");
    }
    void call()
    {
        super.eat();
        dormir();
    }

    Gato()
    {
        super();
        System.out.println("Se ha creado un gato");
    }
}
public class SuperTest
{
    public static void main(String[] args)
    {
        //Caso1
        //new Gato().printColor();

        //Caso2
        //new Gato().call();

        //Caso3
        new Gato();
    }
}
