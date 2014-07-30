/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solution1;

import java.util.Vector;

/**
 *
 * @author jsingh
 */
public class ComplexComponent extends Component {

    private Vector<Component> componentList;

    public ComplexComponent(double price, double discountPrice) {
        super(price, discountPrice);
        componentList = new Vector<>();
    }

    public Vector<Component> getComponentList() {
        return componentList;
    }

    public void addComponent(Component component) {
        this.componentList.add(component);
    }

    @Override
    public double computePrice() {
        double total = this.getDiscountPrice();
        for (Component component : this.getComponentList()) {
            total += component.computePrice();
        }
        return total;
    }
}
