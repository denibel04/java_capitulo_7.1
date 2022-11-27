/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 6: Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los elementos de ese array, es decir, el
 * elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
 * posición 0. Finalmente, muestra el contenido del array.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio06 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[15];
        // Pide los números
        System.out.println("Por favor, introduzca 15 números:");
        for (int i=0; i<15; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();
        // Muestra el array original
        System.out.print("Array original: ");
        for (int i=0; i<15; i++) {
            System.out.printf(num[i] + " ");
        } System.out.println();

        // Desplaza el array:
        int aux = num[14];
        for (int i=13; i>=0; i--) {
            num[i + 1] = num[i];
        }
        num[0] = aux;

        // Muestra el resultado final
        System.out.print("Array desplazado: ");
        for (int i=0; i<15; i++) {
            System.out.printf(num[i] + " ");
        }
    }
}
