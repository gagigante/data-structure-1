/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author gabriel
 */
public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1;
        
        while(x <= 20) {
            if(x % 2 == 0) {
                System.out.println(x);
            }
            
            x++;
        }
    }
    
}
