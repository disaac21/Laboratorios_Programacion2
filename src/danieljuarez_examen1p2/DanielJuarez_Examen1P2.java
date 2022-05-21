package danieljuarez_examen1p2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DanielJuarez_Examen1P2 {

    static Scanner lea = new Scanner(System.in);
    static ArrayList<Computadora> Computadoras = new ArrayList();
    static ArrayList<Object> MaskCompu2 = new ArrayList();
    static ArrayList<Object> IPCompu1 = new ArrayList();
    static ArrayList<Object> IPCompu2 = new ArrayList();

    public static void main(String[] args) {

        Computadora pc1 = new Escritorio(16, 8, "SSD", true, "192.14.65.86", "255.255.255.0", "daniel");
        Computadoras.add(pc1);

        Computadora pc2 = new Escritorio(16, 8, "SSD", true, "192.14.64.128", "255.255.255.192", "compu2");
        Computadoras.add(pc2);

        Computadora pc3 = new Laptop("Lenovo", "24x15", true, "192.14.65.125", "255.255.255.192", "tercero");
        Computadoras.add(pc3);
        
        

        int mainmenu = 1;
        while (mainmenu != 3) {
            System.out.println("\n----- Menú Principal");
            System.out.println("1) Agregar PC");
            System.out.println("2) Ingresar PC");
            System.out.println("3) Salir");
            System.out.print("Ingrese una Opción: ");
            mainmenu = lea.nextInt();

            switch (mainmenu) {
                case 1: {
                    int agregarpc = 1;
                    while (agregarpc != 5) {
                        System.out.println("\n----- Menú CRUD");
                        System.out.println("1) Agregar PC de Escritorio");
                        System.out.println("2) Agregar Laptop");
                        System.out.println("3) Eliminar Computadora");
                        System.out.println("4) Listar Computadoras");
                        System.out.println("5) Salir");
                        System.out.print("Ingrese una Opción: ");
                        agregarpc = lea.nextInt();

                        switch (agregarpc) {
                            case 1: {
                                System.out.println("\n--- Agregar PC de Escritorio ---");
                                System.out.print("Ingresar IP: ");
                                lea.nextLine();
                                String IP = lea.nextLine();
                                System.out.print("Ingresar Mask: ");
                                String Mask = lea.nextLine();
                                System.out.print("Ingresar Hostname: ");
                                String Hostname = lea.nextLine();

                                System.out.print("Ingrese la RAM: ");
                                int RAM = lea.nextInt();
                                System.out.print("Ingrese el Almacenamiento: ");
                                int Almacenamiento = lea.nextInt();
                                System.out.print("Ingrese el Tipo de Almacenamiento\n"
                                        + "1) HDD :: 2) SSD\n");
                                int ControlAlmacenamiento = lea.nextInt();
                                boolean Almacen;
                                String TipoAlmacen;
                                if (ControlAlmacenamiento == 1) {
                                    Almacen = true;
                                    TipoAlmacen = "HDD";
                                } else {
                                    Almacen = false;
                                    TipoAlmacen = "SSD";
                                }
                                System.out.print("Ingrese Si Tiene Tarjeta Grafica\n"
                                        + "1) Si :: 2) No\n");
                                int ControlTarjeta = lea.nextInt();
                                boolean Tarjeta;
                                if (ControlTarjeta == 1) {
                                    Tarjeta = true;
                                } else {
                                    Tarjeta = false;
                                }
                                Computadoras.add(new Escritorio(RAM, Almacenamiento, TipoAlmacen, Tarjeta, IP, Mask, Hostname));
                            }
                            break;
                            case 2: {
                                System.out.println("--- Agregar Laptop ---");
                                System.out.print("Ingresar IP: ");
                                lea.nextLine();
                                String IP = lea.nextLine();
                                System.out.print("Ingresar Mask: ");
                                String Mask = lea.nextLine();
                                System.out.print("Ingresar Hostname: ");
                                String Hostname = lea.nextLine();

                                System.out.print("Ingresar Marca: ");
                                String Marca = lea.nextLine();
                                System.out.print("Ingresar Definición de Pantalla: ");
                                String DefPantalla = lea.nextLine();
                                System.out.print("Ingrese Si Tiene RGB\n"
                                        + "1) Si :: 2) No\n");
                                int ControlBoolean = lea.nextInt();
                                boolean Boolean;
                                if (ControlBoolean == 1) {
                                    Boolean = true;
                                } else {
                                    Boolean = false;
                                }
                                Computadoras.add(new Laptop(Marca, DefPantalla, Boolean, IP, Mask, Hostname));
                            }
                            break;
                            case 3: {
                                System.out.println("-- Eliminar ---");
                                for (int i = 0; i < Computadoras.size(); i++) {
                                    System.out.println(Computadoras.indexOf(Computadoras.get(i)) + " - " + Computadoras.get(i));
                                }
                                System.out.print("Ingrese el Indice de la Computadora a Eliminar: ");
                                int eliminar = lea.nextInt();
                                Computadoras.remove(eliminar);
                            }
                            break;
                            case 4: {
                                System.out.println("--- Listar ---");
                                for (int i = 0; i < Computadoras.size(); i++) {
                                    System.out.println(Computadoras.indexOf(Computadoras.get(i)) + " - " + Computadoras.get(i));
                                }
                            }
                            break;
                        }
                    }
                }
                break;
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case 2: {

                    System.out.println();
                    System.out.println("--- Listado de Computadoras ---");
                    for (int i = 0; i < Computadoras.size(); i++) {
                        System.out.println(Computadoras.indexOf(Computadoras.get(i)) + " - " + Computadoras.get(i));
                    }
                    System.out.print("Ingrese el Indice de la Computadora a Usar: ");
                    int userchoose = lea.nextInt();
                    lea.nextLine();

                    System.out.println();
                    System.out.print(Computadoras.get(userchoose).getHostname() + "#");
                    String opcion = lea.nextLine();

                    while (!opcion.equals("exit")) {
                        if (opcion.equals("show")) {
                            System.out.println("IP: " + Computadoras.get(userchoose).getIP());
                            System.out.println("Mask: " + Computadoras.get(userchoose).getMask());
                            System.out.println();
                        }

                        if (opcion.contains("ping_")) {
                            if (Computadoras.size() <= 1) {
                                System.out.println("Se Necesitan Por Lo Menos 2 Computadoras");
                            } else {

                                int CountOnesPuntos = -1;
                                int AuxCountOnesPuntos = 0;
                                String CadenaMaskCompu2 = "";
                                String CadenaIPCompu1 = "";
                                String CadenaIPCompu2 = "";
                                boolean hayDiferencia = false;
                                MaskCompu2.clear();
                                IPCompu1.clear();
                                IPCompu2.clear();

                                String[] Tokens = opcion.split("_");
                                String SentIP = Tokens[1];

                                boolean existe = false;

                                for (int i = 0; i < Computadoras.size(); i++) {
                                    String aux = Computadoras.get(i).getIP();
                                    if (aux.equals(SentIP)) {
                                        existe = true;
                                        System.out.println();

//                                        System.out.println("Separar Mascara PC2 Por Tokens");
                                        StringTokenizer maskpc1 = new StringTokenizer(Computadoras.get(userchoose).getMask(), ".");
                                        while (maskpc1.hasMoreElements()) {
                                            Object nextElement = maskpc1.nextElement();
                                            MaskCompu2.add(MaskCompu2.size(), nextElement);
                                        }
                                        for (int j = 0; j < MaskCompu2.size(); j++) {
                                            int convert1 = Integer.parseInt((String) MaskCompu2.get(j));
                                            String help = Dec2Bin(convert1);
                                            MaskCompu2.set(j, help);
                                            CadenaMaskCompu2 += MaskCompu2.get(j) + ".";
//                                            System.out.print(MaskCompu2.get(j) + ".");
                                        }
                                        System.out.print("Mask: ");
                                        System.out.println(CadenaMaskCompu2);

                                        int CountOnes = 0;
                                        for (int j = 0; j < CadenaMaskCompu2.length(); j++) {
                                            if (CadenaMaskCompu2.charAt(j) == '1') {
                                                CountOnes++;
                                            }
                                        }

                                        for (int j = 0; j < CadenaMaskCompu2.length(); j++) {
                                            if (CadenaMaskCompu2.charAt(j) == '1' || CadenaMaskCompu2.charAt(j) == '.') {
                                                CountOnesPuntos++;
                                            }
                                        }
//                                        System.out.println("Contador de 1s: " + CountOnes);
//                                        System.out.println("Contador de 1s y Puntos: " + CountOnesPuntos);
//                                        System.out.println(CadenaMaskCompu2.charAt(7));
//                                        System.out.println(CadenaMaskCompu2.charAt(8));
//                                        System.out.println(CadenaMaskCompu2.charAt(9));
//                                        System.out.println(CadenaMaskCompu2.charAt(10));
                                        System.out.println();

                                        //---------------------------------------------------------------------------------------------
                                        System.out.print("IP1: ");
                                        StringTokenizer ippc1 = new StringTokenizer(Computadoras.get(userchoose).getIP(), ".");
                                        while (ippc1.hasMoreElements()) {
                                            Object nextElement = ippc1.nextElement();
                                            IPCompu1.add(IPCompu1.size(), nextElement);
                                        }

                                        for (int j = 0; j < IPCompu1.size(); j++) {
                                            int convert2 = Integer.parseInt((String) IPCompu1.get(j));
                                            String help = Dec2Bin(convert2);
                                            IPCompu1.set(j, help);
                                            CadenaIPCompu1 += IPCompu1.get(j) + ".";
//                                            System.out.print(IPCompu1.get(j) + ".");
                                        }
                                        System.out.println(CadenaIPCompu1);
                                        System.out.println();

                                        //---------------------------------------------------------------------------------------------
                                        System.out.print("IP2: ");
                                        StringTokenizer ippc2 = new StringTokenizer(Computadoras.get(i).getIP(), ".");
                                        while (ippc2.hasMoreElements()) {
                                            Object nextElement = ippc2.nextElement();
                                            IPCompu2.add(IPCompu2.size(), nextElement);
                                        }

                                        for (int j = 0; j < IPCompu2.size(); j++) {
                                            int convert3 = Integer.parseInt((String) IPCompu2.get(j));
                                            String help = Dec2Bin(convert3);
                                            IPCompu2.set(j, help);
                                            CadenaIPCompu2 += IPCompu2.get(j) + ".";
//                                            System.out.print(IPCompu2.get(j) + ".");
                                        }
                                        System.out.println(CadenaIPCompu2);
                                        System.out.println();

                                        //-----------------------------------------------------------------------------------------------
                                        AuxCountOnesPuntos = CountOnesPuntos;
                                        hayDiferencia = false;
                                        for (int j = 0; j < CountOnesPuntos; j++) {
                                            if (CadenaIPCompu1.charAt(j) != CadenaIPCompu2.charAt(j)) {
                                                hayDiferencia = true;
                                            }
                                        }
                                        if (hayDiferencia) {
                                            System.out.println(Computadoras.get(userchoose).getHostname() + "#" + SentIP + "\n\n"
                                                    + "Pinging to " + SentIP + "with 32 bytes of data: \n"
                                                    + "Reply from " + SentIP + ": Destination host unreachable\n"
                                                    + "Reply from " + SentIP + ": Destination host unreachable\n"
                                                    + "Reply from " + SentIP + ": Destination host unreachable\n"
                                                    + "Reply from " + SentIP + ": Destination host unreachable\n\n"
                                                    + "Ping statistics for " + SentIP + ":\n"
                                                    + "\tPackets: Sent = 4, Recieved = 4, Lost = 0 (0% loss)\n");
                                            System.out.println();
                                        } else {
                                            System.out.println(Computadoras.get(userchoose).getHostname() + "#" + SentIP + "\n\n"
                                                    + "Pinging to " + SentIP + "with 32 bytes of data: \n"
                                                    + "Reply from " + SentIP + ": bytes=32 time 37ms TTL=46\n"
                                                    + "Reply from " + SentIP + ": bytes=32 time 37ms TTL=46\n"
                                                    + "Reply from " + SentIP + ": bytes=32 time 37ms TTL=46\n"
                                                    + "Reply from " + SentIP + ": bytes=32 time 37ms TTL=46\n\n"
                                                    + "Ping statistics for " + SentIP + ":\n"
                                                    + "\tPackets: Sent = 4, Recieved = 4, Lost = 0 (0% loss)\n");
                                            System.out.println();
                                        }
                                    }
                                }
                                if (!existe) {
                                    System.out.println(Computadoras.get(userchoose).getHostname() + "#" + SentIP + "\n\n"
                                            + "Pinging to " + SentIP + "with 32 bytes of data: \n"
                                            + "Request timed out\n"
                                            + "Request timed out\n"
                                            + "Request timed out\n"
                                            + "Request timed out\n\n"
                                            + "Ping statistics for " + SentIP + ":\n"
                                            + "\tPackets: Sent = 4, Recieved = 0, Lost = 4 (100% loss)\n");
                                    System.out.println();
                                }
                            }
                        }
                        System.out.print(Computadoras.get(userchoose).getHostname() + "#");
                        opcion = lea.nextLine();
                    }
                    if (opcion.equals("exit")) {
                        System.out.println("exit aca");
                        break;
                    }
                } //fin Case 2 Ingresar PC
                break;
            } // fin switch main menu
        } //fin while main menu
    } //fin main

    public static String Dec2Bin(int numero) {
        String binary = "";
        String addceros = "";

        while (numero > 0) {
            if (numero % 2 == 0) {
                binary = "0" + binary;
            } else {
                binary = "1" + binary;
            }
            numero = (int) numero / 2;
        }

        if (binary.length() < 9) {
            int ceros = 8 - binary.length();
            for (int i = 0; i < ceros; i++) {
                addceros += "0";
            }
        }
        binary = addceros + binary + "";
        return binary;
    }

} //fin clase
