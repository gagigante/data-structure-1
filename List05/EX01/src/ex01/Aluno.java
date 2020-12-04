/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author gabriel
 */
public class Aluno extends Pessoa {
    public Aluno(String Nome, int Idade){
        super(Nome, Idade);
    }
    
    public void quemSou(){
        System.out.println("Sou o Aluno " + this.Nome + " com idade " + this.Idade);
    }
}
