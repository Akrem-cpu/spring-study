package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(value = {"id"},ignoreUnknown = true)
public class CourseDTO {

  //  @JsonIgnore
    private Long id;


    private String name;


    private String category;


    private int rating;


    private String description;

}
