/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];
        int[][] sum = new int[2][2];
        int i, j;
        
        for(i = 0; i < 2; i++){
            for(j = 0; j < 2;j++){
                System.out.println("Digite da linha " + (i + 1)+ " e coluna " + (j + 1) + " da matriz 1");
                mat1[i][j] = Integer.parseInt(scanner.nextLine());
                
                System.out.println("Digite da linha " + (i + 1)+ " e coluna " + (j + 1) + " da matriz 2");
                mat2[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        
        for(i = 0; i < 2; i++){
            for(j = 0; j < 2;j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
        System.out.println("Matriz 01");
        for(i = 0; i < 2; i++){
            for(j = 0; j < 2;j++){
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
         System.out.println("Matriz 02");
        for(i = 0; i < 2; i++){
            for(j = 0; j < 2;j++){
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Soma");
        for(i = 0; i < 2; i++){
            for(j = 0; j < 2;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
