/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solution2;

/**
 *
 * @author jsingh
 */
public abstract class Component implements ComponentInterface {
    
    private double price;
    private double discountPrice;
    
    public Component(double price, double discountPrice) {
        this.price = price;
        this.discountPrice = discountPrice;
    }

    @Override
    public abstract double computePrice();    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}
