/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.User;

/**
 *
 * @author heymeowcat
 */
public class UserModel {
    
     public User userLogin(String username, String password){
         if(username.equals("admin") && password.equals("123")){
             return new User(username,password);
         }
         
         return null;
     }  
    
}
