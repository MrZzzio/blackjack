package io.zzz;

import io.zzz.config.Config;
import io.zzz.interfaces.GameService;
import io.zzz.interfaces.Impl.GameServiceImpl;
import io.zzz.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by dmitry on 24.09.16.
 */
@SpringBootApplication
@Import(Config.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        GameService gameService = new GameServiceImpl();
        Game game = gameService.createGame(new Date());
        gameService.startGame(game);

    }
}
