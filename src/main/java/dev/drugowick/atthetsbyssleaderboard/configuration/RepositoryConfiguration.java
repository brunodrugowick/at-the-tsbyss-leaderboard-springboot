package dev.drugowick.atthetsbyssleaderboard.configuration;

import dev.drugowick.atthetsbyssleaderboard.handlers.ScoreEventHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {

    @Bean
    ScoreEventHandler scoreEventHandler() {
        return new ScoreEventHandler();
    }
}
