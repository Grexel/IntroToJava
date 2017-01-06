/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.problem24;

/**
 * Pick a card: simulate a deck of cards with
 * rank (ace,2,3,4,5,6,7,8,9,10,jack,queen,king)
 * and 
 * suit (clubs, diamonds, hearts, spades)
 * @author JeffreyMiller
 */
public class Problem24 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();
        Card firstCard = deck.takeCard();
        System.out.println("Your card is: " + firstCard);
    }
}
