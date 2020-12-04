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
public class ContaPoupanca extends Conta {
     public ContaPoupanca (int NumeroConta, String Titular, double Saldo) {
      super(NumeroConta, Titular, Saldo);
    }

    public void gerarTaxa() {
      this.Saldo += Saldo * .006;
    }
}
