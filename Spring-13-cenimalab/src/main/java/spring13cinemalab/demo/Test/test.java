package spring13cinemalab.demo.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring13cinemalab.demo.enums.Role;
import spring13cinemalab.demo.reposritory.AccountRepository;
import spring13cinemalab.demo.reposritory.CinemaRepository;

@Component
public class test implements CommandLineRunner {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    CinemaRepository cinemaRepository;

    @Override
    public void run(String... args) throws Exception {
        System.err.println("------------------------------CinemaRepository---------------------------------");

           cinemaRepository.findAllByNameEquals("Hall 2 - EMPIRE").forEach(System.err::println);

        System.err.println("------------------------------CinemaRepository---------------------------------");

    }
}
