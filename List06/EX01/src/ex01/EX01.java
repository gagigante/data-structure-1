/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author gabriel
 */
public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Container container01 = new Container();
        container01.nome = "Pena";
        container01.peso = 27.5;
        
        Container Container02 = new Container();
        Container02.nome = "Leve";
        Container02.peso = 32.3;
        
        Container Container03 = new Container();
        Container03.nome = "Médio";
        Container03.peso = 41.2;
        
        Container Container04 = new Container();
        Container04.nome = "Pesado";
        Container04.peso = 55;
        
        Queue<Container> porto = new LinkedList<>();
        
        porto.offer(container01);
        
        porto.forEach((q) -> {
            System.out.print(q.nome);
        });
        
        System.out.println("");
        
        porto.offer(Container02);
        
        porto.forEach((q) -> {
            System.out.print(q.nome + " ");
        });
        System.out.println("");
        
        porto.offer(Container03);
        
        porto.forEach((q) -> {
            System.out.print(q.nome + " ");
        });
        System.out.println("");
        
        porto.offer(Container04);
        
        porto.forEach((q) -> {
            System.out.print(q.nome + " ");
        });        
        System.out.println("");

        Stack<Container> navioCargueiro = new Stack<>();
        
        porto.forEach((q) -> {
            navioCargueiro.push(q);
        });
        
        porto.clear();
        
        navioCargueiro.forEach((q) -> {
            System.out.println(q.nome);
        });   
    }
    
}
