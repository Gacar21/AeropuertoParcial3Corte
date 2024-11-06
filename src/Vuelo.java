public class Vuelo {

    String Origen[] = {"Los angeles", "Nueva York", "Dubai" , "Paris"};
    String Destino[] = {"Nueva York" , " Los angeles", "Paris", "Dubai"};

    static String[] puestos = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] puestospubl = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};

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

    public static String[] getPuestospubl() {
        return puestospubl;
    }

    public static void setPuestospubl(String[] puestospubl) {
        Vuelo.puestospubl = puestospubl;
    }
}