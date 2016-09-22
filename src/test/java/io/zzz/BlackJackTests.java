package io.zzz;

import io.zzz.model.Game;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by dmitry on 21.09.16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class BlackJackTests {

    @Test
    public void testShouldStartGame(){
        Game oldGame = gameControll.getCurrentGame();
        if (oldGame != null){
            oldGame.closeGame();
        }
        Game oldClosedGame = gameControll.getCurrentGame();
        Assert.assertNull(oldClosedGame);

        Game game = gameControll.createGame(new Date());
        game.startGame();

        Game startedGame = gameControll.getCurrentGame();
        Assert.assertNotNull(startedGame);
    }

    @Test
    public void testShouldTakeCardAndSumPoints(){
        Player player = new Player("Player Name");
        Deck deck = new Deck();
        Card card = deck.getCard();
        Assert.assertNotNull(card);

        player.takeCard(card);
        int points = player.getPoints();
        Assert.assertTrue(points > 0);
    }


}
