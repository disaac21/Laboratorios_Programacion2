package danieljuarez_lab2p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class DanielJuarez_Lab2P2 {

    static Scanner lea = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        ArrayList<Usuario> Usuarios = new ArrayList();
        String nombre;
        String jugadas;
        String secreto = "";
        String userinput = "";
        String useroutput = "";
        int player = 0;
        int contprint = 0;

        //WINNER Funciona
        //FIX Output de X y -
        
        int menu = 1;
        while (menu != 0) {
            System.out.println("0) Salir");
            System.out.println("1) Crear Jugador");
            System.out.println("2) Listar Jugador Por Posición");
            System.out.println("3) Listar Jugadores");
            System.out.println("4) Jugar");
            System.out.print("Ingrese una Opción: ");
            menu = lea.nextInt();
            System.out.println();

            switch (menu) {
                case 1: {
                    System.out.println("Ingrese el Nombre del Usuario");
                    lea.nextLine();
                    nombre = lea.next();
                    Usuarios.add(new Usuario(nombre));
                    System.out.println("Jugador " + nombre + " Creado");
                    System.out.println();

                }
                break;
                case 2: {
                    System.out.println("Ingrese el Numero del Usuario: ");
                    int i = lea.nextInt();
                    System.out.println(Usuarios.get(i).toString());
                    System.out.println();
                }
                break;
                case 3: {
                    imprimir(Usuarios, contprint);
                }
                break;
                case 4: {
                    //Numero Secreto
                    for (int i = 0; i < 4; i++) {
                        int num = 0 + random.nextInt(7);
                        secreto = secreto + num;
                    }

//                    System.out.println("Numero Secreto: " + secreto);
//                    System.out.println("Numero de Usuarios: " + Usuarios.size());
                    System.out.println();

                    int limite = Usuarios.size() * 8;
                    for (int i = 0; i < limite; i++) {

                        System.out.print("Entrada Jugador #" + player + ": ");
                        userinput = lea.next();
//                        String aux = Usuarios.get(player).getJugadas();
//                        Usuarios.get(player).setJugadas(aux+=userinput);
//                        
//                        Usuarios.add(3, userinput);
                        for (int j = 0; j < secreto.length(); j++) {
                            if (secreto.charAt(j) == userinput.charAt(j)) {
                                useroutput = useroutput + "+";
                            }
                        }
                        for (int j = 0; j < secreto.length(); j++) {
                            if (secreto.contains(userinput.charAt(j)+"")) {
                                useroutput = useroutput + "-";
                            } else {
                                useroutput = useroutput + "X";
                            }
                        }
                        System.out.print("Output Jugador #" + player + ": " + useroutput);
                        System.out.println();
                        while (useroutput.length() <= 4) {
                            useroutput = useroutput + "X";
                        }
                        if (useroutput.contains("++++")) {
                            System.out.println("Ganó Jugador #" + player);
                            secreto = "";
                            System.out.println();
                            i = limite-1;
                        }
                        useroutput = "";
                        userinput = "";
                        if (player == Usuarios.size()) {
                            player = 0;
                        } else {
                            player++;
                        }
                    }
                }
                break;
            } //fin switch menu
        } //fin while menu
    } //fin main

    static void imprimir(ArrayList Usuarios, int contprint) {
        if (contprint == Usuarios.size() - 1) {
            System.out.println(Usuarios.get(contprint).toString());
            System.out.println();
        } else {
            System.out.println(Usuarios.get(contprint).toString());
            imprimir(Usuarios, contprint + 1);
        }
    }
}
