import Multiples.Escenario;
import Multiples.Houses;
import Multiples.Sexo;

public class Hogwarts
{
    public static void main(String[] args)
    {
        harry();
        hermione();
        ronald();
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

}
