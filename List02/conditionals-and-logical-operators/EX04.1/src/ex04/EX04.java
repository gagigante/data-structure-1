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
        
        System.out.println("Digite uma hora entre 0 e 23: ");
        hora = Integer.parseInt(scanner.nextLine());
        
        if(hora < 0 || hora > 23)
            System.out.println("Erro: Hora inválida");
        else {
            if(hora <= 6) {
                System.out.println("Boa madrugada");
            } else {
                if(hora <= 12) {
                    System.out.println("Bom dia");
                } else {
                    if(hora <= 18) {
                        System.out.println("Boa tarde");
                    } else {
                        System.out.println("Boa noite");
                    }
                }
            }
        } 
    }
}
