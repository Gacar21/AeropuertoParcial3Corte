import java.util.ArrayList;
import java.util.List;

public class Aeropuertos {
    String NomAero[] = {"The Private Suite", "aeropuerto JFK", " Jetex", "París-Le Bourget,"};

    String NomAeropubl[] = {" John F. Kennedy", " O'Hare "," Hartsfield-Jackson", " Los Ángeles,"} ;

    String Ciudad[] = {"Los Ángeles", "Nueva York", "Dubái", "París"} ;

    String Pais[]= {"EE. UU", "EE. UU", "Árabes Unidos", "Francia"};


    public String[] getNomAeropubl() {
        return NomAeropubl;
    }

    public void setNomAeropubl(String[] nomAeropubl) {
        NomAeropubl = nomAeropubl;
    }

    public String[] getNomAero() {
        return NomAero;
    }

    public void setNomAero(String[] nomAero) {
        NomAero = nomAero;
    }

    public String[] getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String[] ciudad) {
        Ciudad = ciudad;
    }

    public String[] getPais() {
        return Pais;
    }

    public void setPais(String[] pais) {
        Pais = pais;
    }
}