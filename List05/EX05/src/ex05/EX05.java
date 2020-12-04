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
public class EX05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1, "Joao", 500);
        
        contaCorrente.gerarTaxa();
        contaCorrente.getSaldo();
        contaCorrente.Depositar(500);
        contaCorrente.getSaldo();
        
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, "Maria", 700);
        
        contaPoupanca.gerarTaxa();
        contaPoupanca.Sacar(100);
        contaPoupanca.getSaldo();
        contaCorrente.Transferir(contaPoupanca, 200);
        contaPoupanca.getSaldo();
        contaPoupanca.getSaldo();
    }
    
}
