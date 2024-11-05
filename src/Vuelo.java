public class Vuelo {

    String Origen[] = {"BARRANCA", "BOGOTA", "MEDELLIN" , "TOLIMA"};
    String Destino[] = {"MEDELLIN" , " TUNJA", "BUCARAMANGA", "SANTAMARTA"};

    static String[] puestos = {"1A", "2B", "3C", "4D", "5E", "6F", "7G", "8H"};

    String ID[] = {"01512", "32524", "12534", "45875"};

    String Precio[] = {"250.000", "300.000", "150.000", "78.000"};


    int MaxPasajeros = 8;

    public String[] getOrigen() {
        return Origen;
    }

    public void setOrigen(String[] origen) {
        Origen = origen;
    }

    public String[] getDestino() {
        return Destino;
    }

    public void setDestino(String[] destino) {
        Destino = destino;
    }

    public int getMaxPasajeros() {
        return MaxPasajeros;
    }

    public void setMaxPasajeros(int maxPasajeros) {
        MaxPasajeros = maxPasajeros;
    }

    public String[] getID() {
        return ID;
    }

    public void setID(String[] ID) {
        this.ID = ID;
    }

    public String[] getPrecio() {
        return Precio;
    }

    public void setPrecio(String[] precio) {
        Precio = precio;
    }

    public static String[] getPuestos() {
        return puestos;
    }

    public void setPuestos(String[] puestos) {
        this.puestos = puestos;
    }
}