import java.util.ArrayList;
import java.util.List;

public class Aeropuertos {
    String NomAero[] = {"EL DORADO", "GABRIELPUERTO", "SIMON BOLIVAR", "BOYACAPUERTO,"};

    String NomAeropubl[] = {"CHOCO", "AEROEXPRESS","BOLIVAR SIMON", " MONDONGO,"} ;

    String Ciudad[] = {"BOGOTA", "BARRANCA", "MEDELLIN", "BUCARAMANGA"} ;

    String Pais[]= {"COLOMBIA", "ESPAÑA", "BRAZIL", "JAPON"};


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