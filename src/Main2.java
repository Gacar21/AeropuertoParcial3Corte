import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Privado privado = new Privado();
        Scanner sc = new Scanner(System.in);
        Pasajeros pasajero = new Pasajeros();
        Aeropuertos aeropuerto = new Aeropuertos();
        Vuelo vuelo = new Vuelo();
        Companies companies = new Companies();
        int privad = 0;
        int publico = 0;

        boolean ContinuarRegistro = true;
        stop:
        while (ContinuarRegistro) {



        if(publico != vuelo.getMaxPasajeros() || privad != vuelo.getMaxPasajeros()){
            System.out.println("""
                ////// BIENVENIDO //////""");
            System.out.println(" ");

            System.out.println("""
                POR FAVOR ELIJA QUE TIPO DE AEROPUERTO NECESITA
                1. PRIVADO
                2. PUBLICO
                3.SALIR""");

            int opcTipo = sc.nextInt();
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
            switch (opcTipo){
                case 1:
                    System.out.println("AEROPUERTOS DISPONIBLES PRIVADOS");
                    for (int i = 0; i < aeropuerto.getNomAero().length ; i++) {
                        System.out.print(i + ". " + aeropuerto.getNomAero()[i] + " ");
                        System.out.println();
                    }
                    System.out.println("/// ELIGE UN AEROPUERTO ///");
                    System.out.println(" ");
                    int AeroDisp = sc.nextInt();
                    System.out.println("AEROPUERTO " + aeropuerto.getNomAero()[AeroDisp]);
                    System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                    for (int i = 0; i < companies.getCompanies().length; i++) {
                        System.out.print(i + ". " + companies.getCompanies()[i] + " ");
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
                    if(Companie == 0 ){
                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[0]);
                        System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                        System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                    } else if (Companie == 1 ){
                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[1]);
                        System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                        System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                    } else if (Companie == 2 ){
                        System.out.println("PATROCINADOR " + privado.getPatrocinadores()[2]);
                        System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                        System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                    } else if (Companie == 3 ){
                        System.out.println("PATROCINADOR " + privado.getPatrocinadores()[3]);
                        System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[3] + " " + aeropuerto.getPais()[3]);
                        System.out.println("PRECIO: " + vuelo.getPrecio()[3]);
                    } else if (Companie > 3 ){
                        System.out.println("OPCION NO VALIDA");
                        break;
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
                            if(privad != vuelo.getMaxPasajeros()){
                                System.out.println("/// ASIENTOS DISPONIBLES ///");
                                for (int i = 0; i < vuelo.getPuestos().length ; i++) {
                                    System.out.print(vuelo.getPuestos()[i] + " ");
                                }
                                System.out.println();
                                System.out.println("SELECCIONA UN ASIENTO");
                                int AsientoDis = sc.nextInt();
                                privad++;
                                Vuelo.getPuestos()[AsientoDis] = "ND";
                                if(vuelo.getPuestos()[AsientoDis].equals("ND")){
                                    System.out.println("/// ASIENTO ASIGNADO ///");
                                    System.out.println("GRACIAS POR VOLAR CON NOSOTROS");
                                    System.out.println(" ");
                                    break detener;
                                }else {
                                    System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                    Asigpuesto = 1;

                                }
                            }else {
                                System.out.println(" NO HAY MAS ASIENTOS DISPONIBLES ");
                                System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                                break stop;
                            }



                        case 2:
                            System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                            System.out.println(" ");
                            break detener;

                        default:
                            System.out.println("OPCION NO VALIDA");
                            Asigpuesto = 1;
                    }
                case 2:
                    System.out.println("AEROPUERTOS DISPONIBLES");
                    for (int i = 0; i < aeropuerto.getNomAeropubl().length ; i++) {
                        System.out.print(i + ". " + aeropuerto.getNomAeropubl()[i] + " ");
                        System.out.println();
                    }
                    System.out.println("/// ELIGE UN AEROPUERTO ///");
                    System.out.println(" ");
                    int AeroDispPubl = sc.nextInt();
                    System.out.println("AEROPUERTO " + aeropuerto.getNomAeropubl()[AeroDispPubl]);
                    System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                    for (int i = 0; i < companies.getCompaniesPubl().length; i++) {
                        System.out.print(i + ". " + companies.getCompaniesPubl()[i] + " ");
                        System.out.println();
                    }
                    System.out.println(" ");
                    int CompaniePubl = sc.nextInt();
                    System.out.println(" ");
                    System.out.println("/// " + companies.getCompanies()[CompaniePubl] + " ///");
                    System.out.println("/// VUELOS DISPONIBLES ///");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(i + ". " + vuelo.getOrigen()[i] + " - " + vuelo.getDestino()[i]);
                    }
                    int VueloDisPubl = sc.nextInt();
                    System.out.println("SU FACTURA");
                    System.out.println("AEROPUERTO PUBLICO " + aeropuerto.getNomAero()[AeroDispPubl]);
                    System.out.println("COMPAÑIA " + companies.getCompanies()[CompaniePubl]);
                    if(CompaniePubl == 0 ){
                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[0]);
                        System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen()[VueloDisPubl] + " - " + vuelo.getDestino()[VueloDisPubl]);
                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                        System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                    } else if (CompaniePubl == 1 ){
                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[1]);
                        System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen()[VueloDisPubl] + " - " + vuelo.getDestino()[VueloDisPubl]);
                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                        System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                    } else if (CompaniePubl == 2 ){
                        System.out.println("PATROCINADOR " + privado.getPatrocinadores()[2]);
                        System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen()[VueloDisPubl] + " - " + vuelo.getDestino()[VueloDisPubl]);
                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                        System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                    } else if (CompaniePubl == 3 ){
                        System.out.println("PATROCINADOR " + privado.getPatrocinadores()[3]);
                        System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen()[VueloDisPubl] + " - " + vuelo.getDestino()[VueloDisPubl]);
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
                    int AsigpuestoPubl = sc.nextInt();
                    switch (AsigpuestoPubl){
                        case 1:
                            if(publico != vuelo.MaxPasajeros){
                                System.out.println("/// ASIENTOS DISPONIBLES ///");
                                for (int i = 0; i < vuelo.getPuestospubl().length ; i++) {
                                    System.out.print(vuelo.getPuestospubl()[i] + " ");
                                }
                                System.out.println();
                                System.out.println("SELECCIONA UN ASIENTO");
                                int AsientoDis = sc.nextInt();
                                publico++;
                                Vuelo.getPuestospubl()[AsientoDis] = "ND";
                                if(vuelo.getPuestospubl()[AsientoDis].equals("ND")){
                                    System.out.println("/// ASIENTO ASIGNADO ///");
                                    System.out.println("GRACIAS POR VOLAR CON NOSOTROS");
                                    System.out.println(" ");
                                    break detener;

                                }else {
                                    System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                    AsigpuestoPubl = 1;
                                }
                            }else {
                                System.out.println(" NO HAY MAS ASIENTOS DISPONIBLES ");
                                System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                                break stop;
                            }


                        case 2:
                            System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                            break detener;

                        default:
                            System.out.println("OPCION NO VALIDA");
                            AsigpuestoPubl = 1;

                    }
            }
            System.out.println(" ");
        }else {
            System.out.println("NO HAY MAS PUESTOS DISPONIBLES ");
        }



        }
    }
}

