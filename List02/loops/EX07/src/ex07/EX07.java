/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letra;
        
        do{
            // EX 7
            //System.out.println("A");
            //System.out.println("B");
            //System.out.println("C");
            //System.out.println("S");
            
            // EX 7.1
            System.out.println("Primeira");
            System.out.println("Segunda");
            System.out.println("Terceira");
            System.out.println("Sair");
            System.out.println("Digite algo: ");
            letra = scanner.nextLine();
        }while(!"s".equals(letra.toLowerCase()) && !"sair".equals(letra.toLowerCase()));
    }
    
}
