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
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int cigarettesPerMonth, years;
        double cigarettesPrice, result;
        
        System.out.println("Quantos maços de cigarro você fuma por mês? ");
        cigarettesPerMonth = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Informe o preço do cigarro: ");
        cigarettesPrice = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Informe a quantidade de anos: ");
        years = Integer.parseInt(scanner.nextLine());
        
        result = ((cigarettesPerMonth * cigarettesPrice) * 12) * years;
        
        System.out.println("Você gastará " + result + " se fumar " + cigarettesPerMonth + " maço(s) de cigarro por mês durante " + years + " anos");
    }
    
}
