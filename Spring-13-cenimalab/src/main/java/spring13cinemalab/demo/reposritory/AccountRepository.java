package spring13cinemalab.demo.reposritory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring13cinemalab.demo.enitity.AccountDetails;
import spring13cinemalab.demo.enums.Role;

import javax.annotation.PreDestroy;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Stream;

@Repository
public interface AccountRepository extends JpaRepository<AccountDetails, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state

     List<AccountDetails> findAccountDetailsByCountryOrState(String country , String state);

    //Write a derived query to list all accounts with age lower than or equal to a specific value

     List<AccountDetails> findAccountDetailsByAgeLessThanEqual(Integer age);

    //Write a derived query to list all accounts with a specific role

     List<AccountDetails> findAccountDetailsByRoleEquals(Role role);

    //Write a derived query to list all accounts between a range of ages
     List<AccountDetails> findAccountDetailsByAgeBetween(int age1, int age2);

    //Write a derived query to list all accounts where the beginning of the address contains the keyword
     List<AccountDetails> findAccountDetailsByAddressContains(String pattern);

    //Write a derived query to sort the list of accounts with age
     List<AccountDetails> findAllByOrderByAgeAsc();

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts
     @Query("SELECT a FROM AccountDetails a")
    List<AccountDetails> getAllAccounts();

    //Write a JPQL query to list all admin accounts
     @Query("SELECT a FROM AccountDetails a where a.role = 'USER'")
     List<AccountDetails> getAllUserAccounts();
    //Write a JPQL query to sort all accounts with age
    @Query("SELECT a FROM AccountDetails a order by a.age desc ")
    List<AccountDetails> getAllUserAccountsWithAgeSorted();

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value
    @Query(value = "SELECT * FROM account_details where age < :age", nativeQuery = true)
    List<AccountDetails> getAgeLowerThen(@Param("age") int age);

    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city
    @Query(value = "select * from account_details where city like CONCAT('%',:value ,'%') or address like CONCAT('%',:value ,'%') or  name like CONCAT('%',:value ,'%') or  state like CONCAT('%',:value ,'%') or  country like CONCAT('%',:value ,'%')", nativeQuery = true)
    List<AccountDetails> getInfoContainAny(@Param("value") String value);


    //Write a native query to read all accounts with an age lower than a specific value

}
