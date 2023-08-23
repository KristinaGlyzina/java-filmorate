package ru.yandex.practicum.filmorate.models;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Data
@Builder
public class Film {
    private Long id;
    private String name;
    private String description;
    private LocalDate releaseDate;
    private Integer duration;
    private Set<Long> likes = new HashSet<>();
    private Mpa mpa;
    private Set<Genre> genres = new HashSet<>();

    public Film(Long id, String name, String description, LocalDate releaseDate, Integer duration,
                Set<Long> likes, Mpa mpa, Set<Genre> genres) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.likes = likes;
        this.mpa = mpa;
        this.genres = genres;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> values = new HashMap<>();
        values.put("name", name);
        values.put("description", description);
        values.put("release_Date", releaseDate);
        values.put("duration", duration);
        values.put("rating_id", mpa.getId());
        return values;
    }
}
