/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

import java.text.DecimalFormat;
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
        DecimalFormat df = new DecimalFormat("#.00");
        double value, installment;
        int option;
        
        System.out.println("Digite o valor do produto: ");
        value = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Escolha uma opção (1 = 'A vista', 2 = '2 vezes', 3 = '3 vezes'): ");
        option = Integer.parseInt(scanner.nextLine());
        
        switch(option){
            case 1:
                value = value - (value / 10);
                
                System.out.println("Valor do produto á vista: " + value);
                break;
            case 2:
                value = value + (value * 5 / 100);
                installment = value / 2;
                
                System.out.println("Valor do produto parcelado em 2 vezes: " + value + ", o valor de cada parcela é " + df.format(installment));
                break;
            case 3:
                value = value + (value / 10);
                installment = value / 3;
                
                System.out.println("Valor do produto parcelado em 3 vezes: " + value + ", o valor de cada parcela é " + df.format(installment));
                break;
            default:
                System.out.println("Opção errada");
        }
    }
    
}
