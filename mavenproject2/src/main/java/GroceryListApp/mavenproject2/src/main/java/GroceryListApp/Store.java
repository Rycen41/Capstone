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
        products.add(new Product(14, "Arnold Palmer", "Tea & Lemonade Mix", 3.99));
        products.add(new Product(15, "Flour Tortillas", "Burrito Skin", 5.69));
        products.add(new Product(16, "Bacon", "Pig Meat", 3.50));
        products.add(new Product(17, "Kettle Cooked Chips", "Baked Chips", 2.99));
        products.add(new Product(18, "Chicken", "Meat", 9.50));
        products.add(new Product(19, "Shredded Mozzarella", "Cut Cheese", 4.29));
        products.add(new Product(20, "Gold Fish", "Cheezy Crackers", 4.99));
        products.add(new Product(21, "Doritos", "Cheezy Chips", 4.29));
        products.add(new Product(22, "Mt.Dew", "Green Soda", 5.69));
        products.add(new Product(23, "Jasmine Rice", "Rice", 7.99));
        products.add(new Product(24, "Fries", "Cut Potatos", 6.79));
        products.add(new Product(25, "Vanilla", "Vanilla Extract", 4.99));
        products.add(new Product(26, "Cream Cheese", "Begal Dressing", 2.49));
        products.add(new Product(27, "Ranch Dressing", "Pizza Sauce", 3.29));
        products.add(new Product(28, "Raspberries", "Fruit", 2.99));
        products.add(new Product(29, "Dill Pickle", "Salted Cucumber", 2.99));
        products.add(new Product(30, "Mustard", "Yellow Sandwich Dressing", 0.79));
        products.add(new Product(31, "Toilet Paper", "White Cloth", 18.99));
        products.add(new Product(31, "Shredded Cheese", "Mild Cheddar", 3.99));
        products.add(new Product(33, "Cereal", "Breakfast Food", 3.99));
        products.add(new Product(34, "Bagels", "Dry Dougnut", 2.99));
        products.add(new Product(35, "Hamburger", "Cow Meat", 4.99));
        products.add(new Product(36, "Butter Stick", "Butter", 0.89));
        products.add(new Product(37, "Cheese Stick", "Peel Cheese", 5.29));
        products.add(new Product(38, "Half & Half", "Dairy Product", 1.99));
        products.add(new Product(39, "Carrots Snack Pack", "Carrots", 1.59));
        products.add(new Product(40, "Pepsi", "Soda", 5.29));
        products.add(new Product(41, "English Muffins", "Muffin", 2.49));
        products.add(new Product(42, "Frozen Chicken", "Chicken Frozen", 8.99));
        products.add(new Product(43, "Oatmeal", "Oats in a Bag", 2.79));
        products.add(new Product(44, "Shredded Lettuce", "Lettuce", 1.59));
        products.add(new Product(45, "Turkey", "Sandwich Meat", 3.99));
        products.add(new Product(46, "Ham", "Sandwich Meat", 3.99));
        products.add(new Product(47, "Nutella", "Fake Chocolate", 3.99));
        products.add(new Product(48, "Noodles", "Pasta", 1.34));
        products.add(new Product(49, "Cottage Cheese", "Cheese", 2.79));
        products.add(new Product(50, "Sprite", "Soda", 5.69));
        products.add(new Product(51, "Monster", "Energy Drink", 1.79));
        products.add(new Product(52, "Orange Crush", "Soda", 5.29));
    }
    
    
    
    public ArrayList<Product> getProducts() {
        return products;
    }
}

