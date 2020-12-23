/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import java.util.ArrayList;
import java.util.TreeSet;
/**
 *
 * @author gabriel
 */
public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criar classe Animal
        // Criar 3 objetos do tipo Animal
        Animal animal1 = new Animal("Cabra", 80);
        Animal animal2 = new Animal("Cão", 25);
        Animal animal3 = new Animal("Peixe", 0.1);
        
        // Criar TreeSet de animais ordenada por peso
        TreeSet<Animal> treeset = new TreeSet<>();
        
        // Verificar se a TreeSet está vazia
        if (treeset.isEmpty()) {
            System.out.println("TreeSet Vazio");
        }else{
            System.out.println("Há item(ns) no TreeSet");
        }
        
        // Listar os itens da TreeSet
        treeset.forEach((a) -> {
            System.out.println("Nome: " + a.getNome());
        });
        
        // Adicione um animal na TreeSet
        treeset.add(animal1);
        
        // Verifique se a TreeSet está vazia
        if (treeset.isEmpty()) {
            System.out.println("TreeSet Vazio");
        }else{
            System.out.println("Há item(ns) no TreeSet");
        }
        
        // Exiba a quantidade itens presentes na TreeSet
        System.out.println("Total de itens: " + treeset.size());
        
        // Listar os itens da TreeSet
        System.out.println("");
        
        treeset.forEach((a) -> {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Peso: " + a.getPeso());
            System.out.println("");
        });
        
        // Criar uma ArrayList de animais
        ArrayList<Animal> listaAnimais = new ArrayList<>();   
        
        // Adicionar na ArrayList dois animais diferentes do contido na TreeSet
        listaAnimais.add(animal2);
        listaAnimais.add(animal3);
        
        // Verificar se os itens da ArrayList estão presentes na TreeSet
        if (treeset.containsAll(listaAnimais)) {
            System.out.println("listaAnimal está presente");
        } else {
            System.out.println("listaAnimal não está presente");
        }
        
        // Adicionar todos os itens da ArrayList na TreeSet
        treeset.addAll(listaAnimais);
        
        // Listar os itens da TreeSet
        System.out.println("");
        treeset.forEach((a) -> {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Peso: " + a.getPeso());
            System.out.println("");
        });
        
        // Verificar se os itens da ArrayList estão presentes na TreeSet
        if (treeset.containsAll(listaAnimais)) {
            System.out.println("listaAnimal está presente");
        } else {
            System.out.println("listaAnimal não está presente");
        }
        
        // Mostrar a quantidade itens presentes na TreeSet
        System.out.println("Total de itens: " + treeset.size());
        
        // Exiba a quantidade itens presentes na TreeSet
        treeset.remove(animal1);
        
        // Liste os itens da TreeSet
        System.out.println("");
        treeset.forEach((a) -> {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Peso: " + a.getPeso());
            System.out.println("");
        });
        
        // Remova da TreeSet todos os itens presentes na ArrayList
        treeset.removeAll(listaAnimais);
        
        // Limpe a TreeSet
        treeset.clear();
    }
}
