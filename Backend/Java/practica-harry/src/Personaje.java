public class Personaje
{
    public String nombre, sexo, sangre, boggart, patronus, casaPertenece;

    public String getNombre () {  return nombre;  }
    public String getSexo () {  return sexo;  }
    public String getboggart () {  return boggart;  }
    public String getPatronus () {  return patronus;  }
    public String getCasaPertenece () {  return casaPertenece;  }
    public String getSangre() {  return sangre;  }

    public boolean setNombre (String nombre)
    {
        if (!nombre.isEmpty())
        {
            this.nombre = nombre;
            return true;
        }
        else return false;
    }
    public boolean setSexo (String sexo)
    {
        if (!sexo.isEmpty())
        {
            this.sexo = sexo;
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
    public boolean setCasaPertenece (String casaPertenece)
    {
        if (!casaPertenece.isEmpty())
        {
            this.casaPertenece = casaPertenece;
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
}
