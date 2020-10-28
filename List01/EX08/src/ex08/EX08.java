/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        double p1, t1, le, p2, t2, se, avg;
        
        System.out.println("Informe o valor de P1 (Peso: 60%): ");
        p1 = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Informe o valor de T1 (Peso: 30%): ");
        t1 = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Informe o valor de LE (Peso: 10%): ");
        le = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Informe o valor de P2 (Peso: 50%): ");
        p2 = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Informe o valor de T2 (Peso: 35%): ");
        t2 = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Informe o valor de SE (Peso: 15%): ");
        se = Double.parseDouble(scanner.nextLine());
        
        avg = (p1 * 0.3 + t1 * 0.15 + le * 0.05) + (p2 * 0.25 + t2 * 0.175 + se * 0.075);
       
        System.out.println("A média do aluno é " + avg);
    }
    
}
