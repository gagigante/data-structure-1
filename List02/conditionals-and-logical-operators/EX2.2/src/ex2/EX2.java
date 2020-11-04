/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        System.out.println("Digite um número: ");
        number = Integer.parseInt(scanner.nextLine());
        
        if(number < 10 || number > 20) 
            System.out.println("O número não está entre 10 e 20");
        else
            System.out.println("O número está entre 10 e 20");
    }
    
}
