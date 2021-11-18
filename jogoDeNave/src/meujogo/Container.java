/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meujogo;

import static javax.swing.DropMode.ON;
import javax.swing.JFrame;
import meujogo.modelo.Fase;

/**
 *
 * @author ABRAAO
 */
public class Container extends JFrame{
    
    public Container(){
        add (new Fase());
        setTitle("Jogo de Nave");
        setSize(1024, 728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setVisible(true);
        
    
    }
    
    public static void main(String[] args) {
        new Container();
    }
}
