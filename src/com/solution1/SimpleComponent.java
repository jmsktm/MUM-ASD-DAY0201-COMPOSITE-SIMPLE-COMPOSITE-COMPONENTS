/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solution1;

/**
 *
 * @author jsingh
 */
public class SimpleComponent extends Component {

    public SimpleComponent(double price, double discountPrice) {
        super(price, discountPrice);
    }

    @Override
    public double computePrice() {
        return this.getDiscountPrice();
    }
}
