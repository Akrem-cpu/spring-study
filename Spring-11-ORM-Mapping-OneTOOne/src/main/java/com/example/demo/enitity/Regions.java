package com.example.demo.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Regions {
    @Id
    Long regionId;
    String region;
    String county;

}
