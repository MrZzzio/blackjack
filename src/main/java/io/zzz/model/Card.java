package io.zzz.model;

/**
 * Created by dmitry on 22.09.16.
 */
public class Card {

    final private Rating rating;

    final private Suit suit;

    private int intRating;

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

    public int ratingToInt(Rating rating) {
        int r = 0;
        switch (rating) {
            case TWO: r = 2;
                break;
            case THREE: r = 3;
                break;
            case FOUR: r = 4;
                break;
            case FIVE: r = 5;
                break;
            case SIX: r = 6;
                break;
            case SEVEN: r = 7;
                break;
            case EIGHT: r = 8;
                break;
            case NINE: r = 9;
                break;
            case TEN: r = 10;
                break;
            case KNAVE: r = 10;
                break;
            case QUEEN: r = 10;
                break;
            case KING: r = 10;
                break;
            case ACE: r = 11;
                break;
        }

        return r;
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
