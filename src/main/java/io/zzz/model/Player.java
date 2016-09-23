package io.zzz.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 22.09.16.
 */
public class Player {
    private String name;

    private List<Card> cardSet = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCardSet() {
        return cardSet;
    }

    public void setCardSet(Card card) {
        this.cardSet.add(card);
    }
}
