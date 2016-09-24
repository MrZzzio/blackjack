package io.zzz;

import io.zzz.interfaces.DeckService;
import io.zzz.interfaces.GameService;
import io.zzz.interfaces.PlayerService;
import io.zzz.model.Card;
import io.zzz.model.Deck;
import io.zzz.model.Game;
import io.zzz.model.Player;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by dmitry on 21.09.16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class BlackJackTests {

    @Autowired
    GameService gameService;

    @Autowired
    DeckService deckService;

    @Autowired
    PlayerService playerService;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testShouldStartGame(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Game oldGame = this.gameService.getCurrentGame();
        if (oldGame != null){
            this.gameService.closeGame(oldGame);
        }
        Game oldClosedGame = this.gameService.getCurrentGame();
        Assert.assertNull(oldClosedGame);

        Game game = this.gameService.createGame(new Date());
        this.gameService.startGame(game);

        Game startedGame = this.gameService.getCurrentGame();
        Assert.assertNotNull(startedGame);
    }

    @Test
    public void testShouldTakeCardAndSumPoints(){

        Deck deck = new Deck();
        Card card = this.deckService.getCardFromDeck(deck);
        Assert.assertNotNull(card);

        Player player = new Player("Player Name");
        player.setCardSet(card);
        int points = this.playerService.getPoints(player);
        Assert.assertTrue(points > 0);
    }

    @Test
    public void testShouldCreateNewDeckAndCheckCardCount(){
        Deck deck = new Deck();
        Assert.assertTrue(deck.getCardCount() == 52);

        Card card = this.deckService.getCardFromDeck(deck);
        Assert.assertTrue(deck.getCardCount() == 51);
    }


}
