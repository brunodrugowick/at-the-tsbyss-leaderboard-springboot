package dev.drugowick.atthetsbyssleaderboard.handlers;

import dev.drugowick.atthetsbyssleaderboard.model.Score;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

/**
 * Not being used, but some logic may be inserted to handle the Domain object before saving, creating etc.
 *
 * For createdDate and updatedDate I used javax.persistence, so handlers are not necessary for that.
 *
 */
@RepositoryEventHandler(Score.class)
public class ScoreEventHandler {

    @HandleBeforeSave
    public void handleScoreBeforeSave(Score score) {
    }

    @HandleBeforeCreate
    public void handleScoreBeforeCreate(Score score) {
    }
}
