package akrem.demo.repository;

import akrem.demo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    //Display All regions in Canada
   List<Region> findByCountry(String country);

    //Display All regions in Canada, with out duplicates
    List<Region> findDistinctByCountry(String country);
    //Display All county name include 'United'
    List<Region> findByCountryContaining(String country);

    //Display all regions with country name includes 'United' in order
    List<Region> findByCountryContainingOrderByCountry(String country);

    //Display top 2 country in canada

    List<Region> findTop2ByCountry(String country);

}
