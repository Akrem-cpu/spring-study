package com.example.spring17restconsumingapis.enitity;


import com.example.spring17restconsumingapis.enums.State;
import com.example.spring17restconsumingapis.enums.Type;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Movie extends BaseEnitiy  {


    private String name;
    private Double price;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private State state;

    @Column(columnDefinition = "DATE")
    private LocalDate release_date;
    private Integer duration;
    @Column(columnDefinition = "text")
    private String Summary;

    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY)
    private List<MovieCinema> movieCinemaList;

    @ManyToMany
    @JoinTable(name = "movie_genre_rel",
            joinColumns = @JoinColumn(name="movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genreList;





}
