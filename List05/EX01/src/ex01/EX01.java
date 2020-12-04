/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import ex01.javaTeste.Diretor;

/**
 *
 * @author gabriel
 */
public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", 19);
        Professor professor = new Professor("José", 30);
        TecnicoAdministrativo tecnicoAdiministrativo = new TecnicoAdministrativo("Joãp", 30);
        Diretor diretor = new Diretor("Anderson", 50);
        
        aluno.quemSou();
        professor.quemSou();
        tecnicoAdiministrativo.quemSou();
        diretor.quemSou();
    }
}
