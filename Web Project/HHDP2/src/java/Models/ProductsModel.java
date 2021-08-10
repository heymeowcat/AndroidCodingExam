/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.Products;
import java.util.ArrayList;

/**
 *
 * @author heymeowcat
 */
public class ProductsModel {
    
       ArrayList<Products> products = new ArrayList<>();
    
   public ArrayList<Products> getProducts (){
       
       products.add(new Products(0, "banana", "https://5.imimg.com/data5/EL/NU/MY-71836142/banana-fruit-500x500.jpg"));
       products.add(new Products(1, "mango", "https://5.imimg.com/data5/BD/EK/HP/SELLER-7051866/mango-fruit-500x500.jpg"));
       products.add(new Products(2, "apple", "https://sc04.alicdn.com/kf/UTB8ou8hOyDEXKJk43Oqq6Az3XXaz.jpg"));
      
       return products;
   } 
   
    
    
    
}
