/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        
        int currentYear = calendar.get(Calendar.YEAR);
        int bornYear, diferenceInYears, diferenceInMonths, diferenceInDays, diferenteInMinutes, diferenceInSecs;
        
        System.out.println(currentYear);
        
        System.out.println("Informa o ano em que você nasceu: ");
        bornYear = Integer.parseInt(scanner.nextLine());
        
        diferenceInYears = currentYear - bornYear;
        diferenceInMonths = diferenceInYears * 12;
        diferenceInDays = diferenceInYears * 365;
        diferenteInMinutes = diferenceInDays * 24 * 60;
        diferenceInSecs = diferenteInMinutes * 60;
        
        System.out.println("Tempo de vida :::");
        System.out.println("Em anos: " + diferenceInYears);
        System.out.println("Em meses: " + diferenceInMonths);
        System.out.println("Em dias: " + diferenceInDays);
        System.out.println("Em minutos: " + diferenteInMinutes);
        System.out.println("Em segundos: " + diferenceInSecs);
    }
    
}
