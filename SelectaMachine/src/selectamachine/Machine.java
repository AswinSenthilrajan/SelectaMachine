/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectamachine;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author senth
 */
public class Machine {
    double price = 0.0;
    int numberInput;
    String drink;
    double payment = 0.0;
    double change = 0.0;
    HashMap<String,Integer> drinks = new HashMap<String,Integer>();
    
    public void addItemsToMachine(){
        drinks.put("Coke", 1);
        drinks.put("Ice Tea",2);
        drinks.put("Fanta",3);
        drinks.put("Sprite",4);
    }
    
    public Machine(){
        
    }
    
    public void takeOrder(){
         numberInput = Integer.parseInt(JOptionPane.showInputDialog("Type the number."));
        
        if(numberInput == 1){
            System.out.println("You've chosen Coke");
            price =price + 2.70;
        }else if(numberInput == 2){
            price = price + 1.40;
        }else if(numberInput == 3){
            price = price + 1.30;
        }else if(numberInput == 4){
            price = price + 1.20;
        }
        int n = JOptionPane.showConfirmDialog(null,"Do you want to add something ?", "Window", JOptionPane.YES_NO_OPTION);
        
        if(n == JOptionPane.YES_OPTION){
            takeOrder();
        }else if(n == JOptionPane.NO_OPTION){
            payment = Double.parseDouble(JOptionPane.showInputDialog("Please insert your Coins"));
            giveChange(payment);
        }
        
    }
    
    
    public void giveChange(double payment){
        this.payment = payment;
        change = payment - price;
        if(change < 0){
            System.out.println("Thats not enough Money");
        }else{
            
        }
    }
}
