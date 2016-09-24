package io.zzz.interfaces;

import io.zzz.model.Card;
import io.zzz.model.Player;

/**
 * Created by dmitry on 22.09.16.
 */
public interface PlayerService {
//    void takeCard(Card card);

    int getPoints(Player player);
}
