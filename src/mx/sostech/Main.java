package mx.sostech;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static SuperHumano superHumano = new SuperHumano();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        int cant = 0, id = 0;

        LinkedList<SuperHumano> list = new LinkedList<>();

        // System.out.println("cuantos superheroes quieres crear?");
        // cant = scanner.nextInt();
        // SuperHumano[] superHumanos = new SuperHumano[cant];

        do {
            if (list.isEmpty()) {
                System.out.println("Introduce un superheroe:\n");
                creaHeroe();
                list.add(superHumano);
            } else {
                System.out.println("quieres\n1)crear un super heroe\n2)ver superheroes\n3)salir!");
                cant = scanner.nextInt();
                switch (cant) {
                    case 1:
                        creaHeroe();
                        list.add(superHumano);
                        break;
                    case 2:
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println("Nombre: " + list.get(i).getNombre());
                            System.out.println("Edad: " + list.get(i).getEdad());
                            System.out.println("Nacionalidad: " + list.get(i).getNacionalidad());
                            System.out.println("Genero: " + list.get(i).getGenero());
                            System.out.println("Alias: " + list.get(i).getAlias());
                            System.out.println("Faccion: " + list.get(i).getFaccion());
                            System.out.println("Poder: " + list.get(i).getPoder());
                            System.out.println("Debilidad: " + list.get(i).getKriptonita());

                        }
                        break;
                    case 3:
                        System.out.println("hasta la vista beibe!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("opcion no valida!");
                }
            }
        } while (cant != 3);

    }

    private static void creaHeroe() {
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
        superHumano.setEdad(scanner.nextInt());
        System.gc();
    }
}
