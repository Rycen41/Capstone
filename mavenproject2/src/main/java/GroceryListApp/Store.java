/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroceryListApp;

import Product;
import java.util.ArrayList;
/**
 *
 * @author Rycen
 */
public class Store {
    private ArrayList<Product> products;
    
    public Store(ArrayList<Product> products)
    {
        
    }
    
    public Store()
    {
        products = new ArrayList<Product>();
        products.add(new Product(1, "Milk", "It is 2%", 2.45));
        products.add(new Product(2, "Orange Juice", "Juice made from Oranges", 3.05));
        products.add(new Product(3, "Tooth Paste", "Paste to clean teeth", 3.65));
        products.add(new Product(4, "Butter", "Blocked Milk", 1.78));
        products.add(new Product(5, "Bread", "It is 2%", 1.99));
        products.add(new Product(6, "Deodorant", "Makes you not smell bad", 3.99));
        products.add(new Product(7, "Candy", "Small Candy Bars", .79));
        products.add(new Product(8, "Gum", "Chewy Breath Mints", 1.75));
        products.add(new Product(9, "Eggs", "Pre-born Chicks", 1.34));
        products.add(new Product(10, "Cheese", "Milk that is old", 2.33));
        products.add(new Product(11, "Soup", "Hot Noodles", 2.66));
        products.add(new Product(12, "Pudding", "Chocolate Goo", 2.45));
        products.add(new Product(13, "Yogurt", "Flavored cold Pudding", 1.95));
        products.add(new Product(14, "Milk", "It is 2%", 2.45));
        products.add(new Product(15, "Milk", "It is 2%", 2.45));
        products.add(new Product(16, "Milk", "It is 2%", 2.45));
        products.add(new Product(17, "Milk", "It is 2%", 2.45));
        products.add(new Product(18, "Milk", "It is 2%", 2.45));
        products.add(new Product(19, "Milk", "It is 2%", 2.45));
        products.add(new Product(20, "Milk", "It is 2%", 2.45));
        products.add(new Product(21, "Milk", "It is 2%", 2.45));
        products.add(new Product(22, "Milk", "It is 2%", 2.45));
        products.add(new Product(23, "Milk", "It is 2%", 2.45));
        products.add(new Product(24, "Milk", "It is 2%", 2.45));
        products.add(new Product(25, "Milk", "It is 2%", 2.45));
        products.add(new Product(26, "Milk", "It is 2%", 2.45));
        products.add(new Product(27, "Milk", "It is 2%", 2.45));
        products.add(new Product(28, "Milk", "It is 2%", 2.45));
        products.add(new Product(29, "Milk", "It is 2%", 2.45));
        products.add(new Product(30, "Milk", "It is 2%", 2.45));
        products.add(new Product(31, "Milk", "It is 2%", 2.45));
        products.add(new Product(31, "Milk", "It is 2%", 2.45));
        products.add(new Product(33, "Milk", "It is 2%", 2.45));
        products.add(new Product(34, "Milk", "It is 2%", 2.45));
        products.add(new Product(35, "Milk", "It is 2%", 2.45));
        
        
    }
    
    
    
    public ArrayList<Product> getProducts() {
        return products;
    }
}

