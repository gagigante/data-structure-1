/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04;

import java.util.Scanner;
import ex04.Person;

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
        Person person = new Person();
        
        System.out.print("Nome da Pessoa: ");   
        person.setName(scanner.nextLine());
        
        System.out.print("Data de Nascimento da Pessoa: ");   
        person.setDateOfBirth(scanner.nextLine());
        
        System.out.print("CPF da Pessoa: ");   
        person.setCpf(scanner.nextLine());
        
        System.out.println("---------Pessoa-----------");
        person.showPerson();
    }
    
}
