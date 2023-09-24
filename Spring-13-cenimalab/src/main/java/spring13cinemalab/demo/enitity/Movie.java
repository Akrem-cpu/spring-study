package spring13cinemalab.demo.enitity;


import lombok.Data;
import lombok.NoArgsConstructor;
import spring13cinemalab.demo.enums.State;
import spring13cinemalab.demo.enums.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
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
    private String Summary;

    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY)
    private List<MovieCinema> movieCinemaList;

    @ManyToMany
    @JoinTable(name = "movie_genre_rel",
            joinColumns = @JoinColumn(name="movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genreList;





}
