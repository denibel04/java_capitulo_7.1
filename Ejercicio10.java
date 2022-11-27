/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 10: Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array. El programa debe ser capaz
 * de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza
 * arrays auxiliares si es necesario.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio10 {
    public static void main (String[] args) {
        int [] arrayOriginal = new int[20];
        int [] arrayAuxiliarPar = new int[20];
        int [] arrayAuxiliarImpar = new int[20];
        int j = 0; // contador de pares
        int k = 0; // contador de impares
        System.out.print("Array original: ");
        for (int i = 0; i<20; i++){
            arrayOriginal[i] = (int)(Math.random()*101);
            System.out.print(arrayOriginal[i] + " ");
            if (arrayOriginal[i]%2==0) {
                arrayAuxiliarPar [j] = arrayOriginal[i];
                j++;
            } else {
                arrayAuxiliarImpar [k] = arrayOriginal[i];
                k++;
            }
        }
        for (int i = 0; i<j; i++) {
            arrayOriginal[i] = arrayAuxiliarPar [i];
        }
        for (int i = 0; i<k; i++) {
            arrayOriginal[j] = arrayAuxiliarImpar [i];
            j++;
        }
        System.out.print("\nArray ordenado: ");
        for (int i = 0; i<20; i++) {
            System.out.print(arrayOriginal[i] + " ");
        }
    }
}
