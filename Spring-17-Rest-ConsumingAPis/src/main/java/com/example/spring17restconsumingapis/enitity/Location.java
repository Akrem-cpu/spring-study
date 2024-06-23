package com.example.spring17restconsumingapis.enitity;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
@ToString
@Getter
@Setter
public class Location extends BaseEnitiy {

    private String name;
    private String latitude;
    private String longitude;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String address;



}
