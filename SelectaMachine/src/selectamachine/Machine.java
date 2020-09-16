/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectamachine;

import java.util.HashMap;

/**
 *
 * @author senth
 */
public class Machine {
    int numberInput;
    HashMap<String,Integer> drinks = new HashMap<String,Integer>();
    
    public void addItemsToMachine(){
        drinks.put("Cola", 1);
        drinks.put("Ice Tea",2);
        drinks.put("Fanta",3);
        drinks.put("Sprite",4);
    }
    
    public Machine(){
        
    }
    
    
    
    public void giveChange(){
        
    }
}
