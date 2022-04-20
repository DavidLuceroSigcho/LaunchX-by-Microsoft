package AquaticAnimals;

import AquaticAnimals.Fish.KinderFish;
import AquaticAnimals.Fish.SalmonFish;
import AquaticAnimals.Fish.TunaFish;

public class PruebaFish
{
    public static void main(String[] args)
    {
        defKinderFish ();
        defTunaFish ();
        defSalmonFish ();
    }
    public static void defKinderFish()
    {
        KinderFish FishOcean = new KinderFish();
        FishOcean.setAlimentacion("moluscos");
        FishOcean.setColor("Negro con Blanco");
        FishOcean.setPeso(60.65);
        FishOcean.setTipo("Fish");
        FishOcean.setVelocidad(5.7);

        String msg = "\nSoy un pez tipo: " +FishOcean.getTipo();
        msg += "\nColor: "+FishOcean.getColor();
        msg += "\nVelocidad: "+FishOcean.getVelocidad()+" Kilomentros x Hora";
        msg += "\nAlimentacion: "+FishOcean.getAlimentacion();
        msg += "\nPeso: "+FishOcean.getPeso()+" Kilogramos";
        msg += "\nAutor: David Lucero Sigcho"+FishOcean.getSimb1();

        System.out.println(msg);
    }
    public static void defTunaFish()
    {
        TunaFish FishTuna = new TunaFish();
        FishTuna.setAlimentacion("moluscos");
        FishTuna.setColor("Azul Oscuro");
        FishTuna.setPeso(73.62);
        FishTuna.setTipo("Atun");
        FishTuna.setVelocidad(7.23);

        String msg = "Soy un pez tipo: " +FishTuna.getTipo();
        msg += "\nColor: "+FishTuna.getColor();
        msg += "\nVelocidad: "+FishTuna.getVelocidad()+" Kilomentros x Hora";
        msg += "\nAlimentacion: "+FishTuna.getAlimentacion();
        msg += "\nPeso: "+FishTuna.getPeso()+" Kilogramos";
        msg += "\nAutor: David Lucero Sigcho"+FishTuna.getSimb1();

        System.out.println(msg);
    }
    public static void defSalmonFish()
    {
        SalmonFish FishSalmon = new SalmonFish();
        FishSalmon.setAlimentacion("Plancton");
        FishSalmon.setColor("Rosado");
        FishSalmon.setPeso(67.95);
        FishSalmon.setTipo("Salmon");
        FishSalmon.setVelocidad(5.77);

        String msg = "Soy un pez tipo: " +FishSalmon.getTipo();
        msg += "\nColor: "+FishSalmon.getColor();
        msg += "\nVelocidad: "+FishSalmon.getVelocidad()+" Kilomentros x Hora";
        msg += "\nAlimentacion: "+FishSalmon.getAlimentacion();
        msg += "\nPeso: "+FishSalmon.getPeso()+" Kilogramos";
        msg += "\nAutor: David Lucero Sigcho"+FishSalmon.getSimb1();

        System.out.println(msg);
    }
}
