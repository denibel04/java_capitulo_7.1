/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 15: Un restaurante nos ha encargado una aplicación para colocar a los clientes ensus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a
 * 4 comensales (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado para colocar a grupos mayores a
 * 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
 * personas como máximo e intente de nuevo”. Para el grupo que llega, se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
 * busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es dedos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
 * las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
 * pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del programa se ilustra a continuación:
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio15 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crea el array de las mesas y lo llena con las ocupaciones iniciales aleatorias
        int[] ocupadas = new int[10];
        for (int i = 0; i<10; i++) {
            ocupadas[i] = (int)(Math.random()*5);
        }

        int clientes; // grupos que irán llegando

        do {
            // Muestra las mesas y las personas que hay sentadas
            System.out.println("┌────────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
            System.out.print("│ Mesa nº    ");
            for (int i = 0; i < 10; i++) {
                System.out.printf("│%4d ", i+1);
            }
            System.out.println("│\n├────────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
            System.out.print("│ Ocupación  ");
            for (int i = 0; i < 10; i++) {
                System.out.printf("│%4d ", ocupadas[i]);
            }
            System.out.println("│\n└────────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa):");
            clientes = sc.nextInt();

            boolean hayMesa = false;
            if (clientes>4) {
                System.out.print("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
            }

            int i = 0;
            if (clientes!=-1) {
                do {
                    if (ocupadas[i]==0) {
                        System.out.printf("Por favor, siéntese en la mesa %d\n", i + 1);
                        ocupadas[i] += clientes;
                        hayMesa = true;
                    }
                    i++;
                } while (i<10 && !hayMesa);
                i = 0;
                do {
                    if (ocupadas[i] + clientes<=4) {
                        System.out.printf("Tendrán que compartir mesa, sientese en la mesa %d\n", i+1);
                        ocupadas[i] += clientes;
                        hayMesa = true;
                    }
                    i++;
                } while (i<10 && !hayMesa);

                if (!hayMesa) {
                    System.out.println("Lo siento, en estos momentos no quedas sitio");
                }
            }
        } while (clientes != -1);

        sc.close();
    }
}
