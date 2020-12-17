/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> studentList = new ArrayList<>(); 
        // Utilizei ArrayList por suprir todas as necessidades do programa
        
        int option;
        
        do{
            System.out.println("1 - Adicionar aluno na lista");
            System.out.println("2 - Exibir lista de alunos");
            System.out.println("3 - Buscar aluno na lista pelo nome");
            System.out.println("4 - Ordenar lista pela média final");
            System.out.println("5 - Inverter lista");
            System.out.println("6 - SAIR");
            
            option = Integer.parseInt(scanner.nextLine());
            
            switch(option){
                case 1:
                    Aluno aluno = new Aluno();
                    
                    System.out.println("Digite o nome: ");    
                    aluno.Nome = scanner.nextLine();
                    
                    System.out.println("Digite o prontuário: ");
                    aluno.Prontuario = Integer.parseInt(scanner.nextLine());
                    
                    System.out.println("Digite a média final: ");
                    aluno.MediaFinal = Double.parseDouble(scanner.nextLine());
                    
                    studentList.add(aluno);
                    break;
                case 2:
                    System.out.println("");
                    
                    studentList.forEach((a) -> {
                        System.out.println("Nome: " + a.Nome + ", Prontuario: " 
                            + a.Prontuario + ", Média Final: " + a.MediaFinal);
                    });
                    
                    System.out.println("");
                    break;
                case 3:
                    String busca;
                    
                    System.out.println("Digite o nome para a busca");    
                    busca = scanner.nextLine();
                    
                    System.out.println("");
                    
                    studentList.forEach((a) -> {
                        if(a.Nome.contains(busca)){
                            System.out.println("Nome: " + a.Nome + ", Prontuario: " 
                                + a.Prontuario + ", Média Final: " + a.MediaFinal);
                        }
                    });
                    
                    System.out.println("");
                    break;
                case 4:
                    Collections.sort(studentList, new Comparator() {
                        public int compare(Object o1, Object o2) {
                            String n1 = ((Aluno) o1).Nome;
                            String n2 = ((Aluno) o2).Nome;
                           
                            int nomeComp = n1.compareTo(n2);

                            if (nomeComp != 0) {
                               return nomeComp;
                            } 

                            double m1 = ((Aluno) o1).MediaFinal;
                            double m2 = ((Aluno) o2).MediaFinal;

                            if (m1 < m2) {
                                return -1;
                            }
                            
                            if (m1 > m2) {
                                return 1;
                            }
                            
                            return 0;                           
                        }
                    });
                    break;
                case 5:
                    Collections.reverse(studentList);
                    break;
                default:
                    System.out.println("Digite apenas números pertencentes ao menu");
                    break;
            }
        }while(option != 6);
    }
}
