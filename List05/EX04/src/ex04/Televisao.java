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
public class Televisao extends Eletrodomestico {
    public Televisao(){
        super(20, 1);
    }
   
    public void imprime(){
        System.out.println("Você está na Tv, no canal " + this.Canal + ", ela está " + this.Situacao + " com o volume " + this.Volume);
    }
}
