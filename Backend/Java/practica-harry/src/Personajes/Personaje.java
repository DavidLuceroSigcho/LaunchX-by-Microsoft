package Personajes;

import Multiples.Escenario;
import Multiples.Houses;
import Multiples.Sexo;

public class Personaje
{
    public String nombre, sangre, boggart, patronus;
    public Houses houses;
    public Sexo sexo;
    public Escenario escenario;

    public Personaje ()
    {

    }

    public Personaje (String nombre, String sangre, String boggart, String patronus)
    {
        this.nombre = nombre;
        this.sangre = sangre;
        this.boggart = boggart;
        this.patronus = patronus;
        this.escenario = escenario;
        this.houses = houses;
        this.sexo = sexo;
    }

    // GETTERS
    public Sexo getSexo () {  return sexo;  }
    public String getSangre () {  return sangre;  }
    public Houses getHouses () {  return houses;  }
    public String getNombre () {  return nombre;  }
    public String getboggart () {  return boggart;  }
    public String getPatronus () {  return patronus;  }
    public Escenario getEscenario () {  return escenario;  }

    public boolean setNombre (String nombre)
    {
        if (!nombre.isEmpty())
        {
            this.nombre = nombre;
            return true;
        }
        else return false;
    }
    public boolean setBoggart (String boggart)
    {
        if (!boggart.isEmpty())
        {
            this.boggart = boggart;
            return true;
        }
        else return false;
    }
    public boolean setPatronus (String patronus)
    {
        if (!patronus.isEmpty())
        {
            this.patronus = patronus;
            return true;
        }
        else return false;
    }
    public boolean setSangre (String sangre)
    {
        if (!sangre.isEmpty())
        {
            this.sangre = sangre;
            return true;
        }
        else return false;
    }
    public void setHouses(Houses houses)
    {
        this.houses = houses;
    }
    public void setSexo(Sexo sexo)
    {
        this.sexo = sexo;
    }
    public void setEscenario(Escenario escenario)
    {
        this.escenario = escenario;
    }

    public String showMessage()
    {
        return "Nombre: "+nombre+
                "Sangre: "+sangre+
                "Boggart: "+boggart+
                "Patronus: "+patronus;
    }
}
