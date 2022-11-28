/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 14: Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras correspondientes a colores se deben
 * almacenar al comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el
 * programa deben estar en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro, blanco y morado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definicion de variables
        String[] palabras = new String[8];
        String[] auxiliar = new String[100];
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        boolean color = false;
        int k = 0; // contador para el auxiliar
        System.out.println("Por favor, introduzca 8 palabras separadas por intro");
        for (int i=0; i<8; i++) {
            palabras[i] = sc.next();
            for (int j = 0; j<9; j++) {
                if (palabras[i].equals(colores[j])) {
                    auxiliar[k] = palabras[i];
                    k++;
                }
            }
        }
        sc.close();

        for (int i = 0; i<8; i++) {
            for (int j = 0; j<9; j++) {
                if (palabras[i].equals(colores[j])) {
                    color = true;

                }
            }
            if (!color) {
                auxiliar[k] = palabras[i];
                k++;
            }
            color = false;
        }
        for (int i = 0; i<8; i++) {
            System.out.print(auxiliar[i] + " ");
        }
    }
}
