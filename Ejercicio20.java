/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 20: Implementa un programa que calcule la denominación ordinal de los reyes de una secuencia histórica. El programa solicitará la cantidad de
 * reyes que se van a introducir, y a continuación recibirá los nombres de los reyes. Presentará por pantalla dichos nombres, pero colocándoles el ordinal
 * correspondiente. Así, por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería aparecer como Felipe 1º y el segundo como Felipe 2º.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número total de nombres de reyes: ");
        int num = sc.nextInt();
        String[] reyes = new String[num];
        System.out.println("Introduzca los nombres de los reyes separados por intro ");
        for (int i = 0; i<num; i++) {
            reyes[i] = sc.next();
        }
        for (int i = 0; i < num; i++) {
            int ordinal = 1;
            for (int j = 0; j < i; j++) {
                if (reyes[i].equals(reyes[j])) {
                    ordinal++;
                }
            }
            System.out.printf("%s %dº\n", reyes[i], ordinal);
        }
        sc.close();
    }
}
