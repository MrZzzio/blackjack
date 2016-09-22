package io.zzz.interfaces;

import io.zzz.model.Game;

import java.util.Date;

/**
 * Created by dmitry on 21.09.16.
 */

public interface GameService {
    Game getCurrentGame();

    void startGame(Game game);

    void closeGame(Game game);

    Game createGame(Date date);
}
