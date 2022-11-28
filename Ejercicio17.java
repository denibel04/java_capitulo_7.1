/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 17: Escribe un programa que muestre por pantalla un array de 10 números enteros generados al azar entre 0 y 100. A continuación, el programa
 * debe pedir un número al usuario. Se debe comprobar que el número introducido por teclado se encuentra dentro del array, en caso contrario se mostrará
 * un mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno correctamente. A continuación, el programa rotará el
 * array hacia la derecha las veces que haga falta hasta que el número introducido quede situado en la posición 0 del array. Por último, se mostrará el
 * array rotado por pantalla.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crea el array y lo rellena de números aleatorios
        int[] array = new int[10];
        for (int i = 0; i<10; i++) {
            array[i] = (int)(Math.random()*101);
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


        // Pide datos hasta que se introduzca el correcto
        System.out.print("Por favor, introduzca el número que quiera poner en la primera posición: ");
        int num;
        boolean coincide = false;
        do {
           num = sc.nextInt();
            for (int i = 0; i<10; i++) {
                if (array[i]==num) {
                    coincide = true;
                }
            }
            if (!coincide) {
                System.out.print("Ese número no está, introduzca otro: ");
            }
        } while (!coincide);
        sc.close();

        // Desplaza el array
        while (array[0]!=num) {
            int aux = array[9];
            for (int i=8; i>=0; i--) {
                array[i + 1] = array[i];
            }
            array[0] = aux;
        }

        // Muestra el resultado final
        System.out.println("Array desplazado: ");
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
        System.out.print("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }
}
