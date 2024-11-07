public class Vuelo {

    String Origen[] = {"Los angeles", "Nueva York", "Dubai" , "Paris"};
    String Destino[] = {"Nueva York" , " Los angeles", "Paris", "Dubai"};

    static String[] puestos = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] puestospubl = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};

    static String[] vuelo1privado = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo2privado = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo3privado = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};

    static String[] vuelo1publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo2publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo3publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};

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

    public static String[] getVuelo1privado() {
        return vuelo1privado;
    }

    public static void setVuelo1privado(String[] vuelo1privado) {
        Vuelo.vuelo1privado = vuelo1privado;
    }

    public static String[] getVuelo2privado() {
        return vuelo2privado;
    }

    public static void setVuelo2privado(String[] vuelo2privado) {
        Vuelo.vuelo2privado = vuelo2privado;
    }

    public static String[] getVuelo3privado() {
        return vuelo3privado;
    }

    public static void setVuelo3privado(String[] vuelo3privado) {
        Vuelo.vuelo3privado = vuelo3privado;
    }

    public static String[] getVuelo1publico() {
        return vuelo1publico;
    }

    public static void setVuelo1publico(String[] vuelo1publico) {
        Vuelo.vuelo1publico = vuelo1publico;
    }

    public static String[] getVuelo2publico() {
        return vuelo2publico;
    }

    public static void setVuelo2publico(String[] vuelo2publico) {
        Vuelo.vuelo2publico = vuelo2publico;
    }

    public static String[] getVuelo3publico() {
        return vuelo3publico;
    }

    public static void setVuelo3publico(String[] vuelo3publico) {
        Vuelo.vuelo3publico = vuelo3publico;
    }
}