import Multiples.Escenario;
import Multiples.Houses;
import Multiples.Sexo;
import Personajes.*;

public class Hogwarts
{
    public static void main(String[] args)
    {
        harry();
        hermione();
        ronald();
        ginny();
        draco();
        lunalove();
        severus();
        albus();
    }
    // Inicializamos a Harry Potter
    public static void harry()
    {
        HarryPotter Harry = new HarryPotter();
        Harry.setNombre("Harry James Potter");
        Harry.setEdad(21);
        Harry.setFechaNacimiento("31 Julio 1980");
        Harry.setSexo(Sexo.Masculino);
        Harry.setSangre("Mestizo");
        Harry.setBoggart("Dementor");
        Harry.setPatronus("Ciervo");
        Harry.setHouses(Houses.Gryffindor);
        Harry.setPadres("James Potter & Lily J Potter");
        Harry.setEscenario(Escenario.Capts);

        // Mostramos a Harry Potter
        String msg = "\nUn resumen acerca de mi:";
        msg+=   "\nSoy "+Harry.getNombre()+", "+"tengo "+Harry.getEdad()+" años, "+"mi cumpleaños es "+Harry.getFechaNacimiento()+
                "\nMe identifico como "+ Harry.sexo+", "+"tengo sangre de "+Harry.getSangre()+". "+
                "\nMi boggart es "+Harry.getboggart()+", "+"mi patronous es "+Harry.getPatronus()+"."+
                "\nPertenezco a la Casa de "+ Harry.houses+", "+"Mis padres son "+Harry.getPadres()+"."+
                "\nAparezco en los "+ Harry.escenario;
        // Imprimimos a Harry Potter
        System.out.println(msg);
    }
    // Inicializamos a Hermione Granger
    public static void hermione ()
    {
        HermioneGranger Hermione = new HermioneGranger();
        Hermione.setNombre("Hermione Jean Grander");
        Hermione.setEdad(21);
        Hermione.setFechaNacimiento("19 Septiembre 1979");
        Hermione.setSexo(Sexo.Femenino);
        Hermione.setSangre("Muggle");
        Hermione.setBoggart("La profesiora McGonagall diciendole que reprobo todo");
        Hermione.setPatronus("Nutria");
        Hermione.setHouses(Houses.Gryffindor);
        Hermione.setPadres("Mr. Father & Mrs. Granger");

        // Mostramos a Hermione Granger
        String msg = "\nUn resumen acerca de mi:";
        msg+=   "\nSoy "+Hermione.getNombre()+", "+"tengo "+Hermione.getEdad()+" años, "+"mi cumpleaños es "+Hermione.getFechaNacimiento()+
                "\nMe identifico como "+Hermione.sexo+", "+"tengo sangre de "+Hermione.getSangre()+". "+
                "\nMi boggart es "+Hermione.getboggart()+", "+"mi patronous es "+Hermione.getPatronus()+"."+
                "\nPertenezco a la Casa de "+ Hermione.houses+", "+"Mis padres son "+Hermione.getPadres()+".";
        // Imprimimos a Hermione Granger
        System.out.println(msg);
    }
    // Inicializamos a Ronald Weasley
    public static void ronald()
    {
        RonaldWeasley Ronald = new RonaldWeasley();
        Ronald.setNombre("Ronald Billius Weasley");
        Ronald.setEdad(21);
        Ronald.setFechaNacimiento("1 Marzo 1980");
        Ronald.setSexo(Sexo.Masculino);
        Ronald.setSangre("Muggle");
        Ronald.setBoggart("La profesiora McGonagall diciendole que reprobo todo");
        Ronald.setPatronus("Nutria");
        Ronald.setHouses(Houses.Gryffindor);
        Ronald.setPadres("Arthur Weasley & Molly Weasley");

        // Mostramos a Ronald Weasley
        String msg = "\nUn resumen acerca de mi:";
        msg+=   "\nSoy "+Ronald.getNombre()+", "+"tengo "+Ronald.getEdad()+" años, "+"mi cumpleaños es "+Ronald.getFechaNacimiento()+
                "\nMe identifico como "+Ronald.sexo+", "+"tengo sangre de "+Ronald.getSangre()+". "+
                "\nMi boggart es "+Ronald.getboggart()+", "+"mi patronous es "+Ronald.getPatronus()+"."+
                "\nPertenezco a la Casa de "+Ronald.houses+", "+"Mis padres son "+Ronald.getPadres()+".";
        // Imprimimos a Ronald Weasley
        System.out.println(msg);
    }
    // Inicializamos a Ginny Weasly
    public static void ginny ()
    {
        GinnyWeasley Ginny = new GinnyWeasley();
        Ginny.setNombre("Ronald Billius Weasley");
        Ginny.setEdad(21);
        Ginny.setFechaNacimiento("1 Marzo 1980");
        Ginny.setSexo(Sexo.Femenino);
        Ginny.setSangre("Muggle");
        Ginny.setBoggart("La profesiora McGonagall diciendole que reprobo todo");
        Ginny.setPatronus("Nutria");
        Ginny.setHouses(Houses.Gryffindor);
        Ginny.setPadres("Arthur Weasley & Molly Weasley");

        // Mostramos a Ginny Weasley
        String msg = "\nUn resumen acerca de mi:";
        msg+=   "\nSoy "+Ginny.getNombre()+", "+"tengo "+Ginny.getEdad()+" años, "+"mi cumpleaños es "+Ginny.getFechaNacimiento()+
                "\nMe identifico como "+Ginny.sexo+", "+"tengo sangre de "+Ginny.getSangre()+". "+
                "\nMi boggart es "+Ginny.getboggart()+", "+"mi patronous es "+Ginny.getPatronus()+"."+
                "\nPertenezco a la Casa de "+Ginny.houses+", "+"Mis padres son "+Ginny.getPadres()+".";
        // Imprimimos a Ronald Weasley
        System.out.println(msg);
    }
    // Inicializamos a Hermione Granger
    public static void lunalove ()
    {
        LunaLovegood LunaLove = new LunaLovegood();
        LunaLove.setNombre("LunaLove Scamander");
        LunaLove.setEdad(22);
        LunaLove.setFechaNacimiento("13 Febrero 1981");
        LunaLove.setSexo(Sexo.Femenino);
        LunaLove.setSangre("Pure Blood or Half Blood");
        LunaLove.setBoggart("None");
        LunaLove.setPatronus("Hare");
        LunaLove.setHouses(Houses.Ravenclaw);
        LunaLove.setPadres("Xenophilius Lovegood & Pandora Lovegood");

        // Mostramos a LunaLove Granger
        String msg = "\nUn resumen acerca de mi:";
        msg+=   "\nSoy "+LunaLove.getNombre()+", "+"tengo "+LunaLove.getEdad()+" años, "+"mi cumpleaños es "+LunaLove.getFechaNacimiento()+
                "\nMe identifico como "+LunaLove.sexo+", "+"tengo sangre de "+LunaLove.getSangre()+". "+
                "\nMi boggart es "+LunaLove.getboggart()+", "+"mi patronous es "+LunaLove.getPatronus()+"."+
                "\nPertenezco a la Casa de "+ LunaLove.houses+", "+"Mis padres son "+LunaLove.getPadres()+".";
        // Imprimimos a LunaLove Granger
        System.out.println(msg);
    }
    // Inicializamos a Draco Malfoy
    public static void draco()
    {
        DracoMalfoy Draco = new DracoMalfoy();
        Draco.setNombre("Draco Lucius Malfoy");
        Draco.setEdad(21);
        Draco.setFechaNacimiento("5 Junio 1980");
        Draco.setSexo(Sexo.Masculino);
        Draco.setSangre("Pure Blood");
        Draco.setBoggart("Lord Voldemort");
        Draco.setPatronus("None");
        Draco.setHouses(Houses.Slytherin);
        Draco.setPadres("Lucius Malfoy & Narcisa Malfoy");

        // Mostramos a Draco Malfoy
        String msg = "\nUn resumen acerca de mi:";
        msg+=   "\nSoy "+Draco.getNombre()+", "+"tengo "+Draco.getEdad()+" años, "+"mi cumpleaños es "+Draco.getFechaNacimiento()+
                "\nMe identifico como "+Draco.sexo+", "+"tengo sangre de "+Draco.getSangre()+". "+
                "\nMi boggart es "+Draco.getboggart()+", "+"mi patronous es "+Draco.getPatronus()+"."+
                "\nPertenezco a la Casa de "+Draco.houses+", "+"Mis padres son "+Draco.getPadres()+".";
        // Imprimimos a Draco Malfoy
        System.out.println(msg);
    }
    // Inicializamos a Severus Snape
    public static void severus()
    {
        SeverusSnape Severus = new SeverusSnape();
        Severus.setNombre("Severus Snape");
        Severus.setEdad(38);
        Severus.setFechaNacimiento("9 Enero 1960");
        Severus.setSexo(Sexo.Masculino);
        Severus.setSangre("Half Blood");
        Severus.setBoggart("Lord Voldemort");
        Severus.setPatronus("Doe");
        Severus.setHouses(Houses.Slytherin);
        Severus.setPadres("Tobias Snape & Eileen Prince");

        // Mostramos a Severus Snape
        String msg = "\nUn resumen acerca de mi:";
        msg+=   "\nSoy "+Severus.getNombre()+", "+"tengo "+Severus.getEdad()+" años, "+"mi cumpleaños es "+Severus.getFechaNacimiento()+
                "\nMe identifico como "+Severus.sexo+", "+"tengo sangre de "+Severus.getSangre()+". "+
                "\nMi boggart es "+Severus.getboggart()+", "+"mi patronous es "+Severus.getPatronus()+"."+
                "\nPertenezco a la Casa de "+Severus.houses+", "+"Mis padres son "+Severus.getPadres()+".";
        // Imprimimos a Severus Snape
        System.out.println(msg);
    }
    // Inicializamos a Albus Dumbledore
    public static void albus()
    {
        AlbusDumbledore Albus = new AlbusDumbledore();
        Albus.setNombre("Albus Percival Wulfric Brian Dumbledore");
        Albus.setEdad(115);
        Albus.setFechaNacimiento("# Agosto 1881");
        Albus.setSexo(Sexo.Masculino);
        Albus.setSangre("Half Blood");
        Albus.setBoggart("The Corpse of his sister");
        Albus.setPatronus("Phoenix");
        Albus.setHouses(Houses.Slytherin);
        Albus.setPadres("Percival Dumbledore & Kendra Dumbledore");

        // Mostramos a Albus Dumbledore
        String msg = "\nUn resumen acerca de mi:";
        msg+=   "\nSoy "+Albus.getNombre()+", "+"tengo "+Albus.getEdad()+" años, "+"mi cumpleaños es "+Albus.getFechaNacimiento()+
                "\nMe identifico como "+Albus.sexo+", "+"tengo sangre de "+Albus.getSangre()+". "+
                "\nMi boggart es "+Albus.getboggart()+", "+"mi patronous es "+Albus.getPatronus()+"."+
                "\nPertenezco a la Casa de "+Albus.houses+", "+"Mis padres son "+Albus.getPadres()+".";
        // Imprimimos a Albus Snape
        System.out.println(msg);
    }
}
