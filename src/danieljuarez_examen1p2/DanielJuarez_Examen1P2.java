package danieljuarez_examen1p2;

import java.util.ArrayList;
import java.util.Scanner;

public class DanielJuarez_Examen1P2 {

    static Scanner lea = new Scanner(System.in);
    static ArrayList<Computadora> Computadoras = new ArrayList();

    public static void main(String[] args) {

        int mainmenu = 1;
        while (mainmenu != 3) {
            System.out.println("\nMenú Principal");
            System.out.println("1) Agregar PC");
            System.out.println("2) Ingresar PC");
            System.out.println("3) Salir");
            System.out.print("Ingrese una Opción: ");
            mainmenu = lea.nextInt();

            switch (mainmenu) {
                case 1: {
                    int agregarpc = 1;
                    while (agregarpc != 5) {
                        System.out.println("\nMenú Principal");
                        System.out.println("1) Agregar PC de Escritorio");
                        System.out.println("2) Agregar Laptop");
                        System.out.println("3) Eliminar Computadora");
                        System.out.println("4) Listar Computadoras");
                        System.out.println("5) Salir");
                        System.out.print("Ingrese una Opción: ");
                        agregarpc = lea.nextInt();

                        switch (agregarpc) {
                            case 1: {
                                System.out.println("--- Agregar PC de Escritorio ---");
                                System.out.print("Ingresar IP: ");
                                String IP = lea.nextLine();
                                System.out.print("Ingresar Mask: ");
                                String Mask = lea.nextLine();
                                System.out.print("Ingresar Hostname: ");
                                String Hostname = lea.nextLine();

                                System.out.print("Ingrese la RAM: ");
                                int RAM = lea.nextInt();
                                System.out.print("Ingrese el Almacenamiento: ");
                                int Almacenamiento = lea.nextInt();
                                System.out.print("Ingrese el Tipo de Almacenamiento:"
                                        + "1) HDD :: 2) SSD");
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
                                System.out.print("Ingrese Si Tiene Tarjeta Grafica:"
                                        + "1) Si :: 2) No");
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
                                String IP = lea.nextLine();
                                System.out.print("Ingresar Mask: ");
                                String Mask = lea.nextLine();
                                System.out.print("Ingresar Hostname: ");
                                String Hostname = lea.nextLine();

                                System.out.print("Ingresar Marca: ");
                                String Marca = lea.nextLine();
                                System.out.print("Ingresar Definición de Pantalla: ");
                                String DefPantalla = lea.nextLine();
                                System.out.print("Ingresar Si Tiene RGB: ");
                                System.out.print("Ingrese Si Tiene RGB:"
                                        + "1) Si :: 2) No");
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

                    for (int i = 0; i < Computadoras.size(); i++) {
                        System.out.println(Computadoras.indexOf(Computadoras.get(i)) + " - " + Computadoras.get(i));
                    }
                    System.out.print("Ingrese el Indice de la Computadora a Usar: ");
                    int userchoose = lea.nextInt();
                    
                    System.out.println(Computadoras.get(userchoose).getHostname() + " # ");
                    String opcion = lea.nextLine();
                    
                    if (opcion.equals("show")) {
                        
                    }
                    
                }
            }
        }
    }
}
