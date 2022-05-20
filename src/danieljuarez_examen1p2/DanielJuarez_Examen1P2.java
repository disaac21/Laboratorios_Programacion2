package danieljuarez_examen1p2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DanielJuarez_Examen1P2 {

    static Scanner lea = new Scanner(System.in);
    static ArrayList<Computadora> Computadoras = new ArrayList();

    public static void main(String[] args) {

        Computadoras.add(new Escritorio(16, 8, "SSD", true, "123.456.789.123", "123.789.456.123", "daniel"));

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
                    System.out.print(Computadoras.get(userchoose).getHostname() + " # ");
                    String opcion = lea.nextLine();

                    while (!opcion.equals("exit")) {
                        if (opcion.equals("show")) {
                            System.out.println("IP: " + Computadoras.get(userchoose).getIP());
                            System.out.println("Mask: " + Computadoras.get(userchoose).getMask());
                            System.out.println();
                        }
                        if (opcion.equals("ping")) {
                            System.out.print("Ingrese el IP: ");
                            String SentIP = lea.nextLine();

                            for (int i = 0; i < Computadoras.size(); i++) {
                                if (Computadoras.get(i).getIP().equals(SentIP)) {

                                    StringTokenizer st = new StringTokenizer(Computadoras.get(i).getIP(), ".");
                                    while (st.hasMoreElements()) {
                                        Object nextElement = st.nextElement();
                                        System.out.print(nextElement + "\n");
                                    }

                                } else {
                                    System.out.println("La Computadora Requerida No Existe");
                                    System.out.println();
                                    break;
                                }
                            }
                        }
                        System.out.print(Computadoras.get(userchoose).getHostname() + " # ");
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
} //fin clase
