/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.problem24;

/**
 *
 * @author JeffreyMiller
 */
public class Card {
    public static final int CLUB = 0;
    public static final int DIAMOND = 1;
    public static final int HEART = 2;
    public static final int SPADE = 3;
    private int rank;
    private int suit;

    public Card() {
        rank = 1;
        suit = HEART;
    }
    
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        String rankString;
        String suitString;
        switch(getRank()){
            case 1: rankString = "Ace"; break; 
            case 2: rankString = "2"; break; 
            case 3: rankString = "3"; break; 
            case 4: rankString = "4"; break; 
            case 5: rankString = "5"; break; 
            case 6: rankString = "6"; break; 
            case 7: rankString = "7"; break; 
            case 8: rankString = "8"; break; 
            case 9: rankString = "9"; break; 
            case 10: rankString = "10"; break; 
            case 11: rankString = "Jack"; break; 
            case 12: rankString = "Queen"; break; 
            case 13: rankString = "King"; break; 
            default: rankString = "ERROR";
        }
        switch(getSuit()){
            
            case 0: suitString = "Clubs"; break; 
            case 1: suitString = "Diamonds"; break; 
            case 2: suitString = "Hearts"; break; 
            case 3: suitString = "Spades"; break;
            default: suitString = "ERROR";
        }
        return rankString + " of " + suitString;
    }

    
}
