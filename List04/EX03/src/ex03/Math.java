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
public class Math {
    public void sum(int[] numbers){
        int i, sum = 0;
        
        for(i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        
        System.out.println("A soma é: " + sum);
    }
    
    public void subtract(int n1, int n2){
        System.out.println("A subtração é: " + (n1 - n2));
    }
    
    public void multiply(int[] numbers){
        int i, multiply = 1;
        
        for(i = 0; i < numbers.length; i++){
            multiply *= numbers[i];
        }
        
        System.out.println("A multiplicação é: " + multiply);
    }
    
    public void divide(int n1, int n2){
        System.out.println("A divisão é: " + (n1 / n2));
         
        if((n1 / n2) < 0){
            System.out.println("O módulo dessa divisão é: " + ((n1 / n2) * -1));
        }else{
            System.out.println("O módulo dessa divisão é: " + (n1 / n2));
        }
    }
}
