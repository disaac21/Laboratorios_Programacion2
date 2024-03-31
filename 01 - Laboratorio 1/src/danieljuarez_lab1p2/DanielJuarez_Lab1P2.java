package danieljuarez_lab1p2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DanielJuarez_Lab1P2 {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] JugadorUno = new int[8][8];
        int[][] JugadorDos = new int[8][8];

        LlenadoVacio(JugadorUno, JugadorDos);

        Llenado(JugadorUno, JugadorDos);

        boolean ganador = false;
        while (ganador == false) {
            boolean player = true;
            if (player == true) {
                boolean shot = true;
                while (shot == true) {
                    System.out.println("JUGADOR UNO Ingrese el Disparo");
                    String tiro = lea.nextLine();
                    int x = tiro.charAt(1) - '1';
                    int y = tiro.charAt(3) - '1';

                    if (JugadorDos[x][y] == 1) {
                        JugadorDos[x][y] = 4;
                        System.out.println("SHOT");
                        shot = true;
                    } else {
                        System.out.println("FALLO");
                        shot = false;
                        player = false;
                    }
                }
            }
            if (player == false) {
                boolean shot = true;
                while (shot == true) {
                    System.out.println("JUGADOR DOS Ingrese el Disparo");
                    String tiro = lea.nextLine();
                    int x = tiro.charAt(1) - '1';
                    int y = tiro.charAt(3) - '1';
                    for (int i = 0; i < JugadorUno.length; i++) {
                        for (int j = 0; j < JugadorUno[i].length; j++) {
                            if (JugadorUno[x][y] == 1) {
                                JugadorUno[x][y] = 4;
                                System.out.println("SHOT");
                                shot = true;
                            } else {
                                System.out.println("FALLO");
                                shot = false;
                            }
                        }
                    }
                }
            }
            System.out.println();
            ImprimirBoth(JugadorUno, JugadorDos);
            
            int ganador1 = 0;
            int ganador2 = 0;
            for (int i = 0; i < JugadorUno.length; i++) {
                for (int j = 0; j < JugadorUno[i].length; j++) {
                    if (JugadorUno[i][j] == 4) {
                        ganador2++;
                    }
                }
            }
            for (int i = 0; i < JugadorDos.length; i++) {
                for (int j = 0; j < JugadorDos[i].length; j++) {
                    if (JugadorDos[i][j] == 4) {
                        ganador1++;
                    }
                }
            }
            if (ganador1 == 9 || ganador2 == 9) {
                ganador = true;
                if (ganador1 == 9) {
                    System.out.println("TENEMOS UN GANADOR!! JUGADOR 1");
                } else if (ganador2 == 9) {
                    System.out.println("TENEMOS UN GANADOR!! JUGADOR 2");
                }
            } else {
                ganador = false;
            }
        }
    }

    static void LlenadoVacio(int[][] JugadorUno, int[][] JugadorDos) {
        for (int i = 0; i < JugadorUno.length; i++) {
            for (int j = 0; j < JugadorUno[i].length; j++) {
                JugadorUno[i][j] = 0;
            }
        }
        for (int i = 0; i < JugadorDos.length; i++) {
            for (int j = 0; j < JugadorDos[i].length; j++) {
                JugadorDos[i][j] = 0;
            }
        }
    }

    static void ImprimirBoth(int[][] JugadorUno, int[][] JugadorDos) {

        System.out.println("Tablero Jugador Uno");
        for (int i = 0; i < JugadorUno.length; i++) {
            for (int j = 0; j < JugadorUno[i].length; j++) {
                System.out.print("[" + (JugadorUno[i][j]) + "]");
            }
            System.out.println("");
        }

        System.out.println("Tablero Jugador Dos");
        for (int i = 0; i < JugadorDos.length; i++) {
            for (int j = 0; j < JugadorDos[i].length; j++) {
                System.out.print("[" + (JugadorDos[i][j]) + "]");
            }
            System.out.println("");
        }

    }

    static void ImprimirUno(int[][] JugadorUno) {

        System.out.println("Tablero Jugador Uno");
        for (int i = 0; i < JugadorUno.length; i++) {
            for (int j = 0; j < JugadorUno[i].length; j++) {
                System.out.print("[" + (JugadorUno[i][j]) + "]");
            }
            System.out.println("");
        }
    }

    static void ImprimirDos(int[][] JugadorDos) {
        System.out.println("Tablero Jugador Dos");
        for (int i = 0; i < JugadorDos.length; i++) {
            for (int j = 0; j < JugadorDos[i].length; j++) {
                System.out.print("[" + (JugadorDos[i][j]) + "]");
            }
            System.out.println("");
        }

    }

    static void Llenado(int[][] JugadorUno, int[][] JugadorDos) {
        System.out.println("JUGADOR UNO");
        for (int barcos = 0; barcos < 3; barcos++) {
            System.out.println("Ingrese las Coordenadas de la Punta del Primer Barco.\nEj. (7,6) || [4,5]");
            String coordenada1 = lea.nextLine();
            int x = coordenada1.charAt(1) - '1';
            int y = coordenada1.charAt(3) - '1';
            for (int i = 0; i < JugadorUno.length; i++) {
                for (int j = 0; j < JugadorUno[i].length; j++) {
                    JugadorUno[x][y] = 1;
                }
            }

            System.out.println("Ingrese la Dirección a Desplegar el Barco.\nEj. ^, v, <, >");
            String direccion1 = lea.nextLine();
            x = x + 1;
            y = y + 1;
            if (direccion1.equals("^")) {
                if (x - 3 < 1) {
                    System.out.println("No Se Puede Ingresar Hacía Arriba");
                } else {
                    JugadorUno[x - 2][y - 1] = 1;
                    JugadorUno[x - 3][y - 1] = 1;
                    System.out.println("Tablero Jugador Uno");
                }
            }
            if (direccion1.equals("v")) {
                if (x + 3 < 6) {
                    System.out.println("No Se Puede Ingresar Hacía Abajo");
                } else {
                    JugadorUno[x][y - 1] = 1;
                    JugadorUno[x + 1][y - 1] = 1;
                }
            }
            if (direccion1.equals("<")) {
                if (y + 3 < 6) {
                    System.out.println("No Se Puede Ingresar Hacía Izq");
                } else {
                    JugadorUno[x - 1][y - 2] = 1;
                    JugadorUno[x - 1][y - 3] = 1;
                }
            }
            if (direccion1.equals(">")) {
                if (y + 3 < 7) {
                    System.out.println("No Se Puede Ingresar Hacía Izq");
                } else {
                    JugadorUno[x - 1][y] = 1;
                    JugadorUno[x - 1][y + 1] = 1;
                }
            }
        }
        System.out.println("JUGADOR DOS");
        for (int barcos = 0; barcos < 3; barcos++) {
            System.out.println("Ingrese las Coordenadas de la Punta del Primer Barco.\nEj. (7,6) || [4,5]");
            String coordenada1 = lea.nextLine();
            int x = coordenada1.charAt(1) - '1';
            int y = coordenada1.charAt(3) - '1';
            for (int i = 0; i < JugadorDos.length; i++) {
                for (int j = 0; j < JugadorDos[i].length; j++) {
                    JugadorDos[x][y] = 1;
                }
            }

            System.out.println("Ingrese la Dirección a Desplegar el Barco.\nEj. ^, v, <, >");
            String direccion1 = lea.nextLine();
            x = x + 1;
            y = y + 1;
            if (direccion1.equals("^")) {
                if (x - 3 < 1) {
                    System.out.println("No Se Puede Ingresar Hacía Arriba");
                } else {
                    JugadorDos[x - 2][y - 1] = 1;
                    JugadorDos[x - 3][y - 1] = 1;
                    System.out.println("Tablero Jugador Uno");
                }
            }
            if (direccion1.equals("v")) {
                if (x + 3 < 6) {
                    System.out.println("No Se Puede Ingresar Hacía Abajo");
                } else {
                    JugadorDos[x][y - 1] = 1;
                    JugadorDos[x + 1][y - 1] = 1;
                }
            }
            if (direccion1.equals("<")) {
                if (y + 3 < 6) {
                    System.out.println("No Se Puede Ingresar Hacía Izq");
                } else {
                    JugadorDos[x - 1][y - 2] = 1;
                    JugadorDos[x - 1][y - 3] = 1;
                }
            }
            if (direccion1.equals(">")) {
                if (y + 3 < 7) {
                    System.out.println("No Se Puede Ingresar Hacía Izq");
                } else {
                    JugadorDos[x - 1][y] = 1;
                    JugadorDos[x - 1][y + 1] = 1;
                }
            }
        }
    }

}
