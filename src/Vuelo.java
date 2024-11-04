public class Vuelo {

    int MaxPasajeros = 20;

    String ID[][] = {
            {"01512, 32524, 12534, 45875"},
            {"12576, 12357, 12478, 45786"},
    } ;

    String ciudadOrigen[][] = {
            {"BARRANCA, BOGOTA, MEDELLIN, TOLIMA"},
            {"LIMA, TUNJA, SANTANDER, BOYACA"},
    } ;

    String ciudadDestino[][] = {
            {"YONDO, BUCARAMANGA, BOYACA, TUNJA"},
            {"SANTANDER, BOYACA, LIMA, MEDELLIN"},
    } ;

    String Patrocinadores[][] = {
            {"250.000, 300.000, 150.000, 78.000"},
            {"180.000, 25.000, 75.000, 52.000"},
    } ;

    public int getMaxPasajeros() {
        return MaxPasajeros;
    }

    public void setMaxPasajeros(int maxPasajeros) {
        MaxPasajeros = maxPasajeros;
    }

    public String[][] getID() {
        return ID;
    }

    public void setID(String[][] ID) {
        this.ID = ID;
    }

    public String[][] getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String[][] ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String[][] getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String[][] ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String[][] getPatrocinadores() {
        return Patrocinadores;
    }

    public void setPatrocinadores(String[][] patrocinadores) {
        Patrocinadores = patrocinadores;
    }
}