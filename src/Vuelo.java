public class Vuelo {

    String Origen[] = {"BARRANCA", "BOGOTA", "MEDELLIN" , "TOLIMA"};
    String Destino[] = {"MEDELLIN" , " TUNJA", "BUCARAMANGA", "SANTAMARTA"};



    int MaxPasajeros = 20;




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

    String ID[] = {"01512", "32524", "12534", "45875"};

    String Precio[] = {"250.000", "300.000", "150.000", "78.000"};


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
}