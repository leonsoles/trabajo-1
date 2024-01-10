package tarea;

import java.util.Scanner;

public class tercera_pregunta {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double monto_pagar,monto_total;
        final double IGV;
        System.out.printf("Ingresar el monto total:\n");
        monto_total = lector.nextDouble();
        IGV=monto_total*0.18;
        monto_pagar=monto_total-IGV;
        System.out.printf("El monto a pagar es de:" + monto_pagar + "y el IGV es:" + IGV);
    }
    
}
