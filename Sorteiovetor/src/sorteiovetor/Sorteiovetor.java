
package sorteiovetor;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Carlos Abraão
 */
public class Sorteiovetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []v = gerarVetor(10);
        
        System.out.println(Arrays.toString(v));
    }
    
    private static int[] gerarVetor(int tam){
        int[]vetor = new int[tam];
        Random sorteio = new Random();
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sorteio.nextInt(100);
        }
        return vetor;
    }
    
}
