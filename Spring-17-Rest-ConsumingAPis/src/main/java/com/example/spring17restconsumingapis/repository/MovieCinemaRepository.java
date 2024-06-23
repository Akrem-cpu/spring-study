package com.example.spring17restconsumingapis.repository;


import com.example.spring17restconsumingapis.enitity.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface MovieCinemaRepository extends JpaRepository<MovieCinema, Long> {
   @Query("SELECT a FROM MovieCinema a")
    List<MovieCinema> findALlBySql();
    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read movie cinema with id

    //Write a derived query to count all movie cinemas with a specific cinema id

    //Write a derived query to count all movie cinemas with a specific movie id

    //Write a derived query to list all movie cinemas with higher than a specific date

    //Write a derived query to find the top 3 expensive movies

    //Write a derived query to list all movie cinemas that contain a specific movie name

    //Write a derived query to list all movie cinemas in a specific location

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movie cinemas with higher than a specific date

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to count all movie cinemas by cinema id

    //Write a native query that returns all movie cinemas by location name

}
