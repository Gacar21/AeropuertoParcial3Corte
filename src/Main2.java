import java.util.Scanner;

public class Main2 {
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
            if (publico != vuelo.getMaxPasajeros() || privad != vuelo.getMaxPasajeros()) {
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
                } while (opcTipo < 1 || opcTipo > 3);

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
                        } while (AeroDisp < 0 || AeroDisp >= aeropuerto.getNomAero().length);
                        System.out.println("AEROPUERTO " + aeropuerto.getNomAero()[AeroDisp]);

                        int Companie;
                        do {
                            System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                            for (int i = 0; i < companies.getJFK().length; i++) {
                                System.out.print(i + ". " + companies.getJFK()[i] + " " + " - " + aeropuerto.getCiudad()[i]);
                                System.out.println();
                            }
                            System.out.println(" ");
                            Companie = sc.nextInt();
                            if (Companie < 0 || Companie >= companies.getJFK().length) {
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                System.out.println(" ");
                            }
                        } while (Companie < 0 || Companie >= companies.getJFK().length);

                        System.out.println(" ");
                        System.out.println("/// " + companies.getJFK()[Companie] + " ///");

                        int VueloDis;
                        do {
                            System.out.println("/// VUELOS DISPONIBLES ///");
                            for (int i = 0; i < 4; i++) {
                                System.out.println(i + ". " + vuelo.getOrigen()[i] + " - " + vuelo.getDestino()[i]);
                            }
                            VueloDis = sc.nextInt();
                            if (VueloDis < 0 || VueloDis >= 4) {
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                System.out.println(" ");
                            }
                        } while (VueloDis < 0 || VueloDis >= 4);


                        System.out.println("SU FACTURA");
                        System.out.println("AEROPUERTO PRIVADO " + aeropuerto.getNomAero()[AeroDisp]);
                        System.out.println("COMPAÑIA " + companies.getJFK()[Companie]);


                        switch (Companie) {
                            case 0:
                                System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[0]);
                                System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                                System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                                System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                                break;
                            case 1:
                                System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[1]);
                                System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                                System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                                System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                                break;
                            case 2:
                                System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[2]);
                                System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                                System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                                System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                                break;
                            case 3:
                                System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[3]);
                                System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                                System.out.println("UBICADO: " + aeropuerto.getCiudad()[3] + " " + aeropuerto.getPais()[3]);
                                System.out.println("PRECIO: " + vuelo.getPrecio()[3]);
                                break;
                        }

                        System.out.println("NOMBRE: " + pasajero.getNombre());
                        System.out.println("NUM_PASAPORTE: " + pasajero.getNumPasaporte());
                        System.out.println("NACIONALIDAD: " + pasajero.getNacionalidad());

                        int Asigpuesto;
                        do {
                            System.out.println("¿DESEAS ASIGNAR SU PUESTO?");
                            System.out.println("""
                                    1. SI 
                                    2. NO""");
                            Asigpuesto = sc.nextInt();
                            if (Asigpuesto != 1 && Asigpuesto != 2) {
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                System.out.println(" ");
                            }
                        } while (Asigpuesto != 1 && Asigpuesto != 2);

                        switch (Asigpuesto) {
                            case 1:
                                if (VueloDis == 0) {
                                    if (privad != vuelo.getMaxPasajeros()) {
                                        int AsientoDisPub;
                                        do {
                                            System.out.println("/// ASIENTOS DISPONIBLES ///");
                                            for (int i = 0; i < vuelo.getVuelo1privado().length; i++) {
                                                System.out.print(vuelo.getVuelo1privado()[i] + " ");
                                            }
                                            System.out.println();
                                            System.out.println("SELECCIONA UN ASIENTO");
                                            AsientoDisPub = sc.nextInt();
                                            if (AsientoDisPub < 0 || AsientoDisPub >= vuelo.getVuelo1privado().length) {
                                                System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            if (vuelo.getVuelo1privado()[AsientoDisPub].equals("ND")) {
                                                System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            privad++;
                                            vuelo.getVuelo1privado()[AsientoDisPub] = "ND";
                                            System.out.println("/// ASIENTO ASIGNADO ///");
                                            System.out.println("GRACIAS POR VOLAR CON NOSOTROS");
                                            System.out.println(" ");
                                            break;
                                        } while (true);
                                    } else {
                                        System.out.println(" NO HAY MAS ASIENTOS DISPONIBLES ");
                                        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                                        break stop;
                                    }
                                    break detener;
                                } else if (VueloDis == 1) {
                                    if (privad != vuelo.getMaxPasajeros()) {
                                        int AsientoDis;
                                        do {
                                            System.out.println("/// ASIENTOS DISPONIBLES ///");
                                            for (int i = 0; i < vuelo.getVuelo2privado().length; i++) {
                                                System.out.print(vuelo.getVuelo2privado()[i] + " ");
                                            }
                                            System.out.println();
                                            System.out.println("SELECCIONA UN ASIENTO");
                                            AsientoDis = sc.nextInt();
                                            if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo2privado().length) {
                                                System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            if (vuelo.getVuelo2privado()[AsientoDis].equals("ND")) {
                                                System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            privad++;
                                            vuelo.getVuelo2privado()[AsientoDis] = "ND";
                                            System.out.println("/// ASIENTO ASIGNADO ///");
                                            System.out.println("GRACIAS POR VOLAR CON NOSOTROS");
                                            System.out.println(" ");
                                            break;
                                        } while (true);
                                    } else {
                                        System.out.println(" NO HAY MAS ASIENTOS DISPONIBLES ");
                                        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                                        break stop;
                                    }
                                    break detener;
                                } else if (VueloDis == 2) {
                                    if (privad != vuelo.getMaxPasajeros()) {
                                        int AsientoDis;
                                        do {
                                            System.out.println("/// ASIENTOS DISPONIBLES ///");
                                            for (int i = 0; i < vuelo.getVuelo3privado().length; i++) {
                                                System.out.print(vuelo.getVuelo3privado()[i] + " ");
                                            }
                                            System.out.println();
                                            System.out.println("SELECCIONA UN ASIENTO");
                                            AsientoDis = sc.nextInt();
                                            if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo3privado().length) {
                                                System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            if (vuelo.getVuelo3privado()[AsientoDis].equals("ND")) {
                                                System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            privad++;
                                            vuelo.getVuelo3privado()[AsientoDis] = "ND";
                                            System.out.println("/// ASIENTO ASIGNADO ///");
                                            System.out.println("GRACIAS POR VOLAR CON NOSOTROS");
                                            System.out.println(" ");
                                            break;
                                        } while (true);
                                    } else {
                                        System.out.println(" NO HAY MAS ASIENTOS DISPONIBLES ");
                                        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                                        break stop;
                                    }
                                    break detener;
                                }else if (VueloDis == 3) {
                                    if (privad != vuelo.getMaxPasajeros()) {
                                        int AsientoDis;
                                        do {
                                            System.out.println("/// ASIENTOS DISPONIBLES ///");
                                            for (int i = 0; i < vuelo.getVuelo4privado().length; i++) {
                                                System.out.print(vuelo.getVuelo4privado()[i] + " ");
                                            }
                                            System.out.println();
                                            System.out.println("SELECCIONA UN ASIENTO");
                                            AsientoDis = sc.nextInt();
                                            if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo4privado().length) {
                                                System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            if (vuelo.getVuelo4privado()[AsientoDis].equals("ND")) {
                                                System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            privad++;
                                            vuelo.getVuelo4privado()[AsientoDis] = "ND";
                                            System.out.println("/// ASIENTO ASIGNADO ///");
                                            System.out.println("GRACIAS POR VOLAR CON NOSOTROS");
                                            System.out.println(" ");
                                            break;
                                        } while (true);
                                    } else {
                                        System.out.println(" NO HAY MAS ASIENTOS DISPONIBLES ");
                                        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                                        break stop;
                                    }
                                    break detener;
                                }
                            case 2:
                                System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                                System.out.println(" ");
                                break detener;
                        }
                        break;
                    case 2:
                        int AeroDispPub;
                        do {
                            System.out.println("AEROPUERTOS DISPONIBLES PUBLICOS");
                            for (int i = 0; i < aeropuerto.getNomAero().length; i++) {
                                System.out.print(i + ". " + aeropuerto.getNomAeropubl()[i] + " " + " - " + aeropuerto.getPais()[i]);
                                System.out.println();
                            }
                            System.out.println("/// ELIGE UN AEROPUERTO ///");
                            System.out.println(" ");
                            AeroDispPub = sc.nextInt();
                            if (AeroDispPub < 0 || AeroDispPub >= aeropuerto.getNomAeropubl().length) {
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                System.out.println(" ");
                            }
                        } while (AeroDispPub < 0 || AeroDispPub >= aeropuerto.getNomAeropubl().length);

                        System.out.println("AEROPUERTO " + aeropuerto.getNomAeropubl()[AeroDispPub]);

                        int CompaniePub;
                        do {
                            System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                            for (int i = 0; i < companies.getCompaniesPubl().length; i++) {
                                System.out.print(i + ". " + companies.getCompaniesPubl()[i] + " " + " - " + aeropuerto.getCiudad()[i]);
                                System.out.println();
                            }
                            System.out.println(" ");
                            CompaniePub = sc.nextInt();
                            if (CompaniePub < 0 || CompaniePub >= companies.getCompaniesPubl().length) {
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                System.out.println(" ");
                            }
                        } while (CompaniePub < 0 || CompaniePub >= companies.getCompaniesPubl().length);

                        System.out.println(" ");
                        System.out.println("/// " + companies.getCompanies()[CompaniePub] + " ///");

                        int VueloDisPub;
                        do {
                            System.out.println("/// VUELOS DISPONIBLES ///");
                            for (int i = 0; i < 4; i++) {
                                System.out.println(i + ". " + vuelo.getOrigen()[i] + " - " + vuelo.getDestino()[i]);
                            }
                            VueloDisPub = sc.nextInt();
                            if (VueloDisPub < 0 || VueloDisPub >= 4) {
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                System.out.println(" ");
                            }
                        } while (VueloDisPub < 0 || VueloDisPub >= 4);


                        System.out.println("SU FACTURA");
                        System.out.println("AEROPUERTO PRIVADO " + aeropuerto.getNomAero()[AeroDispPub]);
                        System.out.println("COMPAÑIA " + companies.getJFK()[CompaniePub]);


                        switch (CompaniePub) {
                            case 0:
                                System.out.println("PATROCINADOR: " + publi.getDineroGObierno()[0]);
                                System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen()[VueloDisPub] + " - " + vuelo.getDestino()[VueloDisPub]);
                                System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                                System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                                break;
                            case 1:
                                System.out.println("PATROCINADOR: " + publi.getDineroGObierno()[1][1]);
                                System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen()[VueloDisPub] + " - " + vuelo.getDestino()[VueloDisPub]);
                                System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                                System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                                break;
                            case 2:
                                System.out.println("PATROCINADOR: " + publi.getDineroGObierno()[1][2]);
                                System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen()[VueloDisPub] + " - " + vuelo.getDestino()[VueloDisPub]);
                                System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                                System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                                break;
                            case 3:
                                System.out.println("PATROCINADOR: " + publi.getDineroGObierno()[1][3]);
                                System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen()[VueloDisPub] + " - " + vuelo.getDestino()[VueloDisPub]);
                                System.out.println("UBICADO: " + aeropuerto.getCiudad()[3] + " " + aeropuerto.getPais()[3]);
                                System.out.println("PRECIO: " + vuelo.getPrecio()[3]);
                                break;
                        }

                        System.out.println("NOMBRE: " + pasajero.getNombre());
                        System.out.println("NUM_PASAPORTE: " + pasajero.getNumPasaporte());
                        System.out.println("NACIONALIDAD: " + pasajero.getNacionalidad());

                        int AsigpuestoPub;
                        do {
                            System.out.println("¿DESEAS ASIGNAR SU PUESTO?");
                            System.out.println("""
                                    1. SI 
                                    2. NO""");
                            AsigpuestoPub = sc.nextInt();
                            if (AsigpuestoPub != 1 && AsigpuestoPub != 2) {
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                System.out.println(" ");
                            }
                        } while (AsigpuestoPub != 1 && AsigpuestoPub != 2);

                        switch (AsigpuestoPub) {
                            case 1:
                                if (VueloDisPub == 0) {
                                    if (publico != vuelo.getMaxPasajeros()) {
                                        int AsientoDisPub;
                                        do {
                                            System.out.println("/// ASIENTOS DISPONIBLES ///");
                                            for (int i = 0; i < vuelo.getVuelo1publico().length; i++) {
                                                System.out.print(vuelo.getVuelo1publico()[i] + " ");
                                            }
                                            System.out.println();
                                            System.out.println("SELECCIONA UN ASIENTO");
                                            AsientoDisPub = sc.nextInt();
                                            if (AsientoDisPub < 0 || AsientoDisPub >= vuelo.getVuelo1publico().length) {
                                                System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            if (vuelo.getVuelo1publico()[AsientoDisPub].equals("ND")) {
                                                System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            publico++;
                                            vuelo.getVuelo1publico()[AsientoDisPub] = "ND";
                                            System.out.println("/// ASIENTO ASIGNADO ///");
                                            System.out.println("GRACIAS POR VOLAR CON NOSOTROS");
                                            System.out.println(" ");
                                            break;
                                        } while (true);
                                    } else {
                                        System.out.println(" NO HAY MAS ASIENTOS DISPONIBLES ");
                                        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                                        break stop;
                                    }
                                    break detener;
                                } else if (VueloDisPub == 1) {
                                    if (publico != vuelo.getMaxPasajeros()) {
                                        int AsientoDisPub;
                                        do {
                                            System.out.println("/// ASIENTOS DISPONIBLES ///");
                                            for (int i = 0; i < vuelo.getVuelo2publico().length; i++) {
                                                System.out.print(vuelo.getVuelo2publico()[i] + " ");
                                            }
                                            System.out.println();
                                            System.out.println("SELECCIONA UN ASIENTO");
                                            AsientoDisPub = sc.nextInt();
                                            if (AsientoDisPub < 0 || AsientoDisPub >= vuelo.getVuelo2publico().length) {
                                                System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            if (vuelo.getVuelo2publico()[AsientoDisPub].equals("ND")) {
                                                System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            publico++;
                                            vuelo.getVuelo2publico()[AsientoDisPub] = "ND";
                                            System.out.println("/// ASIENTO ASIGNADO ///");
                                            System.out.println("GRACIAS POR VOLAR CON NOSOTROS");
                                            System.out.println(" ");
                                            break;
                                        } while (true);
                                    } else {
                                        System.out.println(" NO HAY MAS ASIENTOS DISPONIBLES ");
                                        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                                        break stop;
                                    }
                                    break detener;
                                } else if (VueloDisPub == 2) {
                                    if (publico != vuelo.getMaxPasajeros()) {
                                        int AsientoDisPub;
                                        do {
                                            System.out.println("/// ASIENTOS DISPONIBLES ///");
                                            for (int i = 0; i < vuelo.getVuelo3publico().length; i++) {
                                                System.out.print(vuelo.getVuelo3publico()[i] + " ");
                                            }
                                            System.out.println();
                                            System.out.println("SELECCIONA UN ASIENTO");
                                            AsientoDisPub = sc.nextInt();
                                            if (AsientoDisPub < 0 || AsientoDisPub >= vuelo.getVuelo3publico().length) {
                                                System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            if (vuelo.getVuelo3publico()[AsientoDisPub].equals("ND")) {
                                                System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            publico++;
                                            vuelo.getVuelo3publico()[AsientoDisPub] = "ND";
                                            System.out.println("/// ASIENTO ASIGNADO ///");
                                            System.out.println("GRACIAS POR VOLAR CON NOSOTROS");
                                            System.out.println(" ");
                                            break;
                                        } while (true);
                                    } else {
                                        System.out.println(" NO HAY MAS ASIENTOS DISPONIBLES ");
                                        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                                        break stop;
                                    }
                                    break detener;
                                }else if (VueloDisPub == 3) {
                                    if (publico != vuelo.getMaxPasajeros()) {
                                        int AsientoDisPub;
                                        do {
                                            System.out.println("/// ASIENTOS DISPONIBLES ///");
                                            for (int i = 0; i < vuelo.getVuelo4publico().length; i++) {
                                                System.out.print(vuelo.getVuelo4publico()[i] + " ");
                                            }
                                            System.out.println();
                                            System.out.println("SELECCIONA UN ASIENTO");
                                            AsientoDisPub = sc.nextInt();
                                            if (AsientoDisPub < 0 || AsientoDisPub >= vuelo.getVuelo4publico().length) {
                                                System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            if (vuelo.getVuelo4publico()[AsientoDisPub].equals("ND")) {
                                                System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                System.out.println(" ");
                                                continue;
                                            }
                                            privad++;
                                            vuelo.getVuelo4publico()[AsientoDisPub] = "ND";
                                            System.out.println("/// ASIENTO ASIGNADO ///");
                                            System.out.println("GRACIAS POR VOLAR CON NOSOTROS");
                                            System.out.println(" ");
                                            break;
                                        } while (true);
                                    } else {
                                        System.out.println(" NO HAY MAS ASIENTOS DISPONIBLES ");
                                        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                                        break stop;
                                    }
                                    break detener;
                                }
                            case 2:
                                break detener;
                        }
                        break;

                }

            } else {
                System.out.println("NO HAY MAS PUESTOS DISPONIBLES ");
            }
        }
    }
}

