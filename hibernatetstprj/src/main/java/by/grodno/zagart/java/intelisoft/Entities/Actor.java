package by.grodno.zagart.java.intelisoft.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by intelisoft on 29.06.2016.
 */
@Entity
@Table(name = "actors")
public class Actor {

    private Long id;
    private String name;
    private List<Film> films = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @ManyToMany
    public List<Film> getFilms() { return films; }
    public void setFilms(List<Film> films) { this.films = films; }

    public void addFilm(Film film) {
        films.add(film);
        film.getActors().add(this);
    }

    public void removeFilm(Film film) {
        films.remove(film);
        film.getActors().remove(this);
    }

}
