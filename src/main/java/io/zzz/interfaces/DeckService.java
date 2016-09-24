package io.zzz.interfaces;

import io.zzz.model.Card;
import io.zzz.model.Deck;

/**
 * Created by dmitry on 22.09.16.
 */
public interface DeckService {
    Card getCardFromDeck(Deck deck);

}
