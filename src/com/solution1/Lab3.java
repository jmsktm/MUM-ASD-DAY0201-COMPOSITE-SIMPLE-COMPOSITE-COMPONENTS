package com.solution1;


public class Lab3 {

    static public void main(String args[]) {
        
        Cabinet cab = new Cabinet(6, 3);
        
        Board board = new Board(26, 6);

        Drive d1 = new Drive(10, 4);
        Drive d2 = new Drive(10, 4);
        Drive d3 = new Drive(10, 4);
        
        Bus bus = new Bus(5, 1);

        Card card1 = new Card(10, 1);
        Card card2 = new Card(10, 1);
        Card card3 = new Card(10, 1);

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
