package spring13cinemalab.demo.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring13cinemalab.demo.enums.Role;
import spring13cinemalab.demo.reposritory.AccountRepository;

@Component
public class test implements CommandLineRunner {
    @Autowired
    AccountRepository accountRepository;


    @Override
    public void run(String... args) throws Exception {
        System.err.println("------------------------------accountRepository---------------------------------");

/*        accountRepository.findAccountDetailsByCountryOrState("United States", "akrem").forEach(System.out::println);
        accountRepository.findAccountDetailsByAgeLessThanEqual(35).forEach(System.out::println);
        accountRepository.findAccountDetailsByRoleEquals(Role.USER).forEach(System.err::println);
        accountRepository.findAccountDetailsByAgeBetween(40, 70).forEach(System.err::println);
        accountRepository.findAccountDetailsByAddressContains("262").forEach(System.err::println);
        accountRepository.findAllByOrderByAgeAsc().forEach(System.err::println);*/
        accountRepository.getAllUserAccountsWithAgeSorted().forEach(System.err::println);


        System.err.println("------------------------------accountRepository---------------------------------");

    }
}
