/*Las horas inferiores a 169 horas se pagan aplicando su tarifa horaria.

Las horas comprendidas entre 169 y 180 horas se pagan aplicando un incremento del 50 % sobre su tarifa horaria.

Las horas superiores a 180 horas se pagan aplicando un incremento del 60 %.

La prima familiar se calcula de la siguiente manera:

1 hijo: 20 €

2 hijos: 50 €

Por encima de 2 hijos : 70 € +20 € por cada hijo adicional */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.println("Introduce el número de hijos: ");
        int hijos = sc.nextInt();
        int prima = 0;
        if (hijos == 1) {
            prima = 20;
        } else if (hijos == 2) {
            prima = 50;
        } else if (hijos > 2) {
            prima = 70 + (hijos - 2) * 20;
        }
        if (horas < 169) {
            System.out.println("El salario es de " + horas * 10 + "€");
        } else if (horas >= 169 && horas <= 180) {
            System.out.println("El salario es de " + (horas * 10) * 1.5 + "€");
        } else {
            System.out.println("El salario es de " + (horas * 10) * 1.6 + "€");
        }
        System.out.println("La prima familiar es de " + prima + "€");
    }
}

