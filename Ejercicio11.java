/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 11: Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación se mostrará
 * el contenido de ese array junto al índice (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los primos
 * a las primeras posiciones, desplazando el resto de números (los que no son primos) de tal forma que no se pierda ninguno. Al
 * final se debe mostrar el array resultante
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definicion de variables
        int [] num = new int[10];
        int[] arrayPrimos = new int[10];
        int[] arrayNoPrimos = new int[10];
        int primos = 0;
        int noprimos = 0;

        // Pedimos los números
        System.out.println("Introduzca 10 números");
        for (int i = 0; i<10; i++) {
            num[i] = sc.nextInt();
            // Ordenar el array auxiliar poniendo los primos en las primeras posiciones
            boolean esprimo = true;
            for (int j = 2; j < num[i] - 1; j++) {
                if (num[i] % j == 0) {
                    esprimo = false;
                }
            }
            if (esprimo) {
                arrayPrimos[primos] = num[i];
                primos++;
            } else {
                arrayNoPrimos[noprimos] = num[i];
                noprimos++;
            }
        }
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

        // Muestra la tabla ordenada:
        System.out.println("\nArray con los primos al principio:");
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i<primos; i++) {
            System.out.printf("│%4d ", arrayPrimos[i]);
        }
        for (int i = 0; i<noprimos; i++) {
            System.out.printf("│%4d ", arrayNoPrimos[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");


    }
}
