/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.problem24;

import java.util.*;

/**
 *
 * @author JeffreyMiller
 */
public class Deck {
    List<Card> cards;

    public Deck() {
        cards = newDeck();
    }
    
    public List<Card> newDeck(){
        ArrayList<Card> newCards = new ArrayList<>();
        for(int i = 0; i < 4; i++){ //for each suit
            for(int j = 1; j <= 13; j++) //for each rank
            {
                newCards.add(new Card(j,i));
            }
        }
        return newCards;
    }
    public void shuffleDeck(){
        Collections.shuffle(cards);
    }
    public Card takeCard(){
        if(cards.size() > 0)
            return cards.remove(0);
        else
            return null;
    }
}
