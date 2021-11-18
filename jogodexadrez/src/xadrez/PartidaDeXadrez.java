/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import jogodetabuleiro.Tabuleiro;

/**
 *
 * @author ABRAAO
 */
public class PartidaDeXadrez {
    
    private Tabuleiro tabuleiro;
    
    public PartidaDeXadrez(){
        
        tabuleiro = new Tabuleiro (8, 8);
    
    
    }
    
    public PecaDeXadrez[][] pegarPecas(){
        
        PecaDeXadrez [][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i=0; i< tabuleiro.getLinhas();i++){
            for(int j=0; j <tabuleiro.getColunas();i++){
                mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i , j);
                        
                
            }
        }
        return mat;
        
        
    }
}
