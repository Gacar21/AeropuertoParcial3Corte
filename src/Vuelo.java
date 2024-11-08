public class Vuelo {

    String Origen[] = {"Los angeles", "Nueva York", "Dubai" , "Paris"};
    String Origen2[] = {"Los angeles", "Nueva York", "Dubai" , "Paris"};
    String Origen3[] = {"Los angeles", "Nueva York", "Dubai" , "Paris"};
    String Origen4[] = {"Los angeles", "Nueva York", "Dubai" , "Paris"};
    String Destino[] = {"Nueva York" , " Los angeles", "Paris", "Dubai"};
    String Destino2[] = {"Nueva York" , " Los angeles", "Paris", "Dubai"};
    String Destino3[] = {"Nueva York" , " Los angeles", "Paris", "Dubai"};
    String Destino4[] = {"Nueva York" , " Los angeles", "Paris", "Dubai"};

    //vuelos privados
    static String[] vuelo1privado = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo2privado = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo3privado = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo4privado = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};

    static String[] vuelo1privado2 = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo2privado3 = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo3privado4 = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo4privado5 = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};

    static String[] vuelo1privado6 = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo2privado7 = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo3privado8 = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo4privado9 = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};

    static String[] vuelo5privado = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo6privado = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo7privado = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo8privado = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};

    //vuelos publicos
    static String[] vuelo1publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo2publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo3publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo4publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};

    static String[] vuelo5publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo6publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo7publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo8publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};

    static String[] vuelo9publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo10publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo11publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo12publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};

    static String[] vuelo13publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo14publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo15publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};
    static String[] vuelo16publico = {"0A", "1B", "2C", "3D", "4E", "5F", "6G", "7H"};

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

    public static String[] getVuelo4privado() {
        return vuelo4privado;
    }

    public static void setVuelo4privado(String[] vuelo4privado) {
        Vuelo.vuelo4privado = vuelo4privado;
    }

    public static String[] getVuelo4publico() {
        return vuelo4publico;
    }

    public String[] getOrigen2() {
        return Origen2;
    }

    public void setOrigen2(String[] origen2) {
        Origen2 = origen2;
    }

    public String[] getOrigen3() {
        return Origen3;
    }

    public void setOrigen3(String[] origen3) {
        Origen3 = origen3;
    }

    public String[] getOrigen4() {
        return Origen4;
    }

    public void setOrigen4(String[] origen4) {
        Origen4 = origen4;
    }

    public String[] getDestino2() {
        return Destino2;
    }

    public void setDestino2(String[] destino2) {
        Destino2 = destino2;
    }

    public String[] getDestino3() {
        return Destino3;
    }

    public void setDestino3(String[] destino3) {
        Destino3 = destino3;
    }

    public String[] getDestino4() {
        return Destino4;
    }

    public void setDestino4(String[] destino4) {
        Destino4 = destino4;
    }

    public static void setVuelo4publico(String[] vuelo4publico) {
        Vuelo.vuelo4publico = vuelo4publico;

    }


    public static String[] getVuelo1privado2() {
        return vuelo1privado2;
    }

    public static void setVuelo1privado2(String[] vuelo1privado2) {
        Vuelo.vuelo1privado2 = vuelo1privado2;
    }

    public static String[] getVuelo2privado3() {
        return vuelo2privado3;
    }

    public static void setVuelo2privado3(String[] vuelo2privado3) {
        Vuelo.vuelo2privado3 = vuelo2privado3;
    }

    public static String[] getVuelo3privado4() {
        return vuelo3privado4;
    }

    public static void setVuelo3privado4(String[] vuelo3privado4) {
        Vuelo.vuelo3privado4 = vuelo3privado4;
    }

    public static String[] getVuelo4privado5() {
        return vuelo4privado5;
    }

    public static void setVuelo4privado5(String[] vuelo4privado5) {
        Vuelo.vuelo4privado5 = vuelo4privado5;
    }

    public static String[] getVuelo1privado6() {
        return vuelo1privado6;
    }

    public static void setVuelo1privado6(String[] vuelo1privado6) {
        Vuelo.vuelo1privado6 = vuelo1privado6;
    }

    public static String[] getVuelo2privado7() {
        return vuelo2privado7;
    }

    public static void setVuelo2privado7(String[] vuelo2privado7) {
        Vuelo.vuelo2privado7 = vuelo2privado7;
    }

    public static String[] getVuelo3privado8() {
        return vuelo3privado8;
    }

    public static void setVuelo3privado8(String[] vuelo3privado8) {
        Vuelo.vuelo3privado8 = vuelo3privado8;
    }

    public static String[] getVuelo4privado9() {
        return vuelo4privado9;
    }

    public static void setVuelo4privado9(String[] vuelo4privado9) {
        Vuelo.vuelo4privado9 = vuelo4privado9;
    }

    public static String[] getVuelo5privado() {
        return vuelo5privado;
    }

    public static void setVuelo5privado(String[] vuelo5privado) {
        Vuelo.vuelo5privado = vuelo5privado;
    }

    public static String[] getVuelo6privado() {
        return vuelo6privado;
    }

    public static void setVuelo6privado(String[] vuelo6privado) {
        Vuelo.vuelo6privado = vuelo6privado;
    }

    public static String[] getVuelo7privado() {
        return vuelo7privado;
    }

    public static void setVuelo7privado(String[] vuelo7privado) {
        Vuelo.vuelo7privado = vuelo7privado;
    }

    public static String[] getVuelo8privado() {
        return vuelo8privado;
    }

    public static void setVuelo8privado(String[] vuelo8privado) {
        Vuelo.vuelo8privado = vuelo8privado;
    }

    public static String[] getVuelo5publico() {
        return vuelo5publico;
    }

    public static void setVuelo5publico(String[] vuelo5publico) {
        Vuelo.vuelo5publico = vuelo5publico;
    }

    public static String[] getVuelo6publico() {
        return vuelo6publico;
    }

    public static void setVuelo6publico(String[] vuelo6publico) {
        Vuelo.vuelo6publico = vuelo6publico;
    }

    public static String[] getVuelo7publico() {
        return vuelo7publico;
    }

    public static void setVuelo7publico(String[] vuelo7publico) {
        Vuelo.vuelo7publico = vuelo7publico;
    }

    public static String[] getVuelo8publico() {
        return vuelo8publico;
    }

    public static void setVuelo8publico(String[] vuelo8publico) {
        Vuelo.vuelo8publico = vuelo8publico;
    }

    public static String[] getVuelo9publico() {
        return vuelo9publico;
    }

    public static void setVuelo9publico(String[] vuelo9publico) {
        Vuelo.vuelo9publico = vuelo9publico;
    }

    public static String[] getVuelo10publico() {
        return vuelo10publico;
    }

    public static void setVuelo10publico(String[] vuelo10publico) {
        Vuelo.vuelo10publico = vuelo10publico;
    }

    public static String[] getVuelo11publico() {
        return vuelo11publico;
    }

    public static void setVuelo11publico(String[] vuelo11publico) {
        Vuelo.vuelo11publico = vuelo11publico;
    }

    public static String[] getVuelo12publico() {
        return vuelo12publico;
    }

    public static void setVuelo12publico(String[] vuelo12publico) {
        Vuelo.vuelo12publico = vuelo12publico;
    }

    public static String[] getVuelo13publico() {
        return vuelo13publico;
    }

    public static void setVuelo13publico(String[] vuelo13publico) {
        Vuelo.vuelo13publico = vuelo13publico;
    }

    public static String[] getVuelo14publico() {
        return vuelo14publico;
    }

    public static void setVuelo14publico(String[] vuelo14publico) {
        Vuelo.vuelo14publico = vuelo14publico;
    }

    public static String[] getVuelo15publico() {
        return vuelo15publico;
    }

    public static void setVuelo15publico(String[] vuelo15publico) {
        Vuelo.vuelo15publico = vuelo15publico;
    }

    public static String[] getVuelo16publico() {
        return vuelo16publico;
    }

    public static void setVuelo16publico(String[] vuelo16publico) {
        Vuelo.vuelo16publico = vuelo16publico;
    }
}
