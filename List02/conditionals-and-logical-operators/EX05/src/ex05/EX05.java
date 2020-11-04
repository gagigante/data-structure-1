/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double weight;
        String msg;
        
        System.out.println("Digite seu peso: ");
        weight = Double.parseDouble(scanner.nextLine());
        
        msg = weight < 56.7 ? "Peso Mosca" : 
                weight <= 61.2 ? "Peso Galo" : 
                    weight <= 65.8 ? "Peso Pena" : 
                        weight <= 70.3 ? "Peso Leve" : 
                            weight <= 77.6 ? "Peso Meio-médio" : 
                                weight <= 83.9 ? "Peso Médio" : 
                                    weight <= 120.2 ? "Peso Pesado" : "Não permitido";
        
        System.out.println(msg);
    }
    
}
