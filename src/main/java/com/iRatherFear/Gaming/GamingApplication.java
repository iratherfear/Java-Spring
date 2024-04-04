package com.iRatherFear.Gaming;

import com.iRatherFear.Gaming.game.GamingController;
import com.iRatherFear.Gaming.game.MarioGame;
import com.iRatherFear.Gaming.game.PacmanGame;
import com.iRatherFear.Gaming.game.SuperControGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamingApplication {

	public static void main(String[] args) {
//		SpringApplication.run(GamingApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperControGame game = new SuperControGame();
		PacmanGame game = new PacmanGame();
		GamingController controller = new GamingController(game);
		controller.run();
	}

}
