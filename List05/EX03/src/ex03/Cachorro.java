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
public class Cachorro extends Animal {
    public Cachorro(String Som){
        super(Som);
    }
    
    public void imprime(){
        System.out.println("Sou o Cachorro e faço " + this.Som);
    }
}
