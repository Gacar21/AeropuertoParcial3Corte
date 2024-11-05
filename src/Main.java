import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Datos[] = new String[10];
        Scanner sc = new Scanner(System.in);
        Pasajeros pasajero = new Pasajeros();
        Aeropuertos aeropuerto = new Aeropuertos();
        Vuelo vuelo = new Vuelo();
        Companies companies = new Companies();


        System.out.println("""
                ////// BIENVENIDO //////
                 POR FAVOR INGRESE SUS DATOS""");

        System.out.println("Ingrese su Nombre: ");
        pasajero.setNombre(sc.nextLine());
        System.out.println("Ingrese su Numero de Pasaporte: ");
        pasajero.setNumPasaporte(sc.nextLine());
        System.out.println("Ingrese su Nacionalidad: ");
        pasajero.setNacionalidad(sc.nextLine());
        System.out.println(" ");

        System.out.println("""
                POR FAVOR ELIJA QUE TIPO DE AEROPUERTO NECESITA
                1. PRIVADO
                2. PUBLICO
                3.SALIR""");

        int opc1 = sc.nextInt();
        if (opc1 == 1) {
            Datos[0] = "PRIVADO";
        } else if (opc1 == 2) {
            Datos[0] = "PUBLICO";
        }
        switch (opc1) {
            case 1:
                System.out.println("""
                        POR FAVOR ELIJA EL AEROPUERTO QUE NECESITA""");
                for (int i = 0; i < aeropuerto.getNomAero().length; i++) {
                    System.out.print(aeropuerto.getNomAero()[i] + " ");
                    System.out.println();
                }
                System.out.println();
                int opc2 = sc.nextInt();
                switch (opc2) {
                    case 1:
                        System.out.println("""
                                //// AEROPUERTO EL DORADO ///
                                ELIJA LA COMPAÑIA DE VUELO DE SU PREFERENCIA""");

                        for (int i = 0; i < companies.getCompanies().length; i++) {
                            System.out.print(companies.getCompanies()[i] + " ");

                            System.out.println();
                        }

                        int opc3 = sc.nextInt();
                        switch (opc3) {
                            case 1:
                                System.out.println("""
                                        VUELOS DISPONIBLES: """);
                                for (int i = 0; i < 4; i++) {
                                    System.out.println(i + ". " + vuelo.getOrigen()[i] + " - " + vuelo.getDestino()[i]);
                                }
                                System.out.println();

                                System.out.println("ELIJA LA OPCION QUE NECESITES");
                                int opc4 = sc.nextInt();
                                if (opc4 == 0) {
                                    Datos[3] = "BARRANCA - MEDELLIN";
                                }
                                switch (opc4) {
                                    case 0:
                                        Eldorado();
                                        System.out.println("COMPAÑIA ELEGIDA: " + companies.getCompanies()[0]);
                                        System.out.println("VUELO: " + vuelo.getID()[0][0] + " " + Datos[3]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[0][0]);


                                    case 1:

                                }

                            case 2:

                        }
                }


            case 2:
                System.out.println("""
                        POR FAVOR ELIJA EL AEROPUERTO QUE NECESITA""");
                for (int i = 0; i < aeropuerto.getNomAeropubl().length; i++) {
                    System.out.print(aeropuerto.getNomAeropubl()[i] + " ");
                }
                System.out.println();
                int opcPub1 = sc.nextInt();
                switch (opcPub1) {
                    case 1:
                        System.out.println("""
                                //// AEROPUERTO CHOCO ///
                                ELIJA LA COMPAÑIA DE VUELO DE SU PREFERENCIA""");

                        for (int i = 0; i < companies.getCompanies().length; i++) {
                            System.out.print(companies.getCompaniesPubl()[i] + " ");
                            System.out.println();
                        }
                        int opcpub2 = sc.nextInt();
                        switch (opcpub2) {
                            case 1:
                                System.out.println("""
                                        /// CHOCO /// 
                                        VUELOS DISPONIBLES: """);
                                for (int i = 0; i <4 ; i++) {
                                    System.out.println(i + ". " + vuelo.getOrigen()[i] + " - " + vuelo.getDestino()[i]);
                                }
                                System.out.println();

                                System.out.println("ELIJA LA OPCION QUE NECESITES");
                                int opcpubl4 = sc.nextInt();
                                if (opcpubl4 == 0) {
                                    Datos[3] = "BARRANCA - MEDELLIN";
                                }
                                switch (opcpubl4) {
                                    case 1:
                                        Choco();


                                        System.out.println("PRECIO: " + vuelo.getPrecio()[1][1]);
                                        System.out.println("NOMBRE: " + pasajero.getNombre());
                                        System.out.println("NUM_PASAPORTE: " + pasajero.getNumPasaporte());
                                        System.out.println("NACIONALIDAD: " + pasajero.getNacionalidad());

                                    case 2:
                                          }

                                            case 2:

                                        }
                                    case 3:

                                }



                        }

                }
        }




