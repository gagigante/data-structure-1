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
        Scanner scanner = new Scanner(System.in);
        int year, i, qtt = 0;
        
        System.out.println("Digite o ano de nascimento: ");
        year = Integer.parseInt(scanner.nextLine());
        
        for(i = year; i <= 2020; i++){
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                qtt++;
            }
        }
        
        System.out.println("Quantidade de anos bissextos vividos: " + qtt);
    }
}
