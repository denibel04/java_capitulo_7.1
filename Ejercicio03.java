/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 3: Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir, el primero que se introduce
 * es el último en mostrarse y viceversa.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 10 números");
        int [] num = new int[10];
        for (int i = 0; i<10; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("Ahora se mostrarán los números introducidos en orden inverso: ");
        for (int i = 9; i>=0; i--) {
            System.out.printf("%d ", num[i]);
        }
    }
}
