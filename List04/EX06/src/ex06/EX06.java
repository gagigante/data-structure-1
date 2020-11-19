/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class EX06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        CustomerOrder customerOrder = new CustomerOrder();
            
        int i, aux;
        float valorTotal = 0;
        
        MenuItem item1 = new MenuItem();
    
        item1.name = "Arroz";
        item1.price = 4.50;
        menu.ListMenuItem.add(item1);
        
        MenuItem item2 = new MenuItem();
        
        item2.name = "Sorvete";
        item2.price = 13.50;
        menu.ListMenuItem.add(item2);
        
        MenuItem item3 = new MenuItem();
        
        item3.name = "Macarrão";
        item3.price = 3;
        menu.ListMenuItem.add(item3);
        
        MenuItem item4 = new MenuItem();
        
        item4.name = "Feijão";
        item4.price = 6.50;
        menu.ListMenuItem.add(item4);
        
        MenuItem item5 = new MenuItem();
        
        item5.name = "Frango";
        item5.price = 5;
        menu.ListMenuItem.add(item5);
        
        do{
            i = 0;
            System.out.println("Digite a opção que você quer");
            
            for(MenuItem item : menu.ListMenuItem){                
                System.out.println(i + " - " + item.name + " - R$ " + item.price);
                i++;
            }
            
            aux = Integer.parseInt(scanner.nextLine());
            
            if(aux <= 4 && aux >= 0){
                customerOrder.ListMenuItem.add(menu.ListMenuItem.get(aux));
                valorTotal += menu.ListMenuItem.get(aux).price;
            }else{
                System.out.println("Opção errada");
            }
            
            System.out.println("Deseja continuar? 0 para continuar e -1 para sair");
            
            aux = Integer.parseInt(scanner.nextLine());
        }while(aux != -1);       
        
        customerOrder.ListMenuItem.forEach((item) -> {                
            System.out.println(item.name + " - " + item.price);
        });
        
        System.out.println("");
        System.out.println("Valor Total R$ " + valorTotal);
    }
    
}
