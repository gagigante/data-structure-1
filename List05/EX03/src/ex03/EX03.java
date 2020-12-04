/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

/**
 *
 * @author gabriel
 */
public class EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Au au!");
        Gato gato = new Gato("Miau!");
        Vaca vaca = new Vaca("Muuuu!");
        Leao leao = new Leao("Roar!");
        Pomba pomba = new Pomba("Pruuu!");
        
        cachorro.imprime();
        gato.imprime();
        vaca.imprime();
        leao.imprime();
        pomba.imprime(); 
    }
    
}
