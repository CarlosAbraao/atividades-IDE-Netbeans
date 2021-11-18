/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import jogodetabuleiro.Posicao;
import jogodetabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;

/**
 *
 * @author ABRAAO
 */
public class Programa {

   
    public static void main(String[] args) {
        PartidaDeXadrez partidadexadrez = new PartidaDeXadrez();
        UsarInterface.imprimirTabuleiro(partidadexadrez.pegarPecas());
    }
    
}
