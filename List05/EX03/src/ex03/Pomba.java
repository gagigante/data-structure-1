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
public class Pomba extends Animal {
     public Pomba(String Som){
        super(Som);
    }
    
    public void imprime(){
        System.out.println("Sou um Pombo e faço " + this.Som);
    }
}
