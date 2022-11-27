/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 12: Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación se mostrará
 * el contenido de ese array junto al índice (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos números están entre 0 y 9. El programa
 * deberá colocar el número de la posición inicial en la posición final, rotando el resto de números para que no se pierda
 * ninguno. Al final se debe mostrar el array resultante.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // definición de variables
        int [] num = new int[10];
        int pinicial = 0;
        int pfinal = 0;
        boolean correcto = true;
        System.out.println("Introduzca 10 números");
        for (int i = 0; i<10; i++) {
          num[i] = sc.nextInt();
        }

        // pide las posiciones hasta que se cumplan todas las condiciones del enunciado
        do {
            correcto = true;
            System.out.print("Introduzca la posición inicial (0 - 9): ");
            pinicial = sc.nextInt();
            if (pinicial<0 || pinicial>10) {
                System.out.println("Error. Introduzca un número del 0 al 9");
                correcto = false;
            } else {
                System.out.print("Introduzca la posición final (0 - 9): ");
                pfinal= sc.nextInt();
                if (pfinal<0 || pfinal>10) {
                    System.out.println("Error. Introduzca un número del 0 al 9");
                    correcto = false;
                } else {
                    if (pinicial>=pfinal) {
                        System.out.println("La posición inicial debe ser menor a la final >:(");
                        correcto = false;
                    }
                }
            }
        } while (!correcto);
        sc.close();

        // Muestra el array original
        System.out.println("\nArray original:");
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", num[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

        // Desplaza el array:
        int aux = num[pinicial];
        int[] n = new int[10];
        for (int i  = 0; i<10; i++) {
            if (i+1 == 10) {
                n[0] = num[i];
            } else if (i>pinicial && i<pfinal){
                n[i] = num[i];
            } else {
                n[i+1] = num[i];
            }
        }
        n[pfinal] = aux;

        // Muestra el array cambiado
        System.out.println("\nArray original:");
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", n[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }
}
