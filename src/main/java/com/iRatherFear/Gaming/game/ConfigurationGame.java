package com.iRatherFear.Gaming.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.file.PathMatcher;

@Configuration
public class ConfigurationGame {
    @Bean
    @Qualifier("Pacman Game")
    public GamingConsole gamingConsole() {
        return new PacmanGame();
    }

    @Bean
    public GamingController gamingController(GamingConsole gamingConsole) {
        return new GamingController(gamingConsole);
    }
}
