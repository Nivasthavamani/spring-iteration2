package com.uniqTechnologies.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uniqTechnologies.learnspringframework.game.GameRunner;
import com.uniqTechnologies.learnspringframework.game.MarioGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		// SuperContraGame game = new SuperContraGame();
		// PacManGame game = new PacManGame();

		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);

		runner.runGame();
	}

}
