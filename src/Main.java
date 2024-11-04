import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Datos[] = new String[10];
        Scanner sc = new Scanner(System.in);
        Pasajeros pasajero = new Pasajeros();
        Aeropuertos aeropuerto = new Aeropuertos();
        Privado privado = new Privado();
        Vuelo vuelo = new Vuelo();
             System.out.println("""
               ////// BIENVENIDO //////
                POR FAVOR INGRESE SUS DATOS""");

        System.out.println("Ingrese su Nombre: ");
        pasajero.setNombre(sc.nextLine());
        System.out.println("Ingrese su Numero de Pasaporte: ");
        pasajero.setNumPasaporte(sc.nextLine());
        System.out.println("Ingrese su Nacionalidad: ");
        pasajero.setNacionalidad(sc.nextLine());

        System.out.println("DATOS ALMACENADOS ");
        System.out.println("""
                POR FAVOR ELIJA QUE TIPO DE AEROPUERTO NECESITA
                1. PRIVADO
                2. PUBLICO
                3.SALIR""");

        int opc1 = sc.nextInt();
        if(opc1==1){
            Datos[0] = "PRIVADO";
        }
        switch (opc1) {
            case 1:
                System.out.println("""
                        POR FAVOR ELIJA EL AEROPUERTO QUE NECESITA""");
                for (int i = 0; i < aeropuerto.getNomAero().length; i++) {
                    for (int j = 0; j < aeropuerto.getNomAero()[i].length; j++) {

                        System.out.print(aeropuerto.getNomAero()[i][j] + " ");

                    }
                    System.out.println();
                }
                System.out.println();
                int opc2 = sc.nextInt();
                if(opc2==1){
                    Datos[1] = "EL DORADO";
                }
                switch (opc2) {
                    case 1:
                        System.out.println("""
                                VUELOS DISPONIBLES: """);
                        for (int i = 0; i < 4; i++) {
                            System.out.println(i + ". " + vuelo.getOrigen()[i] + " - " + vuelo.getDestino()[i]);
                        }
                        System.out.println();
                       }
                System.out.println("ELIJA LA OPCION QUE NECESITES");
                    int opc3 = sc.nextInt();
                    if(opc3==0){
                        Datos[3] = "BARRANCA - MEDELLIN";
                    }
                    switch (opc3) {
                        case 0:
                            System.out.println("/// FACTURA ///");
                            System.out.println("AEROPUERTO: " + Datos[0] + " " + Datos[1]);
                            System.out.println("PROVEEDOR: " + privado.getPatrocinadores()[0][0]);
                            System.out.println("UBICADO: " + aeropuerto.getCiudad()[0][0] + " "+ aeropuerto.getPais()[0][0]);
                            System.out.println("VUELO: " + vuelo.getID()[0][0] + " " + Datos[3]);
                            System.out.println("PRECIO: " + vuelo.getPrecio()[0][0]);
                            System.out.println("NOMBRE: " + pasajero.getNombre());
                            System.out.println("NUM_PASAPORTE: " + pasajero.getNumPasaporte());
                            System.out.println("NACIONALIDAD: " + pasajero.getNacionalidad());


                    }

                break;

            case 2:
        }

    }

}