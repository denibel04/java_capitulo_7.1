/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 19: Realiza un programa que sea capaz de insertar un número en una posición concreta de un array. En primer lugar, el programa generará un
 * array de 12 números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se debe mostrar el contenido de ese array junto al índice (0 – 11).
 * Seguidamente el programa preguntará por el número que se quiere insertar y por la posición donde será insertado. Los números del array se desplazan a la
 * derecha para dejar sitio al nuevo. El último número (el que se encuentra en la posición 11) siempre se perderá.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[12];
        for (int i = 0; i<12; i++) {
            array[i] = (int)(Math.random()*201);
        }

        // Muestra el array original
        System.out.println("Array original:");
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("│%4d ", array[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

        // Pide el número que se va a insertar y dónde
        System.out.print("¿Qué número quiere insertar?: ");
        int num = sc.nextInt();
        System.out.print("¿En qué posición?: ");
        int posicion = sc.nextInt();
        sc.close();

        // Desplaza el array:
        for (int i=10; i>=posicion; i--) {
            array[i + 1] = array[i];
        }
        array[posicion] = num;
        // Muestra el resultado final
        System.out.println("Array resultado:");
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("│%4d ", array[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }
}
