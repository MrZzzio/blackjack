package io.zzz.model;

/**
 * Created by dmitry on 22.09.16.
 */
public class Card {

    final private Rating rating;

    final private Suit suit;

    public Card(Rating rating, Suit suit){
        this.rating = rating;
        this.suit = suit;
    }

    public Rating getRating() {
        return this.rating;
    }

    public Suit getSuit() {
        return this.suit;
    }

    enum Rating {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        KNAVE,
        QUEEN,
        KING,
        ACE
    }

    enum Suit {
        WORMS,      //червы
        CLUBS,      //трефы
        SPADES,     //пики
        DIAMONDS    //бубны
    }
}
