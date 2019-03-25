/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mnm_crm;

import java.util.List;

/**
 *
 * @author meghnasawhney
 */
public class Hostess {
     private Customer cust1;
    private Customer cust2;
    
    public Hostess(){
        cust1=new Customer("Harley", "John", "safeway@gmail.com", "4087384638", "1101 wolfe road cupertino,ca 94087");
        cust2=new Customer("Jones", "Quinn", "luckys@gmail.com", "5109865392", "136 B street hayward,ca 94542");
        
    }
    
    public List<String> viewFrequentlyOrdered(Customer c){
       return c.getFreqOrderedList();
    }
    
}
