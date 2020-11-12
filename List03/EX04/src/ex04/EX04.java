/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] mat = new int[4][2];
        int i, j;
        
        for(i = 0; i < 4; i++){
            for(j = 0; j < 2;j++){
                System.out.println("Digite da linha " + (i + 1)+ " e coluna " + (j + 1) + " da matriz");
                mat[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
       
        System.out.println("Matriz transposta: ");
        for(i = 0; i < 2; i++){
            for(j = 0; j < 4;j++){
                System.out.print(" " + mat[j][i] + " ");
            }
            
            System.out.println("");
        }
    }
    
}
