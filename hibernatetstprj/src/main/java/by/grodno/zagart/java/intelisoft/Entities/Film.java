package by.grodno.zagart.java.intelisoft.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by intelisoft on 29.06.2016.
 */
@Entity
@Table(name = "films")
public class Film {

    private Long id;
    private String title;
    private Set<Actor> actors = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    @ManyToMany(mappedBy = "films")
    public Set<Actor> getActors() { return actors; }
    public void setActors(Set<Actor> actors) { this.actors = actors; }

    public void addActor(Actor actor) {
        actors.add(actor);
        actor.getFilms().add(this);
    }

    public void removeActor(Actor actor) {
        actors.remove(actor);
        actor.getFilms().remove(this);
    }

}
