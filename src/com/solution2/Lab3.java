package com.solution2;


public class Lab3 {

    static public void main(String args[]) {
        
        ComplexComponent cab = new ComplexComponent(6, 3);
        
        ComplexComponent board = new ComplexComponent(26, 6);

        SimpleComponent d1 = new SimpleComponent(10, 4);
        SimpleComponent d2 = new SimpleComponent(10, 4);
        SimpleComponent d3 = new SimpleComponent(10, 4);
        
        SimpleComponent bus = new SimpleComponent(5, 1);

        SimpleComponent card1 = new SimpleComponent(10, 1);
        SimpleComponent card2 = new SimpleComponent(10, 1);
        SimpleComponent card3 = new SimpleComponent(10, 1);

        cab.addComponent(board);
        cab.addComponent(d1);
        cab.addComponent(d2);
        cab.addComponent(d3);
        
        board.addComponent(bus);
        
        board.addComponent(card1);
        board.addComponent(card2);
        board.addComponent(card3);

        System.out.println("Total discounted price of computer is: " + cab.computePrice());
    }
}
