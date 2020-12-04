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
public class Bicicleta extends Veiculo {
    public Bicicleta(String Placa){
        super(Placa);
    }
    
    public void imprime(){
        System.out.println("Bicicleta de Placa: " + this.Placa);
    }
}
