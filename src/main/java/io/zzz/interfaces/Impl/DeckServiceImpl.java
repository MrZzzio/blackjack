package io.zzz.interfaces.Impl;

import io.zzz.interfaces.DeckService;
import io.zzz.model.Card;
import io.zzz.model.Deck;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by dmitry on 23.09.16.
 */
@Service
public class DeckServiceImpl implements DeckService {
    @Override
    public Card getCardFromDeck(Deck deck) {
        List<Card> cardSet = deck.getCardSet();
        Collections.shuffle(cardSet);
        Card card = cardSet.get(1);
        return card;
    }
}
