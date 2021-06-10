import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int EdadM = 0;
        int EdadMen = 0;
        int Contador1 = 0;
        int Contador2 = 0;
        int Edad;
        System.out.println("Ingrese 100 edades de personas ");
        for (int i = 0; i < 100; i++) {
            Edad = src.nextInt();
            if (Edad >= 25) {
                Contador1++;
                EdadM += Edad;
            } else {
                Contador2++;
                EdadMen += Edad;
            }
        }
        float Prom1 = (float) EdadMen / Contador2;
        float Prom2 = (float) EdadM / Contador1;
        System.out.println("El promedio de Edad de las personas mayores o iguales a 25 es de: " + Prom2);
        System.out.println("El promedio de Edad de las personas menores a 25 es de: " + Prom1);
    }

}
