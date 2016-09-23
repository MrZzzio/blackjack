package io.zzz.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by dmitry on 22.09.16.
 */
public class Deck {
    private int cardCount;

    private List<Card> cardSet;

    public Deck(){
        this.cardSet = this.createNewCardSet();
        this.cardCount = this.cardSet.size();
    }

    public int getCardCount() {
        return cardCount;
    }

    public void setCardCount(int cardCount) {
        this.cardCount = cardCount;
    }

    public List<Card> getCardSet() {
        return cardSet;
    }

    //TODO: make it java8 stream
    private List<Card> createNewCardSet(){
        List<Card> cards = new ArrayList<>();
        for (Card.Rating rating : Card.Rating.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                cards.add(new Card(rating, suit));
            }
        }

        return cards;
    }
}
