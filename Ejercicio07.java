/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 7: Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios. El programa
 * pedirá entonces por teclado dos valores y a continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista generada
 * anteriormente. Los números que se han cambiado deben aparecer entrecomillados.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio07 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        for (int i = 0; i<100; i++) {
            num[i] = (int)(Math.random()*21);
            System.out.print(num[i] + " ");
        }

        System.out.print("\nPor favor, introduzca un número de los que se han mostrado: ");
        int valor1 = sc.nextInt();
        System.out.print("Introduzca el número por el que quiera cambiarlo: ");
        int valor2 = sc.nextInt();
        sc.close();

        for (int i = 0; i<100; i++) {
            if (num[i] == valor1) {
                System.out.printf("\"%d\" ", valor2);
            } else {
                System.out.print(num[i] + " ");
            }
        }
    }
}
