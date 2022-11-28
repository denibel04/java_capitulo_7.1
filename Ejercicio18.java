/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 18: Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200 ambos incluidos y que los almacene en un array. A continuación,
 * el programa debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el programa debe colocar de forma alterna y en orden los menores
 * o iguales de 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego mayor… Cuando se acaben los menores o los mayores, se completará con
 * los números que queden.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio18 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int menores = 0;
        int mayores = 0;
        int[] array = new int[10];
        int[] menoresA = new int[10];
        int[] mayoresA = new int[10];
        for (int i = 0; i<10; i++) {
            array[i] = (int)(Math.random()*201);
            //System.out.print(array[i] + " ");
            if (array[i]<=100) {
                menoresA[menores] = array[i];
                menores++;
            } else if (array[i]>100) {
                mayoresA[mayores] = array[i];
                mayores++;
            }
        }

        // Muestra el array original
        System.out.println("Array original:");
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", array[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

        // Muestra el array resultado
        System.out.println("\nArray resultado: ");
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        int i = 0;
        int j = 0;
        while (menores > 0 && mayores > 0) {
            System.out.printf("│%4d ", menoresA[i]);
            menores--;
            j++;
            System.out.printf("│%4d ", mayoresA[i]);
            mayores--;
            i++;
            j++;
        }
        do {
            if (mayores==0) {
                System.out.printf("│%4d ", menoresA[i]);
                menores--;
            } else if (menores==0) {
                System.out.printf("│%4d ", mayoresA[i]);
                mayores--;
            }
            i++;
            j++;
        } while (j<10);
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");


        sc.close();
    }
}
