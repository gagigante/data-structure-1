/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        String productName;  
        double value, cashValue, installmentValue;
                                  
        System.out.println("Nome do Produto: ");        
        productName = scanner.nextLine();
        
        System.out.println("Valor do Produto: ");
        value = Double.parseDouble(scanner.nextLine());
        
        cashValue = value - (value * 0.1);
        installmentValue = (value + (value * 0.05)) / 3;
        
        System.out.println("-------------------------");    
        System.out.println("Nome do Produto: " + productName);    
        System.out.println("Valor à vista: " + cashValue);    
        System.out.println("Valor em 3x: " + installmentValue * 3);
        System.out.println("Valor das parcelas: " + installmentValue);        
    }
    
}
