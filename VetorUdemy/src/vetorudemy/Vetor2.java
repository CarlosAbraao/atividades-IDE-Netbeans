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
public class Vetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Vetor de quantos valores: ");
        int n = sc.nextInt();
        Produto[] produto = new Produto[n];
        
        for(int i = 0; i < n; i++){
            
            System.out.println("Digite o nome do produto: ");
            sc.nextLine();
            String precoNome = sc.nextLine();
            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            
            produto[i] = new Produto(precoNome, preco);
        }
             double soma = 0;
             
             for(int i = 0; i < n; i++){
                 soma =+ produto[i].getPreco();
                 
             }
        System.out.println("Valor da media: " + soma / n);
    }
    
}
