import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String Datos[] = new String[10];
        Privado privado = new Privado();
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

        int opcTipo = sc.nextInt();
        switch (opcTipo){
            case 1:
                System.out.println("AEROPUERTOS DISPONIBLES");
                for (int i = 0; i < aeropuerto.getNomAero().length ; i++) {
                    System.out.println(aeropuerto.getNomAero()[i]);
                    System.out.println();
                }
                System.out.println("/// ELIGE UN AEROPUERTO ///");
                System.out.println(" ");
                int AeroDisp = sc.nextInt();
                        System.out.println("AEROPUERTO " + aeropuerto.getNomAero()[AeroDisp]);
                        System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                        for (int i = 0; i < companies.getCompanies().length; i++) {
                            System.out.print(companies.getCompanies()[i] + " ");
                            System.out.println();
                        }
                        System.out.println(" ");
                int Companie = sc.nextInt();
                        System.out.println(" ");
                        System.out.println("/// " + companies.getCompanies()[Companie] + " ///");
                        System.out.println("/// VUELOS DISPONIBLES ///");
                        for (int i = 0; i < 4; i++) {
                            System.out.println(i + ". " + vuelo.getOrigen()[i] + " - " + vuelo.getDestino()[i]);
                        }
                int VueloDis = sc.nextInt();
                        System.out.println("SU FACTURA");
                        System.out.println("AEROPUERTO PRIVADO " + aeropuerto.getNomAero()[AeroDisp]);
                        System.out.println("COMPAÑIA " + companies.getCompanies()[Companie]);
                        if(Companie == 1 ){
                            System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[0]);
                            System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                            System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                            System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                        } else if (Companie == 2 ){
                            System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[1]);
                            System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                            System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                            System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                        } else if (Companie == 3 ){
                            System.out.println("PATROCINADOR " + privado.getPatrocinadores()[2]);
                            System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                            System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                            System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                        } else if (Companie == 4 ){
                            System.out.println("PATROCINADOR " + privado.getPatrocinadores()[3]);
                            System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                            System.out.println("UBICADO: " + aeropuerto.getCiudad()[3] + " " + aeropuerto.getPais()[3]);
                            System.out.println("PRECIO: " + vuelo.getPrecio()[3]);
                        }
                        System.out.println("NOMBRE: " + pasajero.getNombre());
                        System.out.println("NUM_PASAPORTE: " + pasajero.getNumPasaporte());
                        System.out.println("NACIONALIDAD: " + pasajero.getNacionalidad());

                        System.out.println("¿DESEAS ASIGNAR SU PUESTO?");
                        System.out.println("""
                                1.SI 
                                2.NO""");
                        int Asigpuesto = sc.nextInt();
                        switch (Asigpuesto){
                            case 1:
                                System.out.println("/// ASIENTOS DISPONIBLES ///");
                                for (int i = 0; i < vuelo.getPuestos().length ; i++) {
                                    System.out.println(vuelo.getPuestos()[i]);
                                    System.out.println(" ");
                                }
                                System.out.println("SELECCIONA UN ASIENTO");
                                int AsientoDis = sc.nextInt();
                                Vuelo.getPuestos()[AsientoDis] = "ND";
                                if(vuelo.getPuestos()[AsientoDis].equals("ND")){
                                    System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                }else {
                                    System.out.println("/// ASIENTO ASIGNADO ///");
                                    System.out.println("GRACIAS POR VOLAR CON NOSOTROS");
                                }
                                break;
                            case 2:
                                System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                                break;
                            default:
                                System.out.println("OPCION NO VALIDA");

                        }
            case 2:

                }


            }
        }

