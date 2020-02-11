package mx.sostech;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Metodos {

    static Scanner scanner = new Scanner(System.in);
    static Scanner intScan = new Scanner(System.in);
    static LinkedList<SuperHumano> list = new LinkedList<>();

    public void menu() {
        int cant = 0, id = 0;

        do {
            if (list.isEmpty()) {
                System.out.println("Introduce un superheroe:\n");
                creaHeroe();

            } else {
                System.out.println("quieres\n1)crear un super heroe\n2)ver superheroes\n4)pelear\n3)salir!");
                cant = scanner.nextInt();
                switch (cant) {
                    case 1:
                        creaHeroe();
                        // list.add(superHumano);
                        break;
                    case 2:
                        printer();
                        break;
                    case 3:
                        System.out.println("hasta la vista beibe!");
                        System.exit(0);
                        break;
                    case 4:
                        System.out.println("Elige peleador 1:");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println("" + i + ":" + list.get(i).getAlias());
                        }
                        int p1, p2;
                        p1 = scanner.nextInt();
                        System.out.println("Elige peleador 2:");
                        p2 = scanner.nextInt();
                        pelea(p1, p2);
                        break;
                    default:
                        System.out.println("opcion no valida!");
                }
            }
        } while (cant != 3);

    }

    private void creaHeroe() {
        SuperHumano superHumano = new SuperHumano();
        System.out.println("Nombre:");
        superHumano.setNombre(scanner.nextLine());
        System.out.println("Nacionalidad:");
        superHumano.setNacionalidad(scanner.nextLine());
        System.out.println("Genero:");
        superHumano.setGenero(scanner.nextLine());
        System.out.println("Alias:");
        superHumano.setAlias(scanner.nextLine());
        System.out.println("Poder:");
        superHumano.setPoder(scanner.nextLine());
        System.out.println("Debilidad:");
        superHumano.setKriptonita(scanner.nextLine());
        System.out.println("Faccion:");
        superHumano.setFaccion(scanner.nextLine());
        System.out.println("Edad:");
        superHumano.setEdad(parseInt(intScan.nextLine()));
        System.out.println("Nivel de pelea: ");
        //superHumano.setLvlPelea(parseInt(scanner.nextLine()));
        superHumano.setLvlPelea(new Random().nextInt(10));
        superHumano.setMov1((new Random().nextInt(5)));
        superHumano.setMov2((new Random().nextInt(7)));
        superHumano.setMov3((new Random().nextInt(10)));
        list.add(superHumano);

        System.gc();
    }

    public static void printer() {
        for (SuperHumano humano : list) {
            System.out.println("Nombre: " + humano.getNombre());
            System.out.println("Edad: " + humano.getEdad());
            System.out.println("Nacionalidad: " + humano.getNacionalidad());
            System.out.println("Genero: " + humano.getGenero());
            System.out.println("Alias: " + humano.getAlias());
            System.out.println("Faccion: " + humano.getFaccion());
            System.out.println("Poder: " + humano.getPoder());
            System.out.println("Debilidad: " + humano.getKriptonita());
            System.out.println("Nivel de pelea: " + humano.getLvlPelea());
        }
    }

    //    public static void pelea(int player1, int player2) {
//        int pawer1, pawer2;
//        pawer1 = list.get(player1).getLvlPelea();
//        pawer2 = list.get(player2).getLvlPelea();
//        if (pawer1 > pawer2) {
//            System.out.println("despues de  unos buenos madrazos el ganador es: " + list.get(player1).getAlias());
//        } else if (pawer2 > pawer1) {
//            System.out.println("despues de unos catorrazos y dos pierrotazos al lomo el ganador es: " + list.get(player2).getAlias());
//        } else {
//            System.out.println("se rompieron nada mas que las medias y ambos se fueron llorando");
//        }
//
//    }
    public void pelea(int player1, int player2) {
        int btlLvl1, btlLvl2, mov11, mov12, mov13, mov21, mov22, mov23, vida1, vida2;
        btlLvl1 = list.get(player1).getLvlPelea();
        btlLvl2 = list.get(player2).getLvlPelea();
        vida1 = list.get(player1).getVida();
        vida2 = list.get(player2).getVida();
        mov11 = list.get(player1).getMov1();
        mov12 = list.get(player1).getMov2();
        mov13 = list.get(player1).getMov3();
        mov21 = list.get(player2).getMov1();
        mov22 = list.get(player2).getMov2();
        mov23 = list.get(player2).getMov3();
        do {
            System.out.println("Pelea entre " + list.get(player1).getAlias() + "(vida:" + vida1 + ") y " + list.get(player2).getAlias() + "(vida:" + vida2);
            if (mov11 > mov21) {
                System.out.println("" + list.get(player1).getAlias() + "le puso un buen madrazote a " + list.get(player2).getAlias() + "causandole un daño de " + (mov11 * btlLvl1));
                vida2 = vida2 - (btlLvl1 * mov11);
            } else if (mov11 < mov21) {
                System.out.println("" + list.get(player2).getAlias() + "le puso un buen madrazote a " + list.get(player1).getAlias() + "causandole un daño de " + (mov21 * btlLvl2));
                vida1 = vida1 - (btlLvl2 * mov21);
            }
        } while ((vida1 >= 1 && vida2 <= 0) || (vida2 >= 1 && vida1 <= 0));
    }
}
