package tarea;

import java.util.Scanner;

public class segunda_pregunta {

    public static void main(String[] args) {
        int primera_variable;
        int segunda_variable;
        int tercera_variable;
        int multiplicacion;
        Scanner lector = new Scanner(System.in);
        System.out.printf("Ingrese el valor de la primera variable:\n");
        primera_variable = lector.nextInt();
        System.out.printf("Ingrese el valor de la segunda variable:\n");
        segunda_variable = lector.nextInt();
        System.out.printf("Ingrese el valor de la tercera variable:\n");
        tercera_variable = lector.nextInt();
        multiplicacion=primera_variable*(segunda_variable)*(tercera_variable);
        System.out.printf("La multiplicacion de las 3 variables es:\n"+multiplicacion+"\n");
        
        }
    }
    

