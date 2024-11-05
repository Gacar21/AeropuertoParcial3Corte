import java.util.ArrayList;
import java.util.List;

public class Aeropuertos {
    String NomAero[] = {"0. EL DORADO, 1. GABRIELPUERTO, 2. SIMON BOLIVAR, 3. BOYACAPUERTO,"};

    String NomAeropubl[] = {"0. CHOCO, 1. AEROEXPRESS, 2.  BOLIVAR SIMON, 3. MONDONGO,"} ;

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