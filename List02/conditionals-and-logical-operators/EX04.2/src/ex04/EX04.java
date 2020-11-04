/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora;
        String msg;
        
        System.out.println("Digite uma hora entre 0 e 23: ");
        hora = Integer.parseInt(scanner.nextLine());
        
        msg = hora > 23 ? "Erro: Digite uma hora certa" : 
            hora < 0 ? "Erro: Digite uma hora certa" : 
                hora <= 5 ? "Boa Madrugada" : 
                    hora <= 11 ? "Bom dia" : 
                        hora <= 18 ? "Boa tarde" : "Boa noite";
        
        System.out.println(msg);
    }
    
}
