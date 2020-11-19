/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import java.util.Scanner;
import ex01.Vehicle;

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
        
        System.out.println("---------Veículo 1-----------");
        Vehicle v1 = new Vehicle();
        
        System.out.print("Ano do Veículo: ");   
        v1.setYear(Integer.parseInt(scanner.nextLine()));
        
        System.out.print("Cor do Veículo: ");   
        v1.setColor(scanner.nextLine());
        
        System.out.print("Fabricante do Veículo: ");   
        v1.setManufacturer(scanner.nextLine());
        
        System.out.print("Modelo do Veículo: ");   
        v1.setModel(scanner.nextLine());
        
        System.out.print("Nº Marchas do Veículo: ");   
        v1.setNumberOfGears(Integer.parseInt(scanner.nextLine()));
        
        System.out.print("Nº Portas do Veículo: ");   
        v1.setNumberOfDoors(Integer.parseInt(scanner.nextLine()));
        
        System.out.print("Nº Rodas do Veículo: ");   
        v1.setNumberOfWheels(Integer.parseInt(scanner.nextLine()));
        
        System.out.println("---------Veículo 2-----------");
        Vehicle v2 = new Vehicle();
        
        System.out.print("Ano do Veículo: ");   
        v2.setYear(Integer.parseInt(scanner.nextLine()));
        
        System.out.print("Cor do Veículo: ");   
        v2.setColor(scanner.nextLine());
        
        System.out.print("Fabricante do Veículo: ");
        v2.setManufacturer(scanner.nextLine());
        
        System.out.print("Modelo do Veículo: ");   
        v2.setModel(scanner.nextLine());
        
        System.out.print("Nº Marchas do Veículo: ");   
        v2.setNumberOfGears(Integer.parseInt(scanner.nextLine()));
        
        System.out.print("Nº Portas do Veículo: ");   
        v2.setNumberOfDoors(Integer.parseInt(scanner.nextLine()));
        
        System.out.print("Nº Rodas do Veículo: ");   
        v2.setNumberOfWheels(Integer.parseInt(scanner.nextLine()));
        
        System.out.println("---------Veículo 1-----------");
        v1.showVehicle();
        
        System.out.println("---------Veículo 2-----------");
        v2.showVehicle();
    }
    
}
