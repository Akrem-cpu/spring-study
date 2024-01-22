package spring13cinemalab.demo.enitity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@ToString
public class Cinema extends BaseEnitiy {


    private String name;
    private String sponsoredName;

//    @OneToMany(mappedBy = "cinema" ,fetch = FetchType.LAZY)
//    private List<MovieCinema> movieCinemaList;

    @ManyToOne(cascade = {CascadeType.ALL} , fetch = FetchType.EAGER)
    private Location location;


}
