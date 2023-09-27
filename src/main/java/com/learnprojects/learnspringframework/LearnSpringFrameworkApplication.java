package com.learnprojects.learnspringframework;

import com.learnprojects.learnspringframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		GamingConsole game = new MarioGame();
//		GameRunner runner = new GameRunner(game);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
