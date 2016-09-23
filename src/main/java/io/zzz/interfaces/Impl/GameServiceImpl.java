package io.zzz.interfaces.Impl;

import io.zzz.interfaces.GameService;
import io.zzz.model.Game;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by dmitry on 23.09.16.
 */
@Service
public class GameServiceImpl implements GameService {

    private Game currentGame;

    boolean isActive;

    @Override
    public Game getCurrentGame() {
        return this.currentGame;
    }

    @Override
    public void startGame(Game game) {
        this.currentGame = game;
        this.isActive = true;
    }

    @Override
    public void closeGame(Game game) {
        this.currentGame = null;
        this.isActive = false;
    }

    @Override
    public Game createGame(Date date) {
        Game game = new Game(new Date());
        return game;
    }
}
