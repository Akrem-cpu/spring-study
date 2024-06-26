package com.example.spring17restconsumingapis.repository;


import com.example.spring17restconsumingapis.enitity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that return all genres

    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns genres by containing name

}
