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
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        double width, height, perimeter, area;
        
        System.out.println("Informe a largura do terreno: ");
        width = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Informe a altura do terreno: ");
        height = Double.parseDouble(scanner.nextLine());
        
        perimeter = width * 2 + height * 2;
        area = width * height;
        
        System.out.println("O perímetro do terreno é " + perimeter + " e sua área é " + area);
    }
    
}
