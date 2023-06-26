package com.akrem.demo.bootstraps;

import com.akrem.demo.enums.Status;
import com.akrem.demo.model.Customer;
import com.akrem.demo.model.Merchant;
import com.akrem.demo.model.Payment;
import com.akrem.demo.model.PaymentDetail;
import com.akrem.demo.repository.CustomerRepository;
import com.akrem.demo.repository.MerchantRepository;
import com.akrem.demo.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
@Component
public class DataGenerator  implements CommandLineRunner {
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    MerchantRepository merchantRepository;
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        Payment payment1 = new Payment(LocalDate.of(2022,4,19),new BigDecimal("150000"), Status.SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal("140000"),new BigDecimal("10000"),LocalDate.of(2022,4,24));

        payment1.setPaymentDetail(paymentDetail1);
        Payment payment2 = new Payment(LocalDate.of(2022,4,25),new BigDecimal("100000"), Status.FAILURE);
        PaymentDetail paymentDetail2 = new PaymentDetail(new BigDecimal("90000"),new BigDecimal("5000"),LocalDate.of(2022,4,29));

        payment2.setPaymentDetail(paymentDetail2);

        Merchant merchant1 = new Merchant("AmazonSubMerchant","M123",new BigDecimal("0.25"),new BigDecimal("3.25"),5);
        Customer customer1 = new Customer("msmith","Mike","Smith","msmith@cydeo.com","VA");

        payment1.setCustomer(customer1);
        payment2.setCustomer(customer1);
        payment1.setMerchant(merchant1);
        payment2.setMerchant(merchant1);

        customerRepository.save(customer1);
        merchantRepository.save(merchant1);
        paymentRepository.save(payment1);
        paymentRepository.save(payment2);
    }
}
