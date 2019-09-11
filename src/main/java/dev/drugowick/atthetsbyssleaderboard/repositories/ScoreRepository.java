package dev.drugowick.atthetsbyssleaderboard.repositories;

import dev.drugowick.atthetsbyssleaderboard.model.Score;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "score", path = "score")
public interface ScoreRepository extends PagingAndSortingRepository<Score, Long> {
}
