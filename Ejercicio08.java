/**
 * Capítulo 7 - Arrays de una dimensión
 * Ejercicio 8: Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y que muestre a continuación un
 * diagrama de barras horizontales con esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio08 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temperatura = new int[12];
        String[] mes = {
                "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        System.out.println("Introduzca la temperatura media que ha hecho cada mes: ");
        for (int i=0; i<12; i++) {
            temperatura[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("El diagrama de barras de temperatura media del año es:");
        for (int i=0; i<12; i++) {
            System.out.printf("%10s: ", mes[i]);
            for (int j = 0; j<temperatura[i]; j++) {
                System.out.print("*");
            } System.out.println();
        }
    }
}
