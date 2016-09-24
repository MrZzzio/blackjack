package io.zzz.interfaces.Impl;

import io.zzz.interfaces.PlayerService;
import io.zzz.model.Card;
import io.zzz.model.Player;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dmitry on 24.09.16.
 */
@Service
public class PlayerServiceImpl implements PlayerService {
//    @Override
//    public void takeCard(Card card) {
//
//    }

    @Override
    public int getPoints(Player player) {
        List<Card> cardSet = player.getCardSet();
        int points = 0;
        for (Card card : cardSet) {
            points += card.ratingToInt(card.getRating());
        }
        return points;
    }
}
