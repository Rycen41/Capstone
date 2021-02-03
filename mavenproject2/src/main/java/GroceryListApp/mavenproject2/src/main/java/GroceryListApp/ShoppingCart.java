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
public class ShoppingCart {
    private ArrayList<ShoppingCartItem> items;
    
    public ShoppingCart()
    {
        items = new ArrayList<>();
    }
    
    public double GetTotalPrice() {
        
        double total = 0;
        for (ShoppingCartItem item: items)
        {
            total += item.GetTotalPrice();
        }
        return total;
    }
    
    public boolean ItemExists(Product prod) {
        
        for(ShoppingCartItem item: items)
        {
            if (prod.getId() == item.GetProduct().getId())
            {
                return true;
            }
        }
        return false;
    }
    
    public ShoppingCartItem GetExistingItem(Product prod) {
        
        for(ShoppingCartItem item: items)
        {
            if(prod.getId() == item.GetProduct().getId())
                return item;
        }
        return null;
    }
    
    public void addItem(Product prod, int quantity)
    {
        if (ItemExists(prod))
        {
            ShoppingCartItem item = GetExistingItem(prod);
            item.SetQuantity(item.GetQuantity() + quantity);
        }
        else {
            items.add(new ShoppingCartItem(prod, quantity));
        }
    }
    
    public void removeItem(Product prod, int quantity)
    {
        if (ItemExists(prod))
        {
            ShoppingCartItem item = GetExistingItem(prod);
            if(item.GetQuantity() > quantity)
                item.SetQuantity(item.GetQuantity()- quantity);
            else
                items.remove(item);
        }
    }
    
}
