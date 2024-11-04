import java.util.ArrayList;
import java.util.List;

public class Aeropuertos {
    String NomAero[][] = {
            {"1. EL DORADO, 2. GABRIELPUERTO, 3. SIMON BOLIVAR, 4. BOYACAPUERTO,"},
            {"5. EL PLATINO, 6. EL BRONCE, 7. EL AMARILLO, 8. EL NARANJA"},
    } ;

    String Ciudad[][] = {
            {"BOGOTA", "BARRANCA", "MEDELLIN", "BUCARAMANGA"},
            {"TUNJA", "YONDO", "SANTAMARTA", "CHOCO"},
    } ;



    String Pais[][] = {
            {"COLOMBIA", "ESPAÑA", "BRAZIL", "JAPON"},
            {"ARGENTINA", "VENEZUELA", "ECUADOR", "PERU"},
    } ;

    public String[][] getNomAero() {
        return NomAero;
    }

    public void setNomAero(String[][] nomAero) {
        NomAero = nomAero;
    }

    public String[][] getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String[][] ciudad) {
        Ciudad = ciudad;
    }

    public String[][] getPais() {
        return Pais;
    }

    public void setPais(String[][] pais) {
        Pais = pais;
    }
}