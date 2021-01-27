/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroceryListApp;

import java.util.ArrayList;

/**
 *
 * @author Rycen
 */
public class GroceryListApp {
    
    
    
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Store store = new Store();
        
        displayStoreMenu(store.getProducts());
    }
    
    public static void displayStoreMenu(ArrayList<Product> products)
    {
        System.out.println("Items");
        System.out.println("----------");
        for(Product prod: products)
        {
            System.out.println(prod.getId() + ": " + prod.getName() + " - $" +  prod.getPrice());
        }
    }
}
