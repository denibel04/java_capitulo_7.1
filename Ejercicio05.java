/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 5: Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos junto con las palabras “máximo” y
 * “mínimo” al lado del máximo y del mínimo respectivamente.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Por favor, introduzca 10 números");
        for (int i = 0; i<10; i++) {
            num[i] = sc.nextInt();
            if (num[i]>max) {
                max = num[i];
            } else if (num[i]<min) {
                min = num[i];
            }
        }
        sc.close();

        for (int i = 0; i<10; i++) {
            if (num[i] == max) {
                System.out.println(num[i] + " maximo");
            } else if (num[i]==min) {
                System.out.println(num[i] + " minimo");
            } else {
                System.out.println(num[i]);
            }
        }
    }
}
