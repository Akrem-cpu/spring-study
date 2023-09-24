package spring13cinemalab.demo.enitity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Genre extends BaseEnitiy{

    private String name;

    @ManyToMany(mappedBy = "genreList")
    private List<Movie> movieList;


}
