/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 9: Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con la palabra “par” o “impar” según proceda.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio09 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];
        // Pide los números
        System.out.println("Por favor, introduzca 8 números:");
        for (int i=0; i<8; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        for (int i=0; i<8; i++) {
            if (num[i]%2==0) {
                System.out.println(num[i] + " par");
            } else {
                System.out.println(num[i] + " impar");
            }
        }
    }
}
