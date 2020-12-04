/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04;

/**
 *
 * @author gabriel
 */
public class EX04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        
        televisao.imprime();
        televisao.inverteSituacao(1);
        televisao.imprime();
        
        Radio radio = new Radio();
        
        radio.imprime();
        radio.inverteSituacao(2);
        radio.inverteSituacao(2);
        radio.imprime();   
    }
    
}
