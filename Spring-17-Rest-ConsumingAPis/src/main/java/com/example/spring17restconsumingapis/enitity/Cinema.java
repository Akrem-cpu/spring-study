package com.example.spring17restconsumingapis.enitity;


import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Cinema extends BaseEnitiy {


    private String name;
    private String sponsoredName;


    @ManyToOne(fetch = FetchType.EAGER)
    private Location location;


}
