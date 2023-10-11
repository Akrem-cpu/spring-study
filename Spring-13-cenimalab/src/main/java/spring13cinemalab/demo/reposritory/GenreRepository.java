package spring13cinemalab.demo.reposritory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring13cinemalab.demo.enitity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that return all genres

    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns genres by containing name

}
