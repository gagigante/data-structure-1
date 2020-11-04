/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String letra, msg;
        
        System.out.println("Digite uma letra referente ao seu sexo: ");
        letra = scanner.nextLine();
        
        msg = "F".equals(letra) ? "Feminino" : "M".equals(letra) ? "Masculino" : "Letra incorreta";
        
        System.out.println(msg);
    }
    
}
