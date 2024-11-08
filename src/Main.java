import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Privado privado = new Privado();
        Scanner sc = new Scanner(System.in);
        Pasajeros pasajero = new Pasajeros();
        Aeropuertos aeropuerto = new Aeropuertos();
        Vuelo vuelo = new Vuelo();
        Companies companies = new Companies();
        Public publi = new Public();
        int privad = 0;
        int publico = 0;
        boolean ContinuarRegistro = true;
        stop:
        while (ContinuarRegistro) {
            if(publico != vuelo.getMaxPasajeros() || privad != vuelo.getMaxPasajeros()){
                System.out.println("""
                        ////// BIENVENIDO //////""");
                System.out.println(" ");

                int opcTipo;
                do {
                    System.out.println("""
                            POR FAVOR ELIJA QUE TIPO DE AEROPUERTO NECESITA
                            1. PRIVADO
                            2. PUBLICO
                            3. SALIR""");
                    opcTipo = sc.nextInt();
                    if (opcTipo < 1 || opcTipo > 3) {
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    }
                }while (opcTipo < 1 || opcTipo > 3);

                if (opcTipo == 3) {
                    System.out.println("Gracias por usar nuestros servicios.");
                    System.out.println(" ");
                    break stop;
                }
                sc.nextLine();

                System.out.println(" INGRESE SUS DATOS ");
                System.out.print("Ingrese su Nombre: ");
                pasajero.setNombre(sc.nextLine());
                System.out.print("Ingrese su Numero de Pasaporte: ");
                pasajero.setNumPasaporte(sc.nextLine());
                System.out.print("Ingrese su Nacionalidad: ");
                pasajero.setNacionalidad(sc.nextLine());
                System.out.println(" ");

                detener:
                switch (opcTipo) {
                    case 1:
                        int AeroDisp;
                        do {
                            System.out.println("AEROPUERTOS DISPONIBLES PRIVADOS");
                            for (int i = 0; i < aeropuerto.getNomAero().length; i++) {
                                System.out.print(i + ". " + aeropuerto.getNomAero()[i] + " " + " - " + aeropuerto.getPais()[i]);
                                System.out.println();
                            }
                            System.out.println("/// ELIGE UN AEROPUERTO ///");
                            System.out.println(" ");
                            AeroDisp = sc.nextInt();
                            if (AeroDisp < 0 || AeroDisp >= aeropuerto.getNomAero().length) {
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                System.out.println(" ");
                            }
                        }while (AeroDisp < 0 || AeroDisp >= aeropuerto.getNomAero().length);
                        switch (AeroDisp) {
                            case 0:
                                System.out.println("AEROPUERTO " + aeropuerto.getNomAero()[AeroDisp]);
                                int Companie;
                                do {
                                    System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                                    for (int i = 0; i < companies.getPrivatesuite().length; i++) {
                                        System.out.print(i + ". " + companies.getPrivatesuite()[i] + " " + " - " + aeropuerto.getCiudad()[i]);
                                        System.out.println();
                                    }
                                    System.out.println(" ");
                                    Companie = sc.nextInt();
                                    if (Companie < 0 || Companie >= companies.getPrivatesuite().length) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                }while (Companie < 0 || Companie >= companies.getPrivatesuite().length);

                                System.out.println(" ");
                                System.out.println("/// " + companies.getJFK()[Companie] + " ///");
                            case 1:
                                System.out.println("AEROPUERTO " + aeropuerto.getNomAero()[AeroDisp]);
                                int Companie2;
                                do {
                                    System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                                    for (int i = 0; i < companies.getJFK().length; i++) {
                                        System.out.print(i + ". " + companies.getJFK()[i] + " " + " - " + aeropuerto.getCiudad()[i]);
                                        System.out.println();
                                    }
                                    System.out.println(" ");
                                    Companie2 = sc.nextInt();
                                    if (Companie2 < 0 || Companie2 >= companies.getJFK().length) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                }while (Companie2 < 0 || Companie2 >= companies.getJFK().length);
                                System.out.println(" ");
                                System.out.println("/// " + companies.getJFK()[Companie2] + " ///");
                            case 2:
                                System.out.println("AEROPUERTO " + aeropuerto.getNomAero()[AeroDisp]);
                                int Companie3;
                                do {
                                    System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                                    for (int i = 0; i < companies.getJetex().length; i++) {
                                        System.out.print(i + ". " + companies.getJetex()[i] + " " + " - " + aeropuerto.getCiudad()[i]);
                                        System.out.println();
                                    }
                                    System.out.println(" ");
                                    Companie3 = sc.nextInt();
                                    if (Companie3 < 0 || Companie3 >= companies.getJetex().length) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                }while (Companie3 < 0 || Companie3 >= companies.getJetex().length);
                                System.out.println(" ");
                                System.out.println("/// " + companies.getJFK()[Companie3] + " ///");
                            case 3:
                                System.out.println("AEROPUERTO " + aeropuerto.getNomAero()[AeroDisp]);
                                int Companie4;
                                do {
                                    System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                                    for (int i = 0; i < companies.getBourget().length; i++) {
                                        System.out.print(i + ". " + companies.getBourget()[i] + " " + " - " + aeropuerto.getCiudad()[i]);
                                        System.out.println();
                                    }
                                    System.out.println(" ");
                                    Companie4 = sc.nextInt();
                                    if (Companie4 < 0 || Companie4 >= companies.getBourget().length) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                }while (Companie4 < 0 || Companie4 >= companies.getBourget().length);
                                System.out.println(" ");
                                System.out.println("/// " + companies.getJFK()[Companie4] + " ///");

                        }

                    case 2:
                }
            }
        }
    }
}
