package lab4p2_danieljuarez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Random;

import java.util.Scanner;

public class Lab4P2_DanielJuarez {

    static Scanner lea = new Scanner(System.in);
    static Random random = new Random();
    static ArrayList<Personaje> spidermans = new ArrayList();
    static ArrayList<Personaje> malos = new ArrayList();

    public static void main(String[] args) {

        spidermans.add(new SpiderPunk("SpiderPunk 1", 100, 0, "Universo 1"));
        spidermans.add(new SpiderPunk("SpiderPunk 2", 100, 0, "Universo 1"));
        spidermans.add(new SuperiorSpiderman("Superior 1", 100, 0, "Universo 2"));
        spidermans.add(new SuperiorSpiderman("Superior 2", 100, 0, "Universo 2"));
        spidermans.add(new Clasico("Clásico 1", 100, 0, "Universo 3"));
        spidermans.add(new Clasico("Clásico 2", 100, 0, "Universo 3"));

        malos.add(new Blindado("Blindado 1", 100, 0, "Universo 1"));
        malos.add(new Blindado("Blindado 2", 100, 0, "Universo 1"));
        malos.add(new Alienígena("Alienigena 1", 100, 0, "Universo 2"));
        malos.add(new Alienígena("Alienigena 2", 100, 0, "Universo 2"));
        malos.add(new Alterado("Alterado 1", 100, 0, "Universo 3"));
        malos.add(new Alterado("Alterado 2", 100, 0, "Universo 3"));

        int menu = 1;
        while (menu != 0) {
            System.out.println("0. Salir\n"
                    + "1. Listar Spiderman\n"
                    + "2. Listar Enemigos\n"
                    + "3. Modificar Spiderman\n"
                    + "4. Modificar Enemigos\n"
                    + "5. Jugar");
            System.out.print("Ingrese una Opción: ");
            menu = lea.nextInt();
            System.out.println();

            switch (menu) {
                case 1: {
                    System.out.println(spidermans);
                    System.out.println();
                }
                break;
                case 2: {
                    System.out.println(malos);
                    System.out.println();
                }
                break;
                case 3: {
                    for (int i = 0; i < spidermans.size(); i++) {
                        System.out.println(i + "-" + spidermans.get(i));
                    }

                    boolean out = true;
                    while (out == true) {
                        try {
                            System.out.print("Ingrese el Spiderman a Modificar: ");
                            int modspider = lea.nextInt();
                            lea.nextLine();
                            System.out.println("Ingrese el Nombre: ");
                            String nombre = lea.nextLine();

                            boolean works2 = true;
                            while (works2 == true) {
                                try {
                                    lea.nextLine();
                                    System.out.println("Ingrese los Puntos de Ataque: ");
                                    int puntosataque = lea.nextInt();
                                    spidermans.get(modspider).setPuntosataque(puntosataque);
                                    works2 = false;
                                } catch (InputMismatchException e) {
                                    System.out.println("EXCEPTION: Ingerese un Numero");
                                }
                            }

                            boolean works = true;
                            while (works == true) {
                                try {
                                    lea.nextLine();
                                    System.out.println("Ingrese los Puntos de Vida: ");
                                    int puntosvida = lea.nextInt();
                                    lea.nextLine();
                                    spidermans.get(modspider).setPuntosvida(puntosvida);
                                    works = false;
                                } catch (InputMismatchException e) {
                                    System.out.println("EXCEPTION: Ingerese un Numero");
                                }
                            }
                            System.out.println("Ingrese el Universo: ");
                            String universo = lea.nextLine();

                            spidermans.get(modspider).setNombre(nombre);

                            spidermans.get(modspider).setNombreuniverso(universo);
                            out = false;
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("EXCEPTION: Intente Again");
                        }
                    }

                }
                break;
                case 4: {

                    for (int i = 0; i < malos.size(); i++) {
                        System.out.println(i + "-" + malos.get(i));
                    }

                    boolean out = true;
                    while (out == true) {
                        try {
                            System.out.print("Ingrese el Spiderman a Modificar: ");
                            int modmalos = lea.nextInt();
                            lea.nextLine();
                            System.out.println("Ingrese el Nombre: ");
                            String nombre = lea.nextLine();

                            boolean works2 = true;
                            while (works2 == true) {
                                try {
                                    lea.nextLine();
                                    System.out.println("Ingrese los Puntos de Ataque: ");
                                    int puntosataque = lea.nextInt();
                                    malos.get(modmalos).setPuntosataque(puntosataque);
                                    works2 = false;
                                } catch (InputMismatchException e) {
                                    System.out.println("EXCEPTION: Ingerese un Numero");
                                }
                            }

                            boolean works = true;
                            while (works == true) {
                                try {
                                    lea.nextLine();
                                    System.out.println("Ingrese los Puntos de Vida: ");
                                    int puntosvida = lea.nextInt();
                                    lea.nextLine();
                                    malos.get(modmalos).setPuntosvida(puntosvida);
                                    works = false;
                                } catch (InputMismatchException e) {
                                    System.out.println("EXCEPTION: Ingerese un Numero");
                                }
                            }
                            System.out.println("Ingrese el Universo: ");
                            String universo = lea.nextLine();

                            malos.get(modmalos).setNombre(nombre);

                            malos.get(modmalos).setNombreuniverso(universo);
                            out = false;
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("EXCEPTION: Intente Again");
                        }
                    }

                }
                break;
                case 5: {
                    Collections.shuffle(spidermans);
                    Collections.shuffle(malos);

                    int winspider = 0;
                    int winmalos = 0;

                    for (int i = 0; i < 6; i++) {
                        System.out.println("--- PELEA de " + spidermans.get(i).getNombre() + " y " + malos.get(i).getNombre() + " ---");

                        malos.get(i).setPuntosvida(200 + random.nextDouble(600));
                        spidermans.get(i).setPuntosvida(200 + random.nextDouble(600));

                        while (spidermans.get(i).getPuntosvida() > 0 && malos.get(i).getPuntosvida() > 0) {

                            Pelea(spidermans.get(i), malos.get(i));

                            if (malos.get(i).getPuntosvida() <= 0) {
                                break;
                            }

                            Pelea2(spidermans.get(i), malos.get(i));
//                            if (spidermans.get(i).getPuntosvida() <= 0) {
//                                break;
//                            }
//                            if (spidermans.get(i).getPuntosvida() > 0) {
//                                Pelea(spidermans.get(i), malos.get(i));
//                            } else {
//                                System.out.println("");
//                            }
//
//                            if (malos.get(i).getPuntosvida() > 0) {
//                                Pelea2(spidermans.get(i), malos.get(i));
//                            } else {
//                                System.out.println("");
//                            }

//                            if (spidermans.get(i).getPuntosvida() == 0) {
//                                winmalos++;
//                                break;
//                            }
//                            if (malos.get(i).getPuntosvida() == 0) {
//                                winspider++;
//                                break;
//                            }
//                            System.out.println(spidermans.get(i));
//                            System.out.println(malos.get(i));
                        }//fin del while

                        if (spidermans.get(i).getPuntosvida() <= 0) {
                            winmalos++;
                        } else {
                            winspider++;
                        }
                    }
                    System.out.println("winsmalos " + winmalos);
                    System.out.println("winspider " + winspider);

                    if (winmalos == winspider) {
                        System.out.println("");

                        double vidamalos = 0;

                        for (int i = 0; i < 6; i++) {
                            vidamalos = vidamalos + malos.get(i).getPuntosvida();
                        }

                        double vidaspider = 0;

                        for (int i = 0; i < 6; i++) {
                            vidaspider = vidaspider + spidermans.get(i).getPuntosvida();
                        }

                        double atackmalos = 0;

                        for (int i = 0; i < 6; i++) {
                            atackmalos = atackmalos + malos.get(i).getPuntosataque();
                        }

                        double atackspider = 0;

                        for (int i = 0; i < 6; i++) {
                            atackspider = atackspider + spidermans.get(i).getPuntosataque();
                        }

                        Personaje superMALO = new Alterado("Super Malo", vidamalos, atackmalos, "universo de los malos");
                        Personaje superSPIDER = new Clasico("Super Spider", vidaspider, atackspider, "universo de los malos");

                        System.out.println("--- PELEA de " + superMALO.getNombre() + " y " + superSPIDER.getNombre() + " ---");

                        while (superMALO.getPuntosvida() > 0 && superSPIDER.getPuntosvida() > 0) {
                            Pelea(superSPIDER, superMALO);

                            if (superMALO.getPuntosvida() <= 0) {
                                break;
                            }

                            Pelea2(superSPIDER, superMALO);
                        }//fin del while
                    }
                }

                break;
            } // fin switch menu
        } //fin while menu
    } // fin main

    public static void Pelea(Personaje uno, Personaje dos) {

        // Spiderman Acuático atacó a Octopus haciéndole 400 de daño y dejándolo a 600 de vida
        double vados = dos.getPuntosvida();
        //double vauno = uno.getPuntosvida();
        dos.setPuntosvida(uno.Ataque(dos));
        System.out.println(uno.getNombre() + " atacó a " + dos.getNombre() + " haciendole " + (vados - dos.getPuntosvida()) + " y dejandolo en " + dos.getPuntosvida() + " puntos de vida");
        //uno.setPuntosvida(dos.Ataque(uno));
        //System.out.println(dos.getNombre() + " atacó a " + uno.getNombre() + " haciendole "+ (vauno - uno.getPuntosvida()) + " y dejandolo en "+ uno.getPuntosvida() + " puntos de vida");

    }

    public static void Pelea2(Personaje uno, Personaje dos) {

        //System.out.println("entro a pelea 2");
        //System.out.println("PERSONAJE UNO; " + uno.toString());
// Spiderman Acuático atacó a Octopus haciéndole 400 de daño y dejándolo a 600 de vida
        //double vados = dos.getPuntosvida();
        double vauno = uno.getPuntosvida();
        //dos.setPuntosvida(uno.Ataque(dos));
        //System.out.println(uno.getNombre() + " atacó a " + dos.getNombre() + " haciendole "+ (vados - dos.getPuntosvida()) + " y dejandolo en "+ dos.getPuntosvida() + " puntos de vida");
        uno.setPuntosvida(dos.Ataque(uno));
        System.out.println(dos.getNombre() + " atacó a " + uno.getNombre() + " haciendole " + (vauno - uno.getPuntosvida()) + " y dejandolo en " + uno.getPuntosvida() + " puntos de vida");

    }

} // fin clase
