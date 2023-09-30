package akrem.demo.boostrap;

import akrem.demo.repository.EmployeeRepositoy;
import akrem.demo.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TestQ implements CommandLineRunner {

    private final RegionRepository regionRepository;
    @Autowired
    private EmployeeRepositoy repository;

    public TestQ(RegionRepository repository) {
        this.regionRepository = repository;
    }


    @Override
    public void run(String... args) throws Exception {


        System.err.println("--------------------REGION START--------------------------");

        System.err.println(regionRepository.findByCountry("Canada").toString());
        System.err.println(regionRepository.findDistinctByCountry("Canada").toString());
        System.err.println(regionRepository.findByCountryContaining("United"));
        System.err.println(regionRepository.findByCountryContainingOrderByCountry("United"));
        System.err.println(regionRepository.findTop2ByCountry("Canada"));


        System.err.println("--------------------REGION  END--------------------------");

    }
}
