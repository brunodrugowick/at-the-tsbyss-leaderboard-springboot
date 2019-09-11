package dev.drugowick.atthetsbyssleaderboard.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Integer score;
    private String killedBy;

    @Column(updatable = false)
    private Date createdDate;

    private Date updatedDate;

    @PrePersist
    void prePersist() {
        this.createdDate = this.updatedDate = new Date();
    }

    @PreUpdate
    void preUpdate() {
        this.updatedDate = new Date();
    }
}
