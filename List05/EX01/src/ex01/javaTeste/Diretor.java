/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01.javaTeste;

import ex01.Pessoa;

/**
 *
 * @author gabriel
 */
public class Diretor extends Pessoa {
    public Diretor(String Nome, int Idade){
        super(Nome, Idade);
    }
    
    public void quemSou(){
        System.out.println("Sou o Diretor " + this.Nome + " com idade " + this.Idade);
    }
}
