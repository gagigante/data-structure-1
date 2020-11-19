/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

/**
 *
 * @author gabriel
 */
import ex03.Math;

public class EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Math math = new Math();
        
        int[] vet = {1, 2, 3, 4};
        
        math.sum(vet);
        math.multiply(vet);
        math.divide(-10, 5);
    }
    
}
