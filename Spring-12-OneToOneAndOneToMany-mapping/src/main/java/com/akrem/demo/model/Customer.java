package com.akrem.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Customers")
@Data
@NoArgsConstructor
public class Customer extends BasedEntity {

      private String address;
      private String email;

      public Customer(String address, String email, String name, String sur_name, String user_name) {
            this.address = address;
            this.email = email;
            this.name = name;
            this.sur_name = sur_name;
            this.user_name = user_name;
      }

      private String name;
      private String sur_name;
      private String user_name;

      @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
      List<Payment> paymentList;





}
