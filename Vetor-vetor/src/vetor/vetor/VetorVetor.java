/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor.vetor;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Carlos
 */
public class VetorVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        System.out.println(Arrays.toString(gerarCodigo()));
  
}
      
  public static int[] gerarCodigo(){
      
       int []vetor = new int[10];
        
        Random sorteio = new Random();
        
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sorteio.nextInt(100);
            
            
             
        }
      return vetor;
     
    }
    
    
}
