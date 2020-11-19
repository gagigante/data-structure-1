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
public class Person {
    private String cpf;
    private String name;
    private String dateOfBirth;
    public static int totalOfPleople = 0;
    
    public Person() {
        totalOfPleople++;
    }
      
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setDateOfBirth(String dataOfBirth) {
        this.dateOfBirth = dataOfBirth;
    }
    
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void showPerson(){
        System.out.println("Nome da Pessoa: " + getName());   
        System.out.println("Data de Nascimentoda Pessoa: " + getDateOfBirth());   
        System.out.println("CPF da Pessoa: " + getCpf());   
    }
}
