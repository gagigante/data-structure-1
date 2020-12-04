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
public class Moto extends Veiculo {
    public Moto(String Placa){
        super(Placa);
    }
    
    public void imprime(){
        System.out.println("Moto de Placa: " + this.Placa);
    }
}
