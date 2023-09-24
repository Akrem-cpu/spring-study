package spring13cinemalab.demo.enitity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Data
public class Cinema extends BaseEnitiy {


    private String name;
    private String sponsoredName;

//    @OneToMany(mappedBy = "cinema" ,fetch = FetchType.LAZY)
//    private List<MovieCinema> movieCinemaList;

    @ManyToOne
    private Location location;


}
