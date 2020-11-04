/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade1, grade2, avg;
        
        System.out.println("Digite sua nota 1: ");
        grade1 = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Digite sua nota 2: ");
        grade2 = Double.parseDouble(scanner.nextLine());
        
        avg = (grade1 + grade2) / 2;
        
        if(avg < 4)
            System.out.println("Reprovado");
        else 
            if(avg >= 7)
                System.out.println("Aprovado");
            else
                System.out.println("Recuperação");     
    }
    
}
