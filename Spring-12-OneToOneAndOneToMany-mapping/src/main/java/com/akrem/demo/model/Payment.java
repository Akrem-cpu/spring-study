package com.akrem.demo.model;

import com.akrem.demo.enums.Status;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
public class Payment  extends BasedEntity{


    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;

    private BigDecimal amount;
    private Status paymentStatus;


    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name = "payment_ID")
    private PaymentDetail paymentDetail;

    @ManyToOne()
    private Merchant merchant;

    @ManyToOne
    Customer customer;

    public Payment(LocalDate createdDate, BigDecimal amount, Status paymentStatus) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
}
