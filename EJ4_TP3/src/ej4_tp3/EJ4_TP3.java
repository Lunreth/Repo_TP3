
package ej4_tp3;

import java.util.Scanner;


public class EJ4_TP3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        
        int A = 0;
        int B = 0;
        do{
            System.out.println("Ingrese dos numeros: ");
            A = lector.nextInt();
            B = lector.nextInt();
        }while(A == B);
        
        
        if(B > A){
            int contador = A;
            
            while(contador <= B){
                System.out.println("Valor de contador = " + contador);
                contador++;
            }
        }
        else
        {
            int contador = B;
            
            while(contador <= A){
                System.out.println("Valor de contador = " + contador);
                contador++;
            }
        }
        
        
        
    }
    
}
