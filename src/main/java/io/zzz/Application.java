package io.zzz;

import io.zzz.config.Config;
import io.zzz.interfaces.DeckService;
import io.zzz.interfaces.GameService;
import io.zzz.interfaces.Impl.DeckServiceImpl;
import io.zzz.interfaces.Impl.GameServiceImpl;
import io.zzz.interfaces.Impl.PlayerServiceImpl;
import io.zzz.interfaces.PlayerService;
import io.zzz.model.Card;
import io.zzz.model.Deck;
import io.zzz.model.Game;
import io.zzz.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by dmitry on 24.09.16.
 */
@SpringBootApplication
@Import(Config.class)
public class Application {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String playerName = reader.readLine();
        Player player = new Player(playerName);
        System.out.println("Welcome to game " + player.getName() + "! To start game enter \"Begin\"");
        if (reader.readLine().equals("Begin")) {
            GameService gameService = new GameServiceImpl();
            Game game = gameService.createGame(new Date());
            gameService.startGame(game);
            Deck deck = new Deck();
            DeckService deckService = new DeckServiceImpl();
            PlayerService playerService = new PlayerServiceImpl();
            Card card1 = deckService.getCardFromDeck(deck);
            System.out.println("Your first card is " + card1.getRating() + " " + card1.getSuit());
            player.setCardSet(card1);
            Card card2 = deckService.getCardFromDeck(deck);
            System.out.println("Your second card is " + card2.getRating() + " " + card2.getSuit());
            player.setCardSet(card2);
            String answer;
            do {
                System.out.println("Points sum is " + playerService.getPoints(player));
                System.out.println("Else?");
                answer = reader.readLine();
                if (answer.equals("Yes")) {
                    Card nextCard = deckService.getCardFromDeck(deck);
                    System.out.println("Your next card is " + nextCard.getRating() + " " + nextCard.getSuit());
                    player.setCardSet(nextCard);
                } else {
                    System.out.println("Game over!");
                }
                if (playerService.getPoints(player) == 21) {
                    System.out.println("Points sum is " + playerService.getPoints(player));
                    System.out.println("Congratulations! You win!!!");
                    break;
                } else if (playerService.getPoints(player) > 21) {
                    System.out.println("Points sum is " + playerService.getPoints(player));
                    System.out.println("Sorry, you lose");
                    break;
                }
            }while (answer.equals("Yes"));

            gameService.closeGame(game);

        } else {
            System.out.println("Good by!");
        }
    }
}
