/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX01;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        String name;
        double grade1, grade2, avg;
        
        System.out.println("Digite seu Nome: ");
        name = scanner.nextLine();
        
        System.out.println("Digite sua nota 1: ");
        grade1 = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Digite sua nota 2: ");
        grade2 = Double.parseDouble(scanner.nextLine());
        
        avg = (grade1 + grade2) / 2;
        
        System.out.println("Seu nome: " + name);
        System.out.println("Sua média: " + avg);
        
        if(avg >= 4)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
    
}
