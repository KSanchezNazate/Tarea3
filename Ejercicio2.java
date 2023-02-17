/*Escriba un algoritmo que muestre "riesgo de hielo", si t<2 */
/*Escriba un algoritmo que muestre "Hace frío", si 2 ≤ t < 15 */
/*Escriba un algoritmo que muestre "Buena temperatura", si 15 ≤ t < 30 */
/*Escriba un algoritmo que muestre "Demasiado calor", si t ≥ 30 */


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura");
        int t = sc.nextInt();
        if (t < 2) {
            System.out.println("Riesgo de hielo");
        } else if (t >= 2 && t < 15) {
            System.out.println("Hace frio");
        } else if (t >= 15 && t < 30) {
            System.out.println("Buena temperatura");
        } else {
            System.out.println("Demasiado calor");
        }
    }
}