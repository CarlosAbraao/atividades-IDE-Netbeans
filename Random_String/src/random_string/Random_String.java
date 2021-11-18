
package random_string;

import java.util.Random;

/**
 *
 * @author Carlos
 */
public class Random_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
            
            String nomes[] = {"Carlos", "James","Ronaldo", "Julio","Ana"};
           // System.out.println();
                
      //   String valor=  nomes[new Random().nextInt(nomes.length)];
        
      //  System.out.println(valor);
      
      Random rand = new Random();
      
        System.out.println(nomes[rand.nextInt(nomes.length)]);
            
        
    }
    
}
