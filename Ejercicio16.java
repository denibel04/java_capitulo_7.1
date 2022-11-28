/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 16: Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos).
 * A continuación el programa mostrará el array y preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente se
 * volverá a mostrar el array  escribiendo los números que se quieren resaltar entre corchetes.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio16 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i<20; i++) {
            array[i] = (int)(Math.random()*401);
            System.out.print(array[i] + " ");
        }
        System.out.print("\n¿Qué números quiere resaltar? \n1 – los múltiplos de 5 \n2 – los múltiplos de 7\nOpcion: :");
        int opcion = sc.nextInt();
        for (int i = 0; i<20; i++) {
            if (opcion==1) {
                if (array[i]%5==0) {
                    System.out.printf("[%d] ", array[i]);
                } else {
                    System.out.print(array[i] + " ");
                }
            } else if (opcion==2) {
                if (array[i]%7==0) {
                    System.out.printf("[%d] ", array[i]);
                } else {
                    System.out.print(array[i] + " ");
                }
            }
        }
        sc.close();
    }
}
