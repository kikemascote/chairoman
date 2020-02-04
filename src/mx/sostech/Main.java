package mx.sostech;

import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    static SuperHumano superHumano = new SuperHumano();
    static Scanner scanner = new Scanner(System.in);
    static LinkedList<SuperHumano> list = new LinkedList<>();
    public static void main(String[] args) {
        // write your code here
        int cant = 0, id = 0;



        // System.out.println("cuantos superheroes quieres crear?");
        // cant = scanner.nextInt();
        // SuperHumano[] superHumanos = new SuperHumano[cant];

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

    private static void creaHeroe() {
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
        superHumano.setEdad(parseInt(scanner.nextLine()));
        System.out.println("Nivel de pelea: ");
        superHumano.setLvlPelea(parseInt(scanner.nextLine()));
        list.add(superHumano);

        System.gc();
    }

    public static void printer() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Nombre: " + list.get(i).getNombre());
            System.out.println("Edad: " + list.get(i).getEdad());
            System.out.println("Nacionalidad: " + list.get(i).getNacionalidad());
            System.out.println("Genero: " + list.get(i).getGenero());
            System.out.println("Alias: " + list.get(i).getAlias());
            System.out.println("Faccion: " + list.get(i).getFaccion());
            System.out.println("Poder: " + list.get(i).getPoder());
            System.out.println("Debilidad: " + list.get(i).getKriptonita());
            System.out.println("Nivel de pelea: " + list.get(i).getLvlPelea());
        }
    }

    public static void pelea(int player1, int player2) {
        int pawer1, pawer2;
        pawer1 = list.get(player1).getLvlPelea();
        pawer2 = list.get(player2).getLvlPelea();
        if (pawer1 > pawer2) {
            System.out.println("despues de  unos buenos madrazos el ganador es: " + list.get(player1).getAlias());
        } else if (pawer2 > pawer1) {
            System.out.println("despues de unos catorrazos y dos pierrotazos al lomo el ganador es: " + list.get(player2).getAlias());
        } else {
            System.out.println("se rompieron nada mas que las medias y ambos se fueron llorando");
        }

    }
}
