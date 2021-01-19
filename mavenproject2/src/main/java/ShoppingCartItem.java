/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroceryListApp;

/**
 *
 * @author Rycen
 */
public class ShoppingCartItem {
    private Product product;
    private int quantity;
    
    public ShoppingCartItem(Product prod, int quantity)
    {
        this.product = prod;
        this.quantity = quantity;
    }
    
    public double GetTotalPrice()
    {
        return GetProduct().GetPrice() * GetQuantity();
    }
    
    public Product GetProduct() {
        return product;
    }
    
    public void SetProduct(Product product) {
        this.product = product;
    }
    
    public int GetQuantity() {
        return quantity;
    }
    
    public void GetQuantity(int quantity) {
        this.quantity = quantity;
    }   
}
