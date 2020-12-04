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
public class Eletrodomestico {
    protected int Volume;
    protected double Canal;
    protected String Situacao;
    
    public Eletrodomestico(int Volume, double Canal) {
        this.Volume = Volume;        
        this.Canal = Canal;    
        this.Situacao = "Ligado";
    }
    
    public void inverteSituacao(int Eletro){
        if("Desligado".equals(this.Situacao)){
            this.Situacao = "Ligado";
            
            if(Eletro == 1) {
                this.Volume = 20;
            } else {
                this.Volume = 40;
            }
        } else {
            this.Situacao = "Desligado";
            this.Volume = 0;
        }
    }
}
