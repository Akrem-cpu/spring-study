package com.example.demo.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@Component
@NoArgsConstructor
public class Regions  extends BaseEntity{

    String region;
    String county;
    @OneToOne(mappedBy = "regions")
    private Employee employee;
    public Regions(String region, String county) {
        this.region = region;
        this.county = county;
    }
}
