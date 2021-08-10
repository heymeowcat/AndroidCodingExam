/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author heymeowcat
 */
public class Products {
    
    int productid;
    String productname;
    String productImgUrl;

    public Products(int productid, String productname, String productImgUrl) {
        this.productid = productid;
        this.productname = productname;
        this.productImgUrl = productImgUrl;
    }

    public Products() {
    }

    
    
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductImgUrl() {
        return productImgUrl;
    }

    public void setProductImgUrl(String productImgUrl) {
        this.productImgUrl = productImgUrl;
    }
    
    
    
    
}
