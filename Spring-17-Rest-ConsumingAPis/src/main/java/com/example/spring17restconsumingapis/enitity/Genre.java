package com.example.spring17restconsumingapis.enitity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Genre extends BaseEnitiy {

    private String name;

    @ManyToMany(mappedBy = "genreList")
    @JsonIgnore
    private List<Movie> movieList;


}
