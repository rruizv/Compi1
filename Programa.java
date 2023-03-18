package dron;
import java.util.Scanner;

public class Dron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Desea encender el dron? (s/n)");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("DRON ENCENDIDO, MOTORES FUNCIONANDO");

            boolean encendido = true;

            while (encendido) {
                System.out.println("Elija una opción:");
                System.out.println("1. ELEVARDRON");
                System.out.println("2. BAJARDRON");
                System.out.println("3. GIRARDERECHA");
                System.out.println("4. GIRARIZQUIERDA");
                System.out.println("5. ADELANTE");
                System.out.println("6. ATRAS");
                System.out.println("7. APAGAR DRON");

                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("DRON SUBIENDO");
                        break;
                    case 2:
                        System.out.println("DRON BAJANDO");
                        break;
                    case 3:
                        System.out.println("GIRANDO DRON A LA DERECHA");
                        break;
                    case 4:
                        System.out.println("GIRANDO DRON A LA IZQUIERDA");
                        break;
                    case 5:
                        System.out.println("DRON MOVIENDOSE HACIA ADELANTE");
                        break;
                    case 6:
                        System.out.println("DRON MOVIENDOSE HACIA ATRAS");
                        break;
                    case 7:
                        System.out.println("APAGANDO MOTORES, DRON APAGADO");
                        encendido = false;
                        break;
                }
            }
        } else {
            System.out.println("DRON APAGADO");
        }

        scanner.close();
    }
}
