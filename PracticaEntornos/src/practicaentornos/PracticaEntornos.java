/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaentornos;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class PracticaEntornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        
        System.out.println();
        
        for (int i = 1; i <= numFilas; i++) {
   
            for (int j = 1; j <= numFilas - i; j++) {
                System.out.print(" ");
            }
            
            for (int numero = 1; numero <= (i * 2) - 1; numero++) {
                
                System.out.print("+");
                
            }
            System.out.println();
        }
    }
}

