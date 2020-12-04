/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;

/**
 *
 * @author gabriel
 */
public class Conta {
    protected int NumeroConta;
    protected String Titular;
    protected double Saldo;
    
    public Conta(int NumeroConta, String Titular, double Saldo) {
        this.NumeroConta = NumeroConta;
        this.Titular = Titular;
        this.Saldo = Saldo;
    }
    
    public void Sacar(double valor){
        if(this.Saldo > valor){
            this.Saldo -= valor;        
        }
    }
    
    public void Depositar(double valor){
        this.Saldo += valor;
    }
    
    public void Transferir(Conta conta ,double valor){
        if(this.Saldo > valor){
            this.Saldo -= valor;
        }
        conta.Saldo += valor;
    }
    
    public void getSaldo(){
        System.out.println(this.Titular + ": Seu saldo é: " + this.Saldo);
    }
}
