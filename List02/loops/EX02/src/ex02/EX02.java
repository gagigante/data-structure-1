/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Digite o número 1: ");
        num1 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Digite o número 2: ");
        num2 = Integer.parseInt(scanner.nextLine());
        
        if(num1 < num2) {
            while(num1 <= num2) {
                System.out.println(num1);
                
                num1++;
            }
        } else {
            while(num1 >= num2) {
                System.out.println(num1);
                
                num1--;
            }
        }
    }
    
}
