package ej7_tp3;

// IMPORTAMOS LIBRERIA SCANNER
import java.util.Scanner;

public class EJ7_TP3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // DEFINICIÓN Y CREACIÓN DE VARIABLES
        Scanner objeto = new Scanner(System.in);
        
        double millas = 0.0;
        
        do {
            // MENSAJE INICIAL
            System.out.println("Ingrese las millas: ");

            // INPUT DEL USUARIO
            millas = objeto.nextDouble();
            
            if( millas == 0){
                break;
            }
            
            // OPERACIONES
            double km = millas*1.6093;
            
            System.out.println("Kilometros = " + km);
            
        } while( millas != 0 );
        
    }
    
}
