/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorudemy;

/**
 *
 * @author ABRAAO
 */
public class Produto {
    
   private String precoNome; 
   private double preco;
   
    public Produto(String precoNome, double preco){
        this.precoNome = precoNome;
        this.preco= preco;
    }

    public String getPrecoNome() {
        return precoNome;
    }

    public void setPrecoNome(String precoNome) {
        this.precoNome = precoNome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
