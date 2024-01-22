package spring13cinemalab.demo.enitity;


import lombok.ToString;
import org.hibernate.annotations.FetchProfile;
import org.springframework.context.annotation.Lazy;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
@ToString

public class Location extends BaseEnitiy {

    private String name;
    private String latitude;
    private String longitude;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String address;

    @OneToMany(mappedBy = "location" , cascade = CascadeType.ALL )
    private List<Cinema> cinemaList;

}
