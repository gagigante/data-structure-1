/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
                
        double radius, height, area;
        
        System.out.println("Informe o raio: ");
        radius = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Informe a altura: ");
        height = Double.parseDouble(scanner.nextLine());
        
        area = 3.14 * (radius * radius) * height;
                                
        System.out.println("A área do cilindro é " + area);
    }
    
}
