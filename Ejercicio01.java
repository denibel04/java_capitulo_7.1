/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 1: Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se muestra a continuación. Muestra el
 * contenido de todos los elementos del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio01 {
    public static void main (String[] args) {

        int[] num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        for (int n = 0; n<12; n++) {
            System.out.printf("[%d]: %d\n", n, num[n]); // Los valores no inicializados se inicializan directamente en 0
        }
    }
}
