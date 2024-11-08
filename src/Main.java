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
                                } while (Companie < 0 || Companie >= companies.getPrivatesuite().length);

                                System.out.println(" ");
                                System.out.println("/// " + companies.getJFK()[Companie] + " ///");

                                int VueloDis;
                                do {
                                    System.out.println("/// VUELOS DISPONIBLES ///");
                                    for (int i = 0; i < 4; i++) {
                                        System.out.println(i + ". " + vuelo.getOrigen2()[i] + " - " + vuelo.getDestino()[i]);
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
                                        System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen2()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                                        break;
                                    case 1:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[1]);
                                        System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen2()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                                        break;
                                    case 2:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[2]);
                                        System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen2()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                                        break;
                                    case 3:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[3]);
                                        System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen2()[VueloDis] + " - " + vuelo.getDestino()[VueloDis]);
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
                                        } else if (VueloDis == 3) {
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
                                } while (Companie2 < 0 || Companie2 >= companies.getJFK().length);
                                System.out.println(" ");
                                System.out.println("/// " + companies.getJFK()[Companie2] + " ///");

                                int VueloDis2;
                                do {
                                    System.out.println("/// VUELOS DISPONIBLES ///");
                                    for (int i = 0; i < 4; i++) {
                                        System.out.println(i + ". " + vuelo.getOrigen()[i] + " - " + vuelo.getDestino2()[i]);
                                    }
                                    VueloDis2 = sc.nextInt();
                                    if (VueloDis2 < 0 || VueloDis2 >= 4) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (VueloDis2 < 0 || VueloDis2 >= 4);
                                System.out.println("SU FACTURA");
                                System.out.println("AEROPUERTO PRIVADO " + aeropuerto.getNomAero()[AeroDisp]);
                                System.out.println("COMPAÑIA " + companies.getJFK()[Companie2]);

                                switch (Companie2) {
                                    case 0:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[0]);
                                        System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen()[VueloDis2] + " - " + vuelo.getDestino2()[VueloDis2]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                                        break;
                                    case 1:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[1]);
                                        System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen()[VueloDis2] + " - " + vuelo.getDestino2()[VueloDis2]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                                        break;
                                    case 2:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[2]);
                                        System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen()[VueloDis2] + " - " + vuelo.getDestino2()[VueloDis2]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                                        break;
                                    case 3:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[3]);
                                        System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen()[VueloDis2] + " - " + vuelo.getDestino2()[VueloDis2]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[3] + " " + aeropuerto.getPais()[3]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[3]);
                                        break;
                                }
                                System.out.println("NOMBRE: " + pasajero.getNombre());
                                System.out.println("NUM_PASAPORTE: " + pasajero.getNumPasaporte());
                                System.out.println("NACIONALIDAD: " + pasajero.getNacionalidad());

                                int Asigpuesto2;
                                do {
                                    System.out.println("¿DESEAS ASIGNAR SU PUESTO?");
                                    System.out.println("""
                                            1. SI 
                                            2. NO""");
                                    Asigpuesto2 = sc.nextInt();
                                    if (Asigpuesto2 != 1 && Asigpuesto2 != 2) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (Asigpuesto2 != 1 && Asigpuesto2 != 2);
                                switch (Asigpuesto2) {
                                    case 1:
                                        if (VueloDis2 == 0) {
                                            if (privad != vuelo.getMaxPasajeros()) {
                                                int AsientoDisPub;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo1privado2().length; i++) {
                                                        System.out.print(vuelo.getVuelo1privado2()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDisPub = sc.nextInt();
                                                    if (AsientoDisPub < 0 || AsientoDisPub >= vuelo.getVuelo1privado2().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo1privado2()[AsientoDisPub].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo1privado2()[AsientoDisPub] = "ND";
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
                                        } else if (VueloDis2 == 1) {
                                            if (privad != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo2privado3().length; i++) {
                                                        System.out.print(vuelo.getVuelo2privado3()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo2privado3().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo2privado3()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo2privado3()[AsientoDis] = "ND";
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
                                        } else if (VueloDis2 == 2) {
                                            if (privad != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo3privado4().length; i++) {
                                                        System.out.print(vuelo.getVuelo3privado4()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo3privado4().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo3privado4()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo3privado4()[AsientoDis] = "ND";
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
                                        } else if (VueloDis2 == 3) {
                                            if (privad != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo4privado5().length; i++) {
                                                        System.out.print(vuelo.getVuelo4privado5()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo4privado5().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo4privado5()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo4privado5()[AsientoDis] = "ND";
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
                                } while (Companie3 < 0 || Companie3 >= companies.getJetex().length);
                                System.out.println(" ");
                                System.out.println("/// " + companies.getJFK()[Companie3] + " ///");
                                int VueloDis3;
                                do {
                                    System.out.println("/// VUELOS DISPONIBLES ///");
                                    for (int i = 0; i < 4; i++) {
                                        System.out.println(i + ". " + vuelo.getOrigen3()[i] + " - " + vuelo.getDestino3()[i]);
                                    }
                                    VueloDis3 = sc.nextInt();
                                    if (VueloDis3 < 0 || VueloDis3 >= 4) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (VueloDis3 < 0 || VueloDis3 >= 4);
                                System.out.println("SU FACTURA");
                                System.out.println("AEROPUERTO PRIVADO " + aeropuerto.getNomAero()[AeroDisp]);
                                System.out.println("COMPAÑIA " + companies.getJFK()[Companie3]);

                                switch (Companie3) {
                                    case 0:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[0]);
                                        System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen3()[VueloDis3] + " - " + vuelo.getDestino3()[VueloDis3]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                                        break;
                                    case 1:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[1]);
                                        System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen3()[VueloDis3] + " - " + vuelo.getDestino3()[VueloDis3]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                                        break;
                                    case 2:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[2]);
                                        System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen3()[VueloDis3] + " - " + vuelo.getDestino3()[VueloDis3]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                                        break;
                                    case 3:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[3]);
                                        System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen3()[VueloDis3] + " - " + vuelo.getDestino3()[VueloDis3]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[3] + " " + aeropuerto.getPais()[3]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[3]);
                                        break;
                                }
                                System.out.println("NOMBRE: " + pasajero.getNombre());
                                System.out.println("NUM_PASAPORTE: " + pasajero.getNumPasaporte());
                                System.out.println("NACIONALIDAD: " + pasajero.getNacionalidad());

                                int Asigpuesto3;
                                do {
                                    System.out.println("¿DESEAS ASIGNAR SU PUESTO?");
                                    System.out.println("""
                                            1. SI 
                                            2. NO""");
                                    Asigpuesto3 = sc.nextInt();
                                    if (Asigpuesto3 != 1 && Asigpuesto3 != 2) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (Asigpuesto3 != 1 && Asigpuesto3 != 2);
                                switch (Asigpuesto3) {
                                    case 1:
                                        if (VueloDis3 == 0) {
                                            if (privad != vuelo.getMaxPasajeros()) {
                                                int AsientoDisPub;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo1privado6().length; i++) {
                                                        System.out.print(vuelo.getVuelo1privado6()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDisPub = sc.nextInt();
                                                    if (AsientoDisPub < 0 || AsientoDisPub >= vuelo.getVuelo1privado6().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo1privado6()[AsientoDisPub].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo1privado6()[AsientoDisPub] = "ND";
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
                                        } else if (VueloDis3 == 1) {
                                            if (privad != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo2privado7().length; i++) {
                                                        System.out.print(vuelo.getVuelo2privado7()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo2privado7().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo2privado7()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo2privado7()[AsientoDis] = "ND";
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
                                        } else if (VueloDis3 == 2) {
                                            if (privad != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo3privado8().length; i++) {
                                                        System.out.print(vuelo.getVuelo3privado8()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo3privado8().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo3privado8()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo3privado8()[AsientoDis] = "ND";
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
                                        } else if (VueloDis3 == 3) {
                                            if (privad != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo4privado9().length; i++) {
                                                        System.out.print(vuelo.getVuelo4privado9()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo4privado9().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo4privado9()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo4privado9()[AsientoDis] = "ND";
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
                                } while (Companie4 < 0 || Companie4 >= companies.getBourget().length);
                                System.out.println(" ");
                                System.out.println("/// " + companies.getJFK()[Companie4] + " ///");

                                int VueloDis4;
                                do {
                                    System.out.println("/// VUELOS DISPONIBLES ///");
                                    for (int i = 0; i < 4; i++) {
                                        System.out.println(i + ". " + vuelo.getOrigen4()[i] + " - " + vuelo.getDestino4()[i]);
                                    }
                                    VueloDis4 = sc.nextInt();
                                    if (VueloDis4 < 0 || VueloDis4 >= 4) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (VueloDis4 < 0 || VueloDis4 >= 4);
                                System.out.println("SU FACTURA");
                                System.out.println("AEROPUERTO PRIVADO " + aeropuerto.getNomAero()[AeroDisp]);
                                System.out.println("COMPAÑIA " + companies.getJFK()[Companie4]);
                                switch (Companie4) {
                                    case 0:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[0]);
                                        System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen4()[VueloDis4] + " - " + vuelo.getDestino4()[VueloDis4]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                                        break;
                                    case 1:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[1]);
                                        System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen4()[VueloDis4] + " - " + vuelo.getDestino4()[VueloDis4]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                                        break;
                                    case 2:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[2]);
                                        System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen4()[VueloDis4] + " - " + vuelo.getDestino4()[VueloDis4]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                                        break;
                                    case 3:
                                        System.out.println("PATROCINADOR: " + privado.getPatrocinadores()[3]);
                                        System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen4()[VueloDis4] + " - " + vuelo.getDestino4()[VueloDis4]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[3] + " " + aeropuerto.getPais()[3]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[3]);
                                        break;
                                }
                                System.out.println("NOMBRE: " + pasajero.getNombre());
                                System.out.println("NUM_PASAPORTE: " + pasajero.getNumPasaporte());
                                System.out.println("NACIONALIDAD: " + pasajero.getNacionalidad());
                                int Asigpuesto4;
                                do {
                                    System.out.println("¿DESEAS ASIGNAR SU PUESTO?");
                                    System.out.println("""
                                            1. SI 
                                            2. NO""");
                                    Asigpuesto4 = sc.nextInt();
                                    if (Asigpuesto4 != 1 && Asigpuesto4 != 2) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (Asigpuesto4 != 1 && Asigpuesto4 != 2);
                                switch (Asigpuesto4) {
                                    case 1:
                                        if (VueloDis4 == 0) {
                                            if (privad != vuelo.getMaxPasajeros()) {
                                                int AsientoDisPub;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo5privado().length; i++) {
                                                        System.out.print(vuelo.getVuelo5privado()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDisPub = sc.nextInt();
                                                    if (AsientoDisPub < 0 || AsientoDisPub >= vuelo.getVuelo5privado().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo5privado()[AsientoDisPub].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo5privado()[AsientoDisPub] = "ND";
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
                                        } else if (VueloDis4 == 1) {
                                            if (privad != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo6privado().length; i++) {
                                                        System.out.print(vuelo.getVuelo6privado()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo6privado().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo6privado()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo6privado()[AsientoDis] = "ND";
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
                                        } else if (VueloDis4 == 2) {
                                            if (privad != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo7privado().length; i++) {
                                                        System.out.print(vuelo.getVuelo7privado()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo7privado().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo7privado()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo7privado()[AsientoDis] = "ND";
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
                                        } else if (VueloDis4 == 3) {
                                            if (privad != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo8privado().length; i++) {
                                                        System.out.print(vuelo.getVuelo8privado()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo8privado().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo8privado()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo8privado()[AsientoDis] = "ND";
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
                        }


                    case 2:
                        int AeroDispPubli;
                        do {
                            System.out.println("AEROPUERTOS DISPONIBLES PUBLICOS");
                            for (int i = 0; i < aeropuerto.getNomAeropubl().length; i++) {
                                System.out.print(i + ". " + aeropuerto.getNomAeropubl()[i] + " " + " - " + aeropuerto.getPais()[i]);
                                System.out.println();
                            }
                            System.out.println("/// ELIGE UN AEROPUERTO ///");
                            System.out.println(" ");
                            AeroDispPubli = sc.nextInt();
                            if (AeroDispPubli < 0 || AeroDispPubli >= aeropuerto.getNomAeropubl().length) {
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                System.out.println(" ");
                            }
                        } while (AeroDispPubli < 0 || AeroDispPubli >= aeropuerto.getNomAero().length);
                        switch (AeroDispPubli) {
                            case 0:
                                System.out.println("AEROPUERTO " + aeropuerto.getNomAeropubl()[AeroDispPubli]);
                                int Companiepubl;
                                do {
                                    System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                                    for (int i = 0; i < companies.getKennedy().length; i++) {
                                        System.out.print(i + ". " + companies.getKennedy()[i] + " " + " - " + aeropuerto.getCiudad()[i]);
                                        System.out.println();
                                    }
                                    System.out.println(" ");
                                    Companiepubl = sc.nextInt();
                                    if (Companiepubl < 0 || Companiepubl >= companies.getKennedy().length) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (Companiepubl < 0 || Companiepubl >= companies.getKennedy().length);

                                System.out.println(" ");
                                System.out.println("/// " + companies.getKennedy()[Companiepubl] + " ///");

                                int VueloDispub;
                                do {
                                    System.out.println("/// VUELOS DISPONIBLES ///");
                                    for (int i = 0; i < 4; i++) {
                                        System.out.println(i + ". " + vuelo.getOrigen3()[i] + " - " + vuelo.getDestino2()[i]);
                                    }
                                    VueloDispub = sc.nextInt();
                                    if (VueloDispub < 0 || VueloDispub >= 4) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (VueloDispub < 0 || VueloDispub >= 4);

                                System.out.println("SU FACTURA");
                                System.out.println("AEROPUERTO PRIVADO " + aeropuerto.getNomAero()[AeroDispPubli]);
                                System.out.println("COMPAÑIA " + companies.getKennedy()[Companiepubl]);

                                switch (Companiepubl) {
                                    case 0:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[Companiepubl]);
                                        System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen3()[VueloDispub] + " - " + vuelo.getDestino2()[VueloDispub]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                                        break;
                                    case 1:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[Companiepubl]);
                                        System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen3()[VueloDispub] + " - " + vuelo.getDestino2()[VueloDispub]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                                        break;
                                    case 2:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[Companiepubl]);
                                        System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen3()[VueloDispub] + " - " + vuelo.getDestino2()[VueloDispub]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                                        break;
                                    case 3:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[Companiepubl]);
                                        System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen3()[VueloDispub] + " - " + vuelo.getDestino2()[VueloDispub]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[3] + " " + aeropuerto.getPais()[3]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[3]);
                                        break;
                                }
                                System.out.println("NOMBRE: " + pasajero.getNombre());
                                System.out.println("NUM_PASAPORTE: " + pasajero.getNumPasaporte());
                                System.out.println("NACIONALIDAD: " + pasajero.getNacionalidad());

                                int Asigpuestopubli;
                                do {
                                    System.out.println("¿DESEAS ASIGNAR SU PUESTO?");
                                    System.out.println("""
                                            1. SI 
                                            2. NO""");
                                    Asigpuestopubli = sc.nextInt();
                                    if (Asigpuestopubli != 1 && Asigpuestopubli != 2) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (Asigpuestopubli != 1 && Asigpuestopubli != 2);
                                switch (Asigpuestopubli) {
                                    case 1:
                                        if (VueloDispub == 0) {
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
                                        } else if (VueloDispub == 1) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo2publico().length; i++) {
                                                        System.out.print(vuelo.getVuelo2publico()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo2publico().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo2publico()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo2publico()[AsientoDis] = "ND";
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
                                        } else if (VueloDispub == 2) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo3publico().length; i++) {
                                                        System.out.print(vuelo.getVuelo3publico()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo3publico().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo3publico()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo3publico()[AsientoDis] = "ND";
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
                                        } else if (VueloDispub == 3) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo4publico().length; i++) {
                                                        System.out.print(vuelo.getVuelo4publico()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo4publico().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo4publico()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    privad++;
                                                    vuelo.getVuelo4publico()[AsientoDis] = "ND";
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

                            case 1:
                                System.out.println("AEROPUERTO " + aeropuerto.getNomAero()[AeroDispPubli]);
                                int Companiepubli2;
                                do {
                                    System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                                    for (int i = 0; i < companies.getHare().length; i++) {
                                        System.out.print(i + ". " + companies.getHare()[i] + " " + " - " + aeropuerto.getCiudad()[i]);
                                        System.out.println();
                                    }
                                    System.out.println(" ");
                                    Companiepubli2 = sc.nextInt();
                                    if (Companiepubli2 < 0 || Companiepubli2 >= companies.getHare().length) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (Companiepubli2 < 0 || Companiepubli2 >= companies.getHare().length);
                                System.out.println(" ");
                                System.out.println("/// " + companies.getHare()[Companiepubli2] + " ///");

                                int VueloDisPubl2;
                                do {
                                    System.out.println("/// VUELOS DISPONIBLES ///");
                                    for (int i = 0; i < 4; i++) {
                                        System.out.println(i + ". " + vuelo.getOrigen4()[i] + " - " + vuelo.getDestino()[i]);
                                    }
                                    VueloDisPubl2 = sc.nextInt();
                                    if (VueloDisPubl2 < 0 || VueloDisPubl2 >= 4) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (VueloDisPubl2 < 0 || VueloDisPubl2 >= 4);
                                System.out.println("SU FACTURA");
                                System.out.println("AEROPUERTO PRIVADO " + aeropuerto.getNomAero()[AeroDispPubli]);
                                System.out.println("COMPAÑIA " + companies.getJFK()[Companiepubli2]);

                                switch (Companiepubli2) {
                                    case 0:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[Companiepubli2]);
                                        System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen4()[VueloDisPubl2] + " - " + vuelo.getDestino()[VueloDisPubl2]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                                        break;
                                    case 1:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[Companiepubli2]);
                                        System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen4()[VueloDisPubl2] + " - " + vuelo.getDestino()[VueloDisPubl2]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                                        break;
                                    case 2:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[Companiepubli2]);
                                        System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen4()[VueloDisPubl2] + " - " + vuelo.getDestino()[VueloDisPubl2]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                                        break;
                                    case 3:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[Companiepubli2]);
                                        System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen4()[VueloDisPubl2] + " - " + vuelo.getDestino()[VueloDisPubl2]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[3] + " " + aeropuerto.getPais()[3]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[3]);
                                        break;
                                }
                                System.out.println("NOMBRE: " + pasajero.getNombre());
                                System.out.println("NUM_PASAPORTE: " + pasajero.getNumPasaporte());
                                System.out.println("NACIONALIDAD: " + pasajero.getNacionalidad());

                                int Asigpuesto2;
                                do {
                                    System.out.println("¿DESEAS ASIGNAR SU PUESTO?");
                                    System.out.println("""
                                            1. SI 
                                            2. NO""");
                                    Asigpuesto2 = sc.nextInt();
                                    if (Asigpuesto2 != 1 && Asigpuesto2 != 2) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (Asigpuesto2 != 1 && Asigpuesto2 != 2);
                                switch (Asigpuesto2) {
                                    case 1:
                                        if (VueloDisPubl2 == 0) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDisPub;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo5publico().length; i++) {
                                                        System.out.print(vuelo.getVuelo5publico()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDisPub = sc.nextInt();
                                                    if (AsientoDisPub < 0 || AsientoDisPub >= vuelo.getVuelo5publico().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo5publico()[AsientoDisPub].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo5publico()[AsientoDisPub] = "ND";
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
                                        } else if (VueloDisPubl2 == 1) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo6publico().length; i++) {
                                                        System.out.print(vuelo.getVuelo6publico()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo6publico().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo6publico()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo6publico()[AsientoDis] = "ND";
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
                                        } else if (VueloDisPubl2 == 2) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo7publico().length; i++) {
                                                        System.out.print(vuelo.getVuelo7publico()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo7publico().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo7publico()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo7publico()[AsientoDis] = "ND";
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
                                        } else if (VueloDisPubl2 == 3) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo8publico().length; i++) {
                                                        System.out.print(vuelo.getVuelo8publico()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo8publico().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo8publico()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo8publico()[AsientoDis] = "ND";
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
                                System.out.println("AEROPUERTO " + aeropuerto.getNomAero()[AeroDispPubli]);
                                int CompaniePubli3;
                                do {
                                    System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                                    for (int i = 0; i < companies.getHartsfield().length; i++) {
                                        System.out.print(i + ". " + companies.getHartsfield()[i] + " " + " - " + aeropuerto.getCiudad()[i]);
                                        System.out.println();
                                    }
                                    System.out.println(" ");
                                    CompaniePubli3 = sc.nextInt();
                                    if (CompaniePubli3 < 0 || CompaniePubli3 >= companies.getHartsfield().length) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (CompaniePubli3 < 0 || CompaniePubli3 >= companies.getHartsfield().length);
                                System.out.println(" ");
                                System.out.println("/// " + companies.getHartsfield()[CompaniePubli3] + " ///");
                                int VueloDisPubli3;
                                do {
                                    System.out.println("/// VUELOS DISPONIBLES ///");
                                    for (int i = 0; i < 4; i++) {
                                        System.out.println(i + ". " + vuelo.getOrigen2()[i] + " - " + vuelo.getDestino2()[i]);
                                    }
                                    VueloDisPubli3 = sc.nextInt();
                                    if (VueloDisPubli3 < 0 || VueloDisPubli3 >= 4) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (VueloDisPubli3 < 0 || VueloDisPubli3 >= 4);
                                System.out.println("SU FACTURA");
                                System.out.println("AEROPUERTO PRIVADO " + aeropuerto.getNomAero()[AeroDispPubli]);
                                System.out.println("COMPAÑIA " + companies.getHartsfield()[CompaniePubli3]);

                                switch (CompaniePubli3) {
                                    case 0:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[CompaniePubli3]);
                                        System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen2()[VueloDisPubli3] + " - " + vuelo.getDestino2()[VueloDisPubli3]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                                        break;
                                    case 1:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[CompaniePubli3]);
                                        System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen2()[VueloDisPubli3] + " - " + vuelo.getDestino2()[VueloDisPubli3]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                                        break;
                                    case 2:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[CompaniePubli3]);
                                        System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen2()[VueloDisPubli3] + " - " + vuelo.getDestino2()[VueloDisPubli3]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                                        break;
                                    case 3:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[CompaniePubli3]);
                                        System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen2()[VueloDisPubli3] + " - " + vuelo.getDestino2()[VueloDisPubli3]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[3] + " " + aeropuerto.getPais()[3]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[3]);
                                        break;
                                }
                                System.out.println("NOMBRE: " + pasajero.getNombre());
                                System.out.println("NUM_PASAPORTE: " + pasajero.getNumPasaporte());
                                System.out.println("NACIONALIDAD: " + pasajero.getNacionalidad());

                                int Asigpuesto3;
                                do {
                                    System.out.println("¿DESEAS ASIGNAR SU PUESTO?");
                                    System.out.println("""
                                            1. SI 
                                            2. NO""");
                                    Asigpuesto3 = sc.nextInt();
                                    if (Asigpuesto3 != 1 && Asigpuesto3 != 2) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (Asigpuesto3 != 1 && Asigpuesto3 != 2);
                                switch (Asigpuesto3) {
                                    case 1:
                                        if (VueloDisPubli3 == 0) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDisPub;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo9publico().length; i++) {
                                                        System.out.print(vuelo.getVuelo9publico()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDisPub = sc.nextInt();
                                                    if (AsientoDisPub < 0 || AsientoDisPub >= vuelo.getVuelo9publico().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo9publico()[AsientoDisPub].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo9publico()[AsientoDisPub] = "ND";
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
                                        } else if (VueloDisPubli3 == 1) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo10publico().length; i++) {
                                                        System.out.print(vuelo.getVuelo10publico()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo10publico().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo10publico()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo10publico()[AsientoDis] = "ND";
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
                                        } else if (VueloDisPubli3 == 2) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo11publico().length; i++) {
                                                        System.out.print(vuelo.getVuelo11publico()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo11publico().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo11publico()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo11publico()[AsientoDis] = "ND";
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
                                        } else if (VueloDisPubli3 == 3) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo12publico().length; i++) {
                                                        System.out.print(vuelo.getVuelo12publico()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo12publico().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo12publico()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo12publico()[AsientoDis] = "ND";
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

                            case 3:
                                System.out.println("AEROPUERTO " + aeropuerto.getNomAero()[AeroDispPubli]);
                                int CompaniePubli4;
                                do {
                                    System.out.println("ELIJA LA COMPAÑÍA DE VUELO DE SU PREFERENCIA");
                                    for (int i = 0; i < companies.getBourget().length; i++) {
                                        System.out.print(i + ". " + companies.getBourget()[i] + " " + " - " + aeropuerto.getCiudad()[i]);
                                        System.out.println();
                                    }
                                    System.out.println(" ");
                                    CompaniePubli4 = sc.nextInt();
                                    if (CompaniePubli4 < 0 || CompaniePubli4 >= companies.getBourget().length) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (CompaniePubli4 < 0 || CompaniePubli4 >= companies.getBourget().length);
                                System.out.println(" ");
                                System.out.println("/// " + companies.getJFK()[CompaniePubli4] + " ///");

                                int VueloDisPubli4;
                                do {
                                    System.out.println("/// VUELOS DISPONIBLES ///");
                                    for (int i = 0; i < 4; i++) {
                                        System.out.println(i + ". " + vuelo.getOrigen()[i] + " - " + vuelo.getDestino4()[i]);
                                    }
                                    VueloDisPubli4 = sc.nextInt();
                                    if (VueloDisPubli4 < 0 || VueloDisPubli4 >= 4) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (VueloDisPubli4 < 0 || VueloDisPubli4 >= 4);
                                System.out.println("SU FACTURA");
                                System.out.println("AEROPUERTO PRIVADO " + aeropuerto.getNomAero()[AeroDispPubli]);
                                System.out.println("COMPAÑIA " + companies.getJFK()[CompaniePubli4]);
                                switch (CompaniePubli4) {
                                    case 0:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[CompaniePubli4]);
                                        System.out.println("VUELO: " + vuelo.getID()[0] + " " + vuelo.getOrigen()[VueloDisPubli4] + " - " + vuelo.getDestino4()[VueloDisPubli4]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[0] + " " + aeropuerto.getPais()[0]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[0]);
                                        break;
                                    case 1:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[CompaniePubli4]);
                                        System.out.println("VUELO: " + vuelo.getID()[1] + " " + vuelo.getOrigen()[VueloDisPubli4] + " - " + vuelo.getDestino4()[VueloDisPubli4]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[1] + " " + aeropuerto.getPais()[1]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[1]);
                                        break;
                                    case 2:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[CompaniePubli4]);
                                        System.out.println("VUELO: " + vuelo.getID()[2] + " " + vuelo.getOrigen()[VueloDisPubli4] + " - " + vuelo.getDestino4()[VueloDisPubli4]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[2] + " " + aeropuerto.getPais()[2]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[2]);
                                        break;
                                    case 3:
                                        System.out.println("DINERO GUBERNAMENTAL: " + publi.getDineroGObierno()[CompaniePubli4]);
                                        System.out.println("VUELO: " + vuelo.getID()[3] + " " + vuelo.getOrigen()[VueloDisPubli4] + " - " + vuelo.getDestino4()[VueloDisPubli4]);
                                        System.out.println("UBICADO: " + aeropuerto.getCiudad()[3] + " " + aeropuerto.getPais()[3]);
                                        System.out.println("PRECIO: " + vuelo.getPrecio()[3]);
                                        break;
                                }
                                System.out.println("NOMBRE: " + pasajero.getNombre());
                                System.out.println("NUM_PASAPORTE: " + pasajero.getNumPasaporte());
                                System.out.println("NACIONALIDAD: " + pasajero.getNacionalidad());
                                int Asigpuesto4;
                                do {
                                    System.out.println("¿DESEAS ASIGNAR SU PUESTO?");
                                    System.out.println("""
                                            1. SI 
                                            2. NO""");
                                    Asigpuesto4 = sc.nextInt();
                                    if (Asigpuesto4 != 1 && Asigpuesto4 != 2) {
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                        System.out.println(" ");
                                    }
                                } while (Asigpuesto4 != 1 && Asigpuesto4 != 2);
                                switch (Asigpuesto4) {
                                    case 1:
                                        if (VueloDisPubli4 == 0) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDisPub;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo5privado().length; i++) {
                                                        System.out.print(vuelo.getVuelo5privado()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDisPub = sc.nextInt();
                                                    if (AsientoDisPub < 0 || AsientoDisPub >= vuelo.getVuelo5privado().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo5privado()[AsientoDisPub].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo5privado()[AsientoDisPub] = "ND";
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
                                        } else if (VueloDisPubli4 == 1) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo6privado().length; i++) {
                                                        System.out.print(vuelo.getVuelo6privado()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo6privado().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo6privado()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo6privado()[AsientoDis] = "ND";
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
                                        } else if (VueloDisPubli4 == 2) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo7privado().length; i++) {
                                                        System.out.print(vuelo.getVuelo7privado()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo7privado().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo7privado()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo7privado()[AsientoDis] = "ND";
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
                                        } else if (VueloDisPubli4 == 3) {
                                            if (publico != vuelo.getMaxPasajeros()) {
                                                int AsientoDis;
                                                do {
                                                    System.out.println("/// ASIENTOS DISPONIBLES ///");
                                                    for (int i = 0; i < vuelo.getVuelo8privado().length; i++) {
                                                        System.out.print(vuelo.getVuelo8privado()[i] + " ");
                                                    }
                                                    System.out.println();
                                                    System.out.println("SELECCIONA UN ASIENTO");
                                                    AsientoDis = sc.nextInt();
                                                    if (AsientoDis < 0 || AsientoDis >= vuelo.getVuelo8privado().length) {
                                                        System.out.println("Asiento no válido. Por favor, intente de nuevo.");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    if (vuelo.getVuelo8privado()[AsientoDis].equals("ND")) {
                                                        System.out.println("/// ASIENTO NO DISPONIBLE ///");
                                                        System.out.println(" ");
                                                        continue;
                                                    }
                                                    publico++;
                                                    vuelo.getVuelo8privado()[AsientoDis] = "ND";
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
                        }

                }
            }
        }
    }
}
