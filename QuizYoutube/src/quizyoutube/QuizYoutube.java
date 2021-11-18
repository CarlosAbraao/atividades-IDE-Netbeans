
package quizyoutube;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class QuizYoutube {

    
    public static void main(String[] args) {
        
        String q1 = " 1) QUAL O COMANDO PARA EXIBIR MENSAGEM NA TELA NA LINGUAGEM PYTHON?\n "
                          +"      (a) Sudo\n "
                          +"      (b) print\n "
                          +"      (c) echo";
        
        
                
        String q2 = "\n 2) QUAL O COMANDO PARA EXIBIR MENSAGEM NA TELA NA LINGUAGEM JAVA?\n "
                          +"      (a) head\n "
                          +"      (b) body\n "
                          +"      (c) System.out.println";
        
        
       String q3 = "\n 3) UMA CLASSSE DE COLABORADOR TEM O METODO ABAIXO: \n\n "
                          +"      public void setNome(String nome)   {\n"
                          +"            this.nome = nome; \n"
                             
                          +"           \n }\n"
                          +"     Para instanciar um objeto dessa classe com o nome \"Carlos\" no atributo nome utiliza-se:\n\n  "
                          +"    (a) Colaborador.setNome(\"Carlos\");\n "
                          +"     (b) Colaborador carlos = new Colaborador();\n "
                          +"     (c) Colaborador c = new Colaborador(); c.setNome(\"Carlos\"); \n ";
        
        
        
       Perguntas [] perg = {new Perguntas(q1, "b"),
                            new Perguntas(q2, "c"),
                            new Perguntas(q3, "b")
       };
       
        fazerTeste(perg);
        
    }
    
  
    
    public static void fazerTeste(Perguntas[] perguntas){
        
        int placar = 0;
        
        Scanner teclado = new  Scanner(System.in);
        
        for(int i = 0; i < perguntas.length ; i++){
            
           
            System.out.println(perguntas[i].mensagem);
             System.out.print("Resposta: ");
            String resposta = teclado.nextLine();
            if(resposta.equals(perguntas[i].repostas)){
                placar ++;
            }
            
            
            
        }
            System.out.println("VOCE ACERTOU " + placar + "/" + perguntas.length );

    }    
    
    
}
