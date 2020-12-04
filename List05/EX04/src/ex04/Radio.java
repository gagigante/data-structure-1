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
public class Radio extends Eletrodomestico {
    public Radio(){
        super(40, 99.9);
    }
    
    public void imprime(){
        System.out.println("Você está no Rádio " + this.Canal + " MHz, ele está " + this.Situacao + " com o volume " + this.Volume);
    }
}
