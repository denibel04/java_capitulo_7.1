/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 13: Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0
 * y 500 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el máximo o
 * el mínimo. Seguidamente se volverá a mostrar el array escribiendo el número destacado entre dobles asteriscos.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definicion de variables
        int[] array = new int[100];
        int maximo = 0;
        int minimo = 500;
        for (int i = 0; i<100; i++){
            array[i] = (int)(Math.random()*501);
            if (array[i]<minimo) {
                minimo = array[i];
            } else if (array[i]>maximo) {
                maximo = array[i];
            }
        }
        // Muestra el array original
        for (int i = 0; i<100; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n¿Quieres destacar el máximo o el mínimo?\n1. Máximo\n2. Mínimo");
        int opcion = sc.nextInt();
        sc.close();

        // Muestra el array con los números destacados
        if (opcion==1){
            for (int i = 0; i<100; i++) {
                if (array[i]==maximo) {
                    System.out.printf("**%d** ", array[i]);
                } else {
                    System.out.print(array[i] + " ");
                }

            }
        } else if (opcion==2) {
            for (int i = 0; i<100; i++) {
                if (array[i]==minimo) {
                    System.out.printf("**%d** ", array[i]);
                } else {
                    System.out.print(array[i] + " ");
                }

            }
        }
    }
}
