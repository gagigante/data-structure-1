/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;

/**
 *
 * @author gabriel
 */
public class EX05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 8;
        
        do{
            if(x % 2 != 0) {
                System.out.println(x);
            }
            
            x++;
        } while(x <= 19);
    }
    
}
