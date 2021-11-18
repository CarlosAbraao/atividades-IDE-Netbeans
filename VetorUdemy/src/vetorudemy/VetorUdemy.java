/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorudemy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ABRAAO
 */
public class VetorUdemy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Vetor de quantos valores: ");
        int n = sc.nextInt();
        
        
        double[] vect = new double[n];
        
        for(int i = 0; i < n ; i++){
            System.out.println("Digite um valor na posição: " + (i+1)); 
            vect[i] = sc.nextDouble();
        }
         double soma = 0;
         
         for(int i = 0; i < n; i++){
        
             soma =+ vect[i];
    }
         double avg = soma / 3;
        System.out.println(avg);
        
         sc.close();
    }
    
   
           
}
