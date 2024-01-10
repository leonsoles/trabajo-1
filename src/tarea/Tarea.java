package tarea;

import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int base;
        int altura;
        int area;
        String msj= "centimetros";
        System.out.printf("Indique el tamaño de la base en (%s):\n",msj);
        base = lector.nextInt();
        System.out.printf("Indique el tamaño de la altura en (%s):\n",msj);
        altura = lector.nextInt();
        area = base*altura;
        System.out.printf("El area en este caso de el rectangulo en (%s) es:\n"+area+"\n",msj);
    }
    
}
