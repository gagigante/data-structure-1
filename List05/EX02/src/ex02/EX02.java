/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

/**
 *
 * @author gabriel
 */
public class EX02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro("ASD-1234");
        Bicicleta bicicleta = new Bicicleta("ASD-2434");
        Moto moto = new Moto("ASD-1167");
        
        carro.imprime();
        bicicleta.imprime();
        moto.imprime();
    }
    
}
